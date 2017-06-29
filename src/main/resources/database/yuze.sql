/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50718
Source Host           : 127.0.0.1:3306
Source Database       : yuze

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2017-06-29 16:45:19
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for ac_element
-- ----------------------------
DROP TABLE IF EXISTS `ac_element`;
CREATE TABLE `ac_element` (
  `id` bigint(20) DEFAULT NULL,
  `gmt_create` datetime DEFAULT NULL,
  `gmt_modified` datetime DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `code` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='页面元素权限表';

-- ----------------------------
-- Table structure for ac_menu
-- ----------------------------
DROP TABLE IF EXISTS `ac_menu`;
CREATE TABLE `ac_menu` (
  `id` bigint(20) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `uri` varchar(50) DEFAULT NULL,
  `parent_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='菜单表';

-- ----------------------------
-- Table structure for ac_operation
-- ----------------------------
DROP TABLE IF EXISTS `ac_operation`;
CREATE TABLE `ac_operation` (
  `id` bigint(20) DEFAULT NULL,
  `gmt_create` datetime DEFAULT NULL,
  `gmt_modified` datetime DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `code` varchar(50) DEFAULT NULL,
  `type` varchar(50) DEFAULT NULL,
  `uri_prefix` varchar(100) DEFAULT NULL,
  `parent_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='功能操作权限表';

-- ----------------------------
-- Table structure for ac_permission
-- ----------------------------
DROP TABLE IF EXISTS `ac_permission`;
CREATE TABLE `ac_permission` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `gmt_create` datetime DEFAULT NULL,
  `gmt_modified` datetime DEFAULT NULL,
  `type` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='权限表';

-- ----------------------------
-- Table structure for ac_role
-- ----------------------------
DROP TABLE IF EXISTS `ac_role`;
CREATE TABLE `ac_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `gmt_create` datetime DEFAULT NULL COMMENT '创建时间',
  `gmt_modified` datetime DEFAULT NULL COMMENT '最近修改时间',
  `name` varchar(20) DEFAULT NULL COMMENT '角色名',
  `parent_id` bigint(20) DEFAULT NULL COMMENT '父角色ID',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色表';

-- ----------------------------
-- Table structure for ac_role_group
-- ----------------------------
DROP TABLE IF EXISTS `ac_role_group`;
CREATE TABLE `ac_role_group` (
  `id` bigint(20) NOT NULL,
  `gmt_create` datetime DEFAULT NULL,
  `gmt_modified` datetime DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `parent_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色组';

-- ----------------------------
-- Table structure for ac_role_group_role
-- ----------------------------
DROP TABLE IF EXISTS `ac_role_group_role`;
CREATE TABLE `ac_role_group_role` (
  `id` bigint(20) DEFAULT NULL,
  `gmt_create` datetime DEFAULT NULL,
  `gmt_modified` datetime DEFAULT NULL,
  `role_group_id` bigint(20) DEFAULT NULL,
  `role_id` bigint(20) DEFAULT NULL,
  KEY `ac_role_group_role_ac_role_group_id_fk` (`role_group_id`),
  KEY `ac_role_group_role_ac_role_id_fk` (`role_id`),
  CONSTRAINT `ac_role_group_role_ac_role_group_id_fk` FOREIGN KEY (`role_group_id`) REFERENCES `ac_role_group` (`id`),
  CONSTRAINT `ac_role_group_role_ac_role_id_fk` FOREIGN KEY (`role_id`) REFERENCES `ac_role` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色组角色关联表';

-- ----------------------------
-- Table structure for ac_user
-- ----------------------------
DROP TABLE IF EXISTS `ac_user`;
CREATE TABLE `ac_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id主键',
  `is_deleted` tinyint(4) DEFAULT '0' COMMENT '用户是否被删除',
  `is_active` tinyint(4) DEFAULT '1' COMMENT '用户是否被激活',
  `gmt_create` datetime DEFAULT NULL COMMENT '创建时间 cteate time',
  `gmt_modified` datetime DEFAULT NULL COMMENT '最近修改时间，Last modified time',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for ac_user_auth
-- ----------------------------
DROP TABLE IF EXISTS `ac_user_auth`;
CREATE TABLE `ac_user_auth` (
  `id` bigint(20) NOT NULL,
  `gmt_create` datetime DEFAULT NULL COMMENT '创建时间',
  `gmt_modified` datetime DEFAULT NULL COMMENT '最近修改时间',
  `identify_type` varchar(20) NOT NULL COMMENT '登录类型（手机号 邮箱 用户名）或第三方应用名称（微信 微博等）',
  `credential` varchar(200) NOT NULL COMMENT '密码凭证（站内的保存密码，站外的不保存或保存token）',
  `is_verified` tinyint(4) DEFAULT '0' COMMENT '是否已被验证',
  `log_ip` varchar(20) DEFAULT NULL COMMENT '登录IP地址',
  `user_id` bigint(20) NOT NULL COMMENT 'userid外键',
  `identifier` varchar(100) NOT NULL COMMENT '标识（手机号 邮箱 用户名或第三方应用的唯一标识）',
  `open_id` varchar(0) DEFAULT NULL,
  `access_token` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `ac_user_auth_user_id_uindex` (`user_id`),
  UNIQUE KEY `ac_user_auth_identifier_uindex` (`identifier`),
  UNIQUE KEY `ac_user_auth_id_uindex` (`id`),
  CONSTRAINT `ac_user_auth_ac_user_id_fk` FOREIGN KEY (`user_id`) REFERENCES `ac_user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户鉴权表';

-- ----------------------------
-- Table structure for ac_user_group
-- ----------------------------
DROP TABLE IF EXISTS `ac_user_group`;
CREATE TABLE `ac_user_group` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `parent_id` bigint(20) DEFAULT NULL,
  `gmt_create` datetime DEFAULT NULL,
  `gmt_modified` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for ac_user_group_role
-- ----------------------------
DROP TABLE IF EXISTS `ac_user_group_role`;
CREATE TABLE `ac_user_group_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `gmt_create` datetime DEFAULT NULL,
  `gmt_modified` datetime DEFAULT NULL,
  `user_group_id` bigint(20) DEFAULT NULL,
  `role_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `ac_user_group_role_ac_user_group_id_fk` (`user_group_id`),
  KEY `ac_user_group_role_ac_role_id_fk` (`role_id`),
  CONSTRAINT `ac_user_group_role_ac_role_id_fk` FOREIGN KEY (`role_id`) REFERENCES `ac_role` (`id`),
  CONSTRAINT `ac_user_group_role_ac_user_group_id_fk` FOREIGN KEY (`user_group_id`) REFERENCES `ac_user_group` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户组角色关联表';

-- ----------------------------
-- Table structure for ac_user_group_user
-- ----------------------------
DROP TABLE IF EXISTS `ac_user_group_user`;
CREATE TABLE `ac_user_group_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `gmt_create` datetime DEFAULT NULL,
  `gmt_modified` datetime DEFAULT NULL,
  `user_group_id` bigint(20) DEFAULT NULL,
  `user_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `ac_user_group_user_ac_user_group_id_fk` (`user_group_id`),
  KEY `ac_user_group_user_ac_user_id_fk` (`user_id`),
  CONSTRAINT `ac_user_group_user_ac_user_group_id_fk` FOREIGN KEY (`user_group_id`) REFERENCES `ac_user_group` (`id`),
  CONSTRAINT `ac_user_group_user_ac_user_id_fk` FOREIGN KEY (`user_id`) REFERENCES `ac_user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for ac_user_info
-- ----------------------------
DROP TABLE IF EXISTS `ac_user_info`;
CREATE TABLE `ac_user_info` (
  `id` bigint(20) NOT NULL,
  `user_id` bigint(20) DEFAULT NULL COMMENT 'ac_user外键',
  `gmt_create` datetime DEFAULT NULL COMMENT '创建时间',
  `gmt_modified` datetime DEFAULT NULL COMMENT '最近修改时间',
  `bday` date DEFAULT NULL COMMENT '生日',
  `email` varchar(100) DEFAULT NULL COMMENT '电子邮箱',
  `phone` varchar(20) DEFAULT NULL COMMENT '手机',
  `QQ` varchar(15) DEFAULT NULL COMMENT 'QQ',
  `wechat` varchar(50) DEFAULT NULL COMMENT '微信',
  `nickname` varchar(50) DEFAULT NULL COMMENT '昵称',
  `avatar` varchar(200) DEFAULT NULL COMMENT '头像地址',
  `age` tinyint(4) DEFAULT NULL COMMENT '年龄',
  `gender` tinyint(4) DEFAULT NULL COMMENT '性别',
  `location` varchar(100) DEFAULT NULL COMMENT '地址',
  `profession` varchar(20) DEFAULT NULL COMMENT '职业',
  `hometown` varchar(100) DEFAULT NULL COMMENT '家乡',
  `postcode` varchar(20) DEFAULT NULL COMMENT '邮政编码',
  PRIMARY KEY (`id`),
  KEY `ac_user_info_ac_user_id_fk` (`user_id`),
  CONSTRAINT `ac_user_info_ac_user_id_fk` FOREIGN KEY (`user_id`) REFERENCES `ac_user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户信息表';

-- ----------------------------
-- Table structure for ac_user_role
-- ----------------------------
DROP TABLE IF EXISTS `ac_user_role`;
CREATE TABLE `ac_user_role` (
  `id` bigint(20) DEFAULT NULL,
  `gmt_create` datetime DEFAULT NULL,
  `gmt_modified` datetime DEFAULT NULL,
  `user_id` bigint(20) DEFAULT NULL,
  `role_id` bigint(20) DEFAULT NULL,
  KEY `ac_user_role_ac_user_id_fk` (`user_id`),
  KEY `ac_user_role_ac_role_id_fk` (`role_id`),
  CONSTRAINT `ac_user_role_ac_role_id_fk` FOREIGN KEY (`role_id`) REFERENCES `ac_role` (`id`),
  CONSTRAINT `ac_user_role_ac_user_id_fk` FOREIGN KEY (`user_id`) REFERENCES `ac_user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户角色关联表';
