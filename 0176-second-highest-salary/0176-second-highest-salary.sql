select (
select salary from employee
group by salary order by salary desc limit 1,1)
as SecondHighestSalary;