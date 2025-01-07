-- Write a query that produces the name and number of each salesman and each customer with more than one order. Put the results in alphabetical order.
select c.customer_name, s.salesman_name, o.customer_id, o.salesman_id, o.order_no from customers c, salesman s, orders o 
Where c.customer_id=o.customer_id and c.salesman_id=o.salesman_id and c.salesman_id=s.salesman_id and o.customer_id IN (
select distinct o.customer_id from orders o where customer_id IN (select o.customer_id from orders o group by o.CUSTOMER_ID,o.salesman_id having count(o.customer_id) > 1))
order by customer_id;

-- Solution as per the slide is as below which seems to be wrong as it displays customer_id = 5001 which has only 1 order. 
SELECT customer_id, customer_name FROM customers a
WHERE 1<(SELECT COUNT(*) FROM orders b WHERE a.customer_id = b.customer_id)
UNION
SELECT salesman_id, salesman_name FROM salesman a
WHERE 1<(SELECT COUNT(*) FROM orders b WHERE a.salesman_id = b.salesman_id)
ORDER BY customer_name;

-- second Activity 
-- Write a query to make a report of which salesman produce the largest and smallest orders on each date. Also add a column that shows "highest on" and "lowest on" values.
-- I believe this is impossible to retrieve the data without create a view/table from existing tables. 
-- Just trying to create a new table to include the salesman_name as well 

create table new_table as select o.ORDER_NO,o.PURCHASE_AMOUNT,o.ORDER_DATE,o.SALESMAN_ID,s.salesman_name from orders o, salesman s where o.salesman_id=s.salesman_id and order_date in
    (select order_date from orders group by order_date having count(order_date) > 1 )  order by order_date ;
select * from new_table;

-- select MAX(purchase_amount), min(purchase_amount), order_date, salesman_name from new_table order by order_date ;
-- This MM_Table is to retrive and store the Min and Max Amount 

create table MM_Table as select MAX(purchase_amount) as MAX_Amount, MIN(purchase_amount) as MIN_Amount, order_date from orders group by order_date having count(order_date) > 1 order by order_date;
select * from MM_Table;

-- Final Retrieval query to get the desited output after creating the 2 temp tables. 
select mm.MAX_AMOUNT, mm.MIN_AMOUNT, nt.ORDER_NO, nt.ORDER_DATE, nt.SALESMAN_ID, nt.SALESMAN_NAME from MM_Table mm, new_table nt 
    where mm.order_date=nt.order_date;
