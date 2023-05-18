Delete p1 from Person p1 CROSS JOIN person p2
    where p1.email = p2.email and p1.id > p2.id;