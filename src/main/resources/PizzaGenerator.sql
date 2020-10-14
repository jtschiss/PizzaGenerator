-- MySQL dump 10.13  Distrib 5.7.28, for Linux (x86_64)
--
-- Host: localhost    Database: PizzaGenerator
-- ------------------------------------------------------
-- Server version	5.7.28-0ubuntu0.18.04.4

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
-- Table structure for table `groups`
--

DROP TABLE IF EXISTS `groups`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `groups` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `password` varchar(255) NOT NULL,
  `owner_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `groups_user_fk` (`owner_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `groups`
--

LOCK TABLES `groups` WRITE;
/*!40000 ALTER TABLE `groups` DISABLE KEYS */;
INSERT INTO `groups` VALUES (1,'test','test',1),(2,'testing','$2y$10$PspXzrxGcSh0PrrCmJ9KyeVy6NQCAzmy4/REH7yWPutsDbd9oz6ni',5),(3,'joahs group','$2y$10$vIAUWoDShs3DdzQFVGhR2egix7m7ZK0V0x4/947Q5oQ2QOHQLlpva',5),(4,'Schissels','$2y$10$SI.0ZnZxxTRbJAnnyu5Dr.1f6kcyW0VUQQ5OXSH1fI2xqZFlah.AG',5);
/*!40000 ALTER TABLE `groups` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `liked_toppings`
--

DROP TABLE IF EXISTS `liked_toppings`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `liked_toppings` (
  `user_id` int(11) NOT NULL,
  `topping_id` int(11) NOT NULL,
  PRIMARY KEY (`user_id`,`topping_id`),
  KEY `liked_toppings_toppings_fk` (`topping_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `liked_toppings`
--

LOCK TABLES `liked_toppings` WRITE;
/*!40000 ALTER TABLE `liked_toppings` DISABLE KEYS */;
INSERT INTO `liked_toppings` VALUES (1,1),(3,1),(5,1),(6,1),(1,3),(3,3),(5,3),(1,4),(3,4),(5,4),(6,4),(1,5),(3,5),(1,6),(3,6),(4,6),(5,6),(1,7),(3,7),(1,8),(3,8),(1,9),(3,9),(1,10),(3,10),(1,11),(3,11),(1,12),(3,12),(5,12),(6,12),(1,13),(3,13),(7,14),(1,15),(3,15),(1,16),(3,16);
/*!40000 ALTER TABLE `liked_toppings` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `toppings`
--

DROP TABLE IF EXISTS `toppings`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `toppings` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `topping` varchar(20) NOT NULL,
  `popularity` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `toppings`
--

LOCK TABLES `toppings` WRITE;
/*!40000 ALTER TABLE `toppings` DISABLE KEYS */;
INSERT INTO `toppings` VALUES (1,'Cheddar Cheese',4),(2,'Feta Cheese',1),(3,'Sausage',3),(4,'Pepperoni',4),(5,'Ham',2),(6,'Bacon',4),(7,'Chicken',2),(8,'Jalapenos',2),(9,'Red Onions',2),(10,'Yellow Onions',2),(11,'Tomatoes',2),(12,'Black Olives',4),(13,'Green Olives',2),(14,'Mushrooms',1),(15,'Pineapple',2),(16,'Green Peppers',2),(17,'Spinach',1);
/*!40000 ALTER TABLE `toppings` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'Joah','$2y$10$IGLb/LF3eIrAv8vZXjIieeFbe6KJn.834qNZthCqUS5F1SEf0qJEi'),(2,'admin','$2y$10$M.v9RFktQ9ZqCogxDpDfB.gdkhegPPo.y86OYney31UMiLbGfPcvW'),(3,'jtschiss','$2y$10$tPUqfKt274r8s9Pph03GXeaSDwXBFC0nsxCIwGGcGtxknCSxNaHRa'),(4,'joahschissel','$2y$10$MmE8..g5TM6Y.ygeBe/G9ezvr3gXsMul/TRmwaVwNj7PQpg01h82a'),(5,'Zander','$2y$10$1CmQA2XtoCrVHLpx2W2hQOoUUwjItyNIO2Oh5ATJl2ftCZNHL7iTq'),(6,'Nolan','$2y$10$AuwsoPSR/6/6nFTL30xwweS1cHWkTYHiTzV1h39AYDchpaZVra7gG'),(7,'Monica','$2y$10$xOzl22hJhPAlvmch/L2cg.XBNwEQucyVVixVe/5Xat/p1xsgbLjXC');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_group`
--

DROP TABLE IF EXISTS `user_group`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_group` (
  `user_id` int(11) NOT NULL,
  `group_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_group`
--

LOCK TABLES `user_group` WRITE;
/*!40000 ALTER TABLE `user_group` DISABLE KEYS */;
INSERT INTO `user_group` VALUES (1,1),(5,4),(5,2),(1,4),(6,4),(7,4);
/*!40000 ALTER TABLE `user_group` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-12-11 22:16:13
