create schema spring_jdbc;
create table spring_jdbc.customers
(
    id           serial PRIMARY KEY,
    name         varchar(50),
    surname      varchar(70),
    age          int,
    phone_number varchar(10)
);

create table spring_jdbc.order_table
(
    id           serial PRIMARY KEY,
    date         date,
    customers_id  int,
    product_name varchar(50),
    amount       int
);
