create table academicERP.employee
(
    employee_id int auto_increment
        primary key,
    email       varchar(255) not null,
    firstname   varchar(255) not null,
    lastname    varchar(255) null,
    password    varchar(255) not null,
    title       varchar(255) null,
    constraint UK_fopic1oh5oln2khj8eat6ino0
        unique (email)
);


