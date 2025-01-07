-- In this activity we will using the salesman, orders, and the customers table to perform Subquery operations on both tables.
-- Write a query to find all the orders issued against the salesman who may works for customer whose id is 3007.
    select o.order_no, o.order_date, o.purchase_amount, o.salesman_id, c.customer_id, c.customer_name, s.salesman_name  from orders o, salesman s, customers c 
    where c.salesman_id=o.salesman_id and c.salesman_id = s.salesman_id and c.customer_id=3005 and s.salesman_id = 
    (select s.salesman_id  from salesman s, customers c where s.salesman_id= c.salesman_id and c.customer_id = 3005);

-- As per the Answer this is the following query to be used which seems to be wrong to me.  
SELECT * FROM orders
WHERE salesman_id=(SELECT DISTINCT salesman_id FROM orders WHERE customer_id=3005);

-- Write a query to find all orders attributed to a salesman in New York.
select o.order_no, s.salesman_id, s.salesman_name from orders o, salesman s where s.salesman_id=o.salesman_id and s.SALESMAN_CITY ='New York' order by o.order_no;

SELECT * FROM orders
WHERE salesman_id IN (SELECT salesman_id FROM salesman WHERE salesman_city='New York');

-- Write a query to count the customers with grades above New York's average.
select grade, count(*) as Grade_Count  from customers group by grade having grade > (SELECT AVG(grade) FROM customers WHERE city=('New York'));

-- Write a query to extract the data from the orders table for those salesman who earned the maximum commission
select * from orders where salesman_id IN (select salesman_id from salesman where commission = (select MAX(commission) from SALESMAN));


