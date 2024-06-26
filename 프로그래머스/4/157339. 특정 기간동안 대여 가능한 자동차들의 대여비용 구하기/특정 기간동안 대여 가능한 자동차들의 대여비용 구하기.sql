-- 코드를 입력하세요
SELECT A.CAR_ID
,A.CAR_TYPE
,(A.DAILY_FEE * (1-B.DISCOUNT_RATE * 0.01) * 30) AS FEE
FROM CAR_RENTAL_COMPANY_CAR A
JOIN CAR_RENTAL_COMPANY_DISCOUNT_PLAN B
ON A.CAR_TYPE = B.CAR_TYPE
WHERE A.CAR_TYPE IN ('세단','SUV')
AND A.CAR_ID NOT IN( SELECT CAR_ID
    FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY 
    WHERE END_DATE >= to_date('20221101','YYYYMMDD')
 )
AND B.DURATION_TYPE = '30일 이상'
AND (A.DAILY_FEE * (1-B.DISCOUNT_RATE * 0.01) * 30) BETWEEN 500000 AND 2000000 
ORDER BY FEE DESC,A.CAR_TYPE,A.CAR_ID DESC