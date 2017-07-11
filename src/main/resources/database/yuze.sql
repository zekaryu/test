/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50718
Source Host           : 127.0.0.1:3306
Source Database       : yuze

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2017-07-11 15:12:59
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for ac_permission
-- ----------------------------
DROP TABLE IF EXISTS `ac_permission`;
CREATE TABLE `ac_permission` (
  `id`           bigint(20) NOT NULL AUTO_INCREMENT,
  `gmt_create`   datetime            DEFAULT NULL,
  `gmt_modified` datetime            DEFAULT NULL,
  `type`         tinyint(4)          DEFAULT NULL,
  `name`         VARCHAR(20)         DEFAULT NULL,
  `uri`          VARCHAR(100)        DEFAULT NULL,
  `uri_prefix`   VARCHAR(30)         DEFAULT NULL,
  `code`         VARCHAR(30)         DEFAULT NULL,
  `parent_id`    BIGINT(20)          DEFAULT NULL,
  PRIMARY KEY (`id`)
)
  ENGINE = InnoDB
  AUTO_INCREMENT = 5
  DEFAULT CHARSET = utf8
  COMMENT = '权限表';

-- ----------------------------
-- Records of ac_permission
-- ----------------------------
INSERT INTO `ac_permission` VALUES
  ('1', '2017-07-06 13:53:44', '2017-07-06 13:53:46', '1', '主页', '/index.html', NULL, NULL, NULL);
INSERT INTO `ac_permission`
VALUES ('2', '2017-07-06 15:33:51', '2017-07-06 15:33:53', '2', '查询按钮', NULL, NULL, '1', NULL);
INSERT INTO `ac_permission` VALUES
  ('3', '2017-07-06 15:43:56', '2017-07-06 15:43:59', '3', '用户新增', NULL, '', 'user:create', NULL);
INSERT INTO `ac_permission` VALUES
  ('4', '2017-07-07 08:41:48', '2017-07-07 08:41:51', '1', '用户管理', '/user/userManage.html', NULL,
   NULL, NULL);

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
)
  ENGINE = InnoDB
  AUTO_INCREMENT = 3
  DEFAULT CHARSET = utf8
  COMMENT = '角色表';

-- ----------------------------
-- Records of ac_role
-- ----------------------------
INSERT INTO `ac_role` VALUES ('1', '2017-07-06 13:57:00', '2017-07-06 13:57:02', 'admin', NULL);
INSERT INTO `ac_role` VALUES ('2', '2017-07-06 14:02:35', '2017-07-06 14:02:37', 'user', NULL);

-- ----------------------------
-- Table structure for ac_role_group
-- ----------------------------
DROP TABLE IF EXISTS `ac_role_group`;
CREATE TABLE `ac_role_group` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `gmt_create` datetime DEFAULT NULL,
  `gmt_modified` datetime DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `parent_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色组';

-- ----------------------------
-- Records of ac_role_group
-- ----------------------------

-- ----------------------------
-- Table structure for ac_role_group_role
-- ----------------------------
DROP TABLE IF EXISTS `ac_role_group_role`;
CREATE TABLE `ac_role_group_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `gmt_create` datetime DEFAULT NULL,
  `gmt_modified` datetime DEFAULT NULL,
  `role_group_id` bigint(20) DEFAULT NULL,
  `role_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `ac_role_group_role_ac_role_group_id_fk` (`role_group_id`),
  KEY `ac_role_group_role_ac_role_id_fk` (`role_id`),
  CONSTRAINT `ac_role_group_role_ac_role_group_id_fk` FOREIGN KEY (`role_group_id`) REFERENCES `ac_role_group` (`id`),
  CONSTRAINT `ac_role_group_role_ac_role_id_fk` FOREIGN KEY (`role_id`) REFERENCES `ac_role` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色组角色关联表';

-- ----------------------------
-- Records of ac_role_group_role
-- ----------------------------

-- ----------------------------
-- Table structure for ac_role_permission
-- ----------------------------
DROP TABLE IF EXISTS `ac_role_permission`;
CREATE TABLE `ac_role_permission` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `role_id` bigint(20) DEFAULT NULL,
  `permission_id` bigint(20) DEFAULT NULL,
  `gmt_create` datetime DEFAULT NULL,
  `gmt_modified` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `ac_role_permission_ac_permission_id_fk` (`permission_id`),
  KEY `ac_role_permission_ac_role_id_fk` (`role_id`),
  CONSTRAINT `ac_role_permission_ac_permission_id_fk` FOREIGN KEY (`permission_id`) REFERENCES `ac_permission` (`id`),
  CONSTRAINT `ac_role_permission_ac_role_id_fk` FOREIGN KEY (`role_id`) REFERENCES `ac_role` (`id`)
)
  ENGINE = InnoDB
  AUTO_INCREMENT = 6
  DEFAULT CHARSET = utf8
  COMMENT = '角色权限关联表';

-- ----------------------------
-- Records of ac_role_permission
-- ----------------------------
INSERT INTO `ac_role_permission`
VALUES ('1', '1', '1', '2017-07-06 14:03:11', '2017-07-06 14:03:13');
INSERT INTO `ac_role_permission`
VALUES ('2', '1', '2', '2017-07-07 08:54:13', '2017-07-07 08:54:15');
INSERT INTO `ac_role_permission`
VALUES ('3', '1', '3', '2017-07-07 08:54:24', '2017-07-07 08:54:28');
INSERT INTO `ac_role_permission`
VALUES ('4', '1', '4', '2017-07-07 08:55:25', '2017-07-07 08:55:28');
INSERT INTO `ac_role_permission`
VALUES ('5', '2', '2', '2017-07-07 08:56:16', '2017-07-07 08:56:18');

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
)
  ENGINE = InnoDB
  AUTO_INCREMENT = 6
  DEFAULT CHARSET = utf8;

-- ----------------------------
-- Records of ac_user
-- ----------------------------
INSERT INTO `ac_user` VALUES ('1', '0', '1', '2017-07-06 14:03:28', '2017-07-06 14:03:30');
INSERT INTO `ac_user` VALUES ('2', NULL, '1', NULL, NULL);
INSERT INTO `ac_user` VALUES ('3', NULL, '1', NULL, NULL);
INSERT INTO `ac_user` VALUES ('4', NULL, '1', NULL, NULL);
INSERT INTO `ac_user` VALUES ('5', NULL, '1', NULL, NULL);

-- ----------------------------
-- Table structure for ac_user_auth
-- ----------------------------
DROP TABLE IF EXISTS `ac_user_auth`;
CREATE TABLE `ac_user_auth` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
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
  UNIQUE KEY `ac_user_auth_identifier_uindex` (`identifier`),
  KEY `ac_user_auth_user_id_uindex` (`user_id`) USING BTREE,
  CONSTRAINT `ac_user_auth_ac_user_id_fk` FOREIGN KEY (`user_id`) REFERENCES `ac_user` (`id`)
)
  ENGINE = InnoDB
  AUTO_INCREMENT = 5
  DEFAULT CHARSET = utf8
  COMMENT = '用户鉴权表';

-- ----------------------------
-- Records of ac_user_auth
-- ----------------------------
INSERT INTO `ac_user_auth` VALUES
  ('1', '2017-07-06 14:05:00', '2017-07-06 14:05:03', '1', '123456', '0', NULL, '1', 'yuze', NULL,
        NULL);
INSERT INTO `ac_user_auth` VALUES
  ('4', '2017-07-10 13:44:06', '2017-07-10 13:44:08', '2', '123456', '0', NULL, '1', '15606508303',
        NULL, NULL);

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
-- Records of ac_user_group
-- ----------------------------

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
-- Records of ac_user_group_role
-- ----------------------------

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
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

-- ----------------------------
-- Records of ac_user_group_user
-- ----------------------------

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
-- Records of ac_user_info
-- ----------------------------
INSERT INTO `ac_user_info` VALUES
  ('1', '1', '2017-07-06 14:03:54', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL,
   NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for ac_user_role
-- ----------------------------
DROP TABLE IF EXISTS `ac_user_role`;
CREATE TABLE `ac_user_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `gmt_create` datetime DEFAULT NULL,
  `gmt_modified` datetime DEFAULT NULL,
  `user_id` bigint(20) DEFAULT NULL,
  `role_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `ac_user_role_ac_user_id_fk` (`user_id`),
  KEY `ac_user_role_ac_role_id_fk` (`role_id`),
  CONSTRAINT `ac_user_role_ac_role_id_fk` FOREIGN KEY (`role_id`) REFERENCES `ac_role` (`id`),
  CONSTRAINT `ac_user_role_ac_user_id_fk` FOREIGN KEY (`user_id`) REFERENCES `ac_user` (`id`)
)
  ENGINE = InnoDB
  AUTO_INCREMENT = 3
  DEFAULT CHARSET = utf8
  COMMENT = '用户角色关联表';

-- ----------------------------
-- Records of ac_user_role
-- ----------------------------
INSERT INTO `ac_user_role` VALUES ('1', '2017-07-06 14:06:43', '2017-07-06 14:06:46', '1', '1');
INSERT INTO `ac_user_role` VALUES ('2', '2017-07-07 08:55:57', '2017-07-07 08:55:54', '2', '2');

-- ----------------------------
-- View structure for vw_ac_user_spec
-- ----------------------------
DROP VIEW IF EXISTS `vw_ac_user_spec`;
CREATE ALGORITHM = UNDEFINED
  DEFINER =`root`@`localhost`
  SQL SECURITY DEFINER VIEW `vw_ac_user_spec` AS
  SELECT
    `ua`.`id`            AS `id`,
    `ua`.`identifier`    AS `identifier`,
    `ua`.`credential`    AS `credential`,
    `ua`.`access_token`  AS `access_token`,
    `ua`.`identify_type` AS `identify_type`,
    `ua`.`is_verified`   AS `is_verified`,
    `ua`.`log_ip`        AS `log_ip`,
    `ua`.`open_id`       AS `open_id`,
    `ua`.`gmt_create`    AS `gmt_create`,
    `ua`.`gmt_modified`  AS `gmt_modified`,
    `u`.`is_active`      AS `is_active`,
    `u`.`is_deleted`     AS `is_deleted`
  FROM (`ac_user_auth` `ua`
    JOIN `ac_user` `u` ON ((`u`.`id` = `ua`.`user_id`)));
