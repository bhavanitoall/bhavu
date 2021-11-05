CREATE TABLE 'employee_table'(
employee_Id` int(11) NOT NULL AUTO_INCREMENT,
  `employee_name` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `gender` varchar(45) DEFAULT NULL,
  `salary` double DEFAULT NULL,
  PRIMARY KEY (`employee_Id`)
) ;
)