CREATE TABLE `users` (
	`username` VARCHAR(45) NOT NULL,
	`password` VARCHAR(200) NOT NULL,
	`enabled` TINYINT(4) NOT NULL DEFAULT '1',
	PRIMARY KEY (`username`)
)
COLLATE='latin1_swedish_ci'
ENGINE=InnoDB;

CREATE TABLE `user_roles` (
	`user_role_id` INT(11) NOT NULL AUTO_INCREMENT,
	`username` VARCHAR(45) NOT NULL,
	`role` VARCHAR(45) NOT NULL,
	PRIMARY KEY (`user_role_id`),
	UNIQUE INDEX `uni_username_role` (`role`, `username`),
	INDEX `fk_username_idx` (`username`),
	CONSTRAINT `fk_username` FOREIGN KEY (`username`) REFERENCES `users` (`username`)
)
COLLATE='latin1_swedish_ci'
ENGINE=InnoDB
AUTO_INCREMENT=4;

INSERT INTO `users` (`username`, `password`, `enabled`) VALUES
	('ameya', '1234', 1),
	('avani', '1234', 1);

INSERT INTO `user_roles` (`user_role_id`, `username`, `role`) VALUES
	(2, 'ameya', 'ROLE_ADMIN'),
	(1, 'ameya', 'ROLE_USER'),
	(3, 'avani', 'ROLE_USER');