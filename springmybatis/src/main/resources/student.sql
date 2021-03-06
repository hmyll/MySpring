/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50543
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50543
File Encoding         : 65001

Date: 2020-11-29 18:12:34
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `student`
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `age` int(3) DEFAULT NULL,
  `score` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=50 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('3', '李明', '20', '8');
INSERT INTO `student` VALUES ('5', '李四', '19', '8');
INSERT INTO `student` VALUES ('6', '王五', '20', '8');
INSERT INTO `student` VALUES ('7', '王五', '20', '8');
INSERT INTO `student` VALUES ('8', '援朝', '23', '90');
INSERT INTO `student` VALUES ('9', '王五', '20', '8');
INSERT INTO `student` VALUES ('10', '王五', '20', '8');
INSERT INTO `student` VALUES ('11', '王五', '20', '8');
INSERT INTO `student` VALUES ('12', '王五', '20', '8');
INSERT INTO `student` VALUES ('13', '王五', '20', '8');
INSERT INTO `student` VALUES ('14', '王五', '20', '8');
INSERT INTO `student` VALUES ('15', '王五', '20', '8');
INSERT INTO `student` VALUES ('16', '王五', '20', '8');
INSERT INTO `student` VALUES ('17', '王五', '20', '8');
INSERT INTO `student` VALUES ('18', '王五', '20', '8');
INSERT INTO `student` VALUES ('19', '王五', '20', '8');
INSERT INTO `student` VALUES ('20', '王五', '20', '8');
INSERT INTO `student` VALUES ('21', '王五', '20', '8');
INSERT INTO `student` VALUES ('22', '王五', '20', '8');
INSERT INTO `student` VALUES ('23', '王五', '20', '8');
INSERT INTO `student` VALUES ('24', '王五', '20', '8');
INSERT INTO `student` VALUES ('25', '王五', '20', '8');
INSERT INTO `student` VALUES ('26', '王五', '20', '8');
INSERT INTO `student` VALUES ('27', '王五', '20', '8');
INSERT INTO `student` VALUES ('28', '王五', '20', '8');
INSERT INTO `student` VALUES ('29', '王五', '20', '8');
INSERT INTO `student` VALUES ('30', '王五', '20', '8');
INSERT INTO `student` VALUES ('31', '王五', '20', '8');
INSERT INTO `student` VALUES ('32', '王五', '20', '8');
INSERT INTO `student` VALUES ('33', '王五', '20', '8');
INSERT INTO `student` VALUES ('34', '王五', '20', '8');
INSERT INTO `student` VALUES ('35', '王五', '20', '8');
INSERT INTO `student` VALUES ('36', '王五', '20', '8');
INSERT INTO `student` VALUES ('37', '王五', '20', '8');
INSERT INTO `student` VALUES ('38', '王五', '20', '8');
INSERT INTO `student` VALUES ('39', '王五', '20', '8');
INSERT INTO `student` VALUES ('40', '王五', '20', '8');
INSERT INTO `student` VALUES ('41', '张三', '20', '98.5');
INSERT INTO `student` VALUES ('42', '张三', '20', '98.5');
INSERT INTO `student` VALUES ('43', '张飞', '25', '90');
INSERT INTO `student` VALUES ('44', '张三', '23', null);
INSERT INTO `student` VALUES ('45', '张三', '23', null);
INSERT INTO `student` VALUES ('46', '张三', '23', null);
INSERT INTO `student` VALUES ('47', '张三', '23', null);
INSERT INTO `student` VALUES ('48', '张三', '23', null);
INSERT INTO `student` VALUES ('49', 'çä¼¦', '23', null);
