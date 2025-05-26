У вас есть таблица Customers со следующими столбцами:

CustomerID	FirstName	LastName	City
1	        Ryan	    Gosling	    Los Angeles
2	        Dwayne	    Johnson	    New York
3	        Elon	    Musk	    London
4	        Travis	    Scott	    Washington
5	        Robert	    Pattinson	London

У вас есть таблица Orders со следующими столбцами:

OrderID	CustomerID	OrderDate	Amount
1	    2	        10.10.2024	100
2	    3	        21.06.2024	523
3	    3	        22.06.2024	12
4	    5	        01.01.2025	654
5	    5	        02.03.2025	56

Напишите SQL-запрос, который выберет имена и фамилии клиентов, а также общее количество их заказов.
Результат должен включать только тех клиентов, которые сделали больше 2х заказов.
Выведите FirstName, LastName и TotalOrders.

SELECT FirstName, LastName, COUNT(*) AS TotalOrders FROM Customers
JOIN Orders
ON Customers.CustomerID = Orders.CustomersID
GROUP BY FirstName,LastName
HAVING TotalOrders>2


