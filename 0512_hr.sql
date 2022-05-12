--5�� 12�� (��)

--LIKE ������
--���ϵ� ī��( % , _ ) 2������ ������

--���� JOB_ID �� 'CLERK'�� ������ �������� ������, �޿�, ��å�� ���(LIKE)
SELECT * FROM employees;

select first_name,salary,job_id from employees
where job_id like '%CLERK' ORDER BY FIRST_NAME;

--(����) �̸��� J�� �����ϴ� ���� ��� �̸�, �޿�, ��å�� ��ȸ(LIKE)
SELECT first_name, salary,job_id FROM employees
WHERE first_name LIKE 'J%' ORDER BY first_name;

--(����) �̸��� r�� ������ ���� ��� �̸�, �޿�, ��å�� ��ȸ(LIKE) !!
SELECT first_name, salary,job_id FROM employees
WHERE first_name LIKE '%r' ORDER BY first_name;

--(����) �̸��� J�� ����, r�� ������ ���� ��� �̸�, �޿�, ��å�� ��ȸ(LIKE) !!
SELECT first_name, salary,job_id FROM employees
WHERE first_name LIKE 'J%r' ORDER BY first_name;

--(����) %�� �� %%�� ����ϸ� ��ü ������ �� ���(LIKE) !!
SELECT first_name, salary,job_id FROM employees
WHERE first_name LIKE '%%' ORDER BY first_name;

--(����) �Ի� �⵵�� 02���� ��� �̸�, �޿�, ��å , �Ի����� �� ���(LIKE) !!
SELECT first_name, salary,job_id,hire_date FROM employees
WHERE hire_date LIKE '02%' ORDER BY first_name;

--(����) �̸���P�� �����ϴ� ���� �̸��� 5���� ������ ��� , �޿�, ��å�� ��ȸ(LIKE) !!
SELECT first_name, salary,job_id FROM employees
WHERE first_name LIKE 'P____' ORDER BY first_name;

--���� ������(UNION,INTERSECT,MINUS) **************************************
--�� ĭ�� �°� �̴� �����͸� ��������Ѵ�,
--������ �ٸ��� �ְ� ĭ ���� ���߰ԵǸ� ������ �������� ��������.
--UNION
SELECT first_name, salary,job_id,hire_date,department_id FROM employees
WHERE hire_date LIKE '02%'

UNION

SELECT first_name, salary,job_id,hire_date,department_id FROM employees
WHERE department_id = 50 ORDER BY first_name;

-- INTERSECT
SELECT first_name, salary,job_id,hire_date,department_id FROM employees
WHERE hire_date LIKE '02%'

INTERSECT

SELECT first_name, salary,job_id,hire_date,department_id FROM employees
WHERE department_id = 50 ORDER BY first_name;

-- MINUS
SELECT first_name, salary,job_id,hire_date,department_id FROM employees
WHERE hire_date LIKE '02%'

MINUS

SELECT first_name, salary,job_id,hire_date,department_id FROM employees
WHERE department_id = 50 ORDER BY first_name;

/* DDL : CREATE, ALTER, DROP */
--CREATE TABLE ���̺��(������ �Ұ�)
--(
--    �÷���(������ �Ұ�) ������Ÿ�� [�������Ǹ�(�̸�)(������ �Ұ�)][��������],
--    ...
--);
--TABLE ����¹�
CREATE TABLE test
(
    usrid CHAR(5),
    age NUMBER(3),
    name VARCHAR2(20),
    height number(10, 2),
    weight number(10, 2)
);
-----------------------------------------�����Ǿ��µ� ����������,,
--TABLE �����ϴ¹�
DROP TABLE test;
------
CREATE TABLE MYTEST
(
    SEQNO NUMBER PRIMARY KEY,
    USRNAME VARCHAR2(30) NOT NULL,
    USERID CHAR(13) UNIQUE NOT NULL, --ũ�Ⱑ �����϶� CHAR�� ���
    BIRTH DATE,
    JOINDATE DATE DEFAULT SYSDATE, --���� �ð� �״�θ� �ް������
    GENDER CHAR(1) CHECK (GENDER IN('F','N'))
);
DROP TABLE MYTEST;
--���������� �����ϴ� ��Ÿ���̺��� ���� Ȯ��
SELECT * FROM USER_CONSTRAINTS;
--�������Ǹ� ��Ģ : ���̺��_�÷���_��������Ÿ��         PK:�����̸Ӹ�Ű, FK:����Ű, NN:NOT NULL, UNIQUE:UQ ...
CREATE TABLE MYTEST
(
    SEQNO NUMBER CONSTRAINT MYTEST_SEQNO_PK PRIMARY KEY,
    USRNAME VARCHAR2(30) CONSTRAINT MYTEST_USERNAME_NN NOT NULL,
    USERID CHAR(13) CONSTRAINT MYTEST_ID_UQNN UNIQUE NOT NULL, --ũ�Ⱑ �����϶� CHAR�� ���
    BIRTH DATE,
    JOINDATE DATE DEFAULT SYSDATE, --���� �ð� �״�θ� �ް������
    GENDER CHAR(1) CONSTRAINT MYTEST_GENDER_CK CHECK (GENDER IN('F','N'))
);
--MYTEST ���̺� ������ �Է�

INSERT INTO MYTEST
(SEQNO, USRNAME, USERID, BIRTH, JOINDATE, GENDER) -- �÷���
VALUES
(1,'ȫ�浿','201231411123','20/12/31',SYSDATE, 'N'); -- ������
-- �� �ø����� �÷����� ���� �ȴ�,
-- �÷����� ������ ����� �����ʹ� ��� ������� �־�� �Ѵ�.
INSERT INTO MYTEST
VALUES
(2,'�Ӳ���','201231411124','20/12/31',SYSDATE, 'N'); -- ������
--DEFAULT�� ������ �÷��� ��������
INSERT INTO MYTEST
(SEQNO, USRNAME, USERID, BIRTH, GENDER) -- �÷���
VALUES
(3,'�տ���','210512311123','21/05/12', 'F'); -- ������
--COMMIT �ϸ� �ѹ��� �ȵȴ�. �ѹ��� Ŀ���ϱ� ���� ���
INSERT INTO MYTEST
(SEQNO, USRNAME, USERID, GENDER) -- �÷���
VALUES
(4,'���Ȱ�','210512311133', 'F'); -- ������

COMMIT;

--��������� NULL�� �����͸� ����ϼ���.
SELECT * FROM mytest
WHERE BIRTH IS NULL ORDER BY BIRTH;

-- ������ 'F'�� �����͸� ��ȸ�Ͻÿ�
SELECT * FROM mytest
WHERE GENDER = 'F' ORDER BY BIRTH;

-- ���踦 �����ϴ� ���̺� �����ϱ�
-- �ڽ� ���� ��� �� �θ� ����
CREATE TABLE PARENT_1
(
    SEQNO       NUMBER PRIMARY KEY,
    USRNAME  VARCHAR2(20),
    PHONE       VARCHAR2(10)
);
--�ڽ� ���̺� �����ϱ�  REFERENCES : �����ϰ� �ִٴ°� �ǹ�  PARENT_1(SEQNO) : ��� ���̺�� ���������� ����κп� �����ϴ��� ����
--  �ڽ����̺�(ON DELETE CASCADE) �� �־��ָ� �θ� �����ɽ� �ڽĵ� ���� ������
CREATE TABLE CHILD_1
(
    NUM_1            NUMBER PRIMARY KEY,
    JUMIN             VARCHAR2(13) NOT NULL,
    ADDRESS       VARCHAR2(50),
    SEQNO           NUMBER REFERENCES PARENT_1(SEQNO) ON DELETE CASCADE
);
DROP TABLE CHILD_1;

--���̺� ������ �ֱ�
-- 1) �θ����̺� �μ�Ʈ ����
INSERT INTO PARENT_1 VALUES(1,'ȫ�浿','1111');
INSERT INTO PARENT_1 VALUES(2,'���Ȱ�','2222');

-- 2) �ڽ����̺� �μ�Ʈ ���� (�������� �θ��̶� ������ױ� ������ �� ��ȣ�� �°� ����������Ѵ�.)
INSERT INTO CHILD_1 VALUES(11,'111-222','SEOUL',1);
INSERT INTO CHILD_1 VALUES(22,'222-111','DOKU',1);
INSERT INTO CHILD_1 VALUES(33,'333-555','OKASI',2);

SELECT * FROM PARENT_1; --�θ�
SELECT * FROM CHILD_1;  --�ڽ�


