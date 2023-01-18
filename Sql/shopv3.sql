drop database if exists shopv3;

create database shopv3;

use shopv3;

create table user(
	id int primary key auto_increment,
	roleId int,
	userName varchar(510),
	`password` varchar(510),
	email varchar(510),
	timeCreate datetime default current_timestamp,
    `enable` TINYINT(3)
);

create table role(
	id int primary key auto_increment,
    `role` varchar(510)
);

create table ShippingInfo(
	id int primary key auto_increment,
    userId int,
    `name` varchar(510),
    phone varchar(20),
    street varchar(510),
    city varchar(510),
    county varchar(510),
    country varchar(510),
    other varchar(510)
);


create table ShippingType(
	id int primary key auto_increment,
    service varchar(510),
    cost int
);

create table Coupon(
	id int primary key auto_increment,
    `name` varchar(510),
    `description` varchar(510),
    `code` varchar(20),
    discount int,
    maxDiscountAmount int,
    expired datetime,
    `usage` int
);


create table `Orders`(
	id int primary key auto_increment,
    userId int,
    paymentMethodId int,
    couponId int,
    total int,
    statusId int,
    shippingInfoId int,
    shippingTypeId int,
    timeCreate datetime default current_timestamp
);

create table OrderDetail(
	id int primary key auto_increment,
    ordersId int,
    productId int,
    quantity int,
    total int
);

create table PaymentMethod(
	id int primary key auto_increment,
    `name` varchar(510)
);

create table `Status`(
	id int primary key auto_increment,
    `name` varchar(510)
);


create table Product(
	id int primary key auto_increment,
    productTypeId int,
    `name` varchar(510),
    priceId int,
    `description` varchar(510),
    image varchar(510)
);

create table ProductType(
	id int primary key auto_increment,
    `name` varchar(510)
);

create table Amount(
	product_id int,
    color_id int,
    size_id int,
    amount int,
    image varchar(510)
);

create table Color(
	id int primary key auto_increment,
    `name` varchar(510)
);

create table Size(
	id int primary key auto_increment,
    `name` varchar(510)
);


create table Price(
	id int primary key auto_increment,
    price int,
    timeStart datetime default current_timestamp,
    timeEnd datetime default current_timestamp
);

drop trigger if exists delete_order_detail;

delimiter //
create trigger delete_order_detail after delete on orders for each row
begin
	delete from OrderDetail where ordersId = old.id;
end//


insert into `Role` (`role`) values ('ROLE_ADMIN'),('ROLE_USER');
insert into `User` (roleId,userName,`password`,email,`enable`) values (1,'Admin','{noop}Admin','Admin@shops.com',1),(2,'User1','{noop}User1','User1@gmail.com',1),(2,'user2','{noop}123','User2@gmail.com',1);
insert into Color (`name`) values ('Đỏ'),('Xanh'),('Đen'),('Trắng');
insert into Size (`name`) values ('XS'),('S'),('M'),('L'),('XL'),('XXL');
insert into Coupon values (1,'Tết Nguyên Đán 2023','Mừng Tết Nguyên Đán 2023, Giảm giá sặp sàn','2023',100,100000,current_timestamp(),999);
insert into Price values (1,80000,current_timestamp(),date_add(current_timestamp(),interval 365 day)),
	(2,90000,current_timestamp(),date_add(current_timestamp(),interval 365 day));
insert into ProductType values (1,'Áo Thun'),(2,'Áo Khoác'),(3,'Quần');
insert into ShippingType values (1,'Nhanh',50000),(2,'Thường',30000);
insert into `Status` values (1,'Enable'),(2,'Disable'),(3,'Delete');
insert into Amount (product_id,color_id,size_id,amount) values 
(1,3,1,50,'https://i.imgur.com/RGZyhxE.jpg' ),(1,3,2,50),(1,3,3,50),(1,3,4,50),(1,3,5,50),(1,3,6,50),
	 (2,4,1,50),(2,4,2,50),(2,4,3,50),(2,4,4,50),(2,4,5,50),(2,4,6,50);
     
     
insert into Product values (1,1,'Áo Thun',1,'Áo thun','Ao_thun_xanh.png'),
	(2,2,'Áo khoác',2,'Áo khoác','Ao_khoac.png');
insert into PaymentMethod values (1,'Tiền mặt'),(2,'Bankking');
insert into ShippingInfo values (1,2,'Ngo huynh hieu','0909090909','88 quang trung','Da nang','Da nang','VN',''),(2,2,'Ngo huynh hieu','0808080808','246 nguyen hue','Da nang','Da nang','VN','');
insert into orders values (1,2,1,1,570000,1,1,1,current_timestamp()),(2,2,2,null,360000,2,2,2,current_timestamp());
insert into OrderDetail values (1,1,1,5,400000),(2,1,2,3,270000),(3,2,2,4,360000);
UPDATE `shopv3`.`product` SET `image` = 'https://i.imgur.com/x63UaHb.png' WHERE (`id` = '1');
UPDATE `shopv3`.`product` SET `image` = 'https://i.imgur.com/47fhVXR.png' WHERE (`id` = '2');

INSERT INTO `shopv3`.`product` (`id`, `productTypeId`, `name`, `priceId`, `description`, `image`) VALUES ('3', '1', 'Áo', '1', 'Áo', 'https://i.imgur.com/CKGwteU.png');
INSERT INTO `shopv3`.`product` (`id`, `productTypeId`, `name`, `priceId`, `description`, `image`) VALUES ('4', '1', 'Áo', '1', 'Áo', 'https://i.imgur.com/Q438wWd.png');
INSERT INTO `shopv3`.`product` (`id`, `productTypeId`, `name`, `priceId`, `description`, `image`) VALUES ('5', '1', 'Áo', '1', 'Áo', 'https://i.imgur.com/6yafYNv.png');

insert into Product values (6,3,'Quần Tây ',3,'Quần Tây','https://i.imgur.com/YrMRwk0.png'),
	(7,3,'Quần sọc kẻ',4,'Quần sọc kẻ','https://i.imgur.com/XjRowma.png'),
	(8,3,'Quần ống đứng',3,'Quần ống đứng','https://i.imgur.com/HlYX742.png'),
    (9,3,'Quần ống vải len',3,'Quần ống vải len','https://i.imgur.com/AUtW9Bg.png');
insert into Price values (3,120000,current_timestamp(),date_add(current_timestamp(),interval 365 day)),
	(4,200000,current_timestamp(),date_add(current_timestamp(),interval 365 day));












