select distinct a1.player_id, 
(
    select min(a2.event_date) from Activity a2 where a2.player_id = a1.player_id
) as first_login
from Activity a1

;