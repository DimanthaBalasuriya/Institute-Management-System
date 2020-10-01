-- MySQL dump 10.13  Distrib 5.6.21, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: cambridge_project
-- ------------------------------------------------------
-- Server version	5.6.21-log

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
-- Current Database: `cambridge_project`
--

/*!40000 DROP DATABASE IF EXISTS `cambridge_project`*/;

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `cambridge_project` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `cambridge_project`;

--
-- Table structure for table `account`
--

DROP TABLE IF EXISTS `account`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `account` (
  `acc_id` int(11) NOT NULL AUTO_INCREMENT,
  `acc_time` time DEFAULT NULL,
  `acc_date` date DEFAULT NULL,
  `acc_amount` double DEFAULT NULL,
  `acc_state` char(1) DEFAULT '1',
  `emp_id` int(11) NOT NULL,
  PRIMARY KEY (`acc_id`),
  KEY `fk_Account_Employee1_idx` (`emp_id`),
  CONSTRAINT `fk_Account_Employee1` FOREIGN KEY (`emp_id`) REFERENCES `employee` (`emp_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `account`
--

LOCK TABLES `account` WRITE;
/*!40000 ALTER TABLE `account` DISABLE KEYS */;
INSERT INTO `account` VALUES (1,'02:25:06','2019-12-06',10,'1',10),(2,'02:52:13','2020-07-13',0,'1',11),(3,'04:47:25','2020-09-25',4950,'1',1);
/*!40000 ALTER TABLE `account` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `advance`
--

DROP TABLE IF EXISTS `advance`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `advance` (
  `adv_id` int(11) NOT NULL AUTO_INCREMENT,
  `adv_reason` text,
  `adv_date` date DEFAULT NULL,
  `adv_time` time DEFAULT NULL,
  `adv_amount` double DEFAULT NULL,
  `adv_state` varchar(8) DEFAULT 'active',
  `emp_id` int(11) NOT NULL,
  `use_id` int(11) NOT NULL,
  PRIMARY KEY (`adv_id`),
  KEY `fk_Advance_Employee1_idx` (`emp_id`),
  KEY `fk_Advance_User1_idx` (`use_id`),
  CONSTRAINT `fk_Advance_Employee1` FOREIGN KEY (`emp_id`) REFERENCES `employee` (`emp_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Advance_User1` FOREIGN KEY (`use_id`) REFERENCES `user` (`use_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `advance`
--

LOCK TABLES `advance` WRITE;
/*!40000 ALTER TABLE `advance` DISABLE KEYS */;
/*!40000 ALTER TABLE `advance` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bill`
--

DROP TABLE IF EXISTS `bill`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bill` (
  `bil_id` int(11) NOT NULL AUTO_INCREMENT,
  `bil_time` time DEFAULT NULL,
  `bil_date` date DEFAULT NULL,
  `bil_total` double DEFAULT NULL,
  `bil_discount` double DEFAULT NULL,
  `bil_nettotal` double DEFAULT NULL,
  `bil_state` int(11) DEFAULT '1',
  PRIMARY KEY (`bil_id`)
) ENGINE=InnoDB AUTO_INCREMENT=66 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bill`
--

LOCK TABLES `bill` WRITE;
/*!40000 ALTER TABLE `bill` DISABLE KEYS */;
INSERT INTO `bill` VALUES (1,'06:10:34','2019-12-05',8500,0,0,1),(2,'09:36:12','2019-12-06',7000,1,6930,1),(3,'10:21:44','2019-12-06',7000,0,7000,1),(4,'10:23:21','2019-12-06',7000,1,6930,1),(5,'10:27:58','2019-12-06',7000,0,7000,1),(6,'10:39:47','2019-12-06',7000,1,6930,1),(7,'08:20:04','2019-12-07',300,1,297,1),(8,'08:22:06','2019-12-07',150,0,150,1),(9,'08:30:05','2019-12-07',250,1,247.5,1),(10,'02:01:08','2019-12-07',150,0,150,1),(11,'11:03:50','2020-08-05',7500,0,0,1),(12,'11:04:21','2020-08-05',7500,0,0,1),(13,'10:03:33','2020-08-10',30,0,30,1),(14,'10:11:02','2020-08-10',75,0,75,1),(15,'01:21:40','2020-09-20',500,0,500,1),(16,'01:25:04','2020-09-20',500,0,500,1),(17,'02:57:34','2020-09-20',500,0,500,1),(18,'03:01:41','2020-09-20',500,0,500,1),(19,'03:22:51','2020-09-20',500,0,500,1),(20,'11:42:40','2020-09-23',1000,0,1000,1),(21,'12:00:32','2020-09-23',500,0,500,1),(22,'12:00:42','2020-09-23',500,0,500,1),(23,'09:10:59','2020-09-25',1700,0,0,1),(24,'09:11:24','2020-09-25',1700,0,0,1),(25,'09:17:51','2020-09-25',2000,0,0,1),(26,'09:30:12','2020-09-25',500,0,500,1),(27,'09:30:15','2020-09-25',500,0,500,1),(28,'12:12:59','2020-09-27',150,0,150,1),(29,'12:23:01','2020-09-27',120,1,118.8,1),(30,'02:39:18','2020-09-27',240,0,240,1),(31,'02:46:20','2020-09-27',595,2,583.1,1),(32,'04:20:39','2020-09-27',150,0,150,1),(33,'08:31:36','2020-09-27',250,0,250,1),(34,'02:17:34','2020-09-28',500,0,500,1),(35,'02:52:59','2020-09-28',500,0,500,1),(36,'02:57:58','2020-09-28',1000,0,1000,1),(37,'04:49:17','2020-09-28',500,0,0,1),(38,'09:03:43','2020-09-28',1200,0,1200,1),(39,'12:00:42','2020-09-29',500,0,500,1),(40,'08:52:12','2020-09-30',500,0,500,1),(41,'08:57:23','2020-09-30',500,0,500,1),(42,'08:58:36','2020-09-30',500,0,500,1),(43,'08:59:43','2020-09-30',3400,0,3400,1),(44,'09:29:30','2020-09-30',300,0,300,1),(45,'09:34:01','2020-09-30',500,0,500,1),(46,'09:34:48','2020-09-30',1000,0,1000,1),(47,'09:37:47','2020-09-30',1000,0,1000,1),(48,'09:38:49','2020-09-30',200,0,200,1),(49,'10:31:42','2020-09-30',500,0,500,1),(50,'10:32:02','2020-09-30',500,0,500,1),(51,'10:32:59','2020-09-30',1500,0,1500,1),(52,'10:33:25','2020-09-30',100,0,100,1),(53,'10:33:58','2020-09-30',600,0,600,1),(54,'10:45:09','2020-09-30',500,0,500,1),(55,'10:47:27','2020-09-30',1200,0,1200,1),(56,'11:21:54','2020-09-30',500,0,500,1),(57,'11:23:12','2020-09-30',500,0,500,1),(58,'11:24:40','2020-09-30',500,0,500,1),(59,'11:30:15','2020-09-30',3200,0,3200,1),(60,'11:33:03','2020-09-30',3200,0,3200,1),(61,'11:33:40','2020-09-30',200,0,200,1),(62,'11:44:30','2020-09-30',500,0,500,1),(63,'11:44:52','2020-09-30',1200,0,1200,1),(64,'11:47:02','2020-09-30',500,0,500,1),(65,'11:47:33','2020-09-30',1200,0,1200,1);
/*!40000 ALTER TABLE `bill` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `billpayment`
--

DROP TABLE IF EXISTS `billpayment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `billpayment` (
  `blp_id` int(11) NOT NULL AUTO_INCREMENT,
  `blp_time` time DEFAULT NULL,
  `blp_date` date DEFAULT NULL,
  `blp_payment` double DEFAULT NULL,
  `blp_balance` double DEFAULT NULL,
  `blp_due` double DEFAULT NULL,
  `blp_pmtmethod` varchar(6) DEFAULT NULL,
  `blp_card` varchar(7) DEFAULT NULL,
  `blp_card_no` varchar(30) DEFAULT NULL,
  `blp_ref_no` varchar(30) DEFAULT NULL,
  `blp_state` int(11) DEFAULT NULL,
  `std_id` int(11) NOT NULL,
  `bil_id` int(11) NOT NULL,
  PRIMARY KEY (`blp_id`),
  KEY `fk_billPayment_Student1_idx` (`std_id`),
  KEY `fk_billPayment_Bill1_idx` (`bil_id`),
  CONSTRAINT `fk_billPayment_Bill1` FOREIGN KEY (`bil_id`) REFERENCES `bill` (`bil_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_billPayment_Student1` FOREIGN KEY (`std_id`) REFERENCES `student` (`std_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=50 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `billpayment`
--

LOCK TABLES `billpayment` WRITE;
/*!40000 ALTER TABLE `billpayment` DISABLE KEYS */;
INSERT INTO `billpayment` VALUES (1,'10:39:47','2019-12-06',7000,70,0,'CASH','Select','','',NULL,10,6),(2,'08:30:05','2019-12-07',250,2.5,0,'','Select','','',NULL,10,9),(3,'02:01:08','2019-12-07',200,50,0,'null','Select','','',NULL,10,8),(4,'11:03:50','2020-08-05',7500,0,0,'CASH','Select','','',NULL,16,11),(5,'11:04:21','2020-08-05',7500,0,0,'CASH','Select','','',NULL,17,12),(6,'10:03:33','2020-08-10',50,20,0,'CASH','Select','','',NULL,10,13),(7,'10:11:02','2020-08-10',100,25,0,'CASH','Select','','',NULL,10,14),(8,'03:01:41','2020-09-20',500,0,0,'CARD','Visa','1234567890','123456',NULL,10,18),(9,'03:22:51','2020-09-20',500,0,0,'CARD','Amex','1234567890','1234567890',NULL,10,19),(10,'11:42:40','2020-09-23',1000,0,0,'CASH','Select','','',NULL,10,20),(11,'12:00:42','2020-09-23',500,0,0,'null','Select','','',NULL,10,22),(12,'09:10:59','2020-09-25',1700,0,0,'CASH','Select','','',NULL,19,23),(13,'09:17:51','2020-09-25',2000,0,0,'CASH','Select','','',NULL,21,25),(14,'09:30:12','2020-09-25',500,0,0,'CASH','Select','','',NULL,10,26),(15,'09:30:15','2020-09-25',500,0,0,'CASH','Select','','',NULL,10,27),(16,'12:12:59','2020-09-27',200,50,0,'CASH','Select','','',NULL,10,28),(17,'12:23:02','2020-09-27',120,1.2000000000000028,0,'CASH','Select','','',NULL,10,29),(18,'02:39:18','2020-09-27',250,10,0,'','Select','','',NULL,10,30),(19,'02:46:20','2020-09-27',600,16.899999999999977,0,'CASH','Select','','',NULL,10,31),(20,'04:20:39','2020-09-27',200,50,0,'null','Select','','',NULL,10,28),(21,'08:31:36','2020-09-27',250,0,0,'CASH','Select','','',NULL,10,33),(22,'02:17:34','2020-09-28',500,0,0,'CASH','Select','','',NULL,10,34),(23,'02:52:59','2020-09-28',500,0,0,'CASH','Select','','',NULL,10,35),(24,'02:57:58','2020-09-28',500,0,500,'CASH','Select','','',NULL,10,36),(25,'04:49:17','2020-09-28',500,500,0,'CASH','Select','','',NULL,10,37),(26,'09:03:43','2020-09-28',1200,0,0,'CASH','Select','','',NULL,10,38),(27,'12:00:42','2020-09-29',500,0,0,'CASH','Select','','',NULL,10,39),(28,'08:52:12','2020-09-30',500,0,0,'CASH','Select','','',NULL,10,40),(29,'08:57:23','2020-09-30',500,0,0,'CASH','Select','','',NULL,10,41),(30,'08:58:36','2020-09-30',500,0,0,'CASH','Select','','',NULL,10,42),(31,'08:59:43','2020-09-30',3400,0,0,'CASH','Select','','',NULL,10,43),(32,'09:34:01','2020-09-30',500,0,0,'CASH','Select','','',NULL,10,45),(33,'09:37:47','2020-09-30',1000,0,0,'CASH','Select','','',NULL,10,47),(34,'09:38:49','2020-09-30',0,0,200,'CASH','Select','','',NULL,10,48),(35,'10:31:42','2020-09-30',500,0,0,'CASH','Select','','',NULL,10,49),(36,'10:32:02','2020-09-30',500,0,0,'CASH','Select','','',NULL,10,50),(37,'10:32:59','2020-09-30',1500,0,0,'CASH','Select','','',NULL,10,51),(38,'10:33:25','2020-09-30',100,0,0,'CASH','Select','','',NULL,10,52),(39,'10:33:58','2020-09-30',600,0,0,'CASH','Select','','',NULL,10,53),(40,'10:45:09','2020-09-30',500,0,0,'CASH','Select','','',NULL,10,54),(41,'10:47:27','2020-09-30',1200,0,0,'CASH','Select','','',NULL,10,55),(42,'11:21:54','2020-09-30',500,0,0,'CASH','Select','','',NULL,10,56),(43,'11:24:40','2020-09-30',500,0,0,'CASH','Select','','',NULL,10,58),(44,'11:33:03','2020-09-30',3200,0,0,'CASH','Select','','',NULL,10,60),(45,'11:33:40','2020-09-30',200,0,0,'CASH','Select','','',NULL,10,61),(46,'11:44:30','2020-09-30',500,0,0,'CASH','Select','','',NULL,10,62),(47,'11:44:52','2020-09-30',1200,0,0,'CASH','Select','','',NULL,10,63),(48,'11:47:02','2020-09-30',500,0,0,'CASH','Select','','',NULL,10,64),(49,'11:47:33','2020-09-30',1200,0,0,'CASH','Select','','',NULL,10,65);
/*!40000 ALTER TABLE `billpayment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `class`
--

DROP TABLE IF EXISTS `class`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `class` (
  `cls_id` int(11) NOT NULL AUTO_INCREMENT,
  `cls_fee` double NOT NULL,
  `cls_grade` tinyint(4) DEFAULT NULL,
  `sub_id` int(11) DEFAULT NULL,
  `clr_id` int(11) DEFAULT NULL,
  `emp_id` int(11) DEFAULT NULL,
  `clt_id` int(11) DEFAULT NULL,
  `cls_reg_date` date DEFAULT NULL,
  `cls_reg_time` time DEFAULT NULL,
  `cls_state` varchar(1) DEFAULT '1',
  `use_id` int(11) DEFAULT NULL,
  `cls_end_date` date DEFAULT NULL,
  `cls_pmt_comi` double DEFAULT NULL,
  PRIMARY KEY (`cls_id`),
  KEY `fk_Class_Subject1_idx` (`sub_id`),
  KEY `fk_Class_ClassRoom1_idx` (`clr_id`),
  KEY `fk_Class_Employee1_idx` (`emp_id`),
  KEY `fk_Class_classType1_idx` (`clt_id`),
  KEY `fk_Class_User1_idx` (`use_id`),
  CONSTRAINT `fk_Class_ClassRoom1` FOREIGN KEY (`clr_id`) REFERENCES `classroom` (`clr_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Class_Employee1` FOREIGN KEY (`emp_id`) REFERENCES `employee` (`emp_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Class_Subject1` FOREIGN KEY (`sub_id`) REFERENCES `subject` (`sub_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Class_User1` FOREIGN KEY (`use_id`) REFERENCES `user` (`use_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Class_classType1` FOREIGN KEY (`clt_id`) REFERENCES `classtype` (`clt_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `class`
--

LOCK TABLES `class` WRITE;
/*!40000 ALTER TABLE `class` DISABLE KEYS */;
INSERT INTO `class` VALUES (1,500,5,11,1,4,2,'2019-11-26','05:46:26','1',1,'2020-11-26',25),(4,300,2,13,1,7,2,'2019-11-26','06:00:26','1',1,'2020-11-26',25),(7,200,5,13,4,1,2,'2020-11-27','02:45:57','1',1,'2020-11-27',25),(8,500,6,14,2,1,2,'2020-11-27','03:45:44','1',1,'2020-11-27',25),(9,500,10,14,1,2,2,'2019-11-28','03:37:59','1',1,'2020-11-28',25),(11,500,10,12,2,1,2,'2020-11-30','12:20:40','1',1,'2019-11-21',25),(12,500,1,11,2,2,2,'2019-11-30','12:34:04','1',1,'2019-11-20',25),(13,1200,6,12,6,1,1,'2020-12-06','03:15:38','1',1,'2019-12-10',25),(14,1500,10,12,1,1,2,'2020-08-10','10:14:46','1',1,'2020-08-31',25),(15,500,10,16,8,2,2,'2020-09-25','12:07:02','1',1,'2021-09-25',25),(16,500,10,14,9,1,2,'2020-09-28','04:46:38','1',1,'2021-09-28',25),(17,1200,10,20,7,1,2,'2020-09-28','09:02:50','1',1,'2021-09-28',25);
/*!40000 ALTER TABLE `class` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `classmaterialallot`
--

DROP TABLE IF EXISTS `classmaterialallot`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `classmaterialallot` (
  `cma_id` int(11) NOT NULL AUTO_INCREMENT,
  `cls_id` int(11) NOT NULL,
  `ite_id` int(11) NOT NULL,
  PRIMARY KEY (`cma_id`),
  KEY `fk_Class_has_classMaterial_Class1_idx` (`cls_id`),
  KEY `fk_classMaterialAllot_Item1_idx` (`ite_id`),
  CONSTRAINT `fk_Class_has_classMaterial_Class1` FOREIGN KEY (`cls_id`) REFERENCES `class` (`cls_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_classMaterialAllot_Item1` FOREIGN KEY (`ite_id`) REFERENCES `item` (`ite_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `classmaterialallot`
--

LOCK TABLES `classmaterialallot` WRITE;
/*!40000 ALTER TABLE `classmaterialallot` DISABLE KEYS */;
/*!40000 ALTER TABLE `classmaterialallot` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `classpayment`
--

DROP TABLE IF EXISTS `classpayment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `classpayment` (
  `clp_id` int(11) NOT NULL AUTO_INCREMENT,
  `clp_time` time DEFAULT NULL,
  `clp_date` date DEFAULT NULL,
  `clp_amount` double DEFAULT NULL,
  `clp_currentFee` double DEFAULT NULL,
  `clp_state` int(11) DEFAULT '1',
  `bil_id` int(11) NOT NULL,
  `cls_id` int(11) NOT NULL,
  PRIMARY KEY (`clp_id`),
  KEY `fk_classPayment_Bill1_idx` (`bil_id`),
  KEY `fk_classPayment_Class1_idx` (`cls_id`),
  CONSTRAINT `fk_classPayment_Bill1` FOREIGN KEY (`bil_id`) REFERENCES `bill` (`bil_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_classPayment_Class1` FOREIGN KEY (`cls_id`) REFERENCES `class` (`cls_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `classpayment`
--

LOCK TABLES `classpayment` WRITE;
/*!40000 ALTER TABLE `classpayment` DISABLE KEYS */;
INSERT INTO `classpayment` VALUES (3,'03:22:51','2020-09-20',500,500,1,19,7),(4,'03:22:51','2020-09-20',500,500,1,18,7),(5,'11:42:40','2020-09-23',500,500,1,20,7),(6,'11:42:40','2020-09-23',500,500,1,20,7),(7,'12:00:32','2020-09-23',500,500,1,21,13),(8,'12:00:42','2020-09-23',500,500,1,22,13),(9,'09:10:59','2020-09-25',1200,1200,1,23,13),(10,'09:11:24','2020-09-25',1200,1200,1,24,13),(11,'09:17:51','2020-09-25',1500,1500,1,25,14),(12,'09:30:12','2020-09-25',500,500,1,26,15),(13,'09:30:15','2020-09-25',500,500,1,27,15),(14,'02:17:34','2020-09-28',500,500,1,34,1),(15,'02:52:59','2020-09-28',500,500,1,35,1),(16,'02:57:58','2020-09-28',500,500,1,36,1),(17,'02:57:58','2020-09-28',500,500,1,36,1),(18,'04:49:17','2020-09-28',500,500,1,37,16),(19,'09:03:43','2020-09-28',1200,1200,1,38,17),(20,'12:00:42','2020-09-29',500,500,1,39,1),(21,'08:58:36','2020-08-01',500,500,1,42,1),(22,'08:59:43','2020-08-01',1200,1200,1,43,13),(23,'08:59:43','2020-08-01',500,500,1,43,15),(24,'08:59:43','2020-08-01',500,500,1,43,16),(25,'08:59:43','2020-08-01',1200,1200,1,43,17),(26,'09:34:02','2020-07-01',500,500,1,45,1),(27,'09:37:47','2020-07-01',1200,1200,1,47,13),(28,'10:32:59','2020-07-01',500,500,1,51,15),(29,'10:32:59','2020-07-01',500,500,1,51,16),(30,'10:32:59','2020-07-01',1200,1200,1,51,17),(31,'10:45:09','2020-06-01',500,500,1,54,1),(32,'10:47:27','2020-06-01',1200,1200,1,55,13),(33,'11:21:54','2020-06-01',500,500,1,56,15),(34,'11:24:40','2020-06-01',500,500,1,58,16),(35,'11:33:03','2020-06-01',1200,1200,1,60,17),(36,'11:33:03','2020-05-01',500,500,1,60,1),(37,'11:33:03','2020-05-01',1200,1200,1,60,13),(38,'11:33:03','2020-05-01',500,500,1,60,15),(39,'11:44:30','2020-05-01',500,500,1,62,16),(40,'11:44:52','2020-05-01',1200,1200,1,63,17),(41,'11:47:02','2020-04-01',500,500,1,64,1),(42,'11:47:33','2020-04-01',1200,1200,1,65,13);
/*!40000 ALTER TABLE `classpayment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `classpayreceive`
--

DROP TABLE IF EXISTS `classpayreceive`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `classpayreceive` (
  `cpp_id` int(11) NOT NULL AUTO_INCREMENT,
  `cpp_tot_earn` double DEFAULT NULL,
  `cpp_ded_cap` double DEFAULT NULL,
  `cpp_net_earn` double DEFAULT NULL,
  `cpp_generate_date` date DEFAULT NULL,
  `cpp_generate_time` time DEFAULT NULL,
  `cpp_generate_by` varchar(60) DEFAULT NULL,
  `cpp_valid_date` date DEFAULT NULL,
  `cpp_state` char(1) DEFAULT '1',
  `cls_id` int(11) NOT NULL,
  `acc_id` int(11) NOT NULL,
  PRIMARY KEY (`cpp_id`),
  KEY `fk_classPayReceive_Class1_idx` (`cls_id`),
  KEY `fk_classPayReceive_Account1_idx` (`acc_id`),
  CONSTRAINT `fk_classPayReceive_Account1` FOREIGN KEY (`acc_id`) REFERENCES `account` (`acc_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_classPayReceive_Class1` FOREIGN KEY (`cls_id`) REFERENCES `class` (`cls_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `classpayreceive`
--

LOCK TABLES `classpayreceive` WRITE;
/*!40000 ALTER TABLE `classpayreceive` DISABLE KEYS */;
/*!40000 ALTER TABLE `classpayreceive` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `classroom`
--

DROP TABLE IF EXISTS `classroom`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `classroom` (
  `clr_id` int(11) NOT NULL AUTO_INCREMENT,
  `clr_no` varchar(3) DEFAULT NULL,
  `flr_id` int(11) DEFAULT NULL,
  `rmt_id` int(11) DEFAULT NULL,
  `clr_reg_date` date DEFAULT NULL,
  `clr_reg_time` time DEFAULT NULL,
  PRIMARY KEY (`clr_id`),
  KEY `fk_ClassRoom_Floor1_idx` (`flr_id`),
  KEY `fk_ClassRoom_roomType1_idx` (`rmt_id`),
  CONSTRAINT `fk_ClassRoom_Floor1` FOREIGN KEY (`flr_id`) REFERENCES `floor` (`flr_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_ClassRoom_roomType1` FOREIGN KEY (`rmt_id`) REFERENCES `roomtype` (`rmt_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `classroom`
--

LOCK TABLES `classroom` WRITE;
/*!40000 ALTER TABLE `classroom` DISABLE KEYS */;
INSERT INTO `classroom` VALUES (1,'A-1',1,4,'2019-11-25','10:29:11'),(2,'A-2',1,3,'2019-11-26','04:56:21'),(3,'A-3',1,4,'2019-11-26','04:56:21'),(4,'A-4',1,3,'2019-11-26','04:56:21'),(5,'A-5',1,3,'2019-11-26','08:59:34'),(6,'B-1',1,3,'2019-12-06','02:38:01'),(7,'B-2',5,3,'2020-08-05','11:08:45'),(8,'1C',5,4,'2020-09-25','08:53:38'),(9,'2C',5,4,'2020-09-25','08:55:03');
/*!40000 ALTER TABLE `classroom` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `classscheduleday`
--

DROP TABLE IF EXISTS `classscheduleday`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `classscheduleday` (
  `csd_id` int(11) NOT NULL AUTO_INCREMENT,
  `cls_id` int(11) NOT NULL,
  `day_id` int(11) NOT NULL,
  `csd_start_time` time DEFAULT NULL,
  `csd_end_time` time DEFAULT NULL,
  `csd_state` int(11) DEFAULT '1',
  PRIMARY KEY (`csd_id`),
  KEY `fk_Class_has_Day_Day1_idx` (`day_id`),
  KEY `fk_Class_has_Day_Class1_idx` (`cls_id`),
  CONSTRAINT `fk_Class_has_Day_Class1` FOREIGN KEY (`cls_id`) REFERENCES `class` (`cls_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Class_has_Day_Day1` FOREIGN KEY (`day_id`) REFERENCES `day` (`day_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `classscheduleday`
--

LOCK TABLES `classscheduleday` WRITE;
/*!40000 ALTER TABLE `classscheduleday` DISABLE KEYS */;
INSERT INTO `classscheduleday` VALUES (1,1,1,'12:30:00','05:30:00',1),(2,1,1,'05:30:00','14:30:00',1),(3,13,1,'02:30:00','02:00:00',1),(4,14,1,'08:30:00','10:30:00',1),(5,15,5,'10:00:00','12:00:00',1),(6,16,1,'17:00:00','19:30:00',1),(7,17,1,'22:00:00','23:30:00',1);
/*!40000 ALTER TABLE `classscheduleday` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `classtype`
--

DROP TABLE IF EXISTS `classtype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `classtype` (
  `clt_id` int(11) NOT NULL AUTO_INCREMENT,
  `clt_type` varchar(6) DEFAULT NULL,
  PRIMARY KEY (`clt_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `classtype`
--

LOCK TABLES `classtype` WRITE;
/*!40000 ALTER TABLE `classtype` DISABLE KEYS */;
INSERT INTO `classtype` VALUES (1,'EXAM'),(2,'THEORY'),(3,'PAPER');
/*!40000 ALTER TABLE `classtype` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `day`
--

DROP TABLE IF EXISTS `day`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `day` (
  `day_id` int(11) NOT NULL AUTO_INCREMENT,
  `day_name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`day_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `day`
--

LOCK TABLES `day` WRITE;
/*!40000 ALTER TABLE `day` DISABLE KEYS */;
INSERT INTO `day` VALUES (1,'Monday'),(2,'TUESDAY'),(3,'WEDNSDAY'),(4,'THURSDAY'),(5,'FRIDAY'),(6,'SATURDAY'),(7,'SUNDAY');
/*!40000 ALTER TABLE `day` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `earnfromclass`
--

DROP TABLE IF EXISTS `earnfromclass`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `earnfromclass` (
  `efc_id` int(11) NOT NULL AUTO_INCREMENT,
  `cls_id` int(11) NOT NULL,
  `iee_id` int(11) NOT NULL,
  `efc_month` varchar(10) DEFAULT NULL,
  `efc_up_date` date DEFAULT NULL,
  `efc_up_time` time DEFAULT NULL,
  `efc_amount` double DEFAULT NULL,
  PRIMARY KEY (`efc_id`),
  KEY `fk_Class_has_InstituteEarn_InstituteEarn1_idx` (`iee_id`),
  KEY `fk_Class_has_InstituteEarn_Class1_idx` (`cls_id`),
  CONSTRAINT `fk_Class_has_InstituteEarn_Class1` FOREIGN KEY (`cls_id`) REFERENCES `class` (`cls_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Class_has_InstituteEarn_InstituteEarn1` FOREIGN KEY (`iee_id`) REFERENCES `instituteearn` (`iee_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `earnfromclass`
--

LOCK TABLES `earnfromclass` WRITE;
/*!40000 ALTER TABLE `earnfromclass` DISABLE KEYS */;
/*!40000 ALTER TABLE `earnfromclass` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employee` (
  `emp_id` int(11) NOT NULL AUTO_INCREMENT,
  `emp_nic` varchar(15) NOT NULL,
  `emp_fname` varchar(60) NOT NULL,
  `emp_mname` varchar(60) DEFAULT NULL,
  `emp_lname` varchar(60) NOT NULL,
  `emp_dob` date NOT NULL,
  `emp_gender` char(1) NOT NULL,
  `emp_position` varchar(30) DEFAULT NULL,
  `emp_add_no` varchar(6) DEFAULT NULL,
  `emp_add_street` varchar(60) NOT NULL,
  `emp_add_city` varchar(60) NOT NULL,
  `emp_email` varchar(120) DEFAULT NULL,
  `emp_mobile` varchar(12) DEFAULT NULL,
  `emp_home` varchar(12) DEFAULT NULL,
  `emp_rfid` varchar(36) DEFAULT NULL,
  `emp_tec_free_card_state` varchar(8) DEFAULT 'deactive',
  `emp_reg_date` date DEFAULT NULL,
  `emp_reg_time` time DEFAULT NULL,
  `emp_mem_state` varchar(8) DEFAULT 'active',
  `use_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`emp_id`),
  KEY `fk_Employee_User1_idx` (`use_id`),
  CONSTRAINT `fk_Employee_User1` FOREIGN KEY (`use_id`) REFERENCES `user` (`use_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (1,'992400315V','Nimal','Bandaara','Kumara','1080-08-26','M','TEACHER','32CC','ABC','EFG','Nimal@gmail.com','0729572098','0332260098','1234567890','active','2019-11-25','08:50:25','active',1),(2,'992400316V','Chamod','Balasuriya','Diyamantha','1999-08-28','M','TEACHER','wq','ewe','ew','Diyamanthachamodcal@gmail.com','9333123123','323123123','12345678','active','2019-11-25','10:51:25','active',1),(3,'3234324','dsad','dsad','dsdas','2019-11-14','M','TEACHER','sdsad','dsad','dasd','dasd','321','32132','32133','active','2019-11-26','05:34:26','active',1),(4,'32133','asdasd','sadd','dasda','2019-11-01','M','TEACHER','dsad','dsad','dssad','asds','asdad','adsd','321312','active','2019-11-26','05:46:26','active',1),(5,'99312321312V','dasdad','dasd','dsadsa','2019-11-13','M','TEACHER','asd','das','dasd','dasd','312312','3213123','3123','active','2019-11-26','05:55:26','active',1),(6,'3123','ads','dsad','dasd','2019-11-14','M','TEACHER','ds','dsdad','sadasdsd','sad','dsad','dsd','31231231','active','2019-11-26','05:58:26','active',1),(7,'321','ddasd','d','ds','2019-11-01','M','TEACHER','adsd','dasd','dasd','ss','321312','31231','3123','deactive','2019-11-26','06:00:26','active',1),(9,'3123','dasd','dasda','dasdd','2019-11-16','M','TEACHER','asdda','dasda','dasdad','dsad','dasda','dsad','3213123','A','2019-11-29','11:30:29','active',1),(10,'43423423','Laksman','pranandu','Silva','2019-12-12','M','TEACHER','dsad','dsad','dsad','dsa','dsad','dsa','32132','A','2019-12-06','02:25:06','active',1),(11,'5654656','rtyty','ytryr','ytrytry','2020-07-17','M','TEACHER','232','sdsds','dsdsd','32323','3232323','32323','3232323','A','2020-07-13','02:52:13','active',1),(12,'992400315V','ABC','KODIDD','PERERA','2020-09-08','M','TEACHER','323','dsdsdsd','dsadsad','4343243','324343','4343243','1234567890','A','2020-09-25','04:47:25','active',1);
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employeeattendance`
--

DROP TABLE IF EXISTS `employeeattendance`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employeeattendance` (
  `ema_id` int(11) NOT NULL AUTO_INCREMENT,
  `ema_date` date DEFAULT NULL,
  `ema_in_time` time DEFAULT NULL,
  `ema_out_time` time DEFAULT NULL,
  `ema_att_type` varchar(6) DEFAULT NULL,
  `emp_id` int(11) NOT NULL,
  PRIMARY KEY (`ema_id`),
  KEY `fk_EmployeeAttendance_Employee1_idx` (`emp_id`),
  CONSTRAINT `fk_EmployeeAttendance_Employee1` FOREIGN KEY (`emp_id`) REFERENCES `employee` (`emp_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employeeattendance`
--

LOCK TABLES `employeeattendance` WRITE;
/*!40000 ALTER TABLE `employeeattendance` DISABLE KEYS */;
/*!40000 ALTER TABLE `employeeattendance` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employeeinvoice`
--

DROP TABLE IF EXISTS `employeeinvoice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employeeinvoice` (
  `emi_id` int(11) NOT NULL AUTO_INCREMENT,
  `emi_amount` double DEFAULT NULL,
  `emi_state` varchar(1) DEFAULT '1',
  `emp_id` int(11) NOT NULL,
  `inv_id` int(11) NOT NULL,
  PRIMARY KEY (`emi_id`),
  KEY `fk_employeeInvoice_Employee1_idx` (`emp_id`),
  KEY `fk_employeeInvoice_Invoice1_idx` (`inv_id`),
  CONSTRAINT `fk_employeeInvoice_Employee1` FOREIGN KEY (`emp_id`) REFERENCES `employee` (`emp_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_employeeInvoice_Invoice1` FOREIGN KEY (`inv_id`) REFERENCES `invoice` (`inv_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employeeinvoice`
--

LOCK TABLES `employeeinvoice` WRITE;
/*!40000 ALTER TABLE `employeeinvoice` DISABLE KEYS */;
/*!40000 ALTER TABLE `employeeinvoice` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `floor`
--

DROP TABLE IF EXISTS `floor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `floor` (
  `flr_id` int(11) NOT NULL AUTO_INCREMENT,
  `flr_no` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`flr_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `floor`
--

LOCK TABLES `floor` WRITE;
/*!40000 ALTER TABLE `floor` DISABLE KEYS */;
INSERT INTO `floor` VALUES (1,'1'),(2,'12'),(3,'2'),(4,'3'),(5,'4');
/*!40000 ALTER TABLE `floor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `grn`
--

DROP TABLE IF EXISTS `grn`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `grn` (
  `grn_id` int(11) NOT NULL AUTO_INCREMENT,
  `grn_isu_date` date DEFAULT NULL,
  `grn_isu_time` time DEFAULT NULL,
  `grn_ite_qty` double DEFAULT NULL,
  `grn_total` double DEFAULT NULL,
  `sup_id` int(11) NOT NULL,
  `use_id` int(11) NOT NULL,
  PRIMARY KEY (`grn_id`),
  KEY `fk_GRN_Supplier1_idx` (`sup_id`),
  KEY `fk_GRN_User1_idx` (`use_id`),
  CONSTRAINT `fk_GRN_Supplier1` FOREIGN KEY (`sup_id`) REFERENCES `supplier` (`sup_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_GRN_User1` FOREIGN KEY (`use_id`) REFERENCES `user` (`use_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `grn`
--

LOCK TABLES `grn` WRITE;
/*!40000 ALTER TABLE `grn` DISABLE KEYS */;
INSERT INTO `grn` VALUES (1,'2019-11-26','09:00:00',100,100,4,1),(2,'2019-11-26','09:34:00',100,100,4,1),(4,'2019-11-26','09:47:00',400,4800,4,1),(5,'2019-11-26','09:54:00',160,3200,4,1),(6,'2019-11-26','10:04:00',170,2040,4,1),(7,'2019-12-01','06:34:00',100,1200,4,1),(9,'2019-12-06','02:45:00',1000,20000,4,1),(10,'2019-12-06','02:49:00',1000,20000,4,1),(11,'2019-12-06','02:53:00',1000,12000,4,1),(12,'2020-08-10','10:05:00',1000,12000,4,1),(13,'2020-09-27','02:54:00',1000,10000,4,1),(14,'2020-09-27','03:22:00',1000,5000,5,1),(15,'2020-09-27','04:01:00',2500,27500,4,1);
/*!40000 ALTER TABLE `grn` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `grndetail`
--

DROP TABLE IF EXISTS `grndetail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `grndetail` (
  `grd_id` int(11) NOT NULL AUTO_INCREMENT,
  `grn_id` int(11) NOT NULL,
  `ite_id` int(11) NOT NULL,
  `grd_ite_qty` double DEFAULT NULL,
  `grd_price` double DEFAULT NULL,
  `grd_bPrice` double DEFAULT NULL,
  `grd_sPrice` double DEFAULT NULL,
  PRIMARY KEY (`grd_id`),
  KEY `fk_GRN_has_Item_Item1_idx` (`ite_id`),
  KEY `fk_GRN_has_Item_GRN1_idx` (`grn_id`),
  CONSTRAINT `fk_GRN_has_Item_GRN1` FOREIGN KEY (`grn_id`) REFERENCES `grn` (`grn_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_GRN_has_Item_Item1` FOREIGN KEY (`ite_id`) REFERENCES `item` (`ite_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `grndetail`
--

LOCK TABLES `grndetail` WRITE;
/*!40000 ALTER TABLE `grndetail` DISABLE KEYS */;
INSERT INTO `grndetail` VALUES (1,1,1,100,20,8,10),(2,2,1,100,1000,10,12),(3,4,1,100,1200,12,15),(4,4,2,100,1200,12,15),(5,4,3,200,2400,12,20),(6,5,1,100,2000,20,25),(7,5,2,50,1000,20,25),(8,5,3,10,200,20,25),(9,6,1,20,240,12,15),(10,6,2,50,600,12,20),(11,6,3,100,1200,12,20),(12,7,1,100,1200,12,15),(13,9,3,1000,20000,20,25),(14,10,4,1000,20000,20,30),(15,11,6,1000,12000,12,20),(16,12,1,1000,12000,12,15),(17,13,2,1000,10000,10,15),(18,14,4,1000,5000,5,15),(19,15,1,1000,10000,10,15),(20,15,6,1000,10000,10,20),(21,15,2,500,7500,15,25);
/*!40000 ALTER TABLE `grndetail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `instituteearn`
--

DROP TABLE IF EXISTS `instituteearn`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `instituteearn` (
  `iee_id` int(11) NOT NULL AUTO_INCREMENT,
  `iee_month` varchar(10) DEFAULT NULL,
  `iee_earn` double DEFAULT NULL,
  `iee_up_date` date DEFAULT NULL,
  `iee_up_time` time DEFAULT NULL,
  PRIMARY KEY (`iee_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `instituteearn`
--

LOCK TABLES `instituteearn` WRITE;
/*!40000 ALTER TABLE `instituteearn` DISABLE KEYS */;
INSERT INTO `instituteearn` VALUES (1,'July',0,'2020-07-13','03:12:34'),(2,'September',0,'2020-09-22','10:22:08'),(3,'September',0,'2020-09-22','10:23:02'),(4,'September',0,'2020-09-22','10:23:07');
/*!40000 ALTER TABLE `instituteearn` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `invoice`
--

DROP TABLE IF EXISTS `invoice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `invoice` (
  `inv_id` int(11) NOT NULL AUTO_INCREMENT,
  `inv_isu_date` date DEFAULT NULL,
  `inv_isu_time` time DEFAULT NULL,
  `inv_sub_total` double DEFAULT NULL,
  `inv_discount` double DEFAULT NULL,
  `inv_ite_qty` double DEFAULT NULL,
  `inv_net_total` double DEFAULT NULL,
  `use_id` int(11) NOT NULL,
  PRIMARY KEY (`inv_id`),
  KEY `fk_Invoice_User1_idx` (`use_id`),
  CONSTRAINT `fk_Invoice_User1` FOREIGN KEY (`use_id`) REFERENCES `user` (`use_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `invoice`
--

LOCK TABLES `invoice` WRITE;
/*!40000 ALTER TABLE `invoice` DISABLE KEYS */;
INSERT INTO `invoice` VALUES (1,'2019-11-28','06:38:58',150,0,10,150,1),(2,'2019-11-28','06:47:54',150,0,10,150,1),(3,'2019-11-28','06:51:07',150,0,10,150,1),(4,'2019-11-28','06:52:55',1100,0,60,1100,1),(6,'2019-12-07','08:20:04',300,0,20,297,1),(7,'2019-12-07','08:22:06',150,0,10,150,1),(8,'2019-12-07','08:25:09',150,0,10,148.5,1),(9,'2019-12-07','08:30:05',250,0,10,247.5,1),(10,'2019-12-07','01:52:29',150,0,10,150,1),(11,'2019-12-07','02:01:08',150,0,10,150,1),(12,'2020-08-10','10:03:33',30,0,2,30,1),(13,'2020-08-10','10:11:02',75,0,5,75,1),(14,'2020-09-27','12:12:58',150,0,8,150,1),(15,'2020-09-27','12:23:01',120,0,12,118.8,1),(16,'2020-09-27','02:39:18',240,0,24,240,1),(17,'2020-09-27','02:46:20',595,0,32,583.1,1),(18,'2020-09-27','04:20:39',150,0,10,150,1),(19,'2020-09-27','08:31:36',250,0,10,250,1);
/*!40000 ALTER TABLE `invoice` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `invoiceitem`
--

DROP TABLE IF EXISTS `invoiceitem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `invoiceitem` (
  `ivi_id` int(11) NOT NULL AUTO_INCREMENT,
  `ite_id` int(11) NOT NULL,
  `inv_id` int(11) NOT NULL,
  `ivi_qty` double DEFAULT NULL,
  `ivi_sub_total` double DEFAULT NULL,
  `ivi_discount` double DEFAULT NULL,
  `ivi_net_total` double DEFAULT NULL,
  PRIMARY KEY (`ivi_id`),
  KEY `fk_Item_has_Invoice_Invoice1_idx` (`inv_id`),
  KEY `fk_Item_has_Invoice_Item1_idx` (`ite_id`),
  CONSTRAINT `fk_Item_has_Invoice_Invoice1` FOREIGN KEY (`inv_id`) REFERENCES `invoice` (`inv_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Item_has_Invoice_Item1` FOREIGN KEY (`ite_id`) REFERENCES `item` (`ite_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `invoiceitem`
--

LOCK TABLES `invoiceitem` WRITE;
/*!40000 ALTER TABLE `invoiceitem` DISABLE KEYS */;
INSERT INTO `invoiceitem` VALUES (1,1,1,10,150,0,150),(2,1,2,10,150,0,150),(3,1,3,10,150,0,150),(4,1,4,20,300,0,300),(5,2,4,20,400,0,400),(6,3,4,20,400,0,400),(7,1,6,10,150,0,150),(8,1,6,10,150,0,150),(9,1,7,10,150,0,150),(10,3,9,10,250,0,250),(11,1,7,10,150,0,150),(12,1,12,2,30,0,30),(13,1,13,5,75,0,75),(14,6,14,5,100,0,100),(15,2,14,2,40,0,40),(16,4,14,1,10,0,10),(17,4,15,12,120,0,120),(18,4,16,12,120,0,120),(19,4,16,12,120,0,120),(20,1,17,10,150,0,150),(21,2,17,5,100,0,100),(22,4,17,2,20,0,20),(23,6,17,10,200,0,200),(24,3,17,5,125,0,125),(25,1,18,10,150,0,150),(26,2,19,10,250,0,250);
/*!40000 ALTER TABLE `invoiceitem` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `invoicepayment`
--

DROP TABLE IF EXISTS `invoicepayment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `invoicepayment` (
  `inp_id` int(11) NOT NULL AUTO_INCREMENT,
  `inp_time` time DEFAULT NULL,
  `inp_date` date DEFAULT NULL,
  `inp_amount` double DEFAULT NULL,
  `inp_state` int(11) DEFAULT '1',
  `bil_id` int(11) NOT NULL,
  `inv_id` int(11) NOT NULL,
  PRIMARY KEY (`inp_id`),
  KEY `fk_invoicePayment_Bill1_idx` (`bil_id`),
  KEY `fk_invoicePayment_Invoice1_idx` (`inv_id`),
  CONSTRAINT `fk_invoicePayment_Bill1` FOREIGN KEY (`bil_id`) REFERENCES `bill` (`bil_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_invoicePayment_Invoice1` FOREIGN KEY (`inv_id`) REFERENCES `invoice` (`inv_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `invoicepayment`
--

LOCK TABLES `invoicepayment` WRITE;
/*!40000 ALTER TABLE `invoicepayment` DISABLE KEYS */;
INSERT INTO `invoicepayment` VALUES (1,NULL,NULL,150,1,0,1),(2,NULL,NULL,150,1,0,2),(3,NULL,NULL,1100,1,0,3),(4,'08:20:04','2019-12-07',500,1,7,6),(6,'08:30:05','2019-12-07',250,1,9,9),(7,'02:01:08','2019-12-07',200,1,8,7),(8,'10:03:33','2020-08-10',50,1,13,12),(9,'10:11:02','2020-08-10',100,1,14,13),(10,'12:12:59','2020-09-27',200,1,28,14),(11,'12:23:01','2020-09-27',120,1,29,15),(12,'02:39:18','2020-09-27',250,1,30,16),(13,'02:46:20','2020-09-27',600,1,31,17),(14,'04:20:39','2020-09-27',200,1,28,18),(15,'08:31:36','2020-09-27',250,1,33,19);
/*!40000 ALTER TABLE `invoicepayment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `item`
--

DROP TABLE IF EXISTS `item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `item` (
  `ite_id` int(11) NOT NULL AUTO_INCREMENT,
  `ite_name` varchar(60) DEFAULT NULL,
  `ite_serial` varchar(60) DEFAULT NULL,
  `ite_type` varchar(6) DEFAULT NULL,
  `ite_unit_price` double DEFAULT NULL,
  `ite_buy_price` double DEFAULT NULL,
  `ite_quantity` double DEFAULT NULL,
  `ite_state` varchar(1) DEFAULT '1',
  `itc_id` int(11) DEFAULT NULL,
  `use_id` int(11) NOT NULL,
  PRIMARY KEY (`ite_id`),
  KEY `fk_Item_itemCode1_idx` (`itc_id`),
  KEY `fk_Item_User1_idx` (`use_id`),
  CONSTRAINT `fk_Item_User1` FOREIGN KEY (`use_id`) REFERENCES `user` (`use_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Item_itemCode1` FOREIGN KEY (`itc_id`) REFERENCES `itemcode` (`itc_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `item`
--

LOCK TABLES `item` WRITE;
/*!40000 ALTER TABLE `item` DISABLE KEYS */;
INSERT INTO `item` VALUES (1,'Atlas Chooty Pen (Blue)','12345','',15,10,1090,'1',1,1),(2,'Atlas Chooty Pen (Black)','32131',NULL,25,15,1595,'1',2,1),(3,'Atlas Chooty Pen (Red)','3123',NULL,25,20,95,'1',3,1),(4,'Atlas eraser(Small)','321323',NULL,15,5,1098,'1',1,1),(6,'Atals Pencile HB1','232132',NULL,20,10,1090,'1',2,1),(7,'sdadsadss','33243243243',NULL,5,0,100,'1',2,1);
/*!40000 ALTER TABLE `item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `itemcode`
--

DROP TABLE IF EXISTS `itemcode`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `itemcode` (
  `itc_id` int(11) NOT NULL AUTO_INCREMENT,
  `itc_code` varchar(6) DEFAULT NULL,
  `itc_state` varchar(10) DEFAULT 'active',
  PRIMARY KEY (`itc_id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `itemcode`
--

LOCK TABLES `itemcode` WRITE;
/*!40000 ALTER TABLE `itemcode` DISABLE KEYS */;
INSERT INTO `itemcode` VALUES (1,'#123','active'),(2,'#234','active'),(3,'#345','active'),(4,'#456','deactive'),(5,'#678','active'),(7,'#567','deactive'),(8,'#723','active'),(9,'#5647','deactive'),(10,'#123','active'),(11,'#123','active'),(12,'#234','active'),(13,'#345','active'),(14,'#456','deactive'),(15,'#678','active'),(16,'#567','deactive'),(17,'#723','active'),(18,'#5647','deactive'),(19,'#123','active'),(20,'#125','active');
/*!40000 ALTER TABLE `itemcode` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `loginsession`
--

DROP TABLE IF EXISTS `loginsession`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `loginsession` (
  `lgs_id` int(11) NOT NULL AUTO_INCREMENT,
  `lgs_ip_address` varchar(60) DEFAULT NULL,
  `lgs_inTime` time DEFAULT NULL,
  `lgs_outTime` time DEFAULT NULL,
  `lgs_date` date DEFAULT NULL,
  `use_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`lgs_id`),
  KEY `fk_loginSession_User1_idx` (`use_id`),
  CONSTRAINT `fk_loginSession_User1` FOREIGN KEY (`use_id`) REFERENCES `user` (`use_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=122 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `loginsession`
--

LOCK TABLES `loginsession` WRITE;
/*!40000 ALTER TABLE `loginsession` DISABLE KEYS */;
INSERT INTO `loginsession` VALUES (1,NULL,'08:18:04',NULL,'2019-11-25',NULL),(2,NULL,NULL,'08:19:23','2019-11-25',NULL),(3,NULL,'08:19:51',NULL,'2019-11-25',1),(4,NULL,NULL,'08:25:29','2019-11-25',NULL),(5,NULL,'08:30:00',NULL,'2019-11-25',1),(6,NULL,'08:41:58',NULL,'2019-11-25',1),(7,NULL,'10:05:03',NULL,'2019-11-25',1),(8,NULL,NULL,'10:28:24','2019-11-25',NULL),(9,NULL,'10:28:32',NULL,'2019-11-25',1),(10,NULL,'05:53:38',NULL,'2019-11-26',1),(11,NULL,'05:59:59',NULL,'2019-11-26',1),(12,NULL,'09:19:53',NULL,'2019-11-26',1),(13,NULL,'10:15:21',NULL,'2019-11-26',1),(14,NULL,'10:18:22',NULL,'2019-11-26',1),(15,NULL,'12:44:34',NULL,'2019-11-26',1),(16,NULL,'01:43:00',NULL,'2019-11-26',1),(17,NULL,'02:11:14',NULL,'2019-11-26',1),(18,NULL,'02:34:14',NULL,'2019-11-26',1),(19,NULL,'02:55:57',NULL,'2019-11-26',1),(20,NULL,'03:45:59',NULL,'2019-11-26',1),(21,NULL,'03:53:57',NULL,'2019-11-26',1),(22,NULL,'04:51:07',NULL,'2019-11-26',1),(23,NULL,'04:55:17',NULL,'2019-11-26',1),(24,NULL,'08:36:20',NULL,'2019-11-26',1),(25,NULL,'09:33:54',NULL,'2019-11-26',1),(26,NULL,'09:40:57',NULL,'2019-11-26',1),(27,NULL,'09:46:36',NULL,'2019-11-26',1),(28,NULL,'09:53:49',NULL,'2019-11-26',1),(29,NULL,'10:24:00',NULL,'2019-11-26',1),(30,NULL,'11:19:33',NULL,'2019-11-27',1),(31,NULL,'11:36:54',NULL,'2019-11-27',1),(32,NULL,'12:51:45',NULL,'2019-11-27',1),(33,NULL,'02:50:06',NULL,'2019-11-27',1),(34,NULL,'02:58:54',NULL,'2019-11-27',1),(35,NULL,'06:37:11',NULL,'2019-11-28',1),(36,NULL,'06:46:42',NULL,'2019-11-28',1),(37,NULL,'06:50:27',NULL,'2019-11-28',1),(38,NULL,'06:53:46',NULL,'2019-11-28',1),(39,NULL,'07:24:39',NULL,'2019-11-28',1),(40,NULL,'07:26:16',NULL,'2019-11-28',1),(41,NULL,'07:45:03',NULL,'2019-11-28',1),(42,NULL,'07:45:23',NULL,'2019-11-28',1),(43,NULL,'07:51:00',NULL,'2019-11-28',1),(44,NULL,'07:54:15',NULL,'2019-11-28',1),(45,NULL,'08:35:57',NULL,'2019-11-28',1),(46,NULL,'01:39:03',NULL,'2019-11-28',1),(47,NULL,'01:50:07',NULL,'2019-11-28',1),(48,NULL,'02:31:32',NULL,'2019-11-28',1),(49,NULL,'02:56:49',NULL,'2019-11-28',1),(50,NULL,'04:57:43',NULL,'2019-11-28',1),(51,NULL,'12:19:54',NULL,'2019-11-30',1),(52,NULL,'12:31:30',NULL,'2019-11-30',1),(53,NULL,'12:37:49',NULL,'2019-11-30',1),(54,NULL,'03:49:57',NULL,'2019-12-01',1),(55,NULL,'03:51:25',NULL,'2019-12-01',1),(56,NULL,'03:53:09',NULL,'2019-12-01',1),(57,NULL,'03:56:07',NULL,'2019-12-01',1),(58,NULL,'03:59:00',NULL,'2019-12-01',1),(59,NULL,'04:00:26',NULL,'2019-12-01',1),(60,NULL,'05:49:10',NULL,'2019-12-01',1),(61,NULL,'11:58:55',NULL,'2019-12-04',1),(62,NULL,'05:32:16',NULL,'2019-12-05',1),(63,NULL,'05:38:59',NULL,'2019-12-05',1),(64,NULL,'09:34:43',NULL,'2019-12-06',1),(65,NULL,'10:20:42',NULL,'2019-12-06',1),(66,NULL,'02:26:22',NULL,'2019-12-06',1),(67,NULL,'02:45:17',NULL,'2019-12-06',1),(68,NULL,'02:53:11',NULL,'2019-12-06',1),(69,NULL,'08:19:33',NULL,'2019-12-07',1),(70,NULL,'08:21:43',NULL,'2019-12-07',1),(71,NULL,'08:24:37',NULL,'2019-12-07',1),(72,NULL,'08:29:35',NULL,'2019-12-07',1),(73,NULL,'01:51:01',NULL,'2019-12-07',1),(74,NULL,'01:52:02',NULL,'2019-12-07',1),(75,NULL,'02:00:41',NULL,'2019-12-07',1),(76,NULL,'12:09:30',NULL,'2020-06-12',1),(77,NULL,'11:02:25',NULL,'2020-08-05',1),(78,NULL,'10:01:20',NULL,'2020-08-10',1),(79,NULL,'10:02:01',NULL,'2020-08-10',1),(80,NULL,'10:39:52',NULL,'2020-08-10',1),(81,NULL,'10:40:17',NULL,'2020-08-10',1),(82,NULL,'11:36:14',NULL,'2020-09-19',1),(83,NULL,'01:15:43',NULL,'2020-09-23',1),(84,NULL,'03:48:19',NULL,'2020-09-24',1),(85,NULL,'03:52:44',NULL,'2020-09-24',1),(86,NULL,'03:53:57',NULL,'2020-09-24',1),(87,NULL,'08:12:46',NULL,'2020-09-25',1),(88,NULL,'08:17:56',NULL,'2020-09-25',1),(89,NULL,'09:17:17',NULL,'2020-09-25',1),(90,NULL,'12:05:29',NULL,'2020-09-25',1),(91,NULL,'04:46:01',NULL,'2020-09-25',1),(92,NULL,'05:05:18',NULL,'2020-09-25',1),(93,NULL,'09:09:18',NULL,'2020-09-25',1),(94,NULL,'09:16:44',NULL,'2020-09-25',1),(95,NULL,'09:27:19',NULL,'2020-09-25',1),(96,NULL,'09:28:38',NULL,'2020-09-25',1),(97,NULL,'12:09:27',NULL,'2020-09-27',1),(98,NULL,'12:21:12',NULL,'2020-09-27',1),(99,NULL,'02:38:27',NULL,'2020-09-27',1),(100,NULL,'02:44:19',NULL,'2020-09-27',1),(101,NULL,'02:53:49',NULL,'2020-09-27',1),(102,NULL,'03:22:00',NULL,'2020-09-27',1),(103,NULL,'04:00:45',NULL,'2020-09-27',1),(104,NULL,'04:20:12',NULL,'2020-09-27',1),(105,NULL,'08:27:14',NULL,'2020-09-27',1),(106,NULL,'02:17:14',NULL,'2020-09-28',1),(107,NULL,'02:46:30',NULL,'2020-09-28',1),(108,NULL,'02:57:22',NULL,'2020-09-28',1),(109,NULL,'04:45:21',NULL,'2020-09-28',1),(110,NULL,'04:47:37',NULL,'2020-09-28',1),(111,NULL,'08:59:10',NULL,'2020-09-28',1),(112,NULL,'12:00:23',NULL,'2020-09-29',1),(113,NULL,'08:49:32',NULL,'2020-09-30',1),(114,NULL,'08:51:02',NULL,'2020-09-30',1),(115,NULL,'08:51:37',NULL,'2020-09-30',1),(116,NULL,'08:56:47',NULL,'2020-09-30',1),(117,NULL,'08:58:13',NULL,'2020-09-30',1),(118,NULL,'03:52:07',NULL,'2020-09-30',1),(119,NULL,'06:55:45',NULL,'2020-10-01',1),(120,NULL,'06:59:24',NULL,'2020-10-01',1),(121,NULL,'09:14:05',NULL,'2020-10-01',1);
/*!40000 ALTER TABLE `loginsession` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `notification`
--

DROP TABLE IF EXISTS `notification`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `notification` (
  `nti_id` int(11) NOT NULL AUTO_INCREMENT,
  `nti_title` varchar(30) DEFAULT NULL,
  `nti_body` varchar(60) DEFAULT NULL,
  `nti_date` date DEFAULT NULL,
  `nti_time` time DEFAULT NULL,
  `use_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`nti_id`),
  KEY `fk_Notification_User1_idx` (`use_id`),
  CONSTRAINT `fk_Notification_User1` FOREIGN KEY (`use_id`) REFERENCES `user` (`use_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=122 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `notification`
--

LOCK TABLES `notification` WRITE;
/*!40000 ALTER TABLE `notification` DISABLE KEYS */;
INSERT INTO `notification` VALUES (1,'LOGIN','USER LOGING TO SYSTEM!','2019-11-25','08:18:04',NULL),(2,'LOGOUT','USER LOGOUT FROM SYSTEM!','2019-11-25','08:19:23',NULL),(3,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-11-25','08:19:51',1),(4,'LOGOUT','USER LOGOUT FROM SYSTEM!','2019-11-25','08:25:29',NULL),(5,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-11-25','08:30:00',1),(6,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-11-25','08:41:58',1),(7,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-11-25','10:05:03',1),(8,'LOGOUT','USER LOGOUT FROM SYSTEM!','2019-11-25','10:28:24',NULL),(9,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-11-25','10:28:32',1),(10,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-11-26','05:53:38',1),(11,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-11-26','05:59:59',1),(12,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-11-26','09:19:53',1),(13,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-11-26','10:15:21',1),(14,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-11-26','10:18:22',1),(15,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-11-26','12:44:34',1),(16,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-11-26','01:43:00',1),(17,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-11-26','02:11:14',1),(18,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-11-26','02:34:14',1),(19,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-11-26','02:55:57',1),(20,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-11-26','03:45:59',1),(21,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-11-26','03:53:57',1),(22,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-11-26','04:51:07',1),(23,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-11-26','04:55:17',1),(24,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-11-26','08:36:20',1),(25,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-11-26','09:33:54',1),(26,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-11-26','09:40:58',1),(27,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-11-26','09:46:36',1),(28,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-11-26','09:53:49',1),(29,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-11-26','10:24:00',1),(30,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-11-27','11:19:33',1),(31,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-11-27','11:36:54',1),(32,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-11-27','12:51:45',1),(33,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-11-27','02:50:06',1),(34,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-11-27','02:58:54',1),(35,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-11-28','06:37:11',1),(36,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-11-28','06:46:42',1),(37,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-11-28','06:50:27',1),(38,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-11-28','06:53:46',1),(39,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-11-28','07:24:39',1),(40,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-11-28','07:26:16',1),(41,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-11-28','07:45:03',1),(42,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-11-28','07:45:23',1),(43,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-11-28','07:51:00',1),(44,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-11-28','07:54:15',1),(45,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-11-28','08:35:57',1),(46,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-11-28','01:39:03',1),(47,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-11-28','01:50:07',1),(48,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-11-28','02:31:32',1),(49,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-11-28','02:56:49',1),(50,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-11-28','04:57:43',1),(51,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-11-30','12:19:54',1),(52,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-11-30','12:31:30',1),(53,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-11-30','12:37:49',1),(54,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-12-01','03:49:57',1),(55,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-12-01','03:51:25',1),(56,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-12-01','03:53:09',1),(57,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-12-01','03:56:07',1),(58,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-12-01','03:59:00',1),(59,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-12-01','04:00:27',1),(60,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-12-01','05:49:10',1),(61,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-12-04','11:58:55',1),(62,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-12-05','05:32:16',1),(63,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-12-05','05:38:59',1),(64,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-12-06','09:34:43',1),(65,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-12-06','10:20:42',1),(66,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-12-06','02:26:22',1),(67,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-12-06','02:45:17',1),(68,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-12-06','02:53:11',1),(69,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-12-07','08:19:33',1),(70,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-12-07','08:21:43',1),(71,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-12-07','08:24:37',1),(72,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-12-07','08:29:35',1),(73,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-12-07','01:51:01',1),(74,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-12-07','01:52:02',1),(75,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2019-12-07','02:00:42',1),(76,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2020-06-12','12:09:30',1),(77,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2020-08-05','11:02:25',1),(78,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2020-08-10','10:01:21',1),(79,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2020-08-10','10:02:01',1),(80,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2020-08-10','10:39:52',1),(81,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2020-08-10','10:40:17',1),(82,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2020-09-19','11:36:14',1),(83,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2020-09-23','01:15:43',1),(84,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2020-09-24','03:48:19',1),(85,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2020-09-24','03:52:44',1),(86,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2020-09-24','03:53:57',1),(87,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2020-09-25','08:12:46',1),(88,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2020-09-25','08:17:56',1),(89,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2020-09-25','09:17:17',1),(90,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2020-09-25','12:05:29',1),(91,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2020-09-25','04:46:01',1),(92,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2020-09-25','05:05:18',1),(93,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2020-09-25','09:09:18',1),(94,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2020-09-25','09:16:44',1),(95,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2020-09-25','09:27:19',1),(96,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2020-09-25','09:28:38',1),(97,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2020-09-27','12:09:27',1),(98,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2020-09-27','12:21:13',1),(99,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2020-09-27','02:38:27',1),(100,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2020-09-27','02:44:19',1),(101,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2020-09-27','02:53:49',1),(102,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2020-09-27','03:22:00',1),(103,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2020-09-27','04:00:45',1),(104,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2020-09-27','04:20:12',1),(105,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2020-09-27','08:27:14',1),(106,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2020-09-28','02:17:14',1),(107,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2020-09-28','02:46:30',1),(108,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2020-09-28','02:57:22',1),(109,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2020-09-28','04:45:21',1),(110,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2020-09-28','04:47:37',1),(111,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2020-09-28','08:59:10',1),(112,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2020-09-29','12:00:23',1),(113,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2020-09-30','08:49:32',1),(114,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2020-09-30','08:51:02',1),(115,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2020-09-30','08:51:37',1),(116,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2020-09-30','08:56:47',1),(117,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2020-09-30','08:58:13',1),(118,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2020-09-30','03:52:07',1),(119,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2020-10-01','06:55:45',1),(120,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2020-10-01','06:59:24',1),(121,'LOGIN','ADMIN USER LOGING TO SYSTEM!','2020-10-01','09:14:05',1);
/*!40000 ALTER TABLE `notification` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `roomtype`
--

DROP TABLE IF EXISTS `roomtype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `roomtype` (
  `rmt_id` int(11) NOT NULL AUTO_INCREMENT,
  `rmt_type` varchar(20) NOT NULL,
  PRIMARY KEY (`rmt_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `roomtype`
--

LOCK TABLES `roomtype` WRITE;
/*!40000 ALTER TABLE `roomtype` DISABLE KEYS */;
INSERT INTO `roomtype` VALUES (1,'MEDIUM'),(2,'MEDIUM'),(3,'LARGE'),(4,'SMALL');
/*!40000 ALTER TABLE `roomtype` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student` (
  `std_id` int(11) NOT NULL AUTO_INCREMENT,
  `std_fname` varchar(60) NOT NULL,
  `std_mname` varchar(60) DEFAULT NULL,
  `std_lname` varchar(60) NOT NULL,
  `std_dob` date NOT NULL,
  `std_gender` char(1) NOT NULL,
  `std_school` varchar(200) DEFAULT NULL,
  `std_email` varchar(200) DEFAULT NULL,
  `std_mobile` varchar(12) DEFAULT NULL,
  `std_home` varchar(12) DEFAULT NULL,
  `std_add_no` varchar(6) DEFAULT NULL,
  `std_add_street` varchar(60) DEFAULT NULL,
  `std_add_city` varchar(60) DEFAULT NULL,
  `std_language` varchar(10) DEFAULT NULL,
  `std_rfid` varchar(36) DEFAULT NULL,
  `std_image` blob,
  `std_par_name` varchar(200) DEFAULT NULL,
  `std_par_relation` varchar(15) DEFAULT NULL,
  `std_par_email` varchar(120) DEFAULT NULL,
  `std_par_mobile` varchar(12) DEFAULT NULL,
  `std_par_home` varchar(12) DEFAULT NULL,
  `std_par_occupation` varchar(60) DEFAULT NULL,
  `std_par_address` text,
  `std_reg_date` date DEFAULT NULL,
  `std_reg_time` time DEFAULT NULL,
  `use_id` int(11) DEFAULT NULL,
  `std_reg_payment_st` int(11) DEFAULT '0',
  PRIMARY KEY (`std_id`),
  KEY `fk_Student_User1_idx` (`use_id`),
  CONSTRAINT `fk_Student_User1` FOREIGN KEY (`use_id`) REFERENCES `user` (`use_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES (3,'Buddhika','Maduwantha','Senanayaka','1999-08-27','M','Bandaaranayake Central Colleage','adasd','0727608235','0727608235','dsad','dad','dasd','Sinhala','13232323','image','dsad','Grand father','dsds','0727608235','0727608235','dsd','dasdadsadasd','2019-11-26','10:19:56',1,0),(4,'Buddhika','Maduwantha','Senanayaka','1999-08-27','M','Bandaaranayake Central Colleage','adasd','0727608235','0727608235','dsad','dad','dasd','Sinhala','13232323','image','dsad','Grand father','dsds','0727608235','0727608235','dsd','dasdadsadasd','2019-11-26','10:49:24',1,0),(5,'dasd','das','ddsda','2019-11-15','M','dsads','kjhjk','423432','43242','ds','sas','qsa','English','312312','image','dasd','Grand father','dasd','423432','423432','weqw','qeweqweqe','2019-11-26','12:57:32',1,0),(6,'jakldsa','dsadad','dasdad','2019-11-20','M','dsad','das','312','312','asd','asddasd','dasdasd','Sinhala','312312','image','dasd','Grand father','sadsd','3123','31231','dasdd','dasdasdsd','2019-11-26','01:44:05',1,0),(7,'dasd','das','dadas','2019-11-14','M','dasd','asd','331','3213','das','das','das','Sinhala','3123','image','das','Grand father','asdd','312312','3213','dasdas','zcasdasd','2019-11-26','02:12:02',1,0),(8,'adasd','das','dasd','2019-11-27','M','dasdasd','asda','32','243','d','dsad','dsa','Sinhala','312312','image','ccas','Grand father','xZX','312','312','xZX','xxXx','2019-11-26','02:36:14',1,0),(10,'Chamod','Diyamantha','Balasuriya','1999-08-27','M','Galahitiyaawa Central Colleage','DiyamanthaChamodCal@gmail.com','0771037084','0717608235','291/C','Ganemulla','Horagolla','Sinhala','123456','image','PAD Geethani Priyanka','Mother','Gee@gmail.com','0717608235','0717608235','NO','291/C, Horagolla, Ganemulla','2019-11-26','02:58:08',1,0),(11,'dlasdsd','dsadasd','dsadsad','2019-12-11','M','dsadsadd','dd','dasdasd','dsad','dsad','dsad','dsadas','Sinhala','3213123','Image','asd','Grand father','das','das','das','dsa','dasdasd','2019-12-05','12:00:10',1,1),(12,'Chamod','Diyamantha','Balasuriya','1999-08-27','M','Galahitiyaawa Central Colleage','dasd','32323213','32132','das','ds','ds','Sinhala','32132','Image','dsa','Grand mother','ds','dsa','ds','dsad','dasdas','2019-12-05','05:35:48',1,1),(13,'cdasdas','das','das','2019-12-10','M','asd','adsd','32','312','ds','das','das','Sinhala','3213','Image','asd','Grand father','dasd','312','32','dasd','dasd','2019-12-05','06:10:34',1,1),(16,'dsdsddsdadewewrewr','rewrewrew','rewrerewrrerwer','2020-08-13','M','ewrewrewr','wew@df.com','3231232','2321312','eweqwe','eweweq','ewewe','Sinhala','3231q','Image','dsadsad','Grand father','sadsad@g.com','32132','32132','dsdsad','dsadasdsadadasd','2020-08-05','11:03:49',1,1),(17,'kollla','rewrewrew','rewrerewrrerwer','2020-08-13','M','ewrewrewr','wew@df.com','3231232','2321312','eweqwe','eweweq','ewewe','Sinhala','3231q','Image','dsadsad','Grand father','sadsad@g.com','32132','32132','dsdsad','dsadasdsadadasd','2020-08-05','11:04:21',1,1),(19,'sddsd','dsada','sadsads','2020-09-23','M','sdsadasds','aasdsad','323323','323233','dsdsd','sdasdas','dsadsds','English','32323123','Image','sdasdsd','Mother','ccxzcxcxzc','32323','323123','dsadds','wdasdadasddadadd','2020-09-25','09:10:59',1,1),(20,'sddsd','dsada','sadsads','2020-09-23','M','sdsadasds','aasdsad','323323','323233','dsdsd','sdasdas','dsadsds','English','32323123','Image','sdasdsd','Mother','ccxzcxcxzc','32323','323123','dsadds','wdasdadasddadadd','2020-09-25','09:11:23',1,1),(21,'dklsdskd','dsdsdsddsds','dsds','2020-09-04','M','dsadsdsd','dsadsadsad','233232','33233','23sd','dsdadasd','dsdasds','Select','23323233','Image','dadasdasda','Mother','dadsadas','3232323','3232323','dsadasdsads','asdsadasdasdasdasdadasdasdad','2020-09-25','09:17:50',1,1);
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `studentattendance`
--

DROP TABLE IF EXISTS `studentattendance`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `studentattendance` (
  `sta_id` int(11) NOT NULL AUTO_INCREMENT,
  `std_id` int(11) NOT NULL,
  `cls_id` int(11) NOT NULL,
  `sta_date` date DEFAULT NULL,
  `sta_intime` time DEFAULT NULL,
  `sta_outTime` time DEFAULT NULL,
  `sta_week_no` smallint(6) DEFAULT NULL,
  `sta_day` varchar(12) DEFAULT NULL,
  `sta_cm_state` char(1) DEFAULT '1',
  PRIMARY KEY (`sta_id`),
  KEY `fk_Student_has_Class_Class1_idx` (`cls_id`),
  KEY `fk_Student_has_Class_Student1_idx` (`std_id`),
  CONSTRAINT `fk_Student_has_Class_Class1` FOREIGN KEY (`cls_id`) REFERENCES `class` (`cls_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Student_has_Class_Student1` FOREIGN KEY (`std_id`) REFERENCES `student` (`std_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=104 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `studentattendance`
--

LOCK TABLES `studentattendance` WRITE;
/*!40000 ALTER TABLE `studentattendance` DISABLE KEYS */;
INSERT INTO `studentattendance` VALUES (102,10,17,'2020-09-28','10:11:51','10:11:51',40,'0028','1'),(103,10,17,'2020-09-28','10:12:00','10:12:00',40,'0028','1');
/*!40000 ALTER TABLE `studentattendance` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `studentclass`
--

DROP TABLE IF EXISTS `studentclass`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `studentclass` (
  `sdc_id` int(11) NOT NULL AUTO_INCREMENT,
  `cls_id` int(11) NOT NULL,
  `std_id` int(11) NOT NULL,
  `sdc_reg_date` date DEFAULT NULL,
  `sdc_reg_time` time DEFAULT NULL,
  PRIMARY KEY (`sdc_id`),
  KEY `fk_Class_has_Student_Student1_idx` (`std_id`),
  KEY `fk_Class_has_Student_Class1_idx` (`cls_id`),
  CONSTRAINT `fk_Class_has_Student_Class1` FOREIGN KEY (`cls_id`) REFERENCES `class` (`cls_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Class_has_Student_Student1` FOREIGN KEY (`std_id`) REFERENCES `student` (`std_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `studentclass`
--

LOCK TABLES `studentclass` WRITE;
/*!40000 ALTER TABLE `studentclass` DISABLE KEYS */;
INSERT INTO `studentclass` VALUES (2,1,10,'2019-10-01','06:10:34'),(5,1,13,'2019-12-05','06:10:34'),(6,1,16,'2020-08-05','11:03:50'),(7,1,16,'2020-08-05','11:04:21'),(8,13,10,'2020-09-23','12:00:32'),(9,13,10,'2020-09-23','12:00:42'),(10,13,19,'2020-09-25','09:10:59'),(11,13,19,'2020-09-25','09:11:24'),(12,14,21,'2020-09-25','09:17:51'),(13,15,10,'2020-09-25','09:30:12'),(14,15,10,'2020-09-25','09:30:15'),(15,16,10,'2020-09-28','04:49:17'),(16,17,10,'2020-09-28','09:03:43');
/*!40000 ALTER TABLE `studentclass` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `studentinvoice`
--

DROP TABLE IF EXISTS `studentinvoice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `studentinvoice` (
  `sti_id` int(11) NOT NULL AUTO_INCREMENT,
  `sti_amount` double DEFAULT NULL,
  `sti_state` varchar(1) DEFAULT '1',
  `std_id` int(11) NOT NULL,
  `inv_id` int(11) NOT NULL,
  PRIMARY KEY (`sti_id`),
  KEY `fk_studentInvoice_Student1_idx` (`std_id`),
  KEY `fk_studentInvoice_Invoice1_idx` (`inv_id`),
  CONSTRAINT `fk_studentInvoice_Invoice1` FOREIGN KEY (`inv_id`) REFERENCES `invoice` (`inv_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_studentInvoice_Student1` FOREIGN KEY (`std_id`) REFERENCES `student` (`std_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `studentinvoice`
--

LOCK TABLES `studentinvoice` WRITE;
/*!40000 ALTER TABLE `studentinvoice` DISABLE KEYS */;
INSERT INTO `studentinvoice` VALUES (1,150,'1',10,1),(2,150,'1',10,3),(3,1100,'1',10,4),(4,297,'1',10,6),(5,150,'1',10,7),(7,247.5,'1',10,9),(8,30,'1',10,12),(9,150,'1',10,14),(10,118.8,'1',10,15),(11,240,'1',10,16),(12,583.1,'1',10,17);
/*!40000 ALTER TABLE `studentinvoice` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subject`
--

DROP TABLE IF EXISTS `subject`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `subject` (
  `sub_id` int(11) NOT NULL AUTO_INCREMENT,
  `sub_name` varchar(30) DEFAULT NULL,
  `sub_state` tinyint(4) DEFAULT '1',
  `sbt_id` int(11) NOT NULL,
  PRIMARY KEY (`sub_id`),
  KEY `fk_Subject_subjectType1_idx` (`sbt_id`),
  CONSTRAINT `fk_Subject_subjectType1` FOREIGN KEY (`sbt_id`) REFERENCES `subjecttype` (`sbt_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=107 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subject`
--

LOCK TABLES `subject` WRITE;
/*!40000 ALTER TABLE `subject` DISABLE KEYS */;
INSERT INTO `subject` VALUES (11,'MATHS',1,5),(12,'MATHS',1,6),(13,'SCIENCE',1,5),(14,'SCIENCE',1,6),(15,'SINHALA',1,5),(16,'SINHALA',1,6),(17,'TAMIL',1,5),(18,'TAMIL',1,6),(19,'TAMIL',1,8),(20,'PHYSICS',1,6),(32,'Tec',1,6),(33,'ICT',1,6),(35,'JEOGRAPHY',1,6),(36,'PHOTOGRAPHY',1,8),(37,'CINEMATOGRAPHY',1,8),(38,'CINEMATOGRAPHY1',1,8),(39,'CINEMATOGRAPHY2',1,8),(40,'CINEMATOGRAPHY3',1,8),(41,'CINEMATOGRAPHY3',1,8),(42,'CINEMATOGRAPHY3',1,8),(43,'CINEMATOGRAPHY3',1,8),(44,'CINEMATOGRAPHY3',1,8),(45,'CINEMATOGRAPHY3',1,8),(46,'CINEMATOGRAPHY3',1,8),(47,'CINEMATOGRAPHY3',1,8),(48,'CINEMATOGRAPHY3',1,8),(49,'CINEMATOGRAPHY3',1,8),(50,'CINEMATOGRAPHY3',1,8),(51,'CINEMATOGRAPHY3',1,8),(52,'CINEMATOGRAPHY3',1,8),(53,'CINEMATOGRAPHY3',1,8),(54,'CINEMATOGRAPHY3',1,8),(55,'CINEMATOGRAPHY3',1,8),(56,'CINEMATOGRAPHY3',1,8),(57,'CINEMATOGRAPHY3',1,8),(58,'CINEMATOGRAPHY3',1,8),(59,'CINEMATOGRAPHY3',1,8),(60,'CINEMATOGRAPHY3',1,8),(61,'CINEMATOGRAPHY3',1,8),(62,'CINEMATOGRAPHY3',1,8),(63,'CINEMATOGRAPHY3',1,8),(64,'CINEMATOGRAPHY3',1,8),(65,'CINEMATOGRAPHY3',1,8),(66,'CINEMATOGRAPHY3',1,8),(67,'CINEMATOGRAPHY3',1,8),(68,'CINEMATOGRAPHY3',1,8),(69,'CINEMATOGRAPHY3',1,8),(70,'CINEMATOGRAPHY3',1,8),(71,'CINEMATOGRAPHY3',1,8),(72,'CINEMATOGRAPHY3',1,8),(73,'CINEMATOGRAPHY3',1,8),(74,'CINEMATOGRAPHY3',1,8),(75,'CINEMATOGRAPHY3',1,8),(76,'CINEMATOGRAPHY3',1,8),(77,'CINEMATOGRAPHY3',1,8),(78,'CINEMATOGRAPHY3',1,8),(79,'CINEMATOGRAPHY3',1,8),(80,'CINEMATOGRAPHY3',1,8),(81,'CINEMATOGRAPHY2',1,8),(82,'CINEMATOGRAPHY1',1,8),(83,'CINEMATOGRAPHY',1,8),(84,'PHOTOGRAPHY',1,8),(85,'JEOGRAPHY',1,6),(86,'ICT',1,6),(87,'ICT',1,6),(88,'ICT',1,6),(89,'JEOGRAPHY',1,6),(90,'PHOTOGRAPHY',1,8),(91,'CINEMATOGRAPHY',1,8),(92,'CINEMATOGRAPHY',1,8),(93,'CINEMATOGRAPHY',1,8),(94,'CINEMATOGRAPHY',1,8),(95,'CINEMATOGRAPHY',1,8),(96,'CINEMATOGRAPHY',1,8),(97,'CINEMATOGRAPHY',1,8),(98,'CINEMATOGRAPHY',1,8),(99,'CINEMATOGRAPHY',1,8),(100,'CINEMATOGRAPHY1',1,8),(101,'CINEMATOGRAPHY1',1,8),(102,'CINEMATOGRAPHY1',1,8),(103,'CINEMATOGRAPHY1',1,8),(104,'CINEMATOGRAPHY1',1,8),(105,'CINEMATOGRAPHY1',1,8),(106,'CINEMATOGRAPHY2',1,8);
/*!40000 ALTER TABLE `subject` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subjecttype`
--

DROP TABLE IF EXISTS `subjecttype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `subjecttype` (
  `sbt_id` int(11) NOT NULL AUTO_INCREMENT,
  `sbt_type` varchar(20) NOT NULL,
  PRIMARY KEY (`sbt_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subjecttype`
--

LOCK TABLES `subjecttype` WRITE;
/*!40000 ALTER TABLE `subjecttype` DISABLE KEYS */;
INSERT INTO `subjecttype` VALUES (5,'PRIMARY'),(6,'SECONDARY'),(7,'FITNESS AND SPORT'),(8,'OTHER');
/*!40000 ALTER TABLE `subjecttype` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `supplier`
--

DROP TABLE IF EXISTS `supplier`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `supplier` (
  `sup_id` int(11) NOT NULL AUTO_INCREMENT,
  `sup_name` varchar(60) DEFAULT NULL,
  `sup_contact_no` varchar(25) DEFAULT NULL,
  `sup_fax_no` varchar(25) DEFAULT NULL,
  `sup_email` varchar(200) DEFAULT NULL,
  `sup_web` varchar(200) DEFAULT NULL,
  `sup_add_no` varchar(10) DEFAULT NULL,
  `sup_add_city` varchar(30) DEFAULT NULL,
  `sup_add_street` varchar(30) DEFAULT NULL,
  `sup_add_country` varchar(30) DEFAULT NULL,
  `sup_reg_date` date DEFAULT NULL,
  `sup_reg_time` time DEFAULT NULL,
  `use_id` int(11) DEFAULT NULL,
  `sup_mem_state` varchar(1) DEFAULT '1',
  PRIMARY KEY (`sup_id`),
  KEY `fk_Supplier_User1_idx` (`use_id`),
  CONSTRAINT `fk_Supplier_User1` FOREIGN KEY (`use_id`) REFERENCES `user` (`use_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `supplier`
--

LOCK TABLES `supplier` WRITE;
/*!40000 ALTER TABLE `supplier` DISABLE KEYS */;
INSERT INTO `supplier` VALUES (4,'dsad','dsad','das','dasd','das','dasd','das','das','Sri Lanka','2019-11-26','03:54:12',1,'1'),(5,'sdsadsad','23233','3232323','sds@gmail.com','www.dsds.com','sdsad','dsdas','dsadsad','Sri Lanka','2020-08-05','11:05:55',1,'1');
/*!40000 ALTER TABLE `supplier` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `use_id` int(11) NOT NULL AUTO_INCREMENT,
  `use_username` varchar(30) DEFAULT NULL,
  `use_password` varchar(32) DEFAULT NULL,
  `use_avatar` blob,
  `use_state` varchar(8) DEFAULT 'active',
  `emp_id` int(11) DEFAULT NULL,
  `utp_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`use_id`),
  KEY `fk_User_Employee1_idx` (`emp_id`),
  KEY `fk_User_userType1_idx` (`utp_id`),
  CONSTRAINT `fk_User_Employee1` FOREIGN KEY (`emp_id`) REFERENCES `employee` (`emp_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_User_userType1` FOREIGN KEY (`utp_id`) REFERENCES `usertype` (`utp_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'Chamod','e10adc3949ba59abbe56e057f20f883e','imag','active',2,1),(2,'Broyher','202cb962ac59075b964b07152d234b70','imag','active',1,1),(3,'Abc','202cb962ac59075b964b07152d234b70','imag','active',NULL,1),(4,'Drag','8a13dab3f5ec9e22d0d1495c8c85e436','imag','active',NULL,NULL);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usertype`
--

DROP TABLE IF EXISTS `usertype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usertype` (
  `utp_id` int(11) NOT NULL AUTO_INCREMENT,
  `utp_type` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`utp_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usertype`
--

LOCK TABLES `usertype` WRITE;
/*!40000 ALTER TABLE `usertype` DISABLE KEYS */;
INSERT INTO `usertype` VALUES (1,'Admin'),(2,'Cashier'),(3,'Other'),(4,'StockManager'),(5,'Inventory');
/*!40000 ALTER TABLE `usertype` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `withdraw`
--

DROP TABLE IF EXISTS `withdraw`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `withdraw` (
  `wit_id` int(11) NOT NULL AUTO_INCREMENT,
  `wit_amount` double DEFAULT NULL,
  `wit_time` time DEFAULT NULL,
  `wit_date` date DEFAULT NULL,
  `wit_state` char(1) DEFAULT '1',
  `acc_id` int(11) NOT NULL,
  `emp_id` int(11) NOT NULL,
  `use_id` int(11) NOT NULL,
  PRIMARY KEY (`wit_id`),
  KEY `fk_Withdraw_Account1_idx` (`acc_id`),
  KEY `fk_Withdraw_Employee1_idx` (`emp_id`),
  KEY `fk_Withdraw_User1_idx` (`use_id`),
  CONSTRAINT `fk_Withdraw_Account1` FOREIGN KEY (`acc_id`) REFERENCES `account` (`acc_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Withdraw_Employee1` FOREIGN KEY (`emp_id`) REFERENCES `employee` (`emp_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Withdraw_User1` FOREIGN KEY (`use_id`) REFERENCES `user` (`use_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `withdraw`
--

LOCK TABLES `withdraw` WRITE;
/*!40000 ALTER TABLE `withdraw` DISABLE KEYS */;
/*!40000 ALTER TABLE `withdraw` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-10-01  9:19:00
