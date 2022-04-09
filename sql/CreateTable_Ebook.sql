USE wiki;

DROP TABLE IF EXISTS `ebook`;

CREATE TABLE IF NOT EXISTS `ebook`(
    `id` BIGINT NOT NULL COMMENT 'id',
    `name` VARCHAR(50) COMMENT '名称',
    `category1_id` BIGINT COMMENT '分类1',
    `category2_id` BIGINT COMMENT '分类2',
    `description` VARCHAR(200) COMMENT '描述',
    `cover` VARCHAR(200) COMMENT '封面',
    `doc_count` INT COMMENT '文档数',
    `view_count` INT COMMENT '阅读数',
    `vote_count` INT COMMENT '点赞数',
    PRIMARY KEY (`id`)
)ENGINE = INNODB DEFAULT CHARSET=utf8mb4 COMMENT='电子书表';

INSERT INTO `ebook` (id, name, description) VALUES (1, 'Spring Boot 入门教程', '零基础入门 Spring Boot 开发');
INSERT INTO `ebook` (id, name, description) VALUES (2, 'Vue 入门教程', '零基础入门 Vue 开发');
INSERT INTO `ebook` (id, name, description) VALUES (3, 'MySQL 入门教程', '零基础入门 MySQL 开发');
INSERT INTO `ebook` (id, name, description) VALUES (4, 'Python 入门教程', '零基础入门 Python 开发');
INSERT INTO `ebook` (id, name, description) VALUES (5, 'Go 入门教程', '零基础入门 Go 开发');