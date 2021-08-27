CREATE TABLE `user` (
  `id`                  INT                NOT NULL AUTO_INCREMENT,
  `username`            VARCHAR(128)       NOT NULL DEFAULT '' COMMENT '登录名',
  `name`                VARCHAR(128)       NOT NULL DEFAULT '' COMMENT '姓名',
  `create_time`         DATETIME           NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=UTF8 COMMENT='用户表';
