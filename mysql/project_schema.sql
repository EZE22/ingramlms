CREATE DATABASE IF NOT EXISTS `ingramlms`;
USE `ingramlms`;

SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS `student_progress`;

CREATE TABLE `student_progress` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `section_1` varchar(45) DEFAULT NULL,
  `section_2` varchar(45) DEFAULT NULL,
  `section_3` varchar(45) DEFAULT NULL,
  `section_4` varchar(45) DEFAULT NULL,
  `section_5` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `student_progress_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_DETAIL_idx` (`student_progress_id`),
  CONSTRAINT `FK_DETAIL_idx` FOREIGN KEY (`student_progress_id`) REFERENCES `student_progress` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

SET FOREIGN_KEY_CHECKS = 1;
