SELECT res.employee_id
FROM 
    (select * from Employees LEFT JOIN Salaries using(employee_id)
     UNION
     select * from Salaries LEFT JOIN Employees using(employee_id))
     as res
where res.name is null or res.salary is null
order by res.employee_id;