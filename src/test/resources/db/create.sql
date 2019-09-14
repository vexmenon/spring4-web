CREATE TABLE `user_role` (
	`USER_ROLE_SEQ` INT(10) PRIMARY KEY,
	`COMPANY_MSTR_SEQ` INT(11),
	`USER_ROLE_CD` VARCHAR(50),
	`USER_ROLE_DESC` VARCHAR(100),
	`STATUS` CHAR(1),
	`CREATED_BY` INT(10),
	`CREATE_DTTM` DATETIME ,
	`UPDATED_BY` INT(10),
	`UPDATE_DTTM` DATETIME ,
);
