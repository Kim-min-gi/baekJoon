-- 코드를 입력하세요
SELECT COUNT(*) AS USERS
FROM USER_INFO
WHERE to_char(JOINED,'YYYY') = '2021'
AND AGE BETWEEN 20 AND 29