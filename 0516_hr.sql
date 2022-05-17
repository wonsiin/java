--NULL�� ���õ� �÷�
SELECT FIRST_NAME, SALARY, COMMISSION_PCT
FROM EMPLOYEES;
-- NULL�� ���ԵǾ� ������ 0���� ó���ض�
SELECT FIRST_NAME, SALARY, NVL(COMMISSION_PCT,0)
FROM EMPLOYEES;
--COMMISSION ���� �ִ� ����� COMM * 1.1, ������ SALARY *0.05�� ����� �߰��� ����
--NVL2(COMMISSION_PCT,0,0) ������ 2��° ������ 3��°�� �Ѵ�.
SELECT FIRST_NAME, SALARY, NVL2(COMMISSION_PCT,COMMISSION_PCT*1.1*salary,salary*0.05) AS "Ư�����ޱ�"
FROM EMPLOYEES;

--�������� 1: ��ü �������� �̸�,�μ���,����� �����ȣ�� ����ϵ�, �μ���ȣ�� ���»���� "�ҼӺμ�����", "��簡 ���»���� "�ְ�濵��"
--�� ��µǵ��� ��ȸ
SELECT EMPLOYEE_ID,FIRST_NAME, NVL(DEPARTMENT_ID,-1)"�μ���ȣ", NVL(MANAGER_ID,-1) AS "�Ŵ����ѹ�"
FROM EMPLOYEES;

--CASE WHEN THEN : �ڹ��� IF�� ����
SELECT
    FIRST_NAME,
    DECODE(DEPARTMENT_ID,
    10, '�濵��',
    20,'������',
    30,'������',
    40,'�λ����') AS "�μ���",
    SALARY
FROM employees
WHERE department_id IN (10,20,30,40);

SELECT FIRST_NAME, DEPARTMENT_ID,
    CASE 
        WHEN DEPARTMENT_ID = 10 THEN '�濵��'
        WHEN DEPARTMENT_ID = 20 THEN '������'
        WHEN DEPARTMENT_ID = 30 THEN '������'
        WHEN DEPARTMENT_ID = 40 THEN '�λ����'
        ELSE '��Ÿ' 
    END AS "�μ���"
FROM employees;

SELECT * FROM EMPLOYEES;

--�׷��� �Լ�
--COUNT(�÷���)
SELECT COUNT(FIRST_NAME) AS "���ο�" FROM employees;
SELECT COUNT(COMMISSION_PCT) AS "���ο�" FROM employees;
SELECT COUNT(*) AS "���ڵ�" FROM employees; --���ڵ尡 �����
SELECT FIRST_NAME, COUNT(*) AS "���ڵ�" FROM employees; --�̰� ������. 107���� �ƴ� �ϳ��� �����͸� ��µǱ⶧����
SELECT COUNT(*) AS "���ڵ�", SUM(SALARY), ROUND(AVG(SALARY),2), MIN(SALARY),MAX(SALARY) FROM employees;

--GROUP BY �� �̿��ؼ� �׷�ȭ ��Ű��
--ã���� �ϴ� ������ �׻� �տ����´�.
SELECT DEPARTMENT_ID, SUM(SALARY), ROUND(AVG(SALARY),2) 
FROM employees
GROUP BY DEPARTMENT_ID
--ORDER BY 1; --1�� ������ ORDER BY ��Ű�����ػ���
ORDER BY 3; 

--GROUP BY �� �̿��ؼ� �׷�ȭ�� �������� ���ǿ��� having
SELECT DEPARTMENT_ID, SUM(SALARY), ROUND(AVG(SALARY),2) 
FROM employees
GROUP BY DEPARTMENT_ID
--HAVING DEPARTMENT_ID =80
HAVING ROUND(AVG(SALARY),2) <= 7000 --7000�� ������ ���ϰ��� ����ϱ����� ���
ORDER BY 3; 

--���� 1 : 80�� �μ��� �޿� ���, �ְ�, ���� ,�ο����� ��ȸ
SELECT DEPARTMENT_ID,ROUND(AVG(SALARY),2) ,MAX(SALARY),MIN(SALARY),COUNT(DEPARTMENT_ID)
FROM employees
GROUP BY DEPARTMENT_ID
HAVING DEPARTMENT_ID = 80
ORDER BY 1;

--���� 2 : �� �μ��� �޿��� ���, �ְ�, ���� ,�ο����� ��ȸ
SELECT DEPARTMENT_ID,ROUND(AVG(SALARY),2) ,MAX(SALARY),MIN(SALARY),COUNT(salary)
FROM employees
GROUP BY DEPARTMENT_ID;

--���� 3: �� �μ��� ��� ����, ��ü ����, ���������� ���Ͽ� ��տ����� ���� ������ ��ȸ, �� �μ���ȣ�� NULL�̸� ���X
SELECT DEPARTMENT_ID,ROUND(AVG(SALARY),2),SUM(SALARY),MIN(SALARY)
FROM employees 
GROUP BY DEPARTMENT_ID
HAVING DEPARTMENT_ID IS NOT NULL
ORDER BY 2 ;
--���� 4: ���� ����(JOB_ID)�� �ϴ� ����� ���� 4�� �̻��� ������ �ο����� ��ȸ
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
--���� ���̺��� ���� �����ö� ���
SELECT E.EMPLOYEE_ID, E.FIRST_NAME, E.DEPARTMENT_ID, D.DEPARTMENT_NAME --���̺� ��Ī�� �޾���
FROM employees E,departments D 
WHERE d.department_id = e.department_id;

--EQUI ����
SELECT
     E.EMPLOYEE_ID, 
     E.FIRST_NAME, 
     E.DEPARTMENT_ID,
     D.DEPARTMENT_NAME
FROM  employees E,departments D ;

--CROSS ����
SELECT
     E.EMPLOYEE_ID, 
     E.FIRST_NAME, 
     E.DEPARTMENT_ID,
     D.DEPARTMENT_NAME
FROM  employees E,departments D ;

--3���� ���̺��� ���� ����
--������(FIRST_NAME), �μ���(DEPARTMENT_NAME), ���ø�(CITY)
SELECT E.FIRST_NAME , D.DEPARTMENT_NAME, C.CITY
FROM employees E, departments D, locations C
WHERE
e.department_id = d.department_id
AND
d.location_id = c.location_id;

--1. �μ���, ���ø��� ��ȸ ok
SELECT d.DEPARTMENT_NAME, c.CITY
FROM departments D, locations C
WHERE
d.location_id = c.location_id;
-- 2. �ټ� ����� 15�� �̻��� ����� �̸�, �Ի��� �μ����� ��ȸ�Ͻÿ�. OK
SELECT  FIRST_NAME, floor((sysdate-HIRE_DATE)/365) as "���", JOB_ID
FROM employees
WHERE floor(sysdate-HIRE_DATE)/365 >= 15;
----------------------------�߰�
select  e.FIRST_NAME,e.hire_date,Substr(sysdate,1,2)-Substr(HIRE_DATe,1,2) as "�ټӳ��", d.department_name
from employees e, departments d
where 
    Substr(sysdate,1,2)-Substr(HIRE_DATe,1,2) >= 15
    and
    e.department_id = d.department_id
order by 3;
--3. ���� ������ CLERK �� ���� �� �ټӳ���� 12�� �̻��� �������� Ư���󿩱� 10%�� �����Ϸ��� �Ѵ�.
-- �̸�, �Ի���, �ټӳ��, �μ���, ������(JOB_ID), �޿���, Ư�� �󿩱��� ���ʷ� ��ȸ�ϼ���.    xx (��������)
SELECT  E.FIRST_NAME, E.HIRE_DATE,  Substr(sysdate,1,2)-Substr(HIRE_DATe,1,2) as "���",
d.department_name, j.job_title,E.SALARY,salary*0.1 as "Ư���󿩱�"
FROM  JOBS j,departments d,employees e
where e.job_id like '%CLERK'
and
Substr(sysdate,1,2)-Substr(HIRE_DATe,1,2) >= 12
AND
d.department_id = e.department_id
and
j.job_id = e.job_id
ORDER BY 3;
--4. JOIN �� ����Ͽ� Ŀ�̼��� �޴� ��� ����� �̸�, �μ�ID, �������� ��� OK
SELECT E.FIRST_NAME,E.DEPARTMENT_ID,C.CITY
FROM employees E, departments D, locations C
WHERE e.commission_pct IS NOT NULL
AND
E.DEPARTMENT_ID = D.DEPARTMENT_ID
AND
D.LOCATION_ID = C.LOCATION_ID
and
e.commission_pct is not null;
--5. EQUI���ΰ� ���ϵ�ī�带 ����Ͽ� �̸��� A�� ���Ե� ��� ����� �̸��� �μ����� ���(��ҹ��� ����X) OK
SELECT E.FIRST_NAME,D.DEPARTMENT_name
FROM employees e,departments D
WHERE 
upper(e.FIRST_NAME) LIKE '%A%'
--(e.FIRST_NAME LIKE '%A%' or e.FIRST_NAME LIKE '%a%')
AND
E.DEPARTMENT_ID = D.DEPARTMENT_ID;
--6. JOIN�� ����Ͽ� SEATTLE�� �ٹ��ϴ� ��� ����� �̸�, ����, �μ���ȣ �� �μ����� ��� OK
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

