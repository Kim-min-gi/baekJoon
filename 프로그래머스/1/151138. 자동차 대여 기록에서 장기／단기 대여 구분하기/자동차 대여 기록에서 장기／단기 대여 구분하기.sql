-- 코드를 입력하세요
SELECT HISTORY_ID
    ,CAR_ID
    ,to_char(START_DATE,'YYYY-MM-DD') as START_DATE
    ,to_char(END_DATE,'YYYY-MM-DD') as END_DATE
    ,(CASE WHEN (END_DATE - START_DATE) + 1 >= 30 then
    '장기 대여' else '단기 대여'end) AS RENT_TYPE
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
WHERE EXTRACT(YEAR FROM START_DATE) = '2022'
AND EXTRACT(MONTH FROM START_DATE) = '09'
ORDER BY HISTORY_ID DESC