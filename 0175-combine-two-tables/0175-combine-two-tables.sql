select p.firstname, p.lastname, a.city, a.state
from Person p Left join Address a
on p.personId = a.personId;