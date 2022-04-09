package com.example.wiki_backend.service;

import com.example.wiki_backend.entity.EbookEntity;
import com.example.wiki_backend.mapper.DemoMapper;
import com.example.wiki_backend.mapper.EbookEntityMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author utopia
 */
@Service
public class EbookService {

    @Resource
    private EbookEntityMapper mapper;

    public List<EbookEntity> list(){
        return mapper.selectByExample(null);
    }
}
