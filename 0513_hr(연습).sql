--05.13

drop table wishlist;
drop table orders;

CREATE TABLE categories --��ǰ ī�װ�
(
    CATEGORY_ID CHAR(10) PRIMARY KEY,
    TYPE VARCHAR2(50) NOT NULL CHECK (TYPE IN('��ǰ','����','�ֹ�','����'))
);

CREATE TABLE product --��ǰ����
(
    product_id char(10) PRIMARY key, --��ǰ���̵�
    product_name VARCHAR2(100) not null, --��ǰ�� ����
    ptock_date DATE DEFAULT SYSDATE not null , --��ǰ�԰���
    category_id char(10)  REFERENCES categories(CATEGORY_ID) --��ǰ���̵�
);
create table customers
(
    customer_id VARCHAR2(20) PRIMARY key, --�����̵�
    email VARCHAR2(20) UNIQUE not null, --�̸���
    customer_name VARCHAR2(30) not null, --���̸�
    address VARCHAR2(100) not null --���ּ�
);
CREATE table orders
(
    order_id number PRIMARY key, --�ֹ���ȣ
    customer_id VARCHAR2(20) REFERENCES customers(customer_id), --�����̵�
    product_id char(10) REFERENCES product(product_id), --��ǰ���̵�
    order_date DATE DEFAULT SYSDATE, --�ֹ���¥
    order_count number DEFAULT 0
);

create table wishlist
(
    customer_id VARCHAR2(20),
    product_id char(10), --DEFAULT �� �ּ��� �о������ ����
    save_date DATE DEFAULT SYSDATE,
    PRIMARY KEY(customer_id, product_id)
);


SELECT lower('KOREA korea Korea') from DUAL;
SELECT upper('KOREA korea Korea') from DUAL;
SELECT INITCAP('KOREA korea Korea') from DUAL;
SELECT length('KOREA korea Korea') from DUAL;
SELECT FIRST_NAME, LENGTH(FIRST_NAME), UPPER(FIRST_NAME) FROM employees;
SELECT LENGTH('���ѹα�') FROM DUAL;
SELECT LENGTHB('���ѹα�') FROM DUAL;
SELECT FIRST_NAME||'��',concat(FIRST_NAME, '��') FROM employees;
SELECT substr('����ȭ���� �Ǿ����ϴ�.',7) FROM DUAL;
SELECT substr('����ȭ���� �Ǿ����ϴ�.',4,1) FROM DUAL;
select replace('010-1234-5678', '-',' ')from DUAL;

select 1234.5678,round(1234.5678,2) from DUAL; --�Ҽ��� �������� �ݿø���Ŵ)
select 1234.5678,round(1234.5678,-1), ceil(1234.5678), floor(1234.5678) from DUAL;

select -1234.5678,round(-1234.5678,-1), ceil(-1234.5678), floor(-1234.5678) from DUAL;

--(����) ������ �̸��� �Ի�����
select * from employees;
select first_name||'����' as "�̸�" , substr(hire_date,4,2)||'��' as "�Ի��" from employees;

--(����) ������ �̸�,��,��å ���
select first_name,last_name,job_id from employees
where lower(first_name)like '%s%';

--��¥�Լ� : ��¥�� + - �� �����ϴ�.
select sysdate, systimestamp from DUAL;

select sysdate as "����", sysdate-1 as "����", sysdate+1 "����" from DUAL;

--������(91/12/25���� ��ȯ�Լ��� ���� ��¥Ÿ������ ��ȯ�� �����ؾ���)
select sysdate- '91/12/25'
from DUAL;

SELECT
    FIRST_NAME, hire_date,floor(SYSDATE - HIRE_DATE) AS "�ѱٹ���"
    FROM employees;
    
--ADD_MONTHS(��¥,����)
SELECT SYSDATE, ADD_MONTHS(SYSDATE,-3) FROM DUAL;

--months_between(��¥, ��¥)
SELECT FIRST_NAME,HIRE_DATE,floor(MONTHS_BETWEEN(SYSDATE,HIRE_DATE))as "�ٹ�����" FROM employees;

--��ȯ�Լ�
--TO_DATE(���ڿ�),'91/12/25'
--TO_CHAR

select sysdate, TO_DATE('00/01/29')
from DUAL;

select sysdate, TO_CHAR(SYSDATE,'YYYY-MM-DD')
from DUAL;
select sysdate, TO_CHAR(SYSDATE,'YYYY-MM-DD HH:I:SS DAY')
from DUAL;

--15�� �̻� �ٹ��� ������ ����� ��ȸ(�����ȣ,�̸�,�Ի���,�ٹ�������)
--�ٹ� �Ի����� �������� �������� �����Ͻÿ�.

SELECT * FROM employees;
select department_id,first_name,TO_CHAR(SYSDATE,'YYYY-MM-DD') as "�Ի��/��" ,
floor(MONTHS_BETWEEN(SYSDATE,HIRE_DATE)/12)as "�ٹ����" 
from employees
where floor(MONTHS_BETWEEN(SYSDATE,HIRE_DATE)) >= 180 ORDER by 3 desc;

--(����)

select sysdate - '90/01/29' --������
from DUAL;

select first_name,hire_date
from employees
where hire_date >= '05/01/01'; -- ���డ��

/*
switch(����){
case 10 : ...; break;
case 30 : ...; break;
}
decode(����, 10, ... , 30, .... )
*/

select distinct department_id
from employees
order by 1;

-- 10 --> '�濵��' , 20 --> '������', 30 --> '������', 40-->'�λ����'
select 
first_name,
decode(department_id,
10,'�濵��',
20,'������',
30,'������',
40,'�λ����') as "�μ���"
from employees
where department_id in(10,20,30,40);
select * from employees;

select 
first_name,
decode(department_id,
10,'�濵��',
20,'������',
30,'������',
40,'�λ����') as "�μ���",
ceil(decode(department_id,
10,salary*1.1,
20,salary*1.15,
30,salary*1.12,
40,salary*1.11)) as "�޿��λ�"
from employees
where department_id in(10,20,30,40);
select * from employees;




