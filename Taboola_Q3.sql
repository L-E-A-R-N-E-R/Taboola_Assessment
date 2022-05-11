/* Please design two new tables to store information about:
a. products
b. product price history
The product tables should include the name and category of the product.
The product price history table should refer to the product table and should
include the price information of products and the start date and/or end date for
the product. The current price of a product will have no end date.
Please list the table creation scripts for these two tables and a sample query to
join two tables together. */


/* I am adding one more field with the name 'Product_id' in both the tables. This field is not mentioned in the problem statement. */
/* Product_id will be my primary key. I believe that we need to have a primary key so that we can refer the Product_Price_History table to the Products table*/
/* We can refer by using a Foreign key but foreign key works only with primary key. */
/* Moerover, the values of other fields such as cateogry, price, name and dates can have more than one occurence and therefore none of them can be chosen as primary key*/


CREATE DATABASE Taboola;

CREATE TABLE Products
(
Name varchar(50) NOT NULL,
Product_id int NOT NULL,
Category varchar(50) NOT NULL,
PRIMARY KEY (Product_id)
);

CREATE TABLE Product_Price_History
(
Product_id int NOT NULL,
Price int NOT NULL,
St_date DATE NOT NULL,          /* St date is same as Start date */
End_date DATE,
FOREIGN KEY (Product_id) REFERENCES Products(Product_id)
);

/* I am taking a sample query to show the join operation */
/* Sample Query: Write a query to list all products with the current price */

SELECT * FROM 
(SELECT Product_Price_History.Price, Product_Price_History.St_date, Product_Price_History.End_Date, Product_Price_History.Product_id, Products.Name
FROM Products INNER JOIN Product_Price_History ON Products.Product_id = Product_Price_History.Product_id) AS T
WHERE End_date is NULL;


