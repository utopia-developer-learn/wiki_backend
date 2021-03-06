package com.example.wiki_backend.service;

import com.example.wiki_backend.entity.Demo;
import com.example.wiki_backend.mapper.DemoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author utopia
 */
@Service
public class DemoService {

    @Resource
    private DemoMapper mapper;

    public List<Demo> list(){
        return mapper.selectByExample(null);
    }
}
