--5�� 10��

--��ȸ�ϴ� ���(SELECT)
--SELECT �÷��� FROM ���̺��;
--SELECT FIRST_NAME,salary from employees;

SELECT * FROM EMPLOYEES;

SELECT * FROM DEPARTMENTS;

SELECT FIRST_NAME,salary from employees;

SELECT first_name,salary from employees
order by first_name; --�̸����� ��������

SELECT first_name,salary from employees
order by salary desc; --�޿������� ��������

select first_name,department_id,salary from employees
order by first_name;
--�̸�[FIRST_NAME], �μ�[DEPARTMENT_ID], �޿� [SALARY]
select department_id from employees;            --�ش簪 ���
select all department_id from employees;        --��ü���������
select distinct department_id from employees; --�ߺ�����

select distinct department_id from employees
order by department_id; --[asc/desc] ���δ� �����ص� �ȴ� ��� ��

select distinct first_name,department_id from employees
order by department_id;

select distinct first_name,department_id from employees
order by department_id DESC;

--������Ÿ��/������