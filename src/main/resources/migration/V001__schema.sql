create schema db_migration;
create table db_migration.customers
(
    id           serial PRIMARY KEY,
    name         varchar(50),
    surname      varchar(70),
    age          int,
    phone_number varchar(10)
);

create table db_migration.order_table
(
    id           serial PRIMARY KEY,
    date         date,
    customers_id  int,
    product_name varchar(50),
    amount       int
);
