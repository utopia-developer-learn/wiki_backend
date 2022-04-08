package com.example.wiki_backend.service;

import com.example.wiki_backend.mapper.DemoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author utopia
 */
@Service
public class DemoService {

    @Resource
    private DemoMapper mapper;


}
