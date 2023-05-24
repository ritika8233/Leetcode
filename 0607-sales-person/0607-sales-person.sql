Select s.name from SalesPerson s where s.name not in (
select s.name from SalesPerson s
LEFT JOIN Orders o on s.sales_id = o.sales_id
LEFT Join Company c on c.com_id = o.com_id
where c.name = "RED")
;
