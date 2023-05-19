select a1.sell_date, count(distinct a1.product) as num_sold,

Group_concat(distinct a1.product order by a1.product asc separator ',')
as products

from Activities a1

    group by a1.sell_date 
        order by a1.sell_date;