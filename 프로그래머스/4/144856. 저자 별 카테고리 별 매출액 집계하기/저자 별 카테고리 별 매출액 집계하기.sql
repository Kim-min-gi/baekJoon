-- 코드를 입력하세요
SELECT 
    a.author_id,a.author_name,b.category,
    sum(bs.sales * b.price) TOTAL_SALES 
from book b, author a, book_sales bs
where bs.sales_date between TO_DATE('2022-01-01','YYYY-MM-DD') and TO_DATE('2022-01-31','YYYY-MM-DD') 
and b.book_id = bs.book_id
and b.author_id = a.author_id
group by  a.author_id,a.author_name,b.category
order by author_id, category desc