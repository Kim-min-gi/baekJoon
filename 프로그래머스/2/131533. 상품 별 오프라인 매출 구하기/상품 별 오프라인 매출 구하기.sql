-- 코드를 입력하세요
select p.product_code,
    sum(p.price * os.sales_amount) sales
from product p, offline_sale os
where p.product_id = os.product_id
group by p.product_code
order by sales desc, product_code