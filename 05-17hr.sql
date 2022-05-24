--1. 부서명, 도시명을 조회 ok
SELECT d.DEPARTMENT_NAME, c.CITY
FROM departments D, locations C
WHERE
d.location_id = c.location_id;
-- 2. 근속 년수가 15년 이상인 사람의 이름, 입사일 부서명을 조회하시오. OK
SELECT  FIRST_NAME, floor((sysdate-HIRE_DATE)/365) as "년수", JOB_ID
FROM employees
WHERE floor(sysdate-HIRE_DATE)/365 >= 15;
----------------------------추가
select  e.FIRST_NAME,e.hire_date,Substr(sysdate,1,2)-Substr(HIRE_DATe,1,2) as "근속년수", d.department_name
from employees e, departments d
where 
    Substr(sysdate,1,2)-Substr(HIRE_DATe,1,2) >= 15
    and
    e.department_id = d.department_id
order by 3;
--3. 업무 종류가 CLERK 인 직원 중 근속년수가 12년 이상인 직원에게 특별상여금 10%를 지급하려고 한다.
-- 이름, 입사일, 근속년수, 부서명, 업무명(JOB_ID), 급여액, 특별 상여금을 차례로 조회하세요.    xx (서브쿼리)

select tbl.* from

(SELECT  E.FIRST_NAME, E.HIRE_DATE,  Substr(sysdate,1,2)-Substr(HIRE_DATe,1,2) as "근속년수",
d.department_name,j.job_title,E.SALARY,salary*0.1 as "특별상여금"
FROM  JOBS j,departments d,employees e
where e.job_id like '%CLERK' AND e.department_id = d.department_id and j.job_id = e.job_id) tbl

where
근속년수 >= 12
ORDER BY 3;
--num이라는 이름을 넣어줌으로써 
select *
from
(select ROWNUM as num, department_id, first_name
from employees
ORDER by department_id)
order by num;
--4. JOIN 을 사용하여 커미션을 받는 모든 사원의 이름, 부서ID, 지역명을 출력 OK
SELECT E.FIRST_NAME,E.DEPARTMENT_ID,C.CITY
FROM employees E, departments D, locations C
WHERE e.commission_pct IS NOT NULL
AND
E.DEPARTMENT_ID = D.DEPARTMENT_ID
AND
D.LOCATION_ID = C.LOCATION_ID
and
e.commission_pct is not null;
--5. EQUI조인과 와일드카드를 사용하여 이름에 A가 포함된 모든 사원의 이름과 부서명을 출력(대소문자 구분X) OK
SELECT E.FIRST_NAME,D.DEPARTMENT_name
FROM employees e,departments D
WHERE 
upper(e.FIRST_NAME) LIKE '%A%'
--(e.FIRST_NAME LIKE '%A%' or e.FIRST_NAME LIKE '%a%')
AND
E.DEPARTMENT_ID = D.DEPARTMENT_ID;
--6. JOIN을 사용하여 SEATTLE에 근무하는 모든 사원의 이름, 업무, 부서번호 및 부서명을 출력 OK
SELECT E.FIRST_NAME,j.JOB_Title,E.DEPARTMENT_ID,d.department_name
FROM employees E, departments D, locations C, jobs j
WHERE
 C.city =  'Seattle'
 AND
E.DEPARTMENT_ID = D.DEPARTMENT_ID
AND
D.LOCATION_ID = C.LOCATION_ID
and
e.job_id = j.job_id;

--(예) 사원번호가 162번인 직원 급여와 같은 급여를 받는 직원의 명단을 조회
select first_name,salary from employees --1번 작성하는걸 1쿼리 라고한다.
where employee_id = 162;
select first_name,salary from employees
where salary = 10500;

--서브쿼리로 변환방법 salary로 찾으면 salary만 찾아야한다.
-- 데이터는 1개를 받고 출력은 여러명일때 =가 아닌 in으로 사용한다.
--Where 사용법
select * from employees
where salary = (select salary 
                        from employees
                        where employee_id = 162);
                        
select * from employees;
--부서 번호가 80번인 부서의 사원번호, 이름, 급여, 부서번호
-- 급여가 8000을 초과하는 직원의 명단을 일련번호와 함께 출력 (1,2,3,4...)하시요
--from 절 쿼리문     rownum = count 랑 비슷
select rownum, tbl.* from
--select tbl.salary from
(select employee_id,first_name,salary,department_id  from employees
where department_id = 80) tbl --테이블화 시킬수있다.
where tbl.salary > 8000;

--문제 : 'Bruce' 사원의 이름, 부서이름, 동일한 부서에 근무하는 사원들을 조회

select e.first_name,d.department_name
from employees e, departments d
where E.DEPARTMENT_ID = D.DEPARTMENT_ID
and
e.department_id =(select department_id  from employees where FIRST_name = 'Bruce');

--30번 부서에 근무하는 직책과 동일한 직책으로 근무하는 직원이 다른 부서에도 있는지 확인
-- DISTINCT 중복제거
-- 찾은값은 적고 찾고싶은건 많을때 IN사용 단일값이랑 찾는값도 1개일시는 = 로 사용
--select E.first_name,e.job_id ,D.department_id,D.department_name
SELECT *
from employees e, departments d
where e.department_id = d.DEPARTMENT_ID
and 
e.job_id IN (select DISTINCT job_id 
from employees
where department_id in 30);
--회사의 전체 급여 평균보다 적게 받는 직원의 명단을 조회
select first_name,salary
from employees
where salary <=
(SELECT AVG(salary) from employees);

--각 직원별로자신이 근무하고 있는 부서의 평균 임금을 출력하는 SQL명령문
-- 이름, 급여, 부서번호, 부서명, 부서 평균 급여
select e.first_name "이름",e.salary "급여",e.department_id "부서번호",d.department_name  "부서명",
(select floor(AVG(SALARY)) from employees o where o.department_id =e.department_id)  as "평균급여"
from employees e,departments d;

select e.first_name "이름",e.salary "급여",e.department_id "부서번호",d.department_name "부서명", x."avg_salary" as "부서 평균 급여"
from employees e, departments d,
    (   SELECT department_id, floor(AVG(salary)) as "avg_salary"
        FROM employees
        GROUP BY department_id) x
where e.department_id = d.department_id
and
e.department_id = x.department_id;

--SELECT department_id,TRUNC(AVG(SALARY),2)

SELECT department_id, floor(AVG(salary)) as "avg_salary"
        FROM employees
        GROUP BY department_id;
        
        select * from usraddr;
UPDATE 
    SET 
        usrname = '갈갈', phone='0100000',address='갈팡'
    WHERE 
        usrid = TOTO;
