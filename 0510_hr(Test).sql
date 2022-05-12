--5월 10일

--조회하는 명령(SELECT)
--SELECT 컬럼명 FROM 테이블명;
--SELECT FIRST_NAME,salary from employees;

SELECT * FROM EMPLOYEES;

SELECT * FROM DEPARTMENTS;

SELECT FIRST_NAME,salary from employees;

SELECT first_name,salary from employees
order by first_name; --이름별로 오름차순

SELECT first_name,salary from employees
order by salary desc; --급여순으로 내림차순

select first_name,department_id,salary from employees
order by first_name;
--이름[FIRST_NAME], 부서[DEPARTMENT_ID], 급여 [SALARY]
select department_id from employees;            --해당값 출력
select all department_id from employees;        --전체데이터출력
select distinct department_id from employees; --중복제거

select distinct department_id from employees
order by department_id; --[asc/desc] 가로는 생략해도 된다 라는 뜻

select distinct first_name,department_id from employees
order by department_id;

select distinct first_name,department_id from employees
order by department_id DESC;

--데이터타입/연산자