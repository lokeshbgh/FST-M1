-- Write an SQL statement to know which salesmen are working for which customer.
select c.customer_name, s.salesman_name from SALESMAN s INNER JOIN customers c ON s.salesman_id = c.salesman_id order by customer_name;


-- Write an SQL statement to make a list of customers in ascending order with a salesman that have a grade less than 300.
select c.customer_name, s.salesman_name, s.salesman_id, s.grade as sales_grade, c.grade as cust_grade from customers c LEFT OUTER JOIN salesman s on c.salesman_id=s.salesman_id where c.grade < 300; 

-- Write an SQL statement to find the list of customers who appointed a salesman who gets a commission of more than 12%.
select c.customer_name, s.salesman_name, s.salesman_id, s.commission from customers c INNER JOIN salesman s on c.salesman_id=s.salesman_id and s.commission >12;

-- Write an SQL statement to find the following details of an order - order number, order date, purchase amount of order, which customer gives the order and which salesman works for that customer and commission rate they get for the order.
SELECT a.order_no, a.order_date, a.purchase_amount, b.customer_name AS "Customer Name", b.grade, c.salesman_name AS "Salesman", c.commission FROM orders a 
INNER JOIN customers b ON a.customer_id=b.customer_id 
INNER JOIN salesman c ON a.salesman_id=c.salesman_id;


select o.order_no, o.order_date, o.purchase_amount, c.CUSTOMER_NAME, c.customer_id, s.salesman_name, s.commission 
    from orders o,  customers c, salesman s where o.customer_id=c.customer_id 
     and c.SALESMAN_ID = s.SALESMAN_ID order by o.order_no;






