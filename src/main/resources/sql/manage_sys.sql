/*
 Navicat Premium Data Transfer

 Source Server         : 本地mysql
 Source Server Type    : MySQL
 Source Server Version : 80026
 Source Host           : localhost:3306
 Source Schema         : manage_sys

 Target Server Type    : MySQL
 Target Server Version : 80026
 File Encoding         : 65001

 Date: 24/04/2022 17:33:52
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sys_color
-- ----------------------------
DROP TABLE IF EXISTS `sys_color`;
CREATE TABLE `sys_color`  (
  `c_id` int NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `c_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '颜色名',
  `c_color` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `c_code` int NOT NULL COMMENT '颜色编号',
  `c_company` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0',
  PRIMARY KEY (`c_id`) USING BTREE,
  UNIQUE INDEX `c_code`(`c_code`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_color
-- ----------------------------
INSERT INTO `sys_color` VALUES (1, '咖啡色', '#AC710C', 2101, '2325');
INSERT INTO `sys_color` VALUES (2, '粉色', '#555555', 2102, '2102');
INSERT INTO `sys_color` VALUES (4, '红色', '#D21D1D', 2202201, '2325');
INSERT INTO `sys_color` VALUES (5, '绿色', '#2EBB56', 2202202, '2325');
INSERT INTO `sys_color` VALUES (6, '紫色', '#8B277C', 2202203, '/2325');
INSERT INTO `sys_color` VALUES (8, '粉色', '#EB0066', 2202211, '/2325');
INSERT INTO `sys_color` VALUES (9, '紫色', '#581196', 2204211, '2325');

-- ----------------------------
-- Table structure for sys_company
-- ----------------------------
DROP TABLE IF EXISTS `sys_company`;
CREATE TABLE `sys_company`  (
  `co_id` int NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `co_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '公司名',
  `co_code` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '公司编号',
  `co_state` int NOT NULL COMMENT '公司状态',
  PRIMARY KEY (`co_id`) USING BTREE,
  UNIQUE INDEX `co_name`(`co_name`) USING BTREE,
  UNIQUE INDEX `co_code`(`co_code`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_company
-- ----------------------------
INSERT INTO `sys_company` VALUES (2, '美舒雅', '2102', 1);
INSERT INTO `sys_company` VALUES (3, '鸿翔', '2201', 1);
INSERT INTO `sys_company` VALUES (4, '利辛完胜', '2202', 1);
INSERT INTO `sys_company` VALUES (5, '利辛美舒', '2203', 1);
INSERT INTO `sys_company` VALUES (6, '笨鸽科技', '2325', 1);

-- ----------------------------
-- Table structure for sys_ext_propties
-- ----------------------------
DROP TABLE IF EXISTS `sys_ext_propties`;
CREATE TABLE `sys_ext_propties`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'x属性.表.name',
  `color` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '颜色编码',
  `image` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '图片url',
  `propties_code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '属性标识符',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_ext_propties
-- ----------------------------
INSERT INTO `sys_ext_propties` VALUES (1, '皮革', '#AC710C', NULL, 'ad-47a47745-ad');
INSERT INTO `sys_ext_propties` VALUES (2, '人造革', '#AC710C', 'http:\\\\127.0.0.1:8085\\static\\upload\\1650787912408测试图片.png', 'ad-47a47745-ad');
INSERT INTO `sys_ext_propties` VALUES (3, '化纤', NULL, 'http:\\\\127.0.0.1:8085\\static\\upload\\1650787912408测试图片.png', 'ad-47a47745-ad');

-- ----------------------------
-- Table structure for sys_ext_propties_column
-- ----------------------------
DROP TABLE IF EXISTS `sys_ext_propties_column`;
CREATE TABLE `sys_ext_propties_column`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `ext_propties_code` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '扩展属性code',
  `ext_column_name` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '该扩展属性的名称',
  `ext_column_img` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '该扩展属性的图片地址',
  `ext_column_color` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '该扩展属性的颜色值',
  `ext_column_code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '该条数据的唯一标识符',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_ext_propties_column
-- ----------------------------
INSERT INTO `sys_ext_propties_column` VALUES (1, 'ad-47a47745-ad', '名称', NULL, NULL, NULL);
INSERT INTO `sys_ext_propties_column` VALUES (2, 'ad-47a47745-ad', '代号', NULL, NULL, NULL);
INSERT INTO `sys_ext_propties_column` VALUES (3, 'ad-47a47745-ad', '图片', NULL, NULL, NULL);

-- ----------------------------
-- Table structure for sys_operation_table
-- ----------------------------
DROP TABLE IF EXISTS `sys_operation_table`;
CREATE TABLE `sys_operation_table`  (
  `ot_id` int NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `ot_table` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '表名',
  `ot_column` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '字段名',
  `ot_show` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '列名',
  PRIMARY KEY (`ot_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_operation_table
-- ----------------------------
INSERT INTO `sys_operation_table` VALUES (2, 'sys_user', 'u_id', 'ID');
INSERT INTO `sys_operation_table` VALUES (6, 'sys_user', 'u_username', '用户名');
INSERT INTO `sys_operation_table` VALUES (7, 'sys_user', 'u_code', '用户编号');
INSERT INTO `sys_operation_table` VALUES (8, 'sys_user', 'u_company', '所属公司');
INSERT INTO `sys_operation_table` VALUES (9, 'sys_user', 'u_position', '职位');
INSERT INTO `sys_operation_table` VALUES (10, 'sys_user', 'u_time_start', '开始时间');
INSERT INTO `sys_operation_table` VALUES (11, 'sys_user', 'u_time_end', '结束时间');

-- ----------------------------
-- Table structure for sys_position
-- ----------------------------
DROP TABLE IF EXISTS `sys_position`;
CREATE TABLE `sys_position`  (
  `p_id` int NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `p_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '职位名',
  `p_code` int NOT NULL COMMENT '职位编号',
  `p_company` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '0',
  PRIMARY KEY (`p_id`) USING BTREE,
  UNIQUE INDEX `p_name`(`p_name`) USING BTREE,
  UNIQUE INDEX `p_code`(`p_code`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_position
-- ----------------------------
INSERT INTO `sys_position` VALUES (1, 'CEO', 1, '2102');
INSERT INTO `sys_position` VALUES (2, '职位1', 2, '2325');
INSERT INTO `sys_position` VALUES (3, '管理员', 3, '2325');

-- ----------------------------
-- Table structure for sys_process
-- ----------------------------
DROP TABLE IF EXISTS `sys_process`;
CREATE TABLE `sys_process`  (
  `prc_id` int NOT NULL AUTO_INCREMENT,
  `prc_code` int NOT NULL COMMENT '工序编号',
  `prc_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '工序名称',
  `prc_company` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '0' COMMENT '所属公司',
  PRIMARY KEY (`prc_id`) USING BTREE,
  UNIQUE INDEX `prc_code`(`prc_code`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 24 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_process
-- ----------------------------
INSERT INTO `sys_process` VALUES (1, 123, 'gx3', '/2325');
INSERT INTO `sys_process` VALUES (2, 456, 'gx2', '/2325');
INSERT INTO `sys_process` VALUES (4, 2204051, 'gx1', '2325');
INSERT INTO `sys_process` VALUES (5, 2204052, '1', '2325');
INSERT INTO `sys_process` VALUES (6, 2204053, '2', '2325');
INSERT INTO `sys_process` VALUES (7, 2204054, '3', '2325');
INSERT INTO `sys_process` VALUES (8, 2204055, '4', '/2325');
INSERT INTO `sys_process` VALUES (9, 2204056, '5', '/2325');
INSERT INTO `sys_process` VALUES (10, 2204057, '6', '/2325');
INSERT INTO `sys_process` VALUES (11, 2204058, '7', '/2325');
INSERT INTO `sys_process` VALUES (12, 2204059, '8', '/2325');
INSERT INTO `sys_process` VALUES (19, 22040510, '4', '/2325');
INSERT INTO `sys_process` VALUES (23, 22040511, '5', '/2325');
INSERT INTO `sys_process` VALUES (24, 22040512, '6', '2325');

-- ----------------------------
-- Table structure for sys_product
-- ----------------------------
DROP TABLE IF EXISTS `sys_product`;
CREATE TABLE `sys_product`  (
  `pr_id` int NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `pr_code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '公司编号+产品唯一标识+批次+数量',
  `pr_company` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '产品所属公司',
  `pr_batch` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '产品批次',
  `pr_count` int NOT NULL COMMENT '产品数量',
  `pr_remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`pr_id`) USING BTREE,
  UNIQUE INDEX `pr_code`(`pr_code`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_product
-- ----------------------------
INSERT INTO `sys_product` VALUES (1, '202201010101', '2325', '001', 20, '');

-- ----------------------------
-- Table structure for sys_product_process
-- ----------------------------
DROP TABLE IF EXISTS `sys_product_process`;
CREATE TABLE `sys_product_process`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `product_type_code` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '产品类型code',
  `process_code` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '工序code',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_product_process
-- ----------------------------
INSERT INTO `sys_product_process` VALUES (5, '2204121', '2204051');
INSERT INTO `sys_product_process` VALUES (6, '2204121', '2204054');
INSERT INTO `sys_product_process` VALUES (7, '2204121', '2204053');
INSERT INTO `sys_product_process` VALUES (8, '1', '2204053');
INSERT INTO `sys_product_process` VALUES (9, '1', '2204054');
INSERT INTO `sys_product_process` VALUES (12, '2203311', '2204054');

-- ----------------------------
-- Table structure for sys_product_propties
-- ----------------------------
DROP TABLE IF EXISTS `sys_product_propties`;
CREATE TABLE `sys_product_propties`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `product_type_code` int NOT NULL COMMENT '产品类型code',
  `propties_code` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '属性唯一标识符',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 17 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_product_propties
-- ----------------------------
INSERT INTO `sys_product_propties` VALUES (15, 2204121, '2204221');
INSERT INTO `sys_product_propties` VALUES (16, 2204121, '2204222');

-- ----------------------------
-- Table structure for sys_propties
-- ----------------------------
DROP TABLE IF EXISTS `sys_propties`;
CREATE TABLE `sys_propties`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `propties_name` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '属性名',
  `propties_company_code` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '所属公司',
  `propties_code` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '属性唯一标识符',
  `propties_type` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '属性特殊字段（颜色、图片）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 31 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_propties
-- ----------------------------
INSERT INTO `sys_propties` VALUES (1, '材质', '2325', 'ad-47a47745-ad', 'yes');
INSERT INTO `sys_propties` VALUES (2, '颜色', '1', '2204221', NULL);
INSERT INTO `sys_propties` VALUES (3, '尺寸', '1', '2204222', NULL);
INSERT INTO `sys_propties` VALUES (4, '样式', '1', '2204223', NULL);
INSERT INTO `sys_propties` VALUES (30, '属性1', '2325', 'a1166a0133b94445a78c91ee0b842789', 'no');

-- ----------------------------
-- Table structure for sys_show_table
-- ----------------------------
DROP TABLE IF EXISTS `sys_show_table`;
CREATE TABLE `sys_show_table`  (
  `st_id` int NOT NULL AUTO_INCREMENT,
  `st_table` int NOT NULL COMMENT '表名',
  `st_column` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `st_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`st_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 15 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_show_table
-- ----------------------------
INSERT INTO `sys_show_table` VALUES (2, 12, 'uId', 'ID');
INSERT INTO `sys_show_table` VALUES (6, 12, 'uUsername', '用户名');
INSERT INTO `sys_show_table` VALUES (7, 12, 'uCode', '用户编号');
INSERT INTO `sys_show_table` VALUES (8, 12, 'uCompanyDetail', '所属公司');
INSERT INTO `sys_show_table` VALUES (9, 12, 'uPositionDetail', '职位');
INSERT INTO `sys_show_table` VALUES (10, 12, 'uTimeStart', '开始时间');
INSERT INTO `sys_show_table` VALUES (11, 12, 'uTimeEnd', '结束时间');
INSERT INTO `sys_show_table` VALUES (12, 12, 'uPhone', '联系方式');
INSERT INTO `sys_show_table` VALUES (13, 1, 'cId', 'ID');
INSERT INTO `sys_show_table` VALUES (14, 1, 'cName', '名称');
INSERT INTO `sys_show_table` VALUES (15, 1, 'cCode', '颜色编号');

-- ----------------------------
-- Table structure for sys_size
-- ----------------------------
DROP TABLE IF EXISTS `sys_size`;
CREATE TABLE `sys_size`  (
  `s_id` int NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `s_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '尺寸',
  `s_code` int NOT NULL COMMENT '尺寸编号',
  `s_company` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '0',
  PRIMARY KEY (`s_id`) USING BTREE,
  UNIQUE INDEX `s_code`(`s_code`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_size
-- ----------------------------
INSERT INTO `sys_size` VALUES (1, '大', 2203291, '2325');
INSERT INTO `sys_size` VALUES (2, '中', 2203292, '2325');
INSERT INTO `sys_size` VALUES (3, '小', 2203293, '/2325');

-- ----------------------------
-- Table structure for sys_style
-- ----------------------------
DROP TABLE IF EXISTS `sys_style`;
CREATE TABLE `sys_style`  (
  `st_id` int NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `st_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '样式',
  `st_code` int NOT NULL COMMENT '样式编号',
  `st_img` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `st_company` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '0',
  PRIMARY KEY (`st_id`) USING BTREE,
  UNIQUE INDEX `st_code`(`st_code`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 55 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_style
-- ----------------------------
INSERT INTO `sys_style` VALUES (52, '1', 2203141, 'http:\\\\127.0.0.1:8085\\static\\upload\\1647263938213无标题.jpg', '2325');
INSERT INTO `sys_style` VALUES (53, '2', 2203142, 'http:\\\\127.0.0.1:8085\\static\\upload\\1647263947789注册.png', '2325');
INSERT INTO `sys_style` VALUES (54, '3', 2203143, 'http:\\\\127.0.0.1:8085\\static\\upload\\1647263956291注册1.png', '2325');
INSERT INTO `sys_style` VALUES (55, '46', 2203151, 'http:\\\\127.0.0.1:8085\\static\\upload\\1647352530182R-C.png', '/2325');
INSERT INTO `sys_style` VALUES (56, '样式图片测试', 2204241, 'http:\\\\127.0.0.1:8085\\static\\upload\\1650787912408测试图片.png', '2325');

-- ----------------------------
-- Table structure for sys_table_info
-- ----------------------------
DROP TABLE IF EXISTS `sys_table_info`;
CREATE TABLE `sys_table_info`  (
  `ti_id` int NOT NULL AUTO_INCREMENT,
  `ti_table` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `ti_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `ti_lable` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '通俗叫法',
  PRIMARY KEY (`ti_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_table_info
-- ----------------------------
INSERT INTO `sys_table_info` VALUES (1, 'sys_color', '颜色表', '颜色');
INSERT INTO `sys_table_info` VALUES (2, 'sys_company', '公司表', NULL);
INSERT INTO `sys_table_info` VALUES (3, 'sys_operation_table', '前端展示对应表', NULL);
INSERT INTO `sys_table_info` VALUES (4, 'sys_position', '职位表', NULL);
INSERT INTO `sys_table_info` VALUES (5, 'sys_process', '工序表', '工序');
INSERT INTO `sys_table_info` VALUES (6, 'sys_process_remark', '工序备注表', NULL);
INSERT INTO `sys_table_info` VALUES (7, 'sys_product', '产品表', NULL);
INSERT INTO `sys_table_info` VALUES (8, 'sys_size', '尺寸表', '尺寸');
INSERT INTO `sys_table_info` VALUES (9, 'sys_style', '样式表', '样式');
INSERT INTO `sys_table_info` VALUES (10, 'sys_table_info', '表信息表', NULL);
INSERT INTO `sys_table_info` VALUES (11, 'sys_type', '种类表', '种类');
INSERT INTO `sys_table_info` VALUES (12, 'sys_user', '用户表', NULL);

-- ----------------------------
-- Table structure for sys_type
-- ----------------------------
DROP TABLE IF EXISTS `sys_type`;
CREATE TABLE `sys_type`  (
  `t_id` int NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `t_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '种类',
  `t_code` int NOT NULL COMMENT '种类编号',
  `t_company` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '0',
  PRIMARY KEY (`t_id`) USING BTREE,
  UNIQUE INDEX `t_code`(`t_code`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_type
-- ----------------------------
INSERT INTO `sys_type` VALUES (1, '童装', 1, '2325');
INSERT INTO `sys_type` VALUES (2, '老年', 2, '/2325');
INSERT INTO `sys_type` VALUES (3, '挡风被', 3, '/2325');
INSERT INTO `sys_type` VALUES (5, '挡风被', 2203311, '2325');
INSERT INTO `sys_type` VALUES (6, '老年装', 2204121, '2325');
INSERT INTO `sys_type` VALUES (7, '口罩', 2204211, '/2325');

-- ----------------------------
-- Table structure for sys_url_auth
-- ----------------------------
DROP TABLE IF EXISTS `sys_url_auth`;
CREATE TABLE `sys_url_auth`  (
  `ua_id` int NOT NULL AUTO_INCREMENT,
  `ua_url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `ua_auth` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`ua_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_url_auth
-- ----------------------------
INSERT INTO `sys_url_auth` VALUES (1, '/12', '003,005');

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user`  (
  `u_id` int NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `u_username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  `u_code` int NOT NULL COMMENT '用户编号',
  `u_password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `u_phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '联系方式',
  `u_company` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '公司编号',
  `u_position` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '职位',
  `u_time_start` bigint NULL DEFAULT NULL COMMENT '开始时间',
  `u_time_end` bigint NULL DEFAULT NULL COMMENT '结束时间',
  `u_token` int NULL DEFAULT NULL COMMENT '是否登录',
  `u_nick_code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`u_id`) USING BTREE,
  UNIQUE INDEX `u_code`(`u_code`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 34 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES (9, 'mary', 2112005, '$2a$10$btygvFaW2smnY2ooEGDecuIDNGbD64v1dGri1dib0OQSZ31m07SR6', '15755504268', '/2102/', '/001/', 1655445242, 1655445242, 1, '/2102.2/');
INSERT INTO `sys_user` VALUES (10, 'jay', 2112006, '$2a$10$s2aEwRqzseGVyhFcnhCIxOAGVNAz9JWONOb9d/pcRMOdI./FM1wZq', '1542568656', '/2325//2102/', '/1//2/', 23365455, 1623534, 1, '/2102.5//2325.5/');
INSERT INTO `sys_user` VALUES (15, 'jj', 2102001, '$2a$10$s2aEwRqzseGVyhFcnhCIxOAGVNAz9JWONOb9d/pcRMOdI./FM1wZq', '1542568656', '/2325//2203/', '/001/', 23365455, 1623534, 1, '/2325.6/');
INSERT INTO `sys_user` VALUES (21, '2', 2201253, '$2a$10$1JLJB3M/N6kDGtqknRImDOdDbCYBQNC.HN/VhjooeofgSP.TbWNzq', '15755504268', '/2102/', '/001/', 1643115515362, NULL, NULL, '/2102.3/');
INSERT INTO `sys_user` VALUES (22, '赵杰杰', 2201254, '$2a$10$JLlX9dVjoLyt906pEfX1COVAiHp7VnBEj5GlmSFdHcBQtxEyw0rQ6', '15755504268', '/2102/', '/001/', 1643116114774, NULL, NULL, '/2102.4/');
INSERT INTO `sys_user` VALUES (23, 'jj', 2201255, '$2a$10$uhzZN/4HHeFPHxxCX8WJU.fy9d4.TMxcK6vtxAiOCg/D6kYEFTR2m', '15755504268', '/2325/', '/002/', 1643116586069, NULL, NULL, '/2325.1/');
INSERT INTO `sys_user` VALUES (25, 'Jay Zhao', 2201271, '$2a$10$mNxO8gK5hRGwmvOYgiCp0eEt1zD3eFlqQbznfeh42QHfChMXIozB.', '18326780180', '/2325/', '/002//003/', 1643290538310, NULL, NULL, '/2325.7/');
INSERT INTO `sys_user` VALUES (30, '赵杰杰', 2201302, '$2a$10$RKFcZIqtb4Smprzy1vynOuic3ZxfSDgAX7RFQpsOXLTKK8ShWUiQu', '18326780180', '/2325/', '/002/', 1643517629348, NULL, NULL, '/2325.10/');
INSERT INTO `sys_user` VALUES (32, 'liubei', 2201303, '$2a$10$L1jTQJuF8Zjj9lqFb8zEHuQUkVnedcaesiHG9GPIgMUDc2gpdZ1/O', '18326457852', '/2102/', '/001/', 1644215805457, NULL, NULL, '/2102.6/');
INSERT INTO `sys_user` VALUES (33, '太空氛围', 2204141, '$2a$10$uAAJvYD1cRcnRb6W6SgFx.0MKGiWlzc8kH1CnfyJY/8NzvmLll/Ii', '15755504269', '/2325/', '/3/', 1649943695935, NULL, NULL, '/2325.16/');

SET FOREIGN_KEY_CHECKS = 1;
