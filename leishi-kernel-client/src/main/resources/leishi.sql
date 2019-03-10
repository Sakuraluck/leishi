/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : leishi

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2019-03-10 15:09:17
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
  `sign` int(1) DEFAULT NULL COMMENT '1:常用0，备用',
  `bank_address` varchar(200) DEFAULT NULL COMMENT '银行地址',
  `em_id` int(11) DEFAULT NULL COMMENT '员工id',
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='银行卡号信息';

-- ----------------------------
-- Records of bank_info
-- ----------------------------
INSERT INTO `bank_info` VALUES ('1', '23543453', '招商', '武汉', '1', '江汉路', '1', '2019-03-08 11:33:49', '2019-03-08 11:29:21');

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
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 COMMENT='字典表';

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
INSERT INTO `dictionary` VALUES ('12', 'bank', '光大银行', '光大银行');
INSERT INTO `dictionary` VALUES ('13', 'bank', '招商银行', '招商银行');
INSERT INTO `dictionary` VALUES ('14', 'bank', '工商银行', '工商银行');
INSERT INTO `dictionary` VALUES ('15', 'bank', '中国银行', '中国银行');
INSERT INTO `dictionary` VALUES ('16', 'bank', '农业银行', '农业银行');

-- ----------------------------
-- Table structure for `employee`
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL COMMENT '姓名',
  `age` int(2) DEFAULT NULL COMMENT '年龄',
  `work_id` int(11) DEFAULT NULL COMMENT '工地id',
  `phone` varchar(12) DEFAULT NULL COMMENT '电话号码',
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
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES ('1', '老马', '55', null, '11111111111', '422802199305142139', 'LM', '未知', '未知', 'e10adc3949ba59abbe56e057f20f883e', '8', '2019-01-20 18:24:28', '2019-01-20 18:24:28', '1');
INSERT INTO `employee` VALUES ('2', '钱红军', '0', null, '18772118542', '422802199305142138', 'QHJ', 'DF', 'FAAG', '8ce4790219249153a2f861e0439ba78d', '1', '2019-02-01 14:43:00', '2019-02-01 14:43:00', '1');

-- ----------------------------
-- Table structure for `salary`
-- ----------------------------
DROP TABLE IF EXISTS `salary`;
CREATE TABLE `salary` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `em_id` int(11) NOT NULL,
  `work_id` int(11) NOT NULL COMMENT '工地id',
  `years` int(5) NOT NULL,
  `moths` int(3) NOT NULL,
  `timesheets` double(2,2) NOT NULL COMMENT '工时',
  `day_salary` int(4) NOT NULL COMMENT '当月日薪',
  `month_salary` double(11,2) NOT NULL COMMENT '当月核算月薪',
  `create_time` timestamp NULL DEFAULT NULL,
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='薪资表';

-- ----------------------------
-- Records of salary
-- ----------------------------

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
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COMMENT='员工薪资等级记录表';

-- ----------------------------
-- Records of salary_record
-- ----------------------------
INSERT INTO `salary_record` VALUES ('1', '0', '3', '3', '入职', '2019-01-01 16:17:19', '新员工入职！');
INSERT INTO `salary_record` VALUES ('2', '0', '3', '5', '入职', '2019-01-01 16:17:17', '新员工入职！');
INSERT INTO `salary_record` VALUES ('3', '3', '2', '2', '降薪', '2019-01-01 16:15:17', '重大失误一次，所以降薪');
INSERT INTO `salary_record` VALUES ('4', '0', '8', '6', '入职', '2019-01-20 18:18:57', '新员工入职！');
INSERT INTO `salary_record` VALUES ('5', '0', '8', '7', '入职', '2019-01-20 18:20:44', '新员工入职！');
INSERT INTO `salary_record` VALUES ('6', '0', '8', '1', '入职', '2019-01-20 18:24:28', '新员工入职！');
INSERT INTO `salary_record` VALUES ('7', '0', '1', '2', '入职', '2019-02-01 14:43:00', '新员工入职！');

-- ----------------------------
-- Table structure for `schedule_job`
-- ----------------------------
DROP TABLE IF EXISTS `schedule_job`;
CREATE TABLE `schedule_job` (
  `job_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `create_time` timestamp NULL DEFAULT NULL,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `job_name` varchar(255) DEFAULT NULL,
  `job_group` varchar(255) DEFAULT NULL,
  `job_status` varchar(255) DEFAULT NULL,
  `cron_expression` varchar(255) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `bean_class` varchar(255) DEFAULT NULL,
  `is_concurrent` varchar(255) DEFAULT NULL COMMENT '1',
  `spring_id` varchar(255) DEFAULT NULL,
  `method_name` varchar(255) NOT NULL,
  PRIMARY KEY (`job_id`),
  UNIQUE KEY `name_group` (`job_name`,`job_group`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of schedule_job
-- ----------------------------

-- ----------------------------
-- Table structure for `timesheets`
-- ----------------------------
DROP TABLE IF EXISTS `timesheets`;
CREATE TABLE `timesheets` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `em_id` int(11) NOT NULL COMMENT '员工id',
  `years` int(5) NOT NULL COMMENT '年份',
  `months` int(2) NOT NULL COMMENT '月份',
  `day01` double(3,2) NOT NULL DEFAULT '0.00' COMMENT '工时',
  `day02` double(3,2) NOT NULL DEFAULT '0.00' COMMENT '工时',
  `day03` double(3,2) NOT NULL DEFAULT '0.00',
  `day04` double(3,2) NOT NULL DEFAULT '0.00' COMMENT '工时',
  `day05` double(3,2) NOT NULL DEFAULT '0.00' COMMENT '工时',
  `day06` double(3,2) NOT NULL DEFAULT '0.00' COMMENT '工时',
  `day07` double(3,2) NOT NULL DEFAULT '0.00' COMMENT '工时',
  `day08` double(3,2) NOT NULL DEFAULT '0.00' COMMENT '工时',
  `day09` double(3,2) NOT NULL DEFAULT '0.00' COMMENT '工时',
  `day10` double(3,2) unsigned zerofill NOT NULL DEFAULT '0.00' COMMENT '工时',
  `day11` double(3,2) NOT NULL DEFAULT '0.00' COMMENT '工时',
  `day12` double(3,2) NOT NULL DEFAULT '0.00' COMMENT '工时',
  `day13` double(3,2) NOT NULL DEFAULT '0.00' COMMENT '工时',
  `day14` double(3,2) NOT NULL DEFAULT '0.00' COMMENT '工时',
  `day15` double(3,2) NOT NULL DEFAULT '0.00' COMMENT '工时',
  `day16` double(3,2) NOT NULL DEFAULT '0.00' COMMENT '工时',
  `day17` double(3,2) NOT NULL DEFAULT '0.00' COMMENT '工时',
  `day18` double(3,2) NOT NULL DEFAULT '0.00' COMMENT '工时',
  `day19` double(3,2) NOT NULL DEFAULT '0.00' COMMENT '工时',
  `day20` double(3,2) NOT NULL DEFAULT '0.00' COMMENT '工时',
  `day21` double(3,2) NOT NULL DEFAULT '0.00' COMMENT '工时',
  `day22` double(3,2) NOT NULL DEFAULT '0.00' COMMENT '工时',
  `day23` double(3,2) NOT NULL DEFAULT '0.00' COMMENT '工时',
  `day24` double(3,2) NOT NULL DEFAULT '0.00' COMMENT '工时',
  `day25` double(3,2) NOT NULL DEFAULT '0.00' COMMENT '工时',
  `day26` double(3,2) NOT NULL DEFAULT '0.00' COMMENT '工时',
  `day27` double(3,2) NOT NULL DEFAULT '0.00' COMMENT '工时',
  `day28` double(3,2) NOT NULL DEFAULT '0.00' COMMENT '工时',
  `day29` double(3,2) NOT NULL DEFAULT '0.00' COMMENT '工时',
  `day30` double(3,2) NOT NULL DEFAULT '0.00' COMMENT '工时',
  `day31` double(3,2) NOT NULL DEFAULT '0.00' COMMENT '工时',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='工时表';

-- ----------------------------
-- Records of timesheets
-- ----------------------------
INSERT INTO `timesheets` VALUES ('1', '2', '1', '1', '1.50', '1.00', '0.00', '1.00', '1.00', '1.50', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00');
INSERT INTO `timesheets` VALUES ('2', '1', '2009', '2', '0.00', '0.00', '1.50', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00');

-- ----------------------------
-- Table structure for `work_area`
-- ----------------------------
DROP TABLE IF EXISTS `work_area`;
CREATE TABLE `work_area` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `area_name` varchar(200) DEFAULT NULL,
  `area_desc` varchar(500) DEFAULT NULL COMMENT '工地描述',
  `emp_id` int(11) DEFAULT NULL COMMENT '工地负责人',
  `stakeholder` varchar(10) DEFAULT NULL COMMENT '项目干系人',
  `st_phone` varchar(15) DEFAULT NULL COMMENT '项目干系人电话',
  `status` int(1) NOT NULL DEFAULT '1' COMMENT '工地状态：1未完工，0完工',
  `area_address` varchar(100) DEFAULT NULL COMMENT '工地地址',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `create_user` int(11) DEFAULT NULL COMMENT '创建用户',
  `update_user` int(11) DEFAULT NULL COMMENT '更新用户',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='工地信息表';

-- ----------------------------
-- Records of work_area
-- ----------------------------
INSERT INTO `work_area` VALUES ('1', '孝感保利', null, '1', '吴兴军', '18772118541', '1', '湖北省孝感市', null, '2019-03-10 14:52:59', '1', '1');
INSERT INTO `work_area` VALUES ('2', '湖南长沙工地', '南湖长沙,2', null, '吴兴军', '18772118541', '1', '湖南省长沙市，长沙县', null, null, null, null);
INSERT INTO `work_area` VALUES ('3', '湖南长沙工地', '南湖长沙,2', null, '吴兴军', '18772118541', '1', '湖南省长沙市，长沙县', '2019-03-10 15:06:49', '2019-03-10 15:06:49', '1', '1');

-- ----------------------------
-- Table structure for `work_record`
-- ----------------------------
DROP TABLE IF EXISTS `work_record`;
CREATE TABLE `work_record` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `work_id` int(11) DEFAULT NULL COMMENT '工地ID',
  `work_area` varchar(40) DEFAULT NULL COMMENT '工地名称',
  `specific` varchar(100) DEFAULT NULL COMMENT '具体位置',
  `wide` decimal(11,2) DEFAULT NULL COMMENT '宽',
  `lengths` decimal(11,2) DEFAULT NULL COMMENT '长',
  `hights` decimal(11,2) DEFAULT NULL COMMENT '高',
  `area` decimal(11,2) DEFAULT NULL COMMENT '面积',
  `volume` decimal(11,2) DEFAULT NULL COMMENT '体积',
  `create_user` int(11) NOT NULL COMMENT '创建用户',
  `update_user` int(11) DEFAULT NULL COMMENT '更新用户',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='工作记录表';

-- ----------------------------
-- Records of work_record
-- ----------------------------
