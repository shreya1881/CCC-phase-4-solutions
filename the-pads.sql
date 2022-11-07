/*
Enter your query here.
*/
select concat(name,concat("(",left(occupation,1),")"))
from occupations
order by name;
select CONCAT("There are a total of", " ",COUNT(occupation), " ",LCASE(occupation),"s",".")AS stat
from OCCUPATIONS
group by occupation
order by COUNT(occupation) ASC,occupation