package com.example.wiki_backend.service;

import com.example.wiki_backend.entity.TestEntity;
import com.example.wiki_backend.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author utopia
 */
@Service
public class TestService {

    @Resource
    private TestMapper mapper;

    public List<TestEntity> list(){
        return mapper.list();
    }
}
