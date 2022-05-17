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

select tbl.* from

(SELECT  E.FIRST_NAME, E.HIRE_DATE,  Substr(sysdate,1,2)-Substr(HIRE_DATe,1,2) as "�ټӳ��",
d.department_name,j.job_title,E.SALARY,salary*0.1 as "Ư���󿩱�"
FROM  JOBS j,departments d,employees e
where e.job_id like '%CLERK' AND e.department_id = d.department_id and j.job_id = e.job_id) tbl

where
�ټӳ�� >= 12
ORDER BY 3;
--num�̶�� �̸��� �־������ν� 
select *
from
(select ROWNUM as num, department_id, first_name
from employees
ORDER by department_id)
order by num;
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

--(��) �����ȣ�� 162���� ���� �޿��� ���� �޿��� �޴� ������ ����� ��ȸ
select first_name,salary from employees --1�� �ۼ��ϴ°� 1���� ����Ѵ�.
where employee_id = 162;
select first_name,salary from employees
where salary = 10500;

--���������� ��ȯ��� salary�� ã���� salary�� ã�ƾ��Ѵ�.
-- �����ʹ� 1���� �ް� ����� �������϶� =�� �ƴ� in���� ����Ѵ�.
--Where ����
select * from employees
where salary = (select salary 
                        from employees
                        where employee_id = 162);
                        
select * from employees;
--�μ� ��ȣ�� 80���� �μ��� �����ȣ, �̸�, �޿�, �μ���ȣ
-- �޿��� 8000�� �ʰ��ϴ� ������ ����� �Ϸù�ȣ�� �Բ� ��� (1,2,3,4...)�Ͻÿ�
--from �� ������     rownum = count �� ���
select rownum, tbl.* from
--select tbl.salary from
(select employee_id,first_name,salary,department_id  from employees
where department_id = 80) tbl --���̺�ȭ ��ų���ִ�.
where tbl.salary > 8000;

--���� : 'Bruce' ����� �̸�, �μ��̸�, ������ �μ��� �ٹ��ϴ� ������� ��ȸ
select * from
(select e.first_name,d.department_name  from employees e, departments d
where department_name = 'IT' and E.DEPARTMENT_ID = D.DEPARTMENT_ID) tbl;

--30�� �μ��� �ٹ��ϴ� ��å�� ������ ��å���� �ٹ��ϴ� ������ �ٸ� �μ����� �ִ��� Ȯ��
select tbl.* from
--select tbl.salary from
(select E.employee_id,E.first_name,D.department_id,c.city  from employees e, departments d , locations C
where D.department_id = 30 and E.DEPARTMENT_ID = D.DEPARTMENT_ID AND d.location_id = c.location_id) tbl;

--ȸ���� ��ü �޿� ��պ��� ���� �޴� ������ ����� ��ȸ
select first_name,salary from employees
where salary <=
(SELECT AVG(salary) from employees);

--�� ���������ڽ��� �ٹ��ϰ� �ִ� �μ��� ��� �ӱ��� ����ϴ� SQL��ɹ�
-- �̸�, �޿�, �μ���ȣ, �μ���, �μ� ��� �޿�
select e.department_id "�μ���ȣ",e.first_name "�̸�",e.salary "�޿�",d.department_name  "�μ���",
(select floor(AVG(SALARY)) from employees o where o.department_id =e.department_id)  as "��ձ޿�"
from employees e,departments d;

GROUP BY DEPARTMENT_ID;
select floor(AVG(SALARY)) from employees;