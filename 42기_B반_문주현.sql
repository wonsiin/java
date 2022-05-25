--1) o
 SELECT D.DEPARTMENT_NAME,L.CITY , x."count"
 FROM departments D,locations L ,(SELECT nvl(e.DEPARTMENT_id,0) as "de", count(e.DEPARTMENT_id) as "count"
 FROM employees e  GROUP BY DEPARTMENT_id order by 1) x
 WHERE 
 d.location_id = l.location_iD
 and
 x."de" = d.department_id
 order by 3 DESC;
 
 --2) 11�� -> 15�� o
 SELECT E.first_name "�����", E.HIRE_DATE"�Ի���",D.department_NAME"�μ���"
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
SELECT e1.last_name "����� ����",e1.salary"�޿�",
TRUNC(SYSDATE- E1.HIRE_DATE) AS "�ٹ��ϼ�", e2.last_name AS "�Ŵ�����"
FROM employees E1, employees E2
WHERE e1.MANAGER_ID = e2.employee_id;
--5 o
SELECT E.last_name,E.salary,E.department_id,
D.department_NAME, X."���"
FROM employees E, departments D,
(SELECT e1.department_id,TRUNC(AVG(salary)) AS "���" 
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
select d.department_name,x."�ο���",x."�ִ�ݾ�",x."�ּұݾ�",x."���"
from departments d,
(select department_id,count(*)"�ο���",max(salary) "�ִ�ݾ�",min(salary) "�ּұݾ�",trunc(AVG(salary),2)"���" 
from employees  GROUP BY department_id) x
where not x."�ִ�ݾ�" = x."�ּұݾ�"
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
select x."�μ���ȣ",d.department_name as "�μ��̸�", x."�����", x."�ְ�޿�",
x."�����޿�",x."��ձ޿�",x."�޿��Ѿ�"
from departments d , -- �κ�
(select e.department_id"�μ���ȣ",count(e.department_id) "�����",
max(salary)"�ְ�޿�",min(salary)"�����޿�",
Floor(AVG(salary))"��ձ޿�",sum(salary)"�޿��Ѿ�"
from employees e    --�κ�
GROUP BY e.department_id) x
where x."�μ���ȣ" = d.department_id
and x."�����" >= 3;
--11 o
select * from employees;
SELECT e1.employee_id ,e1.first_name "�̸�",e1.last_name "��", 
E1.HIRE_DATE AS "�Ի���", nvl2(e2.last_name,e2.last_name,'Nomanager') AS "�����ڸ�"
FROM employees E1, employees E2
WHERE e1.MANAGER_ID = e2.employee_id
and e1.HIRE_DATE <= '05/01/01'
ORDER by 4;
--12 o
SELECT  d.department_name"�μ���",
sum(e.salary)"�μ��� ���� �޿���",
(sum(e.salary)*1.1)"�μ��� �λ� �޿���",
(sum(e.salary) * 0.1) "�μ��� �߰� �ΰǺ�"
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
select gi.group_name,gi.DEBUT_DATE,x."�ο���"
from girl_group gi,
(select group_no, count(member_no) as "�ο���" 
from GROUP_MEMBERS GROUP BY group_no) x
where gi.group_no = x.group_no
order by 2;

-- 18) 1�� -> 5�� o
select group_name,agency,member_name
from girl_group i, GROUP_MEMBERS g
where TRUNC((sysdate - DEBUT_DATE)/365) > 5
and i.group_no = g.group_no;

--19 O
select group_name "�ɱ׷��",TO_CHAR(DEBUT_DATE,'YYYY-MM-DD')"���߳�¥",
agency "��ȹ��"
from girl_group 
order by 2;
--20 o
select group_name, case group_name
    when '�ɽ�����' then '������'
    when '���座��' then '������'
    when 'Ʈ���̽�' then '����'
    when '����ģ��' then '����'
    when '����ũ' then '��ũ'
    end as "��Ŭ��"
    from girl_group;






INSERT INTO GIRL_GROUP VALUES (GIRL_GROUP_SEQ.nextval, 'Ʈ���̽�', '2015/10/20', 'JYP');
INSERT INTO GIRL_GROUP VALUES (GIRL_GROUP_SEQ.nextval, '���座��', '2014/08/01', 'SM');
INSERT INTO GIRL_GROUP VALUES (GIRL_GROUP_SEQ.nextval, '����ģ��', '2015/01/15', 'Source');
INSERT INTO GIRL_GROUP VALUES (GIRL_GROUP_SEQ.nextval, '����ũ', '2016/08/08', 'YG');
INSERT INTO GIRL_GROUP VALUES (GIRL_GROUP_SEQ.nextval, '�ɽ�����', '2010/07/09', 'DreamT');

INSERT INTO GROUP_MEMBERS VALUES (GROUP_MEMBER_SEQ.nextval, '����', 1); 
INSERT INTO GROUP_MEMBERS VALUES (GROUP_MEMBER_SEQ.nextval, '����', 1); 
INSERT INTO GROUP_MEMBERS VALUES (GROUP_MEMBER_SEQ.nextval, '���', 1); 
INSERT INTO GROUP_MEMBERS VALUES (GROUP_MEMBER_SEQ.nextval, '�糪', 1); 
INSERT INTO GROUP_MEMBERS VALUES (GROUP_MEMBER_SEQ.nextval, '��ȿ', 1); 
INSERT INTO GROUP_MEMBERS VALUES (GROUP_MEMBER_SEQ.nextval, '�̳�', 1); 
INSERT INTO GROUP_MEMBERS VALUES (GROUP_MEMBER_SEQ.nextval, '����', 1); 
INSERT INTO GROUP_MEMBERS VALUES (GROUP_MEMBER_SEQ.nextval, 'ä��', 1); 
INSERT INTO GROUP_MEMBERS VALUES (GROUP_MEMBER_SEQ.nextval, '����', 1);

INSERT INTO GROUP_MEMBERS VALUES (GROUP_MEMBER_SEQ.nextval, '����', 2);
INSERT INTO GROUP_MEMBERS VALUES (GROUP_MEMBER_SEQ.nextval, '���̸�', 2);
INSERT INTO GROUP_MEMBERS VALUES (GROUP_MEMBER_SEQ.nextval, '����', 2);
INSERT INTO GROUP_MEMBERS VALUES (GROUP_MEMBER_SEQ.nextval, '����', 2);
INSERT INTO GROUP_MEMBERS VALUES (GROUP_MEMBER_SEQ.nextval, '����', 2);

INSERT INTO GROUP_MEMBERS VALUES (GROUP_MEMBER_SEQ.nextval, '�ҿ�', 3);
INSERT INTO GROUP_MEMBERS VALUES (GROUP_MEMBER_SEQ.nextval, '����', 3);
INSERT INTO GROUP_MEMBERS VALUES (GROUP_MEMBER_SEQ.nextval, '����', 3);
INSERT INTO GROUP_MEMBERS VALUES (GROUP_MEMBER_SEQ.nextval, '����', 3);
INSERT INTO GROUP_MEMBERS VALUES (GROUP_MEMBER_SEQ.nextval, '�ź�', 3);
INSERT INTO GROUP_MEMBERS VALUES (GROUP_MEMBER_SEQ.nextval, '����', 3);

INSERT INTO GROUP_MEMBERS VALUES (GROUP_MEMBER_SEQ.nextval, '����', 4);
INSERT INTO GROUP_MEMBERS VALUES (GROUP_MEMBER_SEQ.nextval, '����', 4);
INSERT INTO GROUP_MEMBERS VALUES (GROUP_MEMBER_SEQ.nextval, '����', 4);
INSERT INTO GROUP_MEMBERS VALUES (GROUP_MEMBER_SEQ.nextval, '����', 4);

INSERT INTO GROUP_MEMBERS VALUES (GROUP_MEMBER_SEQ.nextval, '����', 5);
INSERT INTO GROUP_MEMBERS VALUES (GROUP_MEMBER_SEQ.nextval, '����', 5);
INSERT INTO GROUP_MEMBERS VALUES (GROUP_MEMBER_SEQ.nextval, '�ξ�', 5);
INSERT INTO GROUP_MEMBERS VALUES (GROUP_MEMBER_SEQ.nextval, '����', 5);



