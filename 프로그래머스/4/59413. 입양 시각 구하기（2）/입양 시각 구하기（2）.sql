-- 코드를 입력하세요
SELECT
A.HOUR,
count(B.TIME) count
from (select level-1 HOUR from dual connect by level <25) A,
(select to_char(datetime,'HH24') TIME from ANIMAL_OUTS ) B
where A.HOUR = B.TIME(+)
group by A.HOUR
order by A.HOUR