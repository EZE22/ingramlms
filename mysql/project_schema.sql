CREATE DATABASE  IF NOT EXISTS `ingramlms`;

DROP TABLE IF EXISTS `login`;
CREATE TABLE `login` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) DEFAULT NULL, 
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`));
  
INSERT INTO `login` VALUES 
(1,'ingram22', 'everett.ingram22@gmail.com')