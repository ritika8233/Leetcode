
select max(salary) as SecondHighestSalary from employee
    where salary <> (select max(salary) from employee);

# select salary as SecondHighestSalary from employee group by salary
# order by salary desc limit 1,1;
