CREATE DATABASE  IF NOT EXISTS `stus` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;
USE `stus`;
-- MySQL dump 10.13  Distrib 8.0.12, for Win64 (x86_64)
--
-- Host: localhost    Database: stus
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
-- Table structure for table `stu`
--

DROP TABLE IF EXISTS `stu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `stu` (
  `sid` int(11) NOT NULL AUTO_INCREMENT,
  `sname` varchar(20) DEFAULT NULL,
  `gender` varchar(5) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `hobby` varchar(50) DEFAULT NULL,
  `info` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stu`
--

LOCK TABLES `stu` WRITE;
/*!40000 ALTER TABLE `stu` DISABLE KEYS */;
INSERT INTO `stu` VALUES (1,'张三','男','43214325','1996-09-19','羽毛球','我是中国人'),(2,'fdsfdsa','男','14546456456','1996-09-19','游泳','fvcsafewgew2132gew65g15e6w1g'),(3,'4456','男','1654849489','2000-12-03','篮球','456456456456564'),(4,'里斯','男','134789456','1996-09-19','足球, 看书, 写字','幅度萨芬23范德萨23阿凡达s32a'),(5,'从事农耕','女','454811313','1996-09-19','游泳, 足球, 写字','范德萨范德萨范德萨发大水');
/*!40000 ALTER TABLE `stu` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-12-20 19:22:09
