USE wiki;

DROP TABLE IF EXISTS `demo`;

CREATE TABLE IF NOT EXISTS `demo`(
    `id` BIGINT NOT NULL COMMENT 'id',
    `name` VARCHAR(50) COMMENT '姓名',
    `password` VARCHAR(50) COMMENT '密码',
    PRIMARY KEY(`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8mb4;

INSERT INTO `demo` (id, name, password) VALUES (1, 'A', 'password');