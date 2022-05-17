--NULL과 관련된 컬럼
SELECT FIRST_NAME, SALARY, COMMISSION_PCT
FROM EMPLOYEES;
-- NULL이 포함되어 있으면 0으로 처리해라
SELECT FIRST_NAME, SALARY, NVL(COMMISSION_PCT,0)
FROM EMPLOYEES;
--COMMISSION 값이 있는 사람은 COMM * 1.1, 없으면 SALARY *0.05의 비용을 추가로 지급
--NVL2(COMMISSION_PCT,0,0) 있을땐 2번째 없을땐 3번째로 한다.
SELECT FIRST_NAME, SALARY, NVL2(COMMISSION_PCT,COMMISSION_PCT*1.1*salary,salary*0.05) AS "특별지급금"
FROM EMPLOYEES;

--연습문제 1: 전체 데이터중 이름,부서명,상사의 사원번호를 출력하되, 부서번호가 없는사람은 "소속부서없음", "상사가 없는사람은 "최고경영자"
--로 출력되도록 조회
SELECT EMPLOYEE_ID,FIRST_NAME, NVL(DEPARTMENT_ID,-1)"부서번호", NVL(MANAGER_ID,-1) AS "매니저넘버"
FROM EMPLOYEES;

--CASE WHEN THEN : 자바의 IF와 유사
SELECT
    FIRST_NAME,
    DECODE(DEPARTMENT_ID,
    10, '경영진',
    20,'마케팅',
    30,'전산팀',
    40,'인사관리') AS "부서명",
    SALARY
FROM employees
WHERE department_id IN (10,20,30,40);

SELECT FIRST_NAME, DEPARTMENT_ID,
    CASE 
        WHEN DEPARTMENT_ID = 10 THEN '경영진'
        WHEN DEPARTMENT_ID = 20 THEN '마케팅'
        WHEN DEPARTMENT_ID = 30 THEN '전산팀'
        WHEN DEPARTMENT_ID = 40 THEN '인사관리'
        ELSE '기타' 
    END AS "부서명"
FROM employees;

SELECT * FROM EMPLOYEES;

--그룹행 함수
--COUNT(컬럼명)
SELECT COUNT(FIRST_NAME) AS "총인원" FROM employees;
SELECT COUNT(COMMISSION_PCT) AS "총인원" FROM employees;
SELECT COUNT(*) AS "레코드" FROM employees; --레코드가 몇개인지
SELECT FIRST_NAME, COUNT(*) AS "레코드" FROM employees; --이건 오류다. 107개가 아닌 하나의 데이터만 출력되기때문에
SELECT COUNT(*) AS "레코드", SUM(SALARY), ROUND(AVG(SALARY),2), MIN(SALARY),MAX(SALARY) FROM employees;

--GROUP BY 를 이용해서 그룹화 시키기
--찾고자 하는 기준은 항상 앞에적는다.
SELECT DEPARTMENT_ID, SUM(SALARY), ROUND(AVG(SALARY),2) 
FROM employees
GROUP BY DEPARTMENT_ID
--ORDER BY 1; --1번 순서로 ORDER BY 시키기위해사용됨
ORDER BY 3; 

--GROUP BY 를 이용해서 그룹화된 데이터의 조건에는 having
SELECT DEPARTMENT_ID, SUM(SALARY), ROUND(AVG(SALARY),2) 
FROM employees
GROUP BY DEPARTMENT_ID
--HAVING DEPARTMENT_ID =80
HAVING ROUND(AVG(SALARY),2) <= 7000 --7000을 포함한 이하값만 출력하기위해 사용
ORDER BY 3; 

--문제 1 : 80번 부서의 급여 평균, 최고, 최저 ,인원수를 조회
SELECT DEPARTMENT_ID,ROUND(AVG(SALARY),2) ,MAX(SALARY),MIN(SALARY),COUNT(DEPARTMENT_ID)
FROM employees
GROUP BY DEPARTMENT_ID
HAVING DEPARTMENT_ID = 80
ORDER BY 1;

--문제 2 : 각 부서별 급여의 평균, 최고, 최저 ,인원수를 조회
SELECT DEPARTMENT_ID,ROUND(AVG(SALARY),2) ,MAX(SALARY),MIN(SALARY),COUNT(salary)
FROM employees
GROUP BY DEPARTMENT_ID;

--문제 3: 각 부서별 평균 월급, 전체 월급, 최저월급을 구하여 평균월급이 많은 순으로 조회, 단 부서번호가 NULL이면 출력X
SELECT DEPARTMENT_ID,ROUND(AVG(SALARY),2),SUM(SALARY),MIN(SALARY)
FROM employees 
GROUP BY DEPARTMENT_ID
HAVING DEPARTMENT_ID IS NOT NULL
ORDER BY 2 ;
--문제 4: 같은 업무(JOB_ID)를 하는 사람의 수가 4명 이상인 업무와 인원수를 조회
SELECT JOB_ID,COUNT(JOB_ID)
FROM employees 
GROUP BY JOB_ID
HAVING COUNT(JOB_ID) >= 4
ORDER BY 2 ;

SELECT JOB_ID,DEPARTMENT_ID,COUNT(JOB_ID)
FROM employees 
GROUP BY JOB_ID,DEPARTMENT_ID
HAVING COUNT(JOB_ID) >= 4
ORDER BY 2 ;

SELECT EMPLOYEE_ID, FIRST_NAME, DEPARTMENT_ID
FROM employees;
--여러 테이블에서 값을 가져올때 사용
SELECT E.EMPLOYEE_ID, E.FIRST_NAME, E.DEPARTMENT_ID, D.DEPARTMENT_NAME --테이블에 별칭을 달아줌
FROM employees E,departments D 
WHERE d.department_id = e.department_id;

--EQUI 조인
SELECT
     E.EMPLOYEE_ID, 
     E.FIRST_NAME, 
     E.DEPARTMENT_ID,
     D.DEPARTMENT_NAME
FROM  employees E,departments D ;

--CROSS 조인
SELECT
     E.EMPLOYEE_ID, 
     E.FIRST_NAME, 
     E.DEPARTMENT_ID,
     D.DEPARTMENT_NAME
FROM  employees E,departments D ;

--3개의 테이블이 조인 참여
--직원명(FIRST_NAME), 부서명(DEPARTMENT_NAME), 도시명(CITY)
SELECT E.FIRST_NAME , D.DEPARTMENT_NAME, C.CITY
FROM employees E, departments D, locations C
WHERE
e.department_id = d.department_id
AND
d.location_id = c.location_id;

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
SELECT  E.FIRST_NAME, E.HIRE_DATE,  Substr(sysdate,1,2)-Substr(HIRE_DATe,1,2) as "년수",
d.department_name, j.job_title,E.SALARY,salary*0.1 as "특별상여금"
FROM  JOBS j,departments d,employees e
where e.job_id like '%CLERK'
and
Substr(sysdate,1,2)-Substr(HIRE_DATe,1,2) >= 12
AND
d.department_id = e.department_id
and
j.job_id = e.job_id
ORDER BY 3;
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

