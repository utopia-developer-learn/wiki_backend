package com.example.wiki_backend.mapper;

import com.example.wiki_backend.entity.EbookEntity;
import com.example.wiki_backend.entity.EbookEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EbookEntityMapper {
    long countByExample(EbookEntityExample example);

    int deleteByExample(EbookEntityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(EbookEntity record);

    int insertSelective(EbookEntity record);

    List<EbookEntity> selectByExample(EbookEntityExample example);

    EbookEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EbookEntity record, @Param("example") EbookEntityExample example);

    int updateByExample(@Param("record") EbookEntity record, @Param("example") EbookEntityExample example);

    int updateByPrimaryKeySelective(EbookEntity record);

    int updateByPrimaryKey(EbookEntity record);
}