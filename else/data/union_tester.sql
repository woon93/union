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
