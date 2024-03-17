select ord.productName
from Customers cust
inner join Order ord on cust.id = ord.customers.id
where upper(cust.name) = upper(:name)