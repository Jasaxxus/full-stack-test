--Select all policies that are active during the period from 14.10.2019 to 14.11.2019

SELECT * FROM policy WHERE start_date <= convert(date,'2019-10-14', 102) AND expiration_date >= convert(date,'2019-11-14', 102);

