У вас есть таблица Customers со следующими столбцами:

CustomerID	FirstName	LastName	City
1	        Ryan	    Gosling	    Los Angeles
2	        Dwayne	    Johnson	    New York
3	        Elon	    Musk	    London
4	        Travis	    Scott	    Washington
5	        Robert	    Pattinson	London
Напишите SQL-запрос, который выберет всех клиентов из города "London".
Вывести столбцы CustomerID, FirstName, LastName

SELECT CustomerID, FirstName, LastName FROM Customers
WHERE City = "London"


