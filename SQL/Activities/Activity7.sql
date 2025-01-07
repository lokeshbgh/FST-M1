describe orders;
select * from orders;

-- Write an SQL statement to find the total purchase amount of all orders.
select SUM(purchase_amount) as Total_Purchase_Amount from orders;

-- Write an SQL statement to find the average purchase amount of all orders.
select AVG(purchase_amount) as Average_Purchase_Amount from orders;

-- Write an SQL statement to get the maximum purchase amount of all the orders.
select MAX(purchase_amount) as Maximum_Purchase_Amount from orders;

-- Write an SQL statement to get the minimum purchase amount of all the orders.
select MIN(purchase_amount) as Lowest_Purchase_Amount from orders;

-- Write an SQL statement to find the number of salesmen listed in the table.
select count(DISTINCT(SALESMAN_ID)) as Unique_Salesmen_Count from orders;
select count(Unique(SALESMAN_ID)) as Unique_Salesmen_Count from orders;