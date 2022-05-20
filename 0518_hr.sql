--IN 연산자
SELECT * FROM employees;

SELECT  DEPARTMENT_ID, FIRST_NAME, JOB_ID FROM employees
WHERE DEPARTMENT_ID IN (SELECT DISTINCT DEPARTMENT_ID FROM employees
WHERE JOB_ID LIKE '%CLERK%');

SELECT  DEPARTMENT_ID, FIRST_NAME, JOB_ID FROM employees
WHERE JOB_ID IN (SELECT DISTINCT JOB_ID FROM employees
WHERE JOB_ID LIKE '%CLERK%');

--ANY 연산자
--연습 : JOB_ID : 'ST_MAN' 5800 ~ 8200
-- 가장 작은값보다 큰값으로 조회
SELECT FIRST_NAME, SALARY
FROM employees
WHERE SALARY > ANY(SELECT salary FROM employees WHERE job_id = 'ST_MAN')
ORDER BY 2;
SELECT salary FROM employees WHERE job_id = 'ST_MAN';

-- 가장 큰값 보다 작은값으로 조회
SELECT FIRST_NAME, SALARY
FROM employees
WHERE SALARY < ANY(SELECT salary FROM employees WHERE job_id = 'ST_MAN')
ORDER BY 2;

-- 같은값을 조회 IN과 같아진다.
SELECT FIRST_NAME, SALARY
FROM employees
WHERE SALARY = ANY(SELECT salary FROM employees WHERE job_id = 'ST_MAN')
ORDER BY 2;

-- 최소값보다 작은값 , 최대값보다 큰값을 가져옴
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

--SELF JOIN : 하나의 테이블에 PK, FK가 함께존재
SELECT EMPLOYEE_ID,FIRST_NAME,MANAGER_ID
FROM employees;

SELECT E1.EMPLOYEE_ID "사원번호",E1.FIRST_NAME"사원이름",E1.MANAGER_ID"매니저번호", e2.first_name AS "매니저명"
FROM employees E1, employees E2
WHERE e1.MANAGER_ID = e2.employee_id
ORDER BY 1;
--=====================
--outer join
SELECT E1.EMPLOYEE_ID "사원번호",E1.FIRST_NAME"사원이름",E1.MANAGER_ID"매니저번호", e2.first_name AS "매니저명"
FROM employees E1, employees E2
WHERE e1.MANAGER_ID = e2.employee_id (+)
ORDER BY e1.employee_id;


--Neena의 상관은 Steven입니다.
SELECT E1.FIRST_NAME || '의 상관은' || e2.first_name || '입니다'
FROM employees E1, employees E2
WHERE e1.MANAGER_ID = e2.employee_id (+)
ORDER BY e1.employee_id;
--==============Steven 의 상사는 없습니다.
--nvl2 활용
SELECT nvl2(E2.FIRST_NAME ,E1.FIRST_NAME || '의 상관은' || e2.first_name || '입니다',e1.FIRST_NAME || '은 상관이 없습니다')
FROM employees E1, employees E2
WHERE e1.MANAGER_ID = e2.employee_id (+)
ORDER BY e1.employee_id;

--SEQUENCE 객체
--데이터를 저장 할 때 지정된 양으로 증가하거나 감소하도록 하는 일종의 번호표
--DEFAULT 는 1부터 시작, 1씩 증가
--최대 15까지 만들수 있다.
--시작 값은 수정 할 수 없으며 증가 값은 수정할수 없다.
--시퀀스의 컬럼 참조 변수
---시퀀스이름.NEXTVAL -> 다음 번호 값을 표시
---시퀀스이름.CURRVAL -> 현재 값을 표시
--시퀀스 삭제
drop sequence temp_seq;
--시퀀스 생성
CREATE SEQUENCE temp_seq;
-- 1씩 증가 시킴(시퀀스 객체)
select temp_seq.nextval from dual;
--마지막값 소환(시퀀스 객체)
select temp_seq.currval from dual;
--시퀀스 생성 -100시작 5씩 증가
create sequence temp2_seq
increment by 5
start with -100
minvalue -100;
drop sequence temp2_seq;
select temp2_seq.nextval from dual;

--연습 : 직군들 중 'MGR'의 최고 급여보다 많이 받는 사람들의 명단(이름, 급여, 부서번호) 를 출력

/*
--게시판
                                        PK
--회원테이블 (USRINFO) : USERID, USRNAME, USRPWD
                                    PRIVATE        NOTNULL  NOTNULL
                                              PK              로직제어
--게시판 테이블 (BOARD) : BOARDNUM , USERID , TITLE, TEXT ,HITCOUNT 0 ,REGDATE SYSDATE
                                                                FK
-- 댓글 테이블 (REPLY) : REPLYNUM, BOARDNUM,USRID,TEXT,REGDATE
*/
--유저정보

DROP TABLE USERINFO;
DROP TABLE REPLY;
DROP SEQUENCE REPLY_SEQ;
DROP TABLE BOARD;
DROP SEQUENCE BOARD_SEQ;

--==========================================================================================================
CREATE TABLE USERINFO
(
    USRID VARCHAR2 (20) PRIMARY KEY,  --회원아이디
    USERNAME VARCHAR2(20) NOT NULL, --회원명
    USERPWD VARCHAR2(20) NOT NULL       --회원비번?
);

--게시판 정보
CREATE TABLE BOARD
(
    BOARDNUM NUMBER PRIMARY KEY,    --게시글번호
    USRID VARCHAR2(20) NOT NULL,           --회원 아이디
    TITLE VARCHAR2(100),                            --글제목
    TEXT VARCHAR2(2000),                            --글내용
    HITCOUNT NUMBER DEFAULT 0,              --조회수
    REGDATE DATE DEFAULT SYSDATE           --글쓴 날
);


CREATE SEQUENCE BOARD_SEQ;
drop TABLE BOARD;
--리플목록 덧글
--BOARD_SEQ.nextval COUNT 역활
CREATE TABLE REPLY
(
    REPLYNUM NUMBER PRIMARY KEY,                         
    BOARDNUM NUMBER REFERENCES BOARD(BOARDNUM) ON DELETE CASCADE,
    USRID VARCHAR2(20) NOT NULL,
    TEXT VARCHAR2(200),
    REGDATE DATE DEFAULT SYSDATE
);
CREATE SEQUENCE REPLY_SEQ;
--==========================================================================================================
INSERT into USERINFO
VALUES

('AAA','발산이','123');
('CCC','홍길동','1234');
('BBB','임꺽정','1233');
SELECT * FROM USERINFO;
SELECT * FROM BOARD;
SELECT * FROM REPLY;
DELETE 
-- 샘플 데이터 입력
-- (홍길동 'AAA', 임꺽정 'BBB')

-- BOARD
INSERT  INTO BOARD
(BOARDNUM, USRID, TITLE, TEXT)
VALUES
(BOARD_SEQ.nextval, 'CCC', '제목5', '글내용 555');
-- REPLY
INSERT  INTO REPLY
(REPLYNUM,BOARDNUM, USRID, TEXT)
VALUES
(REPLY_SEQ.nextval,2, 'AAA', '글내용 55555');

SELECT BOARDNUM, FROM BOARD;

-------------------------------1 ==================================================
SELECT B.BOARDNUM AS "글번호", P.USRID||' '||'('||(O.USERNAME)||')' AS "작성자",B.TITLE AS "제목"
FROM USERINFO P , USERINFO O , BOARD B
WHERE O.USRID = P.USRID
AND P.USRID = B.USRID;


--서브쿼리
SELECT BOARDNUM AS "글번호"
, USRID||' '||'('||(select USERNAME from userinfo where board.usrid = userinfo.usrid)||')' as "작성자"
, TITLE AS "제목"
from board;

--join
SELECT b.BOARDNUM AS "글번호",b.usrid ||' '||'('|| u.USERNAME || ')' "작성자",
Title "제목"
from userinfo u, board b
where u.usrid = b.usrid;

-------------------------------2 ================================================== 수정필요
SELECT R.BOARDNUM AS "BNUM",R.USRID AS "ID",U.USERNAME AS "NAME", 
R.TEXT AS "TEXT" FROM USERINFO U, BOARD B, REPLY R
WHERE u.USRID = r.usrid
AND r.USRID = b.usrid
and b.usrid = u.usrid;

SELECT r.BOARDNUM AS "BNUM",R.USRID AS "ID",USERNAME AS "NAME", 
TEXT AS "TEXT" FROM userinfo u, REPLY r
where r.usrid = u.usrid
and r.BOARDNUM=1;




-------------------------------3 ==================================================
select b.BOARDNUM as "본문글번호", u1.username "본문작성자" , r.REPLYNUM "리플번호", u2.username "리플 작성자"
from userinfo u1, userinfo u2, REPLY r, BOARD b
where 
u1.usrid = b.usrid
and
r.usrid = u2.usrid
and
b.BOARDNUM = r.BOARDNUM
order by
b.BOARDNUM, r.REPLYNUM;


-------------------------------4 ==================================================

SELECT BOARDNUM as "본문글번호", 
count(REPLYNUM) as "리플개수" 
from REPLY
GROUP BY BOARDNUM;
--==========================================
SELECT BOARDNUM as "본문글번호",
count(*) as "리플개수"
from REPLY r , BOARD b
where
b.BOARDNUM = r.BOARDNUM
GROUP BY
b.BOARDNUM;
--=============================================
UPDATE REPLY
SET
    TEXT='고칩니다';
    
UPDATE REPLY
SET
    TEXT = '고쳤다',
    REGDATE = SYSDATE
WHERE
    REPLYNUM=5;
    SELECT * FROM reply;
    SELECT * FROM BOARD;
ROLLBACK;
COMMIT;
--DELETE REPLY; 해당 데이터 다 날라감.
--DELETE REPLY WHERE REPLYNUM=3; 3번 열 삭제
DELETE REPLY 
WHERE REPLYNUM=3;

DELETE BOARD
WHERE BOARDNUM = 1;
