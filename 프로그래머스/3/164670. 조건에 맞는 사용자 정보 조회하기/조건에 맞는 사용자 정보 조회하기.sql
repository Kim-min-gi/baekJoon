-- 코드를 입력하세요
select B.USER_ID, B.NICKNAME, B.CITY || ' ' || B.STREET_ADDRESS1 || ' ' || B.STREET_ADDRESS2 전체주소, substr(B.TLNO, 1,3) || '-' || substr(B.TLNO, 4,4) || '-' || substr(B.TLNO, 8,4) 전화번호
from USED_GOODS_USER B
where B.USER_ID in (
    SELECT writer_id from USED_GOODS_BOARD
    group by writer_id
    having count(1) >= 3)
order by 1 desc