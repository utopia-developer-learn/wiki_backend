USE wiki;

DROP TABLE IF EXISTS `test`;

CREATE TABLE IF NOT EXISTS `test`(
    `id` BIGINT NOT NULL COMMENT 'id',
    `name` VARCHAR(50) COMMENT '姓名',
    PRIMARY KEY(`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8mb4;

INSERT INTO `test` (id, name) VALUES (1, 'A');