create table academicERP.employee_salary
(
    salary_id    int auto_increment
        primary key,
    amount       double       not null,
    description  varchar(255) not null,
    payment_date date         not null,
    employee_id  int          null,
    constraint FKo7mki93c83b1kx9olp1vmcwcq
        foreign key (employee_id) references academicERP.employee (employee_id)
);


