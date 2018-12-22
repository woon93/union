-- MySQL dump 10.13  Distrib 8.0.12, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: union
-- ------------------------------------------------------
-- Server version	8.0.12

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `articleinfo`
--

DROP TABLE IF EXISTS `union`.`articleinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `union`.`articleinfo` (
  `ARTICLE_ID` varchar(8) NOT NULL COMMENT '文章ID',
  `ARTICLE_CONTENT` char(8) NOT NULL COMMENT '内容',
  `ARTICLE_STATUS` char(2) DEFAULT '' COMMENT '状态',
  `INSERT_TIME` datetime NOT NULL COMMENT '创建时间',
  `UPDATE_TIME` datetime NOT NULL COMMENT '更新时间',
  `UPDATE_CNT` int(2) NOT NULL DEFAULT '0' COMMENT '更新回数',
  PRIMARY KEY (`ARTICLE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='文章';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `articleinfo`
--

LOCK TABLES `union`.`articleinfo` WRITE;
/*!40000 ALTER TABLE `articleinfo` DISABLE KEYS */;
/*!40000 ALTER TABLE `articleinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `commentinfo`
--

DROP TABLE IF EXISTS `union`.`commentinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `union`.`commentinfo` (
  `COMMENT_ID` varchar(12) NOT NULL COMMENT '评论ID',
  `COMMENT_SEQ` int(11) NOT NULL DEFAULT '0' COMMENT '评论编号',
  `COMMENT_USER_ID` varchar(6) NOT NULL COMMENT '评论者',
  `COMMENT_CONTENT` char(8) NOT NULL COMMENT '内容',
  `COMMENT_STATUS` char(2) DEFAULT '' COMMENT '状态',
  `INSERT_TIME` datetime NOT NULL COMMENT '创建时间',
  `UPDATE_TIME` datetime NOT NULL COMMENT '更新时间',
  `UPDATE_CNT` int(3) NOT NULL DEFAULT '0' COMMENT '更新回数',
  `POST_ID` char(6) DEFAULT '‘’' COMMENT '帖子ID',
  `POST_NAME` varchar(45) DEFAULT NULL COMMENT '帖子标题',
  `COMMENT_USER_NAME` varchar(45) DEFAULT NULL COMMENT '评论者名',
  PRIMARY KEY (`COMMENT_ID`,`COMMENT_SEQ`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='评论信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `commentinfo`
--

LOCK TABLES `union`.`commentinfo` WRITE;
/*!40000 ALTER TABLE `commentinfo` DISABLE KEYS */;
INSERT INTO `union`.`commentinfo` VALUES ('10000001',1,'100001','是假评论x1','1','2018-12-18 00:00:00','2018-12-18 00:00:00',20181218,'100003','这又是什么鬼帖子x3','大王'),('10000002',1,'100001','是假评论x2','1','2018-12-18 00:00:00','2018-12-18 00:00:00',20181218,'100002','这又是什么鬼帖子x2','大王'),('10000003',1,'100001','是假评论x3','1','2018-12-18 00:00:00','2018-12-18 00:00:00',20181218,'100001','这又是什么鬼帖子x1','大王');
/*!40000 ALTER TABLE `commentinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `infomst`
--

DROP TABLE IF EXISTS `union`.`infomst`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `union`.`infomst` (
  `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `CLASS1` char(3) NOT NULL COMMENT '一级分类',
  `CLASS2` char(3) DEFAULT NULL COMMENT '二级分类',
  `CLASS3` char(3) DEFAULT NULL COMMENT '三级分类',
  `INDX` char(3) NOT NULL COMMENT '索引',
  `FLDNM` varchar(30) NOT NULL COMMENT '板块名称',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=1001 DEFAULT CHARSET=utf8 COMMENT='信息表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `infomst`
--

LOCK TABLES `union`.`infomst` WRITE;
/*!40000 ALTER TABLE `infomst` DISABLE KEYS */;
INSERT INTO `union`.`infomst` VALUES (0,'0','0','0','0','0'),(999,'999','999','999','999','999');
/*!40000 ALTER TABLE `infomst` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `iuserinfo`
--

DROP TABLE IF EXISTS `union`.`iuserinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `union`.`iuserinfo` (
  `USER_ID` varchar(6) NOT NULL COMMENT '成员ID',
  `USER_PASSWORD` char(8) NOT NULL COMMENT '密码',
  `USER_NAME` varchar(10) NOT NULL COMMENT '用户名',
  `USER_SEX` char(1) NOT NULL COMMENT '性别',
  `USER_IDENTITY` char(2) DEFAULT '' COMMENT '身份',
  `USER_HOMETOWN` varchar(6) NOT NULL COMMENT '籍贯',
  `POLITICAL_STASTUS` char(1) NOT NULL COMMENT '政治面貌',
  `USER_MAILADDRESS` varchar(30) NOT NULL COMMENT '邮箱地址',
  `USER_TEL` varchar(11) NOT NULL COMMENT '联系电话',
  `USER_ADDRESS` varchar(30) DEFAULT '' COMMENT '住址',
  `USER_STASTUS` varchar(10) DEFAULT '' COMMENT '状态',
  `USER_MESSAGE` varchar(140) DEFAULT '' COMMENT '用户签名',
  `INSERT_TIME` datetime NOT NULL COMMENT '插入时间',
  `UPDATE_TIME` datetime NOT NULL COMMENT '更新时间',
  `UPDATE_CNT` int(2) NOT NULL DEFAULT '0' COMMENT '更新回数',
  PRIMARY KEY (`USER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `iuserinfo`
--

LOCK TABLES `union`.`iuserinfo` WRITE;
/*!40000 ALTER TABLE `iuserinfo` DISABLE KEYS */;
INSERT INTO `union`.`iuserinfo` VALUES ('100001','100001','大王','男','99','陕西西安','9','dawang@163.com','13312341234','雁塔区天谷八路','在职','我怎么那么好看','2018-12-16 00:00:00','2018-12-16 00:00:00',0),('admin','admin','admin','男','99','陕西西安','9','dawang@163.com','13312341234','雁塔区天谷八路','在职','我怎么那么好看','2018-12-16 00:00:00','2018-12-16 00:00:00',0);
/*!40000 ALTER TABLE `iuserinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `newsmst`
--

DROP TABLE IF EXISTS `union`.`newsmst`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `union`.`newsmst` (
  `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `AREA` char(2) NOT NULL COMMENT '板块',
  `CLASS` char(2) NOT NULL COMMENT '分类',
  `TITLE` varchar(30) NOT NULL COMMENT '标题',
  `CONTNT` mediumtext NOT NULL COMMENT '内容',
  `PICID` char(6) NOT NULL COMMENT '图片ID',
  `GLANCN` int(6) NOT NULL COMMENT '浏览数',
  `LIKE` int(6) NOT NULL COMMENT '点赞数',
  `GRADE` char(1) NOT NULL COMMENT '评级',
  `WRTID` char(4) NOT NULL COMMENT '投稿者ID',
  `ADTID` char(4) NOT NULL COMMENT '投稿者ID',
  `PUBTIM` datetime NOT NULL COMMENT '发表时间',
  `MDFID` char(4) NOT NULL COMMENT '修改者ID',
  `MDFTM` datetime NOT NULL COMMENT '修改时间',
  `DELFLG` char(1) NOT NULL COMMENT '删除标识',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COMMENT='新闻表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `newsmst`
--

LOCK TABLES `union`.`newsmst` WRITE;
/*!40000 ALTER TABLE `newsmst` DISABLE KEYS */;
/*!40000 ALTER TABLE `newsmst` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pictureinfo`
--

DROP TABLE IF EXISTS `union`.`pictureinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `pictureinfo` (
  `PICTURE_ID` varchar(8) NOT NULL COMMENT '图片ID',
  `PICTURE_CONTENT` char(8) NOT NULL COMMENT '内容',
  `PICTURE_STATUS` char(2) DEFAULT '' COMMENT '状态',
  `INSERT_TIME` datetime NOT NULL COMMENT '创建时间',
  `UPDATE_TIME` datetime NOT NULL COMMENT '更新时间',
  `UPDATE_CNT` int(2) NOT NULL DEFAULT '0' COMMENT '更新回数',
  PRIMARY KEY (`PICTURE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='图片';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pictureinfo`
--

LOCK TABLES `union`.`pictureinfo` WRITE;
/*!40000 ALTER TABLE `pictureinfo` DISABLE KEYS */;
/*!40000 ALTER TABLE `pictureinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `postinfo`
--

DROP TABLE IF EXISTS `union`.`postinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `union`.`postinfo` (
  `POST_ID` varchar(6) NOT NULL DEFAULT '000000' COMMENT '贴子ID',
  `POST_SEQ` int(6) NOT NULL DEFAULT '1' COMMENT '楼层',
  `POST_USER_ID` varchar(6) NOT NULL COMMENT '跟贴者',
  `POST_COMMENT_ID` varchar(12) NOT NULL DEFAULT '00000000' COMMENT '评论ID',
  `POST_TITLE` varchar(30) NOT NULL COMMENT '标题',
  `POST_CONTENT` char(200) NOT NULL COMMENT '内容',
  `POST_STATUS` char(1) DEFAULT '' COMMENT '状态',
  `INSERT_TIME` datetime NOT NULL COMMENT '创建时间',
  `UPDATE_TIME` datetime NOT NULL COMMENT '更新时间',
  `UPDATE_CNT` int(2) NOT NULL DEFAULT '0' COMMENT '更新回数',
  `POST_TAG` char(15) DEFAULT NULL COMMENT '帖子标签',
  PRIMARY KEY (`POST_ID`,`POST_SEQ`,`POST_COMMENT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='贴子信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `postinfo`
--

LOCK TABLES `union`.`postinfo` WRITE;
/*!40000 ALTER TABLE `postinfo` DISABLE KEYS */;
INSERT INTO `union`.`postinfo` VALUES ('100001',1,'100001','10000001','20181218','这又是什么鬼帖子','1','2018-12-18 00:00:00','2018-12-18 00:00:00',1,NULL),('100002',1,'100001','10000001','20181218','这又是什么鬼帖子x2','1','2018-12-18 00:00:00','2018-12-18 00:00:00',1,NULL),('100003',1,'100001','10000001','20181218','这又是什么鬼帖子x3','1','2018-12-18 00:00:00','2018-12-18 00:00:00',1,NULL);
/*!40000 ALTER TABLE `postinfo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-12-19 23:58:19
