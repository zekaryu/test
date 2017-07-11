INSERT INTO `ac_role` VALUES ('1', '2017-07-06 13:57:00', '2017-07-06 13:57:02', 'admin', NULL);
INSERT INTO `ac_role` VALUES ('2', '2017-07-06 14:02:35', '2017-07-06 14:02:37', 'user', NULL);
INSERT INTO `ac_permission` VALUES
  ('1', '2017-07-06 13:53:44', '2017-07-06 13:53:46', '1', '主页', '/index.html', NULL, NULL, NULL);
INSERT INTO `ac_permission`
VALUES ('2', '2017-07-06 15:33:51', '2017-07-06 15:33:53', '2', '查询按钮', NULL, NULL, '1', NULL);
INSERT INTO `ac_permission` VALUES
  ('3', '2017-07-06 15:43:56', '2017-07-06 15:43:59', '3', '用户新增', NULL, '', 'user:create', NULL);
INSERT INTO `ac_permission` VALUES
  ('4', '2017-07-07 08:41:48', '2017-07-07 08:41:51', '1', '用户管理', '/user/userManage.html', NULL,
   NULL, NULL);
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
INSERT INTO `ac_user` VALUES ('1', '0', '1', '2017-07-06 14:03:28', '2017-07-06 14:03:30');
INSERT INTO `ac_user` VALUES ('2', NULL, '1', NULL, NULL);
INSERT INTO `ac_user` VALUES ('3', NULL, '1', NULL, NULL);
INSERT INTO `ac_user` VALUES ('4', NULL, '1', NULL, NULL);
INSERT INTO `ac_user` VALUES ('5', NULL, '1', NULL, NULL);
INSERT INTO `ac_user_auth` VALUES
  ('1', '2017-07-06 14:05:00', '2017-07-06 14:05:03', '1', '123456', '0', NULL, '1', 'yuze', NULL,
        NULL);
INSERT INTO `ac_user_auth` VALUES
  ('4', '2017-07-10 13:44:06', '2017-07-10 13:44:08', '2', '123456', '0', NULL, '1', '15606508303',
        NULL, NULL);
INSERT INTO `ac_user_info` VALUES
  ('1', '1', '2017-07-06 14:03:54', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL,
   NULL, NULL, NULL, NULL);
INSERT INTO `ac_user_role` VALUES ('1', '2017-07-06 14:06:43', '2017-07-06 14:06:46', '1', '1');
INSERT INTO `ac_user_role` VALUES ('2', '2017-07-07 08:55:57', '2017-07-07 08:55:54', '2', '2');