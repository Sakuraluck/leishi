/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : leishi

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2019-01-09 15:46:26
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `bank_info`
-- ----------------------------
DROP TABLE IF EXISTS `bank_info`;
CREATE TABLE `bank_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `bank_card` varchar(20) DEFAULT NULL COMMENT '银行卡号',
  `bank_name` varchar(20) DEFAULT NULL COMMENT '银行名称',
  `bank_deposit` varchar(100) DEFAULT NULL COMMENT '开户行',
  `bank_address` varchar(200) DEFAULT NULL COMMENT '银行地址',
  `em_id` int(11) DEFAULT NULL COMMENT '员工id',
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='银行卡号信息';

-- ----------------------------
-- Records of bank_info
-- ----------------------------

-- ----------------------------
-- Table structure for `dictionary`
-- ----------------------------
DROP TABLE IF EXISTS `dictionary`;
CREATE TABLE `dictionary` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `key` varchar(100) DEFAULT NULL,
  `text` varchar(100) DEFAULT NULL,
  `descript` varchar(255) DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8 COMMENT='字典表';

-- ----------------------------
-- Records of dictionary
-- ----------------------------
INSERT INTO `dictionary` VALUES ('1', 'salary', '170', '一级');
INSERT INTO `dictionary` VALUES ('2', 'salary', '180', '二级');
INSERT INTO `dictionary` VALUES ('3', 'salary', '200', '三级');
INSERT INTO `dictionary` VALUES ('4', 'salary', '250', '四级');
INSERT INTO `dictionary` VALUES ('5', 'salary', '280', '五级');
INSERT INTO `dictionary` VALUES ('6', 'salary', '300', '六级');
INSERT INTO `dictionary` VALUES ('7', 'salary', '350', '七级');
INSERT INTO `dictionary` VALUES ('8', 'salary', '400', '八级');
INSERT INTO `dictionary` VALUES ('9', 'salary', '500', '九级');
INSERT INTO `dictionary` VALUES ('10', 'color', '红色', null);
INSERT INTO `dictionary` VALUES ('11', 'color', '白色', null);

-- ----------------------------
-- Table structure for `employee`
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL COMMENT '姓名',
  `age` int(2) DEFAULT NULL COMMENT '年龄',
  `phone` int(11) DEFAULT NULL COMMENT '电话号码',
  `identity` varchar(20) NOT NULL COMMENT '身份证号',
  `user_name` varchar(100) DEFAULT NULL COMMENT '登录用户名',
  `comm_address` varchar(100) DEFAULT NULL COMMENT '通讯地址',
  `home_address` varchar(100) DEFAULT NULL COMMENT '家庭住址',
  `password` varchar(100) DEFAULT NULL COMMENT '密码',
  `salary_grade` int(1) DEFAULT NULL COMMENT '薪资等级',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `status` int(1) DEFAULT NULL COMMENT '状态：1在职，0离职',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES ('1', 'WXJ', '25', '1877211854', '422802199305142139', 'WXJ', '湖北利川', '湖北利川', '123456', '1', '2019-01-01 12:19:29', '2019-01-09 14:56:46', '1');
INSERT INTO `employee` VALUES ('2', '钱红军', '26', '1877211854', '422802199305142139', 'QHJ', '湖北利川', '湖北利川', 'QHJ', '2', '2019-01-01 15:34:24', '2019-01-09 14:56:23', '1');
INSERT INTO `employee` VALUES ('3', '钱红军', '26', '1877211854', '422802199305142139', 'QHJ', '湖北利川', '湖北利川', 'QHJ', '3', '2019-01-01 15:36:46', '2019-01-09 14:56:23', '1');
INSERT INTO `employee` VALUES ('4', '钱红军', '26', '1877211854', '422802199305142139', 'QHJ', '湖北利川', '湖北利川', 'QHJ', '3', '2019-01-01 15:40:25', '2019-01-09 14:56:24', '1');
INSERT INTO `employee` VALUES ('5', '钱红军', '26', '1877211854', '422802199305142139', 'QHJ', '湖北利川', '湖北利川', 'QHJ', '3', '2019-01-01 15:42:02', '2019-01-09 14:56:24', '1');

-- ----------------------------
-- Table structure for `salary_record`
-- ----------------------------
DROP TABLE IF EXISTS `salary_record`;
CREATE TABLE `salary_record` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `before_greade` int(1) NOT NULL COMMENT '原来的薪资等级',
  `after_greade` int(1) NOT NULL COMMENT '变化后薪资等级',
  `em_id` int(11) NOT NULL COMMENT '员工id',
  `change_desc` varchar(100) NOT NULL COMMENT '变化描述',
  `create_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `reason` varchar(400) NOT NULL COMMENT '升降原因',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='员工薪资等级记录表';

-- ----------------------------
-- Records of salary_record
-- ----------------------------
INSERT INTO `salary_record` VALUES ('1', '0', '3', '3', '入职', '2019-01-01 16:17:19', '新员工入职！');
INSERT INTO `salary_record` VALUES ('2', '0', '3', '5', '入职', '2019-01-01 16:17:17', '新员工入职！');
INSERT INTO `salary_record` VALUES ('3', '3', '2', '2', '降薪', '2019-01-01 16:15:17', '重大失误一次，所以降薪');

-- ----------------------------
-- Table structure for `work_area`
-- ----------------------------
DROP TABLE IF EXISTS `work_area`;
CREATE TABLE `work_area` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `area_name` varchar(200) DEFAULT NULL,
  `area_desc` varchar(500) DEFAULT NULL COMMENT '工地描述',
  `emp_id` int(11) DEFAULT NULL COMMENT '工地负责人',
  `area_address` varchar(100) DEFAULT NULL COMMENT '工地地址',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `create_user` int(11) DEFAULT NULL COMMENT '创建用户',
  `update_user` int(11) DEFAULT NULL COMMENT '更新用户',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='工地信息表';

-- ----------------------------
-- Records of work_area
-- ----------------------------

-- ----------------------------
-- Table structure for `work_record`
-- ----------------------------
DROP TABLE IF EXISTS `work_record`;
CREATE TABLE `work_record` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `work_area` varchar(40) DEFAULT NULL COMMENT '工地名称',
  `work_id` int(11) DEFAULT NULL COMMENT '工地ID',
  `wide` decimal(11,2) DEFAULT NULL COMMENT '宽',
  `lengths` decimal(11,2) DEFAULT NULL COMMENT '长',
  `hights` decimal(11,2) DEFAULT NULL COMMENT '高',
  `area` decimal(11,2) DEFAULT NULL COMMENT '面积',
  `volume` decimal(11,2) DEFAULT NULL COMMENT '体积',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `create_user` int(11) NOT NULL COMMENT '创建用户',
  `update_user` int(11) DEFAULT NULL COMMENT '更新用户',
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='工作记录表';

-- ----------------------------
-- Records of work_record
-- ----------------------------
