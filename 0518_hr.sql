--IN ������
SELECT * FROM employees;

SELECT  DEPARTMENT_ID, FIRST_NAME, JOB_ID FROM employees
WHERE DEPARTMENT_ID IN (SELECT DISTINCT DEPARTMENT_ID FROM employees
WHERE JOB_ID LIKE '%CLERK%');

SELECT  DEPARTMENT_ID, FIRST_NAME, JOB_ID FROM employees
WHERE JOB_ID IN (SELECT DISTINCT JOB_ID FROM employees
WHERE JOB_ID LIKE '%CLERK%');

--ANY ������
--���� : JOB_ID : 'ST_MAN' 5800 ~ 8200
-- ���� ���������� ū������ ��ȸ
SELECT FIRST_NAME, SALARY
FROM employees
WHERE SALARY > ANY(SELECT salary FROM employees WHERE job_id = 'ST_MAN')
ORDER BY 2;
SELECT salary FROM employees WHERE job_id = 'ST_MAN';

-- ���� ū�� ���� ���������� ��ȸ
SELECT FIRST_NAME, SALARY
FROM employees
WHERE SALARY < ANY(SELECT salary FROM employees WHERE job_id = 'ST_MAN')
ORDER BY 2;

-- �������� ��ȸ IN�� ��������.
SELECT FIRST_NAME, SALARY
FROM employees
WHERE SALARY = ANY(SELECT salary FROM employees WHERE job_id = 'ST_MAN')
ORDER BY 2;

-- �ּҰ����� ������ , �ִ밪���� ū���� ������
SELECT FIRST_NAME, SALARY
FROM employees
WHERE SALARY < ALL(SELECT salary FROM employees WHERE job_id = 'ST_MAN')
ORDER BY 2;

SELECT FIRST_NAME, SALARY FROM employees
ORDER BY 2;

SELECT SALARY FROM
(SELECT  SALARY FROM employees ORDER BY 1)WHERE rownum <= 10;

SELECT SALARY FROM
(SELECT  SALARY FROM employees ORDER BY 1 DESC)WHERE rownum <= 10;

--SELF JOIN : �ϳ��� ���̺� PK, FK�� �Բ�����
SELECT EMPLOYEE_ID,FIRST_NAME,MANAGER_ID
FROM employees;

SELECT E1.EMPLOYEE_ID "�����ȣ",E1.FIRST_NAME"����̸�",E1.MANAGER_ID"�Ŵ�����ȣ", e2.first_name AS "�Ŵ�����"
FROM employees E1, employees E2
WHERE e1.MANAGER_ID = e2.employee_id
ORDER BY 1;
--=====================
--outer join
SELECT E1.EMPLOYEE_ID "�����ȣ",E1.FIRST_NAME"����̸�",E1.MANAGER_ID"�Ŵ�����ȣ", e2.first_name AS "�Ŵ�����"
FROM employees E1, employees E2
WHERE e1.MANAGER_ID = e2.employee_id (+)
ORDER BY e1.employee_id;


--Neena�� ����� Steven�Դϴ�.
SELECT E1.FIRST_NAME || '�� �����' || e2.first_name || '�Դϴ�'
FROM employees E1, employees E2
WHERE e1.MANAGER_ID = e2.employee_id (+)
ORDER BY e1.employee_id;
--==============Steven �� ���� �����ϴ�.
--nvl2 Ȱ��
SELECT nvl2(E2.FIRST_NAME ,E1.FIRST_NAME || '�� �����' || e2.first_name || '�Դϴ�',e1.FIRST_NAME || '�� ����� �����ϴ�')
FROM employees E1, employees E2
WHERE e1.MANAGER_ID = e2.employee_id (+)
ORDER BY e1.employee_id;

--SEQUENCE ��ü
--�����͸� ���� �� �� ������ ������ �����ϰų� �����ϵ��� �ϴ� ������ ��ȣǥ
--DEFAULT �� 1���� ����, 1�� ����
--�ִ� 15���� ����� �ִ�.
--���� ���� ���� �� �� ������ ���� ���� �����Ҽ� ����.
--�������� �÷� ���� ����
---�������̸�.NEXTVAL -> ���� ��ȣ ���� ǥ��
---�������̸�.CURRVAL -> ���� ���� ǥ��
--������ ����
drop sequence temp_seq;
--������ ����
CREATE SEQUENCE temp_seq;
-- 1�� ���� ��Ŵ(������ ��ü)
select temp_seq.nextval from dual;
--�������� ��ȯ(������ ��ü)
select temp_seq.currval from dual;
--������ ���� -100���� 5�� ����
create sequence temp2_seq
increment by 5
start with -100
minvalue -100;
drop sequence temp2_seq;
select temp2_seq.nextval from dual;

--���� : ������ �� 'MGR'�� �ְ� �޿����� ���� �޴� ������� ���(�̸�, �޿�, �μ���ȣ) �� ���

/*
--�Խ���
                                        PK
--ȸ�����̺� (USRINFO) : USERID, USRNAME, USRPWD
                                    PRIVATE        NOTNULL  NOTNULL
                                              PK              ��������
--�Խ��� ���̺� (BOARD) : BOARDNUM , USERID , TITLE, TEXT ,HITCOUNT 0 ,REGDATE SYSDATE
                                                                FK
-- ��� ���̺� (REPLY) : REPLYNUM, BOARDNUM,USRID,TEXT,REGDATE
*/
--��������

DROP TABLE USERINFO;
DROP TABLE REPLY;
DROP SEQUENCE REPLY_SEQ;
DROP TABLE BOARD;
DROP SEQUENCE BOARD_SEQ;


CREATE TABLE USERINFO
(
    USRID VARCHAR2 (20) PRIMARY KEY,  --ȸ�����̵�
    USERNAME VARCHAR2(20) NOT NULL, --ȸ����
    USERPWD VARCHAR2(20) NOT NULL       --ȸ�����?
);

--�Խ��� ����
CREATE TABLE BOARD
(
    BOARDNUM NUMBER PRIMARY KEY,    --�Խñ۹�ȣ
    USRID VARCHAR2(20) NOT NULL,           --ȸ�� ���̵�
    TITLE VARCHAR2(100),                            --������
    TEXT VARCHAR2(2000),                            --�۳���
    HITCOUNT NUMBER DEFAULT 0,              --��ȸ��
    REGDATE DATE DEFAULT SYSDATE           --�۾� ��
);


CREATE SEQUENCE BOARD_SEQ;
drop TABLE BOARD;
--���ø�� ����
--BOARD_SEQ.nextval COUNT ��Ȱ
CREATE TABLE REPLY
(
    REPLYNUM NUMBER PRIMARY KEY,                         
    BOARDNUM NUMBER REFERENCES BOARD(BOARDNUM) ON DELETE CASCADE,
    USRID VARCHAR2(20) NOT NULL,
    TEXT VARCHAR2(200),
    REGDATE DATE DEFAULT SYSDATE
);
CREATE SEQUENCE REPLY_SEQ;

INSERT into USERINFO
VALUES

('AAA','�߻���','123');
('CCC','ȫ�浿','1234');
('BBB','�Ӳ���','1233');
SELECT * FROM USERINFO;
SELECT * FROM BOARD;
SELECT * FROM REPLY;
DELETE 
-- ���� ������ �Է�
-- (ȫ�浿 'AAA', �Ӳ��� 'BBB')

-- BOARD
INSERT  INTO BOARD
(BOARDNUM, USRID, TITLE, TEXT)
VALUES
(BOARD_SEQ.nextval, 'CCC', '����5', '�۳��� 555');
-- REPLY
INSERT  INTO REPLY
(REPLYNUM,BOARDNUM, USRID, TEXT)
VALUES
(REPLY_SEQ.nextval,2, 'AAA', '�۳��� 55555');

SELECT BOARDNUM, FROM BOARD;

-------------------------------1 ==================================================
SELECT B.BOARDNUM AS "�۹�ȣ", P.USRID||' '||'('||(O.USERNAME)||')' AS "�ۼ���",B.TITLE AS "����"
FROM USERINFO P , USERINFO O , BOARD B
WHERE O.USRID = P.USRID
AND P.USRID = B.USRID;
-------------------------------2 ==================================================
SELECT R.BOARDNUM AS "BNUM",R.USRID AS "ID",U.USERNAME AS "NAME", 
R.TEXT AS "TEXT" FROM USERINFO U, BOARD B, REPLY R
WHERE U.USRID = b.usrid
AND U.USRID = r.usrid;
-------------------------------3 ==================================================
select b.BOARDNUM, u1.username , r.REPLYNUM, u2.username 
from userinfo u1, userinfo u2, REPLY r, BOARD b
where 
u1.usrid = b.usrid
and
r.usrid = u2.usrid
and
b.BOARDNUM = r.BOARDNUM
order by 3;
-------------------------------4 ==================================================

SELECT BOARDNUM as "�����۹�ȣ", 
count(REPLYNUM) as "���ð���" 
from REPLY
GROUP BY BOARDNUM;



SELECT DISTINCT(SELECT DISTINCT r.BOARDNUM from REPLY o) as "�����۹�ȣ" ,
(SELECT count(r.REPLYNUM) from REPLY p) as "���ð���"
from BOARD B, REPLY R
where b.BOARDNUM = r.BOARDNUM
order by 1;

 SELECT DISTINCT r.BOARDNUM  from REPLY r;
SELECT BOARDNUM  from REPLY;
 
SELECT DISTINCT o.BOARDNUM from REPLY o where o.BOARDNUM
(SELECT DISTINCT count(o.REPLYNUM) from REPLY o);




SELECT b.BOARDNUM AS "�����۹�ȣ", 
(select o.username from userinfo o,BOARD b where b.USRID = o.USRID) AS "�����ۼ���",
R.REPLYNUM AS "���ù�ȣ", 
u.username AS "���� �ۼ���" FROM userinfo u, BOARD B, REPLY R
WHERE 
b.BOARDNUM = r.BOARDNUM
and
r.USRID = u.usrid
and
o.USRID = u.usrid;
select  , o.username from userinfo o;

select x.boardnum, x.username 
(select n.REPLYNUM from userinfo i, REPLY n
where i.usrid = n.usrid)
from 
(select b.BOARDNUM, u.username from userinfo u, BOARD b
where b.USRID = u.USRID
and
i.usrid = u.usrid) x;
order by 1;
select (select n.REPLYNUM from userinfo i, REPLY n
where i.usrid = n.usrid),;

SELECT * FROM USERINFO;
SELECT * FROM BOARD;
SELECT * FROM REPLY;

select b.BOARDNUM as "�����۹�ȣ",
i.username as "�����ۼ���",
n.REPLYNUM as "���ù�ȣ"
--,(select u.username from userinfo u, REPLY r
--where r.usrid = u.usrid) as "�����ۼ���"
from userinfo i, REPLY n , BOARD b
where 
i.usrid = b.usrid
and
n.usrid = i.usrid
and
b.usrid = n.usrid
order by 3;


select b.BOARDNUM, u1.username , r.REPLYNUM, u2.username 
from userinfo u1, userinfo u2, REPLY r, BOARD b
where 
u1.usrid = b.usrid
and
r.usrid = u2.usrid
and
b.BOARDNUM = r.BOARDNUM
order by 3;