--MySQL Workbench 画E-R图, 并根据E-R生成sql
--MySql:注意要使用 【&amp;】 符号,否则spring的配置文件会报错;useSSL=false不使用服务器验证;
-- ALTER TABLE 表名 CHANGE 原字段名 新字段名 字段类型 约束条件
-- ALTER TABLE user10 CHANGE test test1 CHAR(32) NOT NULL DEFAULT '123';
---------------------------------------------------------------------------------------------------------------

CREATE DATABASE `union` CHARACTER SET utf8 COLLATE utf8_general_ci;
--创建数据库`union`

---------------------查看权限script-----------------------------------------
-- select Host,User,Grant_priv,Super_priv from mysql.user;

-- update mysql.user set Grant_priv='Y',Super_priv='Y' where user = 'root' and host = '%';
-- 开启root用户的Grant权限
---------------------查看权限script-----------------------------------------

update mysql.user set Grant_priv='Y',Super_priv='Y' where user = 'tester' and host = '%';
--开启root用户的Grant权限

flush privileges;
--刷新权限

-------------------然后重启MySQL（WINDOWS）----------------------------------
--》windows+R  弹出运行框   在运行框中输入cmd  + 回车  进入系统的dos窗口
--	停止mysql：输入 net stop mysql;
--	启动mysql：输入 net start mysql;

--》或者用【任务管理器】-> 【服务】，找到MySQL服务，鼠标右键，【重新启动】
-------------------然后重启MySQL---------------------------------------------

CREATE USER 'tester'@'%' IDENTIFIED BY 'tester';
--创建用户'tester'，授予访问权限'%'

flush privileges ;
--刷新权限

grant all privileges on `union`.* to 'tester'@'%';
--identified by 'tester' with grant option;
--给用户'tester'添加访问DB`union`的权限

use union;
--切换到`union`

CREATE TABLE `union`.`INFOMST`(
  `ID` INT UNSIGNED AUTO_INCREMENT,
  `CLASS1` CHAR(3) NOT NULL COMMENT '一级分类',
  `CLASS2` CHAR(3) COMMENT '二级分类',
  `CLASS3` CHAR(3) COMMENT '三级分类',
  `INDX` CHAR(3) NOT NULL COMMENT '索引',
  `FLDNM` VARCHAR(30) NOT NULL COMMENT '板块名称',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COMMENT '信息表';

INSERT INTO `union`.`infomst` (`ID`, `CLASS1`, `CLASS2`, `CLASS3`, `INDX`, `FLDNM`) VALUES ('999', '999', '999', '999', '999', '999');

CREATE TABLE `union`.`iUSERINFO` (
  `USER_ID` VARCHAR(6) NOT NULL  COMMENT '成员ID',
  `USER_PASSWORD` CHAR(8) NOT NULL COMMENT '密码',
  `USER_NAME` VARCHAR(10) NOT NULL COMMENT '用户名',
  `USER_SEX` CHAR(1) NOT NULL COMMENT '性别',
  `USER_IDENTITY` CHAR(2) DEFAULT '' COMMENT '身份',
  `USER_HOMETOWN` VARCHAR(6) NOT NULL COMMENT '籍贯',
  `POLITICAL_STASTUS` CHAR(1) NOT NULL COMMENT '政治面貌',
  `USER_MAILADDRESS` VARCHAR(30) NOT NULL COMMENT '邮箱地址',
  `USER_TEL` VARCHAR(11) NOT NULL COMMENT '联系电话',
  `USER_ADDRESS` VARCHAR(30) DEFAULT '' COMMENT '住址',
  `USER_STASTUS` VARCHAR(10) DEFAULT '' COMMENT '状态',
  `USER_MESSAGE` VARCHAR(140) DEFAULT '' COMMENT '用户签名',
  `INSERT_TIME` DATETIME NOT NULL COMMENT '插入时间',
  `UPDATE_TIME` DATETIME NOT NULL COMMENT '更新时间',
  `UPDATE_CNT` INT(2) NOT NULL DEFAULT 0 COMMENT '更新回数',
  PRIMARY KEY (`USER_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COMMENT '用户信息';

CREATE TABLE POSTINFO (
  `POST_ID` VARCHAR(6) NOT NULL DEFAULT '000000' COMMENT '贴子ID',
  `POST_SEQ` INT NOT NULL DEFAULT 1 COMMENT '楼层',
  `POST_USER_ID` VARCHAR(6) NOT NULL COMMENT '跟贴者',
  `POST_COMMENT_ID` VARCHAR(8) NOT NULL DEFAULT '00000000' COMMENT '评论ID',
  `POST_TITLE` VARCHAR(30) NOT NULL COMMENT '标题',
  `POST_CONTENT` CHAR(200) NOT NULL COMMENT '内容',
  `POST_STATUS` CHAR(1) DEFAULT '' COMMENT '状态',
  `INSERT_TIME` DATETIME NOT NULL COMMENT '创建时间',
  `UPDATE_TIME` DATETIME NOT NULL COMMENT '更新时间',
  `UPDATE_CNT` INT(2) NOT NULL DEFAULT 0 COMMENT '更新回数',
  PRIMARY KEY (`POST_ID`,`POST_SEQ`,`POST_COMMENT_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COMMENT '贴子信息';

CREATE TABLE COMMENTINFO (
  `COMMENT_ID` VARCHAR(8) NOT NULL COMMENT '评论ID',
  `COMMENT_SEQ` INT NOT NULL DEFAULT 0 COMMENT '评论编号',
  `COMMENT_USER_ID` VARCHAR(6) NOT NULL COMMENT '评论者',
  `COMMENT_CONTENT` CHAR(8) NOT NULL COMMENT '内容',
  `COMMENT_STATUS` CHAR(2) DEFAULT '' COMMENT '状态',
  `INSERT_TIME` DATETIME NOT NULL COMMENT '创建时间',
  `UPDATE_TIME` DATETIME NOT NULL COMMENT '更新时间',
  `UPDATE_CNT` INT(3) NOT NULL DEFAULT 0 COMMENT '更新回数',
  PRIMARY KEY (`COMMENT_ID`,`COMMENT_SEQ`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COMMENT '评论信息';

CREATE TABLE PICTUREINFO (
  `PICTURE_ID` VARCHAR(8) NOT NULL COMMENT '图片ID',
  `PICTURE_CONTENT` CHAR(8) NOT NULL COMMENT '内容',
  `PICTURE_STATUS` CHAR(2) DEFAULT '' COMMENT '状态',
  `INSERT_TIME` DATETIME NOT NULL COMMENT '创建时间',
  `UPDATE_TIME` DATETIME NOT NULL COMMENT '更新时间',
  `UPDATE_CNT` INT(2) NOT NULL DEFAULT 0 COMMENT '更新回数',
  PRIMARY KEY (`PICTURE_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COMMENT '图片';

CREATE TABLE ARTICLEINFO (
  `ARTICLE_ID` VARCHAR(8) NOT NULL COMMENT '文章ID',
  `ARTICLE_CONTENT` CHAR(8) NOT NULL COMMENT '内容',
  `ARTICLE_STATUS` CHAR(2) DEFAULT '' COMMENT '状态',
  `INSERT_TIME` DATETIME NOT NULL COMMENT '创建时间',
  `UPDATE_TIME` DATETIME NOT NULL COMMENT '更新时间',
  `UPDATE_CNT` INT(2) NOT NULL DEFAULT 0 COMMENT '更新回数',
  PRIMARY KEY (`ARTICLE_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COMMENT '文章';


--CREATE TABLE NEWSMST (
--  `ID` INT UNSIGNED AUTO_INCREMENT,
--  `AREA` CHAR(2) NOT NULL COMMENT '板块',
--  `CLASS` CHAR(2) NOT NULL COMMENT '分类',
--  `TITLE` VARCHAR(30) NOT NULL COMMENT '标题',
--  `CONTNT` TEXT(50000) NOT NULL COMMENT '内容',
--  `PICID` CHAR(6) NOT NULL COMMENT '图片ID',
--  `GLANCN` INT(6) NOT NULL COMMENT '浏览数',
--  `LIKE` INT(6) NOT NULL COMMENT '点赞数',
--  `GRADE` CHAR(1) NOT NULL COMMENT '评级',
--  `WRTID` CHAR(4) NOT NULL COMMENT '投稿者ID',
--  `ADTID` CHAR(4) NOT NULL COMMENT '投稿者ID',
--  `PUBTIM` DATETIME NOT NULL COMMENT '发表时间',
--  `MDFID` CHAR(4) NOT NULL COMMENT '修改者ID',
--  `MDFTM` DATETIME NOT NULL COMMENT '修改时间',
--  `DELFLG` CHAR(1) NOT NULL COMMENT '删除标识',
--  PRIMARY KEY (`ID`)
--) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COMMENT '新闻表';

''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''