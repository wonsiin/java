--1) o
 SELECT D.DEPARTMENT_NAME,L.CITY , x."count"
 FROM departments D,locations L ,(SELECT nvl(e.DEPARTMENT_id,0) as "de", count(e.DEPARTMENT_id) as "count"
 FROM employees e  GROUP BY DEPARTMENT_id order by 1) x
 WHERE 
 d.location_id = l.location_iD
 and
 x."de" = d.department_id
 order by 3 DESC;
 
 --2) 11년 -> 15년 o
 SELECT E.first_name "사원명", E.HIRE_DATE"입사일",D.department_NAME"부서명"
 FROM employees E ,departments D
 WHERE 
 e.department_id = d.department_id
 AND
 TRUNC((SYSDATE- HIRE_DATE)/365)  > 15
 ORDER BY 1;
--3) o
 SELECT e.employee_id,e.last_name, E.HIRE_DATE,D.department_NAME
 FROM employees E ,departments D
 WHERE 
 e.department_id = d.department_id
 AND
HIRE_DATE  LIKE '05%'
 ORDER BY 3 DESC;
--4) o
SELECT e1.last_name "사원의 성씨",e1.salary"급여",
TRUNC(SYSDATE- E1.HIRE_DATE) AS "근무일수", e2.last_name AS "매니저명"
FROM employees E1, employees E2
WHERE e1.MANAGER_ID = e2.employee_id;
--5 o
SELECT E.last_name,E.salary,E.department_id,
D.department_NAME, X."평균"
FROM employees E, departments D,
(SELECT e1.department_id,TRUNC(AVG(salary)) AS "평균" 
FROM employees E1
GROUP BY department_id) X
WHERE e.department_id = d.department_id
and
e.department_id = x.department_id;
(SELECT e1.department_id,TRUNC(AVG(salary)) FROM employees E1
GROUP BY department_id);

--6 o 
SELECT FIRST_NAME, SALARY,
NVL(commission_pct,0)"commission_pct", NVL(department_id,0)"department_id"
FROM(SELECT * FROM employees
WHERE department_id = '80'
order by commission_pct DESC)
order by 2 DESC;

--7 o
SELECT last_name,SALARY, country_name 
FROM employees E, departments D, locations L,countries c
WHERE c.country_name = 'United States of America'
and e.department_id = d.department_id
and d.location_id = l.location_id
and  e.salary >= 9000
ORDER by 2;
--8 o
select d.department_name,x."인원수",x."최대금액",x."최소금액",x."평균"
from departments d,
(select department_id,count(*)"인원수",max(salary) "최대금액",min(salary) "최소금액",trunc(AVG(salary),2)"평균" 
from employees  GROUP BY department_id) x
where not x."최대금액" = x."최소금액"
and d.department_id = x.department_id;
--9 o
update
employees
set salary = (select round(avg(salary))
from  employees
group by department_id
HAVING department_id = 30)
where last_name = 'Tobias';

--10 o
select x."부서번호",d.department_name as "부서이름", x."사원수", x."최고급여",
x."최저급여",x."평균급여",x."급여총액"
from departments d , -- 부분
(select e.department_id"부서번호",count(e.department_id) "사원수",
max(salary)"최고급여",min(salary)"최저급여",
Floor(AVG(salary))"평균급여",sum(salary)"급여총액"
from employees e    --부분
GROUP BY e.department_id) x
where x."부서번호" = d.department_id
and x."사원수" >= 3;
--11 o
select * from employees;
SELECT e1.employee_id ,e1.first_name "이름",e1.last_name "성", 
E1.HIRE_DATE AS "입사일", nvl2(e2.last_name,e2.last_name,'Nomanager') AS "관리자명"
FROM employees E1, employees E2
WHERE e1.MANAGER_ID = e2.employee_id
and e1.HIRE_DATE <= '05/01/01'
ORDER by 4;
--12 o
SELECT  d.department_name"부서명",
sum(e.salary)"부서별 현재 급여함",
(sum(e.salary)*1.1)"부서별 인상 급여함",
(sum(e.salary) * 0.1) "부서별 추가 인건비"
FROM departments d,employees e
where d.department_id = e.department_id
GROUP BY department_name
ORDER by 1;


--13 o
CREATE SEQUENCE GIRL_GROUP_SEQ;
--14 o
create table girl_group
(
    GROUP_NO NUMBER PRIMARY KEY,
    GROUP_NAME VARCHAR2(30) UNIQUE,
    DEBUT_DATE DATE DEFAULT SYSDATE NOT NULL,
    AGENCY VARCHAR2(30) CHECK (AGENCY IN ('YG','JYP','SM','Source','DreamT'))
);
--15 o
CREATE SEQUENCE GROUP_MEMBER_SEQ;
--16 o
CREATE TABLE GROUP_MEMBERS
(
    MEMBER_NO NUMBER PRIMARY KEY,
    MEMBER_NAME VARCHAR2(30) NOT NULL,
    GROUP_NO NUMBER REFERENCES girl_group(GROUP_NO) 
);
DROP TABLE GROUP_MEMBERS;
DROP TABLE girl_group;
DROP SEQUENCE GROUP_MEMBER_SEQ;
DROP SEQUENCE GIRL_GROUP_SEQ;
--17 o
select gi.group_name,gi.DEBUT_DATE,x."인원수"
from girl_group gi,
(select group_no, count(member_no) as "인원수" 
from GROUP_MEMBERS GROUP BY group_no) x
where gi.group_no = x.group_no
order by 2;

-- 18) 1년 -> 5년 o
select group_name,agency,member_name
from girl_group i, GROUP_MEMBERS g
where TRUNC((sysdate - DEBUT_DATE)/365) > 5
and i.group_no = g.group_no;

--19 O
select group_name "걸그룹명",TO_CHAR(DEBUT_DATE,'YYYY-MM-DD')"데뷔날짜",
agency "기획사"
from girl_group 
order by 2;
--20 o
select group_name, case group_name
    when '걸스데이' then '데이지'
    when '레드벨벳' then '레베럽'
    when '트와이스' then '윈스'
    when '여자친구' then '버디'
    when '블랙핑크' then '블링크'
    end as "팬클럽"
    from girl_group;






INSERT INTO GIRL_GROUP VALUES (GIRL_GROUP_SEQ.nextval, '트와이스', '2015/10/20', 'JYP');
INSERT INTO GIRL_GROUP VALUES (GIRL_GROUP_SEQ.nextval, '레드벨벳', '2014/08/01', 'SM');
INSERT INTO GIRL_GROUP VALUES (GIRL_GROUP_SEQ.nextval, '여자친구', '2015/01/15', 'Source');
INSERT INTO GIRL_GROUP VALUES (GIRL_GROUP_SEQ.nextval, '블랙핑크', '2016/08/08', 'YG');
INSERT INTO GIRL_GROUP VALUES (GIRL_GROUP_SEQ.nextval, '걸스데이', '2010/07/09', 'DreamT');

INSERT INTO GROUP_MEMBERS VALUES (GROUP_MEMBER_SEQ.nextval, '나연', 1); 
INSERT INTO GROUP_MEMBERS VALUES (GROUP_MEMBER_SEQ.nextval, '정연', 1); 
INSERT INTO GROUP_MEMBERS VALUES (GROUP_MEMBER_SEQ.nextval, '모모', 1); 
INSERT INTO GROUP_MEMBERS VALUES (GROUP_MEMBER_SEQ.nextval, '사나', 1); 
INSERT INTO GROUP_MEMBERS VALUES (GROUP_MEMBER_SEQ.nextval, '지효', 1); 
INSERT INTO GROUP_MEMBERS VALUES (GROUP_MEMBER_SEQ.nextval, '미나', 1); 
INSERT INTO GROUP_MEMBERS VALUES (GROUP_MEMBER_SEQ.nextval, '다현', 1); 
INSERT INTO GROUP_MEMBERS VALUES (GROUP_MEMBER_SEQ.nextval, '채영', 1); 
INSERT INTO GROUP_MEMBERS VALUES (GROUP_MEMBER_SEQ.nextval, '쯔위', 1);

INSERT INTO GROUP_MEMBERS VALUES (GROUP_MEMBER_SEQ.nextval, '웬디', 2);
INSERT INTO GROUP_MEMBERS VALUES (GROUP_MEMBER_SEQ.nextval, '아이린', 2);
INSERT INTO GROUP_MEMBERS VALUES (GROUP_MEMBER_SEQ.nextval, '슬기', 2);
INSERT INTO GROUP_MEMBERS VALUES (GROUP_MEMBER_SEQ.nextval, '조이', 2);
INSERT INTO GROUP_MEMBERS VALUES (GROUP_MEMBER_SEQ.nextval, '예리', 2);

INSERT INTO GROUP_MEMBERS VALUES (GROUP_MEMBER_SEQ.nextval, '소원', 3);
INSERT INTO GROUP_MEMBERS VALUES (GROUP_MEMBER_SEQ.nextval, '예린', 3);
INSERT INTO GROUP_MEMBERS VALUES (GROUP_MEMBER_SEQ.nextval, '은하', 3);
INSERT INTO GROUP_MEMBERS VALUES (GROUP_MEMBER_SEQ.nextval, '유주', 3);
INSERT INTO GROUP_MEMBERS VALUES (GROUP_MEMBER_SEQ.nextval, '신비', 3);
INSERT INTO GROUP_MEMBERS VALUES (GROUP_MEMBER_SEQ.nextval, '엄지', 3);

INSERT INTO GROUP_MEMBERS VALUES (GROUP_MEMBER_SEQ.nextval, '지수', 4);
INSERT INTO GROUP_MEMBERS VALUES (GROUP_MEMBER_SEQ.nextval, '제니', 4);
INSERT INTO GROUP_MEMBERS VALUES (GROUP_MEMBER_SEQ.nextval, '로제', 4);
INSERT INTO GROUP_MEMBERS VALUES (GROUP_MEMBER_SEQ.nextval, '리사', 4);

INSERT INTO GROUP_MEMBERS VALUES (GROUP_MEMBER_SEQ.nextval, '소진', 5);
INSERT INTO GROUP_MEMBERS VALUES (GROUP_MEMBER_SEQ.nextval, '유라', 5);
INSERT INTO GROUP_MEMBERS VALUES (GROUP_MEMBER_SEQ.nextval, '민아', 5);
INSERT INTO GROUP_MEMBERS VALUES (GROUP_MEMBER_SEQ.nextval, '혜리', 5);



