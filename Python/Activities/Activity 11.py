--Activity 11

select salesman_id, salesman_name from salesman a where (select count(*) from orders b where a.salesman_id = b.salesman_id) > 1
union
select customer_id,  customer_name from customers c where (select count(*) from orders d where c.customer_id = d.customer_id) > 1;
