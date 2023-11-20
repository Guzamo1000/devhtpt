-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: train
-- ------------------------------------------------------
-- Server version	8.2.0

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `branchs`
--

DROP TABLE IF EXISTS `branchs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `branchs` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `address` varchar(255) DEFAULT NULL,
  `phone_number` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `branchs`
--

LOCK TABLES `branchs` WRITE;
/*!40000 ALTER TABLE `branchs` DISABLE KEYS */;
INSERT INTO `branchs` VALUES (1,'Address 1','0123456789'),(2,'Address 2','0123456788'),(3,'Address 3','0123456787'),(4,'Address 4','0123456786'),(5,'Address 5','0123456785'),(6,'Address 6','0123456784'),(7,'Address 7','0123456783'),(8,'Address 8','0123456782'),(9,'Address 9','0123456781'),(10,'Address 10','0123456780');
/*!40000 ALTER TABLE `branchs` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customers`
--

DROP TABLE IF EXISTS `customers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customers` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `account` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `phone_number` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customers`
--

LOCK TABLES `customers` WRITE;
/*!40000 ALTER TABLE `customers` DISABLE KEYS */;
INSERT INTO `customers` VALUES (1,'Customer 1','Account 1',NULL,'0123456789','Address 1'),(2,'Customer 2','Account 2','Password 2','0123456788','Address 2'),(3,'Customer 3','Account 3','Password 3','0123456787','Address 3'),(4,'Customer 4','Account 4','Password 4','0123456786','Address 4'),(5,'Customer 5','Account 5','Password 5','0123456785','Address 5'),(6,'Customer 6','Account 6','Password 6','0123456784','Address 6'),(7,'Customer 7','Account 7','Password 7','0123456783','Address 7'),(8,'Customer 8','Account 8','Password 8','0123456782','Address 8'),(9,'Customer 9','Account 9','Password 9','0123456781','Address 9'),(10,'Customer 10','Account 10',NULL,'0123456782','Address 10'),(11,'Nguyễn Công Hậu','headwd','Nguyễn Công Hậu','+84256985614','Số 20 Ngõ 4,Nguyễn Văn Khuyễn, Hà Nam');
/*!40000 ALTER TABLE `customers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `stations`
--

DROP TABLE IF EXISTS `stations`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `stations` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `address` varchar(255) DEFAULT NULL,
  `train_station_class` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stations`
--

LOCK TABLES `stations` WRITE;
/*!40000 ALTER TABLE `stations` DISABLE KEYS */;
INSERT INTO `stations` VALUES (1,'Address 1','Class 1'),(2,'Address 2','Class 2'),(3,'Address 3','Class 3'),(4,'Address 4','Class 4'),(5,'Address 5','Class 5'),(6,'Address 6','Class 6'),(7,'Address 7','Class 7'),(8,'Address 8','Class 8'),(9,'Address 9','Class 9'),(10,'Address 10','Class 10');
/*!40000 ALTER TABLE `stations` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tickets`
--

DROP TABLE IF EXISTS `tickets`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tickets` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `ticket_name` varchar(255) DEFAULT NULL,
  `ticket_price` float DEFAULT NULL,
  `discount` float DEFAULT NULL,
  `seat_type` varchar(255) DEFAULT NULL,
  `user_id` bigint DEFAULT NULL,
  `customer_id` bigint DEFAULT NULL,
  `train_ride_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_TICKETS_ON_CUSTOMERID` (`customer_id`),
  KEY `FK_TICKETS_ON_TRAINRIDEID` (`train_ride_id`),
  KEY `FK_TICKETS_ON_USERID` (`user_id`),
  CONSTRAINT `FK_TICKETS_ON_CUSTOMERID` FOREIGN KEY (`customer_id`) REFERENCES `customers` (`id`),
  CONSTRAINT `FK_TICKETS_ON_TRAINRIDEID` FOREIGN KEY (`train_ride_id`) REFERENCES `train_rides` (`id`),
  CONSTRAINT `FK_TICKETS_ON_USERID` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tickets`
--

LOCK TABLES `tickets` WRITE;
/*!40000 ALTER TABLE `tickets` DISABLE KEYS */;
INSERT INTO `tickets` VALUES (2,'ticket2',200,0.3,'Seat Type 2',2,2,2),(3,'ticket3',300,0.3,'Seat Type 3',3,3,3),(4,'ticket4',400,0.4,'Seat Type 4',4,4,4),(5,'ticket5',500,0.5,'Seat Type 5',5,5,5),(6,'ticket6',600,0.6,'Seat Type 6',6,6,6),(7,'ticket7',700,0.7,'Seat Type 7',7,7,7),(8,'ticket8',800,0.8,'Seat Type 8',8,8,8),(9,'ticket9',900,11,'Seat Type 9',9,9,10);
/*!40000 ALTER TABLE `tickets` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `train_rides`
--

DROP TABLE IF EXISTS `train_rides`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `train_rides` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `departure_time` datetime DEFAULT NULL,
  `departure_station` varchar(255) DEFAULT NULL,
  `destination` varchar(255) DEFAULT NULL,
  `station` bigint DEFAULT NULL,
  `train_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_TRAINRIDES_ON_STATION` (`station`),
  KEY `FK_TRAINRIDES_ON_TRAINID` (`train_id`),
  CONSTRAINT `FK_TRAINRIDES_ON_STATION` FOREIGN KEY (`station`) REFERENCES `stations` (`id`),
  CONSTRAINT `FK_TRAINRIDES_ON_TRAINID` FOREIGN KEY (`train_id`) REFERENCES `trains` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `train_rides`
--

LOCK TABLES `train_rides` WRITE;
/*!40000 ALTER TABLE `train_rides` DISABLE KEYS */;
INSERT INTO `train_rides` VALUES (1,'2023-01-01 00:00:00','Departure Station 1','Destination 1',1,1),(2,'2023-01-02 00:00:00','Departure Station 2','Destination 2',2,2),(3,'2023-01-03 00:00:00','Departure Station 3','Destination 3',3,3),(4,'2023-01-04 00:00:00','Departure Station 4','Destination 4',4,4),(5,'2023-01-05 00:00:00','Departure Station 5','Destination 5',5,5),(6,'2023-01-06 00:00:00','Departure Station 6','Destination 6',6,6),(7,'2023-01-07 00:00:00','Departure Station 7','Destination 7',7,7),(8,'2023-01-08 00:00:00','Departure Station 8','Destination 8',8,8),(10,'2023-01-10 00:00:00','Departure Station 10','Destination 10',10,10),(13,'2023-09-12 15:57:00','dacwc','agawggh',2,3),(14,'2023-09-12 15:57:00','dacwc','agawggh',2,4);
/*!40000 ALTER TABLE `train_rides` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `trains`
--

DROP TABLE IF EXISTS `trains`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `trains` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `manufacturing` varchar(255) DEFAULT NULL,
  `class1seats` int DEFAULT NULL,
  `class2seats` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `trains`
--

LOCK TABLES `trains` WRITE;
/*!40000 ALTER TABLE `trains` DISABLE KEYS */;
INSERT INTO `trains` VALUES (1,'Manufacturing 1',100,201),(2,'Manufacturing 2',110,210),(3,'Manufacturing 3',120,220),(4,'Manufacturing 4',130,230),(5,'Manufacturing 5',140,240),(6,'Manufacturing 6',150,250),(7,'Manufacturing 7',160,260),(8,'Manufacturing 8',170,270),(9,'Manufacturing 9',180,280),(10,'Manufacturing 10',190,290);
/*!40000 ALTER TABLE `trains` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `full_name` varchar(255) DEFAULT NULL,
  `account` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL,
  `phone_number` varchar(255) DEFAULT NULL,
  `branch_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_USERS_ON_BRANCHID` (`branch_id`),
  CONSTRAINT `FK_USERS_ON_BRANCHID` FOREIGN KEY (`branch_id`) REFERENCES `branchs` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'Full Name 1','Account 1','Password 1','0','0123456789',1),(2,'Full Name 2','Account 2','Password 2','1','0123456788',2),(3,'Full Name 3','Account 3','Password 3','0','0123456787',3),(4,'Full Name 4','Account 4','Password 4','0','0123456786',4),(5,'Full Name 5','Account 5','Password 5','0','0123456785',5),(6,'Full Name 6','Account 6','Password 6','2','0123456784',6),(7,'Full Name 7','Account 7','Password 7','1','0123456783',7),(8,'Full Name 8','Account 8','Password 8','1','0123456782',8),(9,'Full Name 9','Account 9','Password 9','0','0123456781',9),(10,'Full Name 10','Account 10','Password 10','2','0123456780',10),(11,'Nguyễn Công Hậu','hau','1','2','+84256985614',2),(16,'Nguyễn Công Hậu','hehe','hehe','2','+84256985614',2);
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-11-20 21:28:27
