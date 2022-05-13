--05.13

drop table wishlist;
drop table orders;

CREATE TABLE categories --제품 카테고리
(
    CATEGORY_ID CHAR(10) PRIMARY KEY,
    TYPE VARCHAR2(50) NOT NULL CHECK (TYPE IN('식품','가전','주방','가구'))
);

CREATE TABLE product --제품정보
(
    product_id char(10) PRIMARY key, --제품아이디
    product_name VARCHAR2(100) not null, --제품의 종류
    ptock_date DATE DEFAULT SYSDATE not null , --제품입고일
    category_id char(10)  REFERENCES categories(CATEGORY_ID) --제품아이디
);
create table customers
(
    customer_id VARCHAR2(20) PRIMARY key, --고객아이디
    email VARCHAR2(20) UNIQUE not null, --이메일
    customer_name VARCHAR2(30) not null, --고객이름
    address VARCHAR2(100) not null --고객주소
);
CREATE table orders
(
    order_id number PRIMARY key, --주문번호
    customer_id VARCHAR2(20) REFERENCES customers(customer_id), --고객아이디
    product_id char(10) REFERENCES product(product_id), --제품아이디
    order_date DATE DEFAULT SYSDATE, --주문날짜
    order_count number DEFAULT 0
);

create table wishlist
(
    customer_id VARCHAR2(20),
    product_id char(10), --DEFAULT 는 주석도 읽어버리니 주의
    save_date DATE DEFAULT SYSDATE,
    PRIMARY KEY(customer_id, product_id)
);


SELECT lower('KOREA korea Korea') from DUAL;
SELECT upper('KOREA korea Korea') from DUAL;
SELECT INITCAP('KOREA korea Korea') from DUAL;
SELECT length('KOREA korea Korea') from DUAL;
SELECT FIRST_NAME, LENGTH(FIRST_NAME), UPPER(FIRST_NAME) FROM employees;
SELECT LENGTH('대한민국') FROM DUAL;
SELECT LENGTHB('대한민국') FROM DUAL;
SELECT FIRST_NAME||'님',concat(FIRST_NAME, '님') FROM employees;
SELECT substr('무궁화꽃이 피었습니다.',7) FROM DUAL;
SELECT substr('무궁화꽃이 피었습니다.',4,1) FROM DUAL;
select replace('010-1234-5678', '-',' ')from DUAL;

select 1234.5678,round(1234.5678,2) from DUAL; --소수점 기준으로 반올림시킴)
select 1234.5678,round(1234.5678,-1), ceil(1234.5678), floor(1234.5678) from DUAL;

select -1234.5678,round(-1234.5678,-1), ceil(-1234.5678), floor(-1234.5678) from DUAL;

--(연습) 직원의 이름과 입사월출력
select * from employees;
select first_name||'さま' as "이름" , substr(hire_date,4,2)||'월' as "입사월" from employees;

--(연습) 직원의 이름,성,직책 출력
select first_name,last_name,job_id from employees
where lower(first_name)like '%s%';

--날짜함수 : 날짜는 + - 가 가능하다.
select sysdate, systimestamp from DUAL;

select sysdate as "오늘", sysdate-1 as "어제", sysdate+1 "내일" from DUAL;

--오류임(91/12/25값을 변환함수를 통해 날짜타입으로 변환후 연산해야함)
select sysdate- '91/12/25'
from DUAL;

SELECT
    FIRST_NAME, hire_date,floor(SYSDATE - HIRE_DATE) AS "총근무일"
    FROM employees;
    
--ADD_MONTHS(날짜,정수)
SELECT SYSDATE, ADD_MONTHS(SYSDATE,-3) FROM DUAL;

--months_between(날짜, 날짜)
SELECT FIRST_NAME,HIRE_DATE,floor(MONTHS_BETWEEN(SYSDATE,HIRE_DATE))as "근무개월" FROM employees;

--변환함수
--TO_DATE(문자열),'91/12/25'
--TO_CHAR

select sysdate, TO_DATE('00/01/29')
from DUAL;

select sysdate, TO_CHAR(SYSDATE,'YYYY-MM-DD')
from DUAL;
select sysdate, TO_CHAR(SYSDATE,'YYYY-MM-DD HH:I:SS DAY')
from DUAL;

--15년 이상 근무한 직원의 명단을 조회(사원번호,이름,입사일,근무개월수)
--근무 입사일을 기준으로 내림차순 정렬하시오.

SELECT * FROM employees;
select department_id,first_name,TO_CHAR(SYSDATE,'YYYY-MM-DD') as "입사월/일" ,
floor(MONTHS_BETWEEN(SYSDATE,HIRE_DATE)/12)as "근무년수" 
from employees
where floor(MONTHS_BETWEEN(SYSDATE,HIRE_DATE)) >= 180 ORDER by 3 desc;

--(연습)

select sysdate - '90/01/29' --오류값
from DUAL;

select first_name,hire_date
from employees
where hire_date >= '05/01/01'; -- 실행가능

/*
switch(정수){
case 10 : ...; break;
case 30 : ...; break;
}
decode(변수, 10, ... , 30, .... )
*/

select distinct department_id
from employees
order by 1;

-- 10 --> '경영진' , 20 --> '마케팅', 30 --> '전산팀', 40-->'인사관리'
select 
first_name,
decode(department_id,
10,'경영진',
20,'마케팅',
30,'전산팀',
40,'인사관리') as "부서명"
from employees
where department_id in(10,20,30,40);
select * from employees;

select 
first_name,
decode(department_id,
10,'경영진',
20,'마케팅',
30,'전산팀',
40,'인사관리') as "부서명",
ceil(decode(department_id,
10,salary*1.1,
20,salary*1.15,
30,salary*1.12,
40,salary*1.11)) as "급여인상"
from employees
where department_id in(10,20,30,40);
select * from employees;




