package com.example.wiki_backend.mapper;

import com.example.wiki_backend.entity.TestEntity;

import java.util.List;

/**
 * @author utopia
 */
public interface TestMapper {
    /**
     * 查询 test 表中的数据
     * @return 符合条件的所有实体
     */
    List<TestEntity> list();
}
