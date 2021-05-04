

drop table users

create table users(
UserID int primary key auto_increment,
Username varchar(50),
Password varchar(50),
sex char(10),
email varchar(50)
)
select * from users