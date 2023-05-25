select l1.user_id, max(l1.time_stamp) as last_stamp from Logins l1 
where year(l1.time_stamp) = 2020
group by l1.user_id
;