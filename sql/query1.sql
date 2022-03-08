--Select all policies that start before 14.11.2019

SELECT * FROM policy WHERE start_date < convert(date,'2019-11-14', 102);

