/*
Navicat MySQL Data Transfer

Source Server         : vote
Source Server Version : 50516
Source Host           : localhost:3306
Source Database       : bookmanage

Target Server Type    : MYSQL
Target Server Version : 50516
File Encoding         : 65001

Date: 2019-07-13 11:05:11
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `book_id` int(255) NOT NULL AUTO_INCREMENT,
  `book_name` varchar(255) NOT NULL,
  `book_isbn` varchar(255) NOT NULL,
  `book_author` varchar(255) NOT NULL,
  `book_status` varchar(255) NOT NULL,
  PRIMARY KEY (`book_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES ('1', '西游记', '324234234', '吴承恩', '未借');
INSERT INTO `book` VALUES ('2', '平凡的世界', '343252545', '路遥', '未借');
INSERT INTO `book` VALUES ('3', '三国演义', '54541321', '罗贯中', '未借');
