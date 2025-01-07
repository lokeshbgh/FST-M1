-- Write an SQL statement to find the highest purchase amount ordered by the each customer with their ID and highest purchase amount.
-- select * from orders order by  purchase_amount desc ;
select max(purchase_amount) as MAX_Purchase_Amount, customer_id from orders group by customer_id order by MAX_Purchase_Amount desc;

-- Write an SQL statement to find the highest purchase amount on '2012-08-17' for each salesman with their ID.
select max(purchase_amount) as MAX_PURCHASE_AMOUNT, order_date, Salesman_id from orders where order_date='17-AUG-12' group by salesman_id, order_date;

-- Write an SQL statement to find the highest purchase amount with their ID and order date, for only those customers who have a higher purchase amount within the list [2030, 3450, 5760, 6000].
select MAX(PURCHASE_AMOUNT) as MAX_Purchase_Amount, order_no, SALESMAN_ID, ORDER_DATE from orders where Purchase_Amount in (2030, 3450, 5760, 6000);
select MAX(PURCHASE_AMOUNT), customer_id, order_date as MAX_Purchase_Amount from orders where Purchase_Amount in (2030, 3450, 5760, 6000) group by customer_id, order_date ;

SELECT customer_id, order_date, MAX(purchase_amount) AS "Max Amount" FROM orders GROUP BY customer_id, order_date HAVING MAX(purchase_amount) IN(2030, 3450, 5760, 6000);




