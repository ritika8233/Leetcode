select u.name, if(r.distance is not null, sum(r.distance), 0)
 as travelled_distance from users u
LEFT JOIN rides r on u.id = r.user_id
group by u.id
order by travelled_distance desc, u.name asc
;