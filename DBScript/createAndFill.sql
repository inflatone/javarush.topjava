DROP DATABASE IF EXISTS test;
CREATE DATABASE test;
USE test;
CREATE TABLE `test`.`test` (
  `id` INT(8) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(100) NOT NULL,
  `necessary` BIT(1) NOT NULL DEFAULT b'0',
  `quantity` INT(8) NOT NULL,
  PRIMARY KEY (`id`))
  COLLATE='utf8_general_ci';

INSERT INTO `test`.`test` (`name`, `necessary`, `quantity`) VALUES ('Motherboard', 1, 5);
INSERT INTO `test`.`test` (`name`, `necessary`, `quantity`) VALUES ('Sound card', 0, 5);
INSERT INTO `test`.`test` (`name`, `necessary`, `quantity`) VALUES ('CPU', 1, 5);
INSERT INTO `test`.`test` (`name`, `necessary`, `quantity`) VALUES ('RGB Lighting', 0, 5);
INSERT INTO `test`.`test` (`name`, `necessary`, `quantity`) VALUES ('HDD', 0, 5);
INSERT INTO `test`.`test` (`name`, `necessary`, `quantity`) VALUES ('Case', 1, 5);
INSERT INTO `test`.`test` (`name`, `necessary`, `quantity`) VALUES ('RAM', 1, 5);
INSERT INTO `test`.`test` (`name`, `necessary`, `quantity`) VALUES ('SSD', 1, 5);
INSERT INTO `test`.`test` (`name`, `necessary`, `quantity`) VALUES ('Graphics card', 0, 5);
INSERT INTO `test`.`test` (`name`, `necessary`, `quantity`) VALUES ('Keyboard', 0, 5);
INSERT INTO `test`.`test` (`name`, `necessary`, `quantity`) VALUES ('Display', 0, 5);
INSERT INTO `test`.`test` (`name`, `necessary`, `quantity`) VALUES ('Printer', 0, 5);
INSERT INTO `test`.`test` (`name`, `necessary`, `quantity`) VALUES ('Multimedia speakers', 0, 5);
INSERT INTO `test`.`test` (`name`, `necessary`, `quantity`) VALUES ('Mouse', 0, 5);
INSERT INTO `test`.`test` (`name`, `necessary`, `quantity`) VALUES ('Image scanner', 0, 5);
INSERT INTO `test`.`test` (`name`, `necessary`, `quantity`) VALUES ('Webcam', 0, 5);
INSERT INTO `test`.`test` (`name`, `necessary`, `quantity`) VALUES ('Optical disc', 0, 5);
INSERT INTO `test`.`test` (`name`, `necessary`, `quantity`) VALUES ('Touchpad', 0, 5);
INSERT INTO `test`.`test` (`name`, `necessary`, `quantity`) VALUES ('Microphone', 0, 5);
INSERT INTO `test`.`test` (`name`, `necessary`, `quantity`) VALUES ('Headphones', 0, 5);
INSERT INTO `test`.`test` (`name`, `necessary`, `quantity`) VALUES ('USB flash drive', 0, 5);
INSERT INTO `test`.`test` (`name`, `necessary`, `quantity`) VALUES ('Gamepad', 0, 5);
INSERT INTO `test`.`test` (`name`, `necessary`, `quantity`) VALUES ('Fan', 0, 5);
INSERT INTO `test`.`test` (`name`, `necessary`, `quantity`) VALUES ('Water Cooling Kit', 0, 5);
INSERT INTO `test`.`test` (`name`, `necessary`, `quantity`) VALUES ('Digital pen', 0, 5);
INSERT INTO `test`.`test` (`name`, `necessary`, `quantity`) VALUES ('MIDI keyboard', 0, 5);