package com.example.wiki_backend.controller;

import com.example.wiki_backend.entity.EbookEntity;
import com.example.wiki_backend.resp.CommonResp;
import com.example.wiki_backend.service.EbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author utopia
 */
@RestController
@RequestMapping("/ebook")
public class EbookController {

    @Resource
    private EbookService ebookService;

    @GetMapping("/list")
    public CommonResp list(){
        CommonResp<List<EbookEntity>> resultResp = new CommonResp<>();

        List<EbookEntity> list = ebookService.list();

        resultResp.setContent(list);

        return resultResp;
    }
}
