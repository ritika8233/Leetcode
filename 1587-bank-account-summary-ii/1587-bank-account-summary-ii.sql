select res.name, res.balance from
(select u.name, sum(t.amount) as balance from Users u
LEFT JOIN Transactions t on u.account = t.account
group by u.name) as res
where res.balance > 10000
;