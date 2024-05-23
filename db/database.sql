create database cafe;

use cafe;

create table `admin` (
	`id` int Not NULL,
	`username` varchar(200) DEFAULT NULL,
    `password` varchar(100) DEFAULT NULL,
    `s_ques` varchar(500) DEFAULT NULL,
    `ans` varchar(200) DEFAULT NULL,
    PRIMARY KEY (`id`)
);

create table `product` (
	`id` int Not NULL auto_increment,
	`name` varchar(200) DEFAULT NULL,
    `price` double DEFAULT NULL,
	`image` blob,
    PRIMARY KEY (`id`)
);

create table `cart` (
	`cid` int Not NULL,
    `pid` int Not NULL,
	`pName` varchar(45) DEFAULT NULL,
    `qty` int DEFAULT NULL,
    `price` double DEFAULT NULL,
    `total` double DEFAULT NULL
);

create table `payment` (
	`pid` int Not NULL auto_increment,
	`cName` varchar(200) DEFAULT NULL,
    `proid` varchar(100) DEFAULT NULL,
    `pName` varchar(200) DEFAULT NULL,
    `total` double DEFAULT NULL,
    `pdate` date DEFAULT NULL,
    PRIMARY KEY (`pid`)
);