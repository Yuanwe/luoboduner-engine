create table wedding_album
(
  id int auto_increment
    primary key,
  photo_url varchar(255) not null,
  remark varchar(255) null,
  create_time datetime null,
  update_time datetime null,
  status tinyint(1) not null
);