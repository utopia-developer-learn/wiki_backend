package com.example.wiki_backend.service;

import com.example.wiki_backend.entity.EbookEntity;
import com.example.wiki_backend.entity.EbookEntityExample;
import com.example.wiki_backend.mapper.DemoMapper;
import com.example.wiki_backend.mapper.EbookEntityMapper;
import com.example.wiki_backend.req.EbookReq;
import com.example.wiki_backend.resp.EbookResp;
import com.example.wiki_backend.utils.CopyUtil;
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

    public List<EbookResp> list(EbookReq req){
        EbookEntityExample ebookEntityExample = new EbookEntityExample();
        EbookEntityExample.Criteria criteria = ebookEntityExample.createCriteria();

        criteria.andNameLike("%" + req.getName() + "%");

        List<EbookEntity> tmpList = mapper.selectByExample(ebookEntityExample);

        List<EbookResp> result = CopyUtil.copyList(tmpList, EbookResp.class);
        return result;
    }
}
