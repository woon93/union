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

DROP TABLE IF EXISTS `articleinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `articleinfo` (
  `ARTICLE_ID` varchar(8) NOT NULL COMMENT '文章ID',
  `ARTICLE_CONTENT` text COMMENT '内容',
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

LOCK TABLES `articleinfo` WRITE;
/*!40000 ALTER TABLE `articleinfo` DISABLE KEYS */;
INSERT INTO `articleinfo` VALUES ('100004','<p style=\"margin-top: 0px; margin-bottom: 0px; line-height: 30px; color: rgb(85, 85, 85); white-space: normal; background-color: rgb(255, 255, 255); text-indent: 2em; font-family: arial, helvetica, sans-serif;\"><span style=\"font-family: 黑体, 微软雅黑; font-size: 22px; font-weight: 700; text-align: center; background-color: rgb(255, 255, 255);\">市总工会机关党委在“支部主题党日”收官之月 确定明年将开展三大活动</span></p><p style=\"margin-top: 0px; margin-bottom: 0px; line-height: 30px; color: rgb(85, 85, 85); white-space: normal; background-color: rgb(255, 255, 255); text-indent: 2em; font-family: arial, helvetica, sans-serif;\">在2018年“支部主题党日”收官之月，市总工会机关党委结合工会工作实际，指导各支部广泛开展“支部主题党日”系列活动，确定明年将开展三大活动。</p><p style=\"margin-top: 0px; margin-bottom: 0px; line-height: 30px; color: rgb(85, 85, 85); white-space: normal; background-color: rgb(255, 255, 255); text-indent: 2em; font-family: arial, helvetica, sans-serif;\">12月4日，在兴庆区中山公园宪法广场联合举办2018“法润银川”宪法知识竞答趣味定向赛，组织基层工会46支代表队参加竞赛，将工会今年开展的集中学习、法宣在线考试、街头宣传、宪法“进企业进工地”等学法守纪活动推向高潮，也进一步营造了机关在职党员带头学习宪法、遵守宪法、运用宪法，维护宪法权威的浓厚氛围。</p><p style=\"margin-top: 0px; margin-bottom: 0px; line-height: 30px; color: rgb(85, 85, 85); white-space: normal; background-color: rgb(255, 255, 255); text-indent: 2em; font-family: arial, helvetica, sans-serif;\">12月13日下午，组织全体党员参观纪念陕甘边革命根据地创建85周年“照金精神”巡展和银川党性教育主题展，引导党员传承红色基因，坚定理想信念，加强党性修养，履职敬业，为建设和谐美丽银川做出工会贡献。</p><p style=\"margin-top: 0px; margin-bottom: 0px; line-height: 30px; color: rgb(85, 85, 85); white-space: normal; background-color: rgb(255, 255, 255); text-indent: 2em; font-family: arial, helvetica, sans-serif;\">本周以来，机关党委认真听取市总干部职工的意见建议，积极谋划2019年党建工作，计划在2019年开展“工会走在前·党员做表率”系列教育活动、“听职工心声·服务职工”暖心活动、党支部工作提升活动。</p><p><br/></p>','','2018-12-31 20:10:50','2018-12-31 20:10:50',0),('100005','<p>市总工会机关党委在“支部主题党日”收官之月 确定明年将开展三大活动</p><p><span style=\"margin: 0px 60px;\">2018-12-17 09:24</span></p><p style=\"margin-top: 0px; margin-bottom: 0px; line-height: 30px; font-size: 16px; text-indent: 2em; font-family: arial, helvetica, sans-serif;\">在2018年“支部主题党日”收官之月，市总工会机关党委结合工会工作实际，指导各支部广泛开展“支部主题党日”系列活动，确定明年将开展三大活动。</p><p style=\"margin-top: 0px; margin-bottom: 0px; line-height: 30px; font-size: 16px; text-indent: 2em; font-family: arial, helvetica, sans-serif;\">12月4日，在兴庆区中山公园宪法广场联合举办2018“法润银川”宪法知识竞答趣味定向赛，组织基层工会46支代表队参加竞赛，将工会今年开展的集中学习、法宣在线考试、街头宣传、宪法“进企业进工地”等学法守纪活动推向高潮，也进一步营造了机关在职党员带头学习宪法、遵守宪法、运用宪法，维护宪法权威的浓厚氛围。</p><p style=\"margin-top: 0px; margin-bottom: 0px; line-height: 30px; font-size: 16px; text-indent: 2em; font-family: arial, helvetica, sans-serif;\">12月13日下午，组织全体党员参观纪念陕甘边革命根据地创建85周年“照金精神”巡展和银川党性教育主题展，引导党员传承红色基因，坚定理想信念，加强党性修养，履职敬业，为建设和谐美丽银川做出工会贡献。</p><p style=\"margin-top: 0px; margin-bottom: 0px; line-height: 30px; font-size: 16px; text-indent: 2em; font-family: arial, helvetica, sans-serif;\">本周以来，机关党委认真听取市总干部职工的意见建议，积极谋划2019年党建工作，计划在2019年开展“工会走在前·党员做表率”系列教育活动、“听职工心声·服务职工”暖心活动、党支部工作提升活动。</p><p><br/></p>','','2018-12-31 20:10:50','2018-12-31 20:10:50',0),('100006','<p>市总工会机关党委在“支部主题党日”收官之月 确定明年将开展三大活动</p><p><span style=\"margin: 0px 60px;\">2018-12-17 09:24</span></p><p style=\"margin-top: 0px; margin-bottom: 0px; line-height: 30px; font-size: 16px; text-indent: 2em; font-family: arial, helvetica, sans-serif;\">在2018年“支部主题党日”收官之月，市总工会机关党委结合工会工作实际，指导各支部广泛开展“支部主题党日”系列活动，确定明年将开展三大活动。</p><p style=\"margin-top: 0px; margin-bottom: 0px; line-height: 30px; font-size: 16px; text-indent: 2em; font-family: arial, helvetica, sans-serif;\">12月4日，在兴庆区中山公园宪法广场联合举办2018“法润银川”宪法知识竞答趣味定向赛，组织基层工会46支代表队参加竞赛，将工会今年开展的集中学习、法宣在线考试、街头宣传、宪法“进企业进工地”等学法守纪活动推向高潮，也进一步营造了机关在职党员带头学习宪法、遵守宪法、运用宪法，维护宪法权威的浓厚氛围。</p><p style=\"margin-top: 0px; margin-bottom: 0px; line-height: 30px; font-size: 16px; text-indent: 2em; font-family: arial, helvetica, sans-serif;\">12月13日下午，组织全体党员参观纪念陕甘边革命根据地创建85周年“照金精神”巡展和银川党性教育主题展，引导党员传承红色基因，坚定理想信念，加强党性修养，履职敬业，为建设和谐美丽银川做出工会贡献。</p><p style=\"margin-top: 0px; margin-bottom: 0px; line-height: 30px; font-size: 16px; text-indent: 2em; font-family: arial, helvetica, sans-serif;\">本周以来，机关党委认真听取市总干部职工的意见建议，积极谋划2019年党建工作，计划在2019年开展“工会走在前·党员做表率”系列教育活动、“听职工心声·服务职工”暖心活动、党支部工作提升活动。</p><p><br/></p>','','2018-12-31 20:10:50','2018-12-31 20:10:50',0),('100007','<p>市总工会机关党委在“支部主题党日”收官之月 确定明年将开展三大活动</p><p><span style=\"margin: 0px 60px;\">2018-12-17 09:24</span></p><p style=\"margin-top: 0px; margin-bottom: 0px; line-height: 30px; font-size: 16px; text-indent: 2em; font-family: arial, helvetica, sans-serif;\">在2018年“支部主题党日”收官之月，市总工会机关党委结合工会工作实际，指导各支部广泛开展“支部主题党日”系列活动，确定明年将开展三大活动。</p><p style=\"margin-top: 0px; margin-bottom: 0px; line-height: 30px; font-size: 16px; text-indent: 2em; font-family: arial, helvetica, sans-serif;\">12月4日，在兴庆区中山公园宪法广场联合举办2018“法润银川”宪法知识竞答趣味定向赛，组织基层工会46支代表队参加竞赛，将工会今年开展的集中学习、法宣在线考试、街头宣传、宪法“进企业进工地”等学法守纪活动推向高潮，也进一步营造了机关在职党员带头学习宪法、遵守宪法、运用宪法，维护宪法权威的浓厚氛围。</p><p style=\"margin-top: 0px; margin-bottom: 0px; line-height: 30px; font-size: 16px; text-indent: 2em; font-family: arial, helvetica, sans-serif;\">12月13日下午，组织全体党员参观纪念陕甘边革命根据地创建85周年“照金精神”巡展和银川党性教育主题展，引导党员传承红色基因，坚定理想信念，加强党性修养，履职敬业，为建设和谐美丽银川做出工会贡献。</p><p style=\"margin-top: 0px; margin-bottom: 0px; line-height: 30px; font-size: 16px; text-indent: 2em; font-family: arial, helvetica, sans-serif;\">本周以来，机关党委认真听取市总干部职工的意见建议，积极谋划2019年党建工作，计划在2019年开展“工会走在前·党员做表率”系列教育活动、“听职工心声·服务职工”暖心活动、党支部工作提升活动。</p><p><br/></p>','','2018-12-31 20:10:50','2018-12-31 20:10:50',0),('100008','<p>市总工会机关党委在“支部主题党日”收官之月 确定明年将开展三大活动</p><p><span style=\"margin: 0px 60px;\">2018-12-17 09:24</span></p><p style=\"margin-top: 0px; margin-bottom: 0px; line-height: 30px; font-size: 16px; text-indent: 2em; font-family: arial, helvetica, sans-serif;\">在2018年“支部主题党日”收官之月，市总工会机关党委结合工会工作实际，指导各支部广泛开展“支部主题党日”系列活动，确定明年将开展三大活动。</p><p style=\"margin-top: 0px; margin-bottom: 0px; line-height: 30px; font-size: 16px; text-indent: 2em; font-family: arial, helvetica, sans-serif;\">12月4日，在兴庆区中山公园宪法广场联合举办2018“法润银川”宪法知识竞答趣味定向赛，组织基层工会46支代表队参加竞赛，将工会今年开展的集中学习、法宣在线考试、街头宣传、宪法“进企业进工地”等学法守纪活动推向高潮，也进一步营造了机关在职党员带头学习宪法、遵守宪法、运用宪法，维护宪法权威的浓厚氛围。</p><p style=\"margin-top: 0px; margin-bottom: 0px; line-height: 30px; font-size: 16px; text-indent: 2em; font-family: arial, helvetica, sans-serif;\">12月13日下午，组织全体党员参观纪念陕甘边革命根据地创建85周年“照金精神”巡展和银川党性教育主题展，引导党员传承红色基因，坚定理想信念，加强党性修养，履职敬业，为建设和谐美丽银川做出工会贡献。</p><p style=\"margin-top: 0px; margin-bottom: 0px; line-height: 30px; font-size: 16px; text-indent: 2em; font-family: arial, helvetica, sans-serif;\">本周以来，机关党委认真听取市总干部职工的意见建议，积极谋划2019年党建工作，计划在2019年开展“工会走在前·党员做表率”系列教育活动、“听职工心声·服务职工”暖心活动、党支部工作提升活动。</p><p><br/></p>','','2018-12-31 20:10:50','2018-12-31 20:10:50',0),('100009','<pre style=\"background-color:#2b2b2b;color:#a9b7c6;font-family:&#39;Source Code Pro&#39;;font-size:9.0pt;\">function&nbsp;appendPost(){\r\n&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;$(&quot;#thisPost&quot;).append(${content});\r\n&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</pre><p><br/></p>','','2018-12-31 20:10:50','2018-12-31 20:10:50',0),('100010','<pre style=\"background-color:#2b2b2b;color:#a9b7c6;font-family:&#39;Source Code Pro&#39;;font-size:9.0pt;\">function&nbsp;appendPost(){\r\n&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;$(&quot;#thisPost&quot;).append(${content});\r\n&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</pre><p><br/></p>','','2018-12-31 20:10:50','2018-12-31 20:10:50',0),('100011','<pre style=\"margin-top: 0px; margin-bottom: 0px; padding: 0px; white-space: pre-wrap; overflow-wrap: break-word; font-family: 微软雅黑; font-size: 12px; background-color: rgb(229, 241, 244);\">th:text=&quot;${username}</pre><p><br/></p>','','2018-12-31 20:10:50','2018-12-31 20:10:50',0),('100012','<p>市总工会机关党委在“支部主题党日”收官之月 确定明年将开展三大活动</p><p><span style=\"margin: 0px 60px;\">2018-12-17 09:24</span></p><p style=\"margin-top: 0px; margin-bottom: 0px; line-height: 30px; font-size: 16px; text-indent: 2em; font-family: arial, helvetica, sans-serif;\">在2018年“支部主题党日”收官之月，市总工会机关党委结合工会工作实际，指导各支部广泛开展“支部主题党日”系列活动，确定明年将开展三大活动。</p><p style=\"margin-top: 0px; margin-bottom: 0px; line-height: 30px; font-size: 16px; text-indent: 2em; font-family: arial, helvetica, sans-serif;\">12月4日，在兴庆区中山公园宪法广场联合举办2018“法润银川”宪法知识竞答趣味定向赛，组织基层工会46支代表队参加竞赛，将工会今年开展的集中学习、法宣在线考试、街头宣传、宪法“进企业进工地”等学法守纪活动推向高潮，也进一步营造了机关在职党员带头学习宪法、遵守宪法、运用宪法，维护宪法权威的浓厚氛围。</p><p style=\"margin-top: 0px; margin-bottom: 0px; line-height: 30px; font-size: 16px; text-indent: 2em; font-family: arial, helvetica, sans-serif;\">12月13日下午，组织全体党员参观纪念陕甘边革命根据地创建85周年“照金精神”巡展和银川党性教育主题展，引导党员传承红色基因，坚定理想信念，加强党性修养，履职敬业，为建设和谐美丽银川做出工会贡献。</p><p style=\"margin-top: 0px; margin-bottom: 0px; line-height: 30px; font-size: 16px; text-indent: 2em; font-family: arial, helvetica, sans-serif;\">本周以来，机关党委认真听取市总干部职工的意见建议，积极谋划2019年党建工作，计划在2019年开展“工会走在前·党员做表率”系列教育活动、“听职工心声·服务职工”暖心活动、党支部工作提升活动。</p><p><br/></p>','','2018-12-31 20:10:50','2018-12-31 20:10:50',0),('100013','<p>市总工会机关党委在“支部主题党日”收官之月 确定明年将开展三大活动</p><p><span style=\"margin: 0px 60px;\">2018-12-17 09:24</span></p><p style=\"margin-top: 0px; margin-bottom: 0px; line-height: 30px; font-size: 16px; text-indent: 2em; font-family: arial, helvetica, sans-serif;\">在2018年“支部主题党日”收官之月，市总工会机关党委结合工会工作实际，指导各支部广泛开展“支部主题党日”系列活动，确定明年将开展三大活动。</p><p style=\"margin-top: 0px; margin-bottom: 0px; line-height: 30px; font-size: 16px; text-indent: 2em; font-family: arial, helvetica, sans-serif;\">12月4日，在兴庆区中山公园宪法广场联合举办2018“法润银川”宪法知识竞答趣味定向赛，组织基层工会46支代表队参加竞赛，将工会今年开展的集中学习、法宣在线考试、街头宣传、宪法“进企业进工地”等学法守纪活动推向高潮，也进一步营造了机关在职党员带头学习宪法、遵守宪法、运用宪法，维护宪法权威的浓厚氛围。</p><p style=\"margin-top: 0px; margin-bottom: 0px; line-height: 30px; font-size: 16px; text-indent: 2em; font-family: arial, helvetica, sans-serif;\">12月13日下午，组织全体党员参观纪念陕甘边革命根据地创建85周年“照金精神”巡展和银川党性教育主题展，引导党员传承红色基因，坚定理想信念，加强党性修养，履职敬业，为建设和谐美丽银川做出工会贡献。</p><p style=\"margin-top: 0px; margin-bottom: 0px; line-height: 30px; font-size: 16px; text-indent: 2em; font-family: arial, helvetica, sans-serif;\">本周以来，机关党委认真听取市总干部职工的意见建议，积极谋划2019年党建工作，计划在2019年开展“工会走在前·党员做表率”系列教育活动、“听职工心声·服务职工”暖心活动、党支部工作提升活动。</p><p><br/></p>','','2018-12-31 20:10:50','2018-12-31 20:10:50',0),('100014','','','2018-12-31 20:10:50','2018-12-31 20:10:50',0),('100015','<p>市总工会机关党委在“支部主题党日”收官之月 确定明年将开展三大活动</p><p><span style=\"margin: 0px 60px;\">2018-12-17 09:24</span></p><p style=\"margin-top: 0px; margin-bottom: 0px; line-height: 30px; font-size: 16px; text-indent: 2em; font-family: arial, helvetica, sans-serif;\">在2018年“支部主题党日”收官之月，市总工会机关党委结合工会工作实际，指导各支部广泛开展“支部主题党日”系列活动，确定明年将开展三大活动。</p><p style=\"margin-top: 0px; margin-bottom: 0px; line-height: 30px; font-size: 16px; text-indent: 2em; font-family: arial, helvetica, sans-serif;\">12月4日，在兴庆区中山公园宪法广场联合举办2018“法润银川”宪法知识竞答趣味定向赛，组织基层工会46支代表队参加竞赛，将工会今年开展的集中学习、法宣在线考试、街头宣传、宪法“进企业进工地”等学法守纪活动推向高潮，也进一步营造了机关在职党员带头学习宪法、遵守宪法、运用宪法，维护宪法权威的浓厚氛围。</p><p style=\"margin-top: 0px; margin-bottom: 0px; line-height: 30px; font-size: 16px; text-indent: 2em; font-family: arial, helvetica, sans-serif;\">12月13日下午，组织全体党员参观纪念陕甘边革命根据地创建85周年“照金精神”巡展和银川党性教育主题展，引导党员传承红色基因，坚定理想信念，加强党性修养，履职敬业，为建设和谐美丽银川做出工会贡献。</p><p style=\"margin-top: 0px; margin-bottom: 0px; line-height: 30px; font-size: 16px; text-indent: 2em; font-family: arial, helvetica, sans-serif;\">本周以来，机关党委认真听取市总干部职工的意见建议，积极谋划2019年党建工作，计划在2019年开展“工会走在前·党员做表率”系列教育活动、“听职工心声·服务职工”暖心活动、党支部工作提升活动。</p><p><br/></p>','','2018-12-31 20:10:50','2018-12-31 20:10:50',0),('100016','<p>市总工会机关党委在“支部主题党日”收官之月 确定明年将开展三大活动</p><p><span style=\"margin: 0px 60px;\">2018-12-17 09:24</span></p><p style=\"margin-top: 0px; margin-bottom: 0px; line-height: 30px; font-size: 16px; text-indent: 2em; font-family: arial, helvetica, sans-serif;\">在2018年“支部主题党日”收官之月，市总工会机关党委结合工会工作实际，指导各支部广泛开展“支部主题党日”系列活动，确定明年将开展三大活动。</p><p style=\"margin-top: 0px; margin-bottom: 0px; line-height: 30px; font-size: 16px; text-indent: 2em; font-family: arial, helvetica, sans-serif;\">12月4日，在兴庆区中山公园宪法广场联合举办2018“法润银川”宪法知识竞答趣味定向赛，组织基层工会46支代表队参加竞赛，将工会今年开展的集中学习、法宣在线考试、街头宣传、宪法“进企业进工地”等学法守纪活动推向高潮，也进一步营造了机关在职党员带头学习宪法、遵守宪法、运用宪法，维护宪法权威的浓厚氛围。</p><p style=\"margin-top: 0px; margin-bottom: 0px; line-height: 30px; font-size: 16px; text-indent: 2em; font-family: arial, helvetica, sans-serif;\">12月13日下午，组织全体党员参观纪念陕甘边革命根据地创建85周年“照金精神”巡展和银川党性教育主题展，引导党员传承红色基因，坚定理想信念，加强党性修养，履职敬业，为建设和谐美丽银川做出工会贡献。</p><p style=\"margin-top: 0px; margin-bottom: 0px; line-height: 30px; font-size: 16px; text-indent: 2em; font-family: arial, helvetica, sans-serif;\">本周以来，机关党委认真听取市总干部职工的意见建议，积极谋划2019年党建工作，计划在2019年开展“工会走在前·党员做表率”系列教育活动、“听职工心声·服务职工”暖心活动、党支部工作提升活动。</p><p><br/></p>','','2018-12-31 20:10:50','2018-12-31 20:10:50',0),('100017','<p>public static void main(String[] args) {</p><p>&nbsp; &nbsp; &nbsp; &nbsp; ZoneId zoneId = ZoneId.systemDefault();</p><p>&nbsp; &nbsp; &nbsp; &nbsp; LocalDate localDate = LocalDate.now();</p><p>&nbsp; &nbsp; &nbsp; &nbsp; ZonedDateTime zdt = localDate.atStartOfDay(zoneId);</p><p><br/></p><p>&nbsp; &nbsp; &nbsp; &nbsp; Date date = Date.from(zdt.toInstant());</p><p><br/></p><p>&nbsp; &nbsp; &nbsp; &nbsp; System.out.println(&quot;LocalDate = &quot; + localDate);</p><p>&nbsp; &nbsp; &nbsp; &nbsp; System.out.println(&quot;Date = &quot; + date);</p><p><br/></p><p>&nbsp; &nbsp; }</p><p>---------------------&nbsp;</p><p>作者：insping&nbsp;</p><p>来源：CSDN&nbsp;</p><p>原文：https://blog.csdn.net/hspingcc/article/details/73332252&nbsp;</p><p>版权声明：本文为博主原创文章，转载请附上博文链接！</p><p><br/></p>','','2019-01-01 22:59:19','2019-01-01 22:59:19',0),('100018','<p>asdasdds</p>','','2019-01-06 21:47:14','2019-01-06 21:47:14',0),('100019','<p><span style=\"text-decoration: line-through; color: rgb(255, 0, 0); background-color: rgb(255, 255, 0);\"><em><strong>什么情况</strong></em></span></p>','','2019-01-06 23:35:06','2019-01-06 23:35:06',0);
/*!40000 ALTER TABLE `articleinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `commentinfo`
--

DROP TABLE IF EXISTS `commentinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `commentinfo` (
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

LOCK TABLES `commentinfo` WRITE;
/*!40000 ALTER TABLE `commentinfo` DISABLE KEYS */;
INSERT INTO `commentinfo` VALUES ('100001000001',1,'100001','是假评论x3','1','2018-12-18 00:00:00','2018-12-18 00:00:00',20181218,'100001','这又是什么鬼帖子x1','大王'),('100001000002',1,'100001','是假评论x2','1','2018-12-18 00:00:00','2018-12-18 00:00:00',20181218,'100002','这又是什么鬼帖子x2','大王'),('100001000003',1,'100001','是假评论x1','1','2018-12-18 00:00:00','2018-12-18 00:00:00',20181218,'100003','这又是什么鬼帖子x3','大王');
/*!40000 ALTER TABLE `commentinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `infomst`
--

DROP TABLE IF EXISTS `infomst`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `infomst` (
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

LOCK TABLES `infomst` WRITE;
/*!40000 ALTER TABLE `infomst` DISABLE KEYS */;
INSERT INTO `infomst` VALUES (0,'0','0','0','0','0'),(999,'999','999','999','999','999');
/*!40000 ALTER TABLE `infomst` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `iuserinfo`
--

DROP TABLE IF EXISTS `iuserinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `iuserinfo` (
  `USER_ID` varchar(15) NOT NULL COMMENT '成员ID',
  `USER_PASSWORD` char(100) NOT NULL COMMENT '密码',
  `USER_NAME` varchar(10) NOT NULL COMMENT '用户名',
  `USER_SEX` char(1) NOT NULL COMMENT '性别',
  `USER_IDENTITY` char(20) DEFAULT '' COMMENT '身份',
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

LOCK TABLES `iuserinfo` WRITE;
/*!40000 ALTER TABLE `iuserinfo` DISABLE KEYS */;
INSERT INTO `iuserinfo` VALUES ('100001','100001','tester01','男','99','陕西西安','9','dawang@163.com','13312341234','雁塔区天谷八路','在职','我怎么那么好看','2018-12-16 00:00:00','2018-12-16 00:00:00',0),('dashuai','$2a$10$E/mDElUPx53JmOCdfCGSx.gWELvbeOqLRD8iVceiH3ox0mKy4TtlG','大帅','男','ROLE_ADMIN','陕西西安','9','dawang@163.com','13312341234','雁塔区天谷八路','在职','我怎么那么好看','2018-12-16 00:00:00','2018-12-16 00:00:00',0),('dawang','$2a$10$j54KbMlIbrLkngsqHvBwfOZzLLQu0CpNm/2FJJxbJ14iHY.5piii2','大王','男','ROLE_ADMIN','陕西西安','9','dawang@163.com','13312341234','雁塔区天谷八路','在职','我怎么那么好看','2018-12-16 00:00:00','2018-12-16 00:00:00',0);
/*!40000 ALTER TABLE `iuserinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `newsmst`
--

DROP TABLE IF EXISTS `newsmst`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `newsmst` (
  `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `AREA` varchar(30) NOT NULL COMMENT '板块',
  `CLASS` varchar(30) NOT NULL COMMENT '分类',
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

LOCK TABLES `newsmst` WRITE;
/*!40000 ALTER TABLE `newsmst` DISABLE KEYS */;
INSERT INTO `newsmst` VALUES (1,'板块一','分类一','银川市总工会召开党风廉政建设工作会议','2月18日，银川市总工会召开了2019年度党风廉政建设工作会议，会议传达了十九届中央纪委三次全会、自治区纪委十二届三次全会、银川市纪委十四届四次全会精神，纪检监察组长姚永伟对市工会2019年党风廉政建设工作进行安排部署，市人大常委会副主任、总工会主席张自华出席会议并与党组成员签订了党风廉政建设责任书。','0',0,0,'0','1001','1001','2019-02-02 00:00:00','1002','2019-02-02 00:00:00','0');
/*!40000 ALTER TABLE `newsmst` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pictureinfo`
--

DROP TABLE IF EXISTS `pictureinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `pictureinfo` (
  `PICTURE_ID` varchar(8) NOT NULL COMMENT '图片ID',
  `PICTURE_URL` tinytext NOT NULL COMMENT '内容',
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

LOCK TABLES `pictureinfo` WRITE;
/*!40000 ALTER TABLE `pictureinfo` DISABLE KEYS */;
/*!40000 ALTER TABLE `pictureinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `postinfo`
--

DROP TABLE IF EXISTS `postinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `postinfo` (
  `POST_ID` varchar(6) NOT NULL DEFAULT '000000' COMMENT '贴子ID',
  `POST_SEQ` int(11) NOT NULL DEFAULT '1' COMMENT '楼层',
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

LOCK TABLES `postinfo` WRITE;
/*!40000 ALTER TABLE `postinfo` DISABLE KEYS */;
INSERT INTO `postinfo` VALUES ('100001',1,'100001','100001000001','20181218','这又是什么鬼帖子','1','2018-12-18 00:00:00','2018-12-18 00:00:00',1,NULL),('100002',1,'100001','100001000002','20181218','这又是什么鬼帖子x2','1','2018-12-18 00:00:00','2018-12-18 00:00:00',1,NULL),('100003',1,'100001','100001000003','20181218','这又是什么鬼帖子x3','1','2018-12-18 00:00:00','2018-12-18 00:00:00',1,NULL),('100016',0,'dawang','00000000','本王的帖子','市总工会机关党委在“支部主题党日”收官之月 确定明年将开展三大活动2018-12-17 09:24在2018年“支部主题党日”收官之月，市总工会机关党委结合工会工作实际，指导各支部广泛开展“支部主题党日”系列活动，确定明年将开展三大活动。12月4日，在兴庆区中山公园宪法广场联合举办2018“法润银川”宪法知识竞答趣味定向赛，组织基层工会46支代表队参加竞赛，将工会今年开展的集中学习、法宣在线考试、','0','2018-12-31 20:10:50','2018-12-31 20:10:50',0,NULL),('100017',0,'dawang','00000000','本王的帖子','public static void main(String[] args) {        ZoneId zoneId = ZoneId.systemDefault();        LocalDate localDate = LocalDate.now();        ZonedDateTime zdt = localDate.atStartOfDay(zoneId);','0','2019-01-01 22:59:19','2019-01-01 22:59:19',0,NULL),('100018',0,'dawang','00000000','本王的帖子','asdasdd','0','2019-01-06 21:47:14','2019-01-06 21:47:14',0,NULL),('100019',0,'dawang','00000000','本王的帖子','什么情','0','2019-01-06 23:35:06','2019-01-06 23:35:06',0,NULL);
/*!40000 ALTER TABLE `postinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `resource`
--

DROP TABLE IF EXISTS `resource`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `resource` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `url` varchar(255) DEFAULT NULL COMMENT '资源',
  `roles` varchar(255) DEFAULT NULL COMMENT '所需角色',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `resource`
--

LOCK TABLES `resource` WRITE;
/*!40000 ALTER TABLE `resource` DISABLE KEYS */;
INSERT INTO `resource` VALUES (1,'/depart1/**','ROLE_ADMIN,ROLE_MANAGER,ROLE_DEPART1'),(2,'/depart2/**','ROLE_ADMIN,ROLE_MANAGER,ROLE_DEPART2'),(3,'/user/**','ROLE_ADMIN,ROLE_USER'),(4,'/admin/**','ROLE_ADMIN');
/*!40000 ALTER TABLE `resource` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'union'
--

--
-- Dumping routines for database 'union'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-03-02 11:03:21
