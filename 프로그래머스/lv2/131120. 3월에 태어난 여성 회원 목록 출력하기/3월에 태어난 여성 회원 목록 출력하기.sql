-- 코드를 입력하세요
SELECT MEMBER_ID,MEMBER_NAME,GENDER,to_char(DATE_OF_BIRTH,'YYYY-MM-DD')
FROM MEMBER_PROFILE
WHERE TLNO IS NOT NULL
AND GENDER = 'W'
--AND to_char(DATE_OF_BIRTH,'MM') = '03'
AND EXTRACT(MONTH FROM DATE_OF_BIRTH) = '03'
ORDER BY MEMBER_ID