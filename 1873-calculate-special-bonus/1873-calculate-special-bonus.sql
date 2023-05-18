select employee_id,
    CASE 
        when name like 'M%' then 0
        when employee_id % 2 != 0 then salary
        else 0 
    END as bonus
from Employees
    order by employee_id;