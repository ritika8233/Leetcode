select res.customer_number from(
    select customer_number, count(order_number) as ordersmax
    from Orders group by customer_number
    order by ordersmax desc limit 1
) as res
;

