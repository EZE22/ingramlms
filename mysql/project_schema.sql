CREATE DATABASE  IF NOT EXISTS `ingramlms`;
USE `ingramlms`;
--
-- Table structure for table `employee`
--
DROP TABLE IF EXISTS `ingramlms`;
CREATE TABLE `student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `job_title` varchar(45) DEFAULT NULL, 
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

INSERT INTO `student` VALUES 
(1,'Software Engineer 1', 'Adam', 'Ingram', 'everett.ingram22@gmail.com')