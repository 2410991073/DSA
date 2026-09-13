# Write your MySQL query statement below

SELECT email from Person
GROUP By email
HAVING COUNT(email)>1;