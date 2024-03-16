select product_name
from spring_jdbc.customers
         right join spring_jdbc.order_table on spring_jdbc.customers.id = spring_jdbc.order_table.customers_id
where upper(name) = upper(:name);
