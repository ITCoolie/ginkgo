# ginkgo database

CREATE DATABASE db_ginkgo;

DROP TABLE IF EXISTS `tb_user`;

/*账号信息表*/
CREATE TABLE `tb_user` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(200) DEFAULT NULL COMMENT '账号名称',
  `password` varchar(40) DEFAULT NULL COMMENT '账号密码md5值',
  `nickname` varchar(200) DEFAULT NULL COMMENT 'nickname',
  `status` int(11) DEFAULT NULL COMMENT 'account status',
  `photo` varchar(200) DEFAULT NULL COMMENT 'photo',
  `phone` varchar(200) DEFAULT NULL COMMENT 'phone',
  `create_at` DateTime DEFAULT NULL COMMENT 'create time',
  `update_at` DateTime DEFAULT NULL COMMENT 'account update time',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uniq_name` (`name`)

) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='user table';


/*模板信息表*/
CREATE TABLE `tb_template` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(200) DEFAULT NULL COMMENT '模板名称',
  `width` int(11) DEFAULT NULL COMMENT '模板宽度',
  `height` int(11) DEFAULT NULL COMMENT '模板高度',
  `status` int(11) DEFAULT NULL COMMENT '模板类型 1:正常 -2:下架',
  `comment` int(11) DEFAULT NULL COMMENT '备注 几图几文',
  `create_at` DateTime DEFAULT NULL COMMENT 'create time',
  `update_at` DateTime DEFAULT NULL COMMENT 'account update time',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uniq_name` (`name`)

) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='模板类型表';


CREATE TABLE `tb_creative` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(200) DEFAULT NULL COMMENT '创意名称',
  `data` varchar(200) DEFAULT NULL COMMENT '创意信息',
  `template_id` int(11) DEFAULT NULL COMMENT '模板id',
  `author` varchar(200) DEFAULT NULL COMMENT '创意添加者',
  `status` int(11) DEFAULT NULL COMMENT '模板类型 1:审核中 2:审核成功 -2:审核失败',
  `create_at` DateTime DEFAULT NULL COMMENT 'create time',
  `update_at` DateTime DEFAULT NULL COMMENT 'account update time',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uniq_name` (`name`)

) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='创意表';


CREATE TABLE `tb_ad_plan` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(200) DEFAULT NULL COMMENT '投放计划名称',
  `author` varchar(200) DEFAULT NULL COMMENT '创意添加者',
  `status` int(11) DEFAULT NULL COMMENT '',
  `create_at` DateTime DEFAULT NULL COMMENT 'create time',
  `update_at` DateTime DEFAULT NULL COMMENT 'account update time',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uniq_name` (`name`)

) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='广告投放计划';


CREATE TABLE `tb_ad_unit` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(200) DEFAULT NULL COMMENT '投放单元名称',
  `ad_plan` int(11) DEFAULT NULL COMMENT '广告计划id',
  `author` varchar(200) DEFAULT NULL COMMENT '添加者',
  `status` int(11) DEFAULT NULL COMMENT '模板类型 1:正常 -2:下架',
  `create_at` DateTime DEFAULT NULL COMMENT 'create time',
  `update_at` DateTime DEFAULT NULL COMMENT 'account update time',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uniq_name` (`name`)

) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='广告单元表';

