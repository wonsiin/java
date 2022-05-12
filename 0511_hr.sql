--5�� 11�� (��)

--��ü ������ ��ȸ
SELECT * FROM employees;

--Ư�� �÷��� ��ȸ
SELECT FIRST_NAME,SALARY,DEPARTMENT_ID FROM employees;

-- �μ� ��ȣ
SELECT DISTINCT department_id FROM employees;

-- �μ� ��ȣ �������� ����
SELECT DISTINCT department_id FROM employees
ORDER BY DEPARTMENT_ID;

-- �μ� ��ȣ �������� ����
SELECT DISTINCT department_id FROM employees
ORDER BY DEPARTMENT_ID DESC;

-- �̸��� �μ� ��ȣ �μ���ȣ�� ��������, �̸��� �������� ����
SELECT FIRST_NAME,DEPARTMENT_ID FROM employees
ORDER BY DEPARTMENT_ID DESC, FIRST_NAME;

-- ��Ī(ALIAS)
SELECT FIRST_NAME AS "�̸�",DEPARTMENT_ID AS "�μ���ȣ" FROM employees
ORDER BY DEPARTMENT_ID DESC, FIRST_NAME;

--�����ڸ� �̿��� ó��
-- �޿��� 5000�̻��� ������ �̸�, �μ� , �޿��� ��ȸ
--SELECT XX FROM XX WHERE ���ǽ� ORDER BY XX
SELECT FIRST_NAME,DEPARTMENT_ID,SALARY FROM employees
WHERE SALARY >= 5000 ORDER BY SALARY, department_id,FIRST_NAME;
--����Ŭ�� ������ Ÿ�԰� ���ͳ�

--�Ի����� 2005�� ���� �Ի��� ��ȸ
 --��������ǥ ���������
SELECT FIRST_NAME,DEPARTMENT_ID,HIRE_DATE FROM employees;
SELECT FIRST_NAME,DEPARTMENT_ID,HIRE_DATE FROM employees
WHERE HIRE_DATE >= '05/01/01' ORDER BY HIRE_DATE;

SELECT FIRST_NAME,DEPARTMENT_ID,HIRE_DATE FROM employees
WHERE HIRE_DATE <= '05/01/01' ORDER BY HIRE_DATE;

-- Steven King �� SA_PR�̴�. --> ALIAS�� '�Ż�����'
--|| ���
SELECT (FIRST_NAME|| ' ' ||LAST_NAME || ' ��  ' || JOB_ID|| '�̴�')AS "�Ż�����" FROM employees;

SELECT (FIRST_NAME|| ' ' ||LAST_NAME || ' �� ' || JOB_ID|| '�̴�')AS "�Ż�����" FROM employees ORDER BY FIRST_NAME;

--50�� �μ��� ���� �������� �̸�,�μ���ȣ,�޿� ���.
--���ڿ��̸� ' ' �� ���ڸ� 50�� ���
SELECT FIRST_NAME,DEPARTMENT_ID,SALARY FROM employees
WHERE DEPARTMENT_ID = 50 ORDER BY SALARY DESC;

--�޿��� 5000 ~ 10000 ���� ��ϰ�������
SELECT FIRST_NAME,DEPARTMENT_ID,SALARY FROM employees
WHERE SALARY >= 5000 AND SALARY <= 10000 ORDER BY SALARY;


--���� 1
--�����ȣ , �̸�, �μ���ȣ, �޿�, ������ �޿����� �������� ��ȸ
SELECT EMPLOYEE_ID,FIRST_NAME,DEPARTMENT_ID,SALARY,JOB_ID FROM employees
ORDER BY SALARY DESC;
--���� 2
--�޿��� 10000 �̻��� ����� �̸�, �޿�, �μ���ȣ ��ȸ
SELECT FIRST_NAME,SALARY,DEPARTMENT_ID FROM employees
WHERE SALARY >= 10000;
--���� 3
--100�� �μ��� �Ҽӵ� ������� �̸�, �μ���ȣ, �޿��� �̸������� �������� �����Ͽ� ��ȸ
SELECT FIRST_NAME,DEPARTMENT_ID,SALARY FROM employees
WHERE DEPARTMENT_ID = 100 ORDER BY FIRST_NAME;
--���� 4
--�Ի����� '07/02/07'���Ŀ� �Ի��� ����� �̸�, �Ի����� ��¥�� ������������ ��ȸ
SELECT FIRST_NAME,HIRE_DATE FROM employees
WHERE hire_date >= '07/02/07' ORDER BY hire_date;
--���� 5
--�̸�,�Ի���,�޿�,�μ���ȣ�� ��ȸ, (�μ��� ��������,�̸��� ��������)
SELECT FIRST_NAME,HIRE_DATE,SALARY,DEPARTMENT_ID FROM employees
ORDER BY DEPARTMENT_ID,FIRST_NAME;
--���� 6
--�̸�,�Ի���,�޿�,Ŀ�̼� ����(COMMISSION_PCT)��ȸ
SELECT FIRST_NAME,HIRE_DATE,SALARY,COMMISSION_PCT FROM employees;

/*NULL ������ ó���ϱ� */
SELECT FIRST_NAME,HIRE_DATE,SALARY,COMMISSION_PCT FROM employees
WHERE COMMISSION_PCT IS NOT NULL;

--�μ��� �Ҽӵ��� ���� ����� �̸�, �Ի���, �޿�, �μ���ȣ�� ��ȸ
SELECT FIRST_NAME,HIRE_DATE,SALARY,DEPARTMENT_ID FROM employees
WHERE DEPARTMENT_ID IS NULL;

--(����) �������� �ִ� ������ �̸�, �޿�,Ŀ�̼Ǻ���,������, �հ踦 ��ȸ�Ͻÿ�.(��Ī�� ����Ұ�)
SELECT FIRST_NAME AS"�̸�",SALARY AS"�޿�",COMMISSION_PCT AS"����",SALARY*COMMISSION_PCT AS"������",SALARY+(SALARY*COMMISSION_PCT) AS"�հ�"  
FROM employees
WHERE SALARY+(SALARY*COMMISSION_PCT) IS NOT NULL 
ORDER BY SALARY DESC;

--(����) �������� �ִ� ������ �̸�, �޿�,Ŀ�̼Ǻ���,������, �հ踦 ��ȸ�Ͻÿ�.(��Ī�� ����Ұ�)
-- �����ݾ��� 10000 ������ �����
SELECT FIRST_NAME AS"�̸�",SALARY AS"�޿�",COMMISSION_PCT AS"����",SALARY*COMMISSION_PCT AS"������",SALARY+(SALARY*COMMISSION_PCT) AS"�հ�"  
FROM employees 
WHERE COMMISSION_PCT IS NOT NULL 
AND SALARY*COMMISSION_PCT <= 1000 
ORDER BY SALARY+(SALARY*COMMISSION_PCT) DESC;

--�޿��� 5000 ~ 10000 ���� ��ϰ�������(�ݺ�)
SELECT FIRST_NAME,DEPARTMENT_ID,SALARY FROM employees
WHERE SALARY >= 5000 AND SALARY <= 10000 ORDER BY SALARY;

--BETWEEN ���(���� ����)
SELECT FIRST_NAME,DEPARTMENT_ID,SALARY FROM employees
WHERE SALARY BETWEEN 5000 AND 10000 ORDER BY SALARY;

--�޿��� 5000 ~ 10000 ���̰� �ƴ� ���� ��ϰ�������(�ݺ�)
SELECT FIRST_NAME,DEPARTMENT_ID,SALARY FROM employees
WHERE SALARY NOT BETWEEN 5000 AND 10000 ORDER BY SALARY DESC;

--�μ���ȣ�� 10�� �̰ų� 30���� ������ �̸�, �μ���ȣ ,������ ��ȸ
-- OR�� ����
SELECT FIRST_NAME,DEPARTMENT_ID,job_id FROM employees
WHERE DEPARTMENT_ID = 10 OR DEPARTMENT_ID = 30;
--IN���� OR�� ���� �ʿ��� ���̺���  OR��� ������ ���϶� ���(��Ȯ�� ���� �˶� ���)
SELECT FIRST_NAME,DEPARTMENT_ID,job_id FROM employees
WHERE DEPARTMENT_ID IN(10,30);
-- �μ���ȣ�� 10��, 30��, 50���� �ƴ� ������ �̸�, �μ���ȣ ,������ ��ȸ
SELECT FIRST_NAME,DEPARTMENT_ID,job_id FROM employees
WHERE DEPARTMENT_ID NOT IN(10,30,50);

--LIKE %�� ���� �� ������ ����.
--CLERK ���� ��ȸ
--���ڿ� �˻��Ҷ��� �����޸� �ȿ����� �� �ҹ��ڰ� �߿��ϴ�
SELECT FIRST_NAME,JOB_ID
FROM employees
WHERE JOB_ID LIKE '%CLERK';









