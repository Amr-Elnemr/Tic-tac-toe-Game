-- MySQL dump 10.13  Distrib 5.7.21, for Linux (x86_64)
--
-- Host: localhost    Database: TicTacDB
-- ------------------------------------------------------
-- Server version	5.7.21-0ubuntu0.16.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Games`
--

DROP TABLE IF EXISTS `Games`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Games` (
  `Game_ID` int(3) NOT NULL AUTO_INCREMENT,
  `X1` tinyint(1) NOT NULL,
  `O1` tinyint(1) NOT NULL,
  `X2` tinyint(1) NOT NULL,
  `O2` tinyint(1) NOT NULL,
  `X3` tinyint(1) NOT NULL,
  `O3` tinyint(1) DEFAULT NULL,
  `X4` tinyint(1) DEFAULT NULL,
  `O4` tinyint(1) DEFAULT NULL,
  `X5` tinyint(1) DEFAULT NULL,
  `P1_ID` int(3) NOT NULL,
  `P2_Name` varchar(20) NOT NULL,
  `Result` enum('W','L','D') NOT NULL,
  PRIMARY KEY (`Game_ID`),
  KEY `Games_ibfk_1` (`P1_ID`),
  CONSTRAINT `Games_ibfk_1` FOREIGN KEY (`P1_ID`) REFERENCES `Players` (`P1_ID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Games`
--

LOCK TABLES `Games` WRITE;
/*!40000 ALTER TABLE `Games` DISABLE KEYS */;
INSERT INTO `Games` VALUES (1,1,2,3,4,5,6,7,8,9,2,'mohsen','D'),(2,1,2,3,4,5,6,7,8,9,1,'mohsen','W'),(3,1,2,3,4,5,NULL,7,8,NULL,1,'mohsen','W'),(4,1,2,3,4,5,NULL,7,8,NULL,1,'mohsen','L'),(6,1,2,3,4,5,NULL,7,8,NULL,1,'mohsen','L'),(7,1,2,3,4,5,NULL,7,8,NULL,2,'karim','L');
/*!40000 ALTER TABLE `Games` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Players`
--

DROP TABLE IF EXISTS `Players`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Players` (
  `P1_ID` int(3) NOT NULL AUTO_INCREMENT,
  `P1_Name` varchar(20) NOT NULL,
  PRIMARY KEY (`P1_ID`),
  UNIQUE KEY `Uniq_Name` (`P1_Name`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Players`
--

LOCK TABLES `Players` WRITE;
/*!40000 ALTER TABLE `Players` DISABLE KEYS */;
INSERT INTO `Players` VALUES (2,'Mizo'),(1,'Tarek');
/*!40000 ALTER TABLE `Players` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-02-27  0:43:36
