У вас есть таблица Orders со следующими столбцами:

OrderID	CustomerID	OrderDate	Amount
1	    2	        10.10.2024	100
2	    3	        21.06.2024	523
3	    3	        22.06.2024	12
4	    5	        01.01.2025	654
5	    5	        02.03.2025	56

Напишите SQL-запрос, который подсчитает общую сумму заказов для каждого клиента и отсортирует результаты по общей
сумме в убывающем порядке. Выведите CustomerID и TotalOrders.

SELECT CustomerID, SUM(Amount) AS TotalOrders FROM Orders
GROUP BY CustomerID
ORDER BY TotalOrders DESC

