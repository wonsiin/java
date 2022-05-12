--5월 12일 (목)

--LIKE 연산자
--와일드 카드( % , _ ) 2가지가 존재함

--연습 JOB_ID 가 'CLERK'로 끝나는 데이터의 직원명, 급여, 직책을 출력(LIKE)
SELECT * FROM employees;

select first_name,salary,job_id from employees
where job_id like '%CLERK' ORDER BY FIRST_NAME;

--(연습) 이름이 J로 시작하는 직원 출력 이름, 급여, 직책을 조회(LIKE)
SELECT first_name, salary,job_id FROM employees
WHERE first_name LIKE 'J%' ORDER BY first_name;

--(연습) 이름이 r로 끝나는 직원 출력 이름, 급여, 직책을 조회(LIKE) !!
SELECT first_name, salary,job_id FROM employees
WHERE first_name LIKE '%r' ORDER BY first_name;

--(연습) 이름이 J로 시작, r로 끝나는 직원 출력 이름, 급여, 직책을 조회(LIKE) !!
SELECT first_name, salary,job_id FROM employees
WHERE first_name LIKE 'J%r' ORDER BY first_name;

--(연습) %개 및 %%를 사용하면 전체 직원을 다 출력(LIKE) !!
SELECT first_name, salary,job_id FROM employees
WHERE first_name LIKE '%%' ORDER BY first_name;

--(연습) 입사 년도가 02년인 사람 이름, 급여, 직책 , 입사일을 다 출력(LIKE) !!
SELECT first_name, salary,job_id,hire_date FROM employees
WHERE hire_date LIKE '02%' ORDER BY first_name;

--(연습) 이름이P로 시작하는 직원 이름이 5자인 직원을 출력 , 급여, 직책을 조회(LIKE) !!
SELECT first_name, salary,job_id FROM employees
WHERE first_name LIKE 'P____' ORDER BY first_name;

--집합 연산자(UNION,INTERSECT,MINUS) **************************************
--위 칸에 맞게 뽑는 데이터를 맞춰줘야한다,
--집합을 다르게 넣고 칸 수만 맞추게되면 위에를 기준으로 맞춰진다.
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
--CREATE TABLE 테이블명(예약어는 불가)
--(
--    컬럼명(예약어는 불가) 데이터타입 [제약조건명(이름)(예약어는 불가)][제약조건],
--    ...
--);
--TABLE 만드는법
CREATE TABLE test
(
    usrid CHAR(5),
    age NUMBER(3),
    name VARCHAR2(20),
    height number(10, 2),
    weight number(10, 2)
);
-----------------------------------------생성되었는데 만들어는진다,,
--TABLE 삭제하는법
DROP TABLE test;
------
CREATE TABLE MYTEST
(
    SEQNO NUMBER PRIMARY KEY,
    USRNAME VARCHAR2(30) NOT NULL,
    USERID CHAR(13) UNIQUE NOT NULL, --크기가 고정일땐 CHAR로 사용
    BIRTH DATE,
    JOINDATE DATE DEFAULT SYSDATE, --현재 시간 그대로를 받고싶을때
    GENDER CHAR(1) CHECK (GENDER IN('F','N'))
);
DROP TABLE MYTEST;
--제약조건을 관리하는 메타테이블의 정보 확인
SELECT * FROM USER_CONSTRAINTS;
--제약조건명 규칙 : 테이블명_컬럼명_제약조건타입         PK:프라이머리키, FK:포링키, NN:NOT NULL, UNIQUE:UQ ...
CREATE TABLE MYTEST
(
    SEQNO NUMBER CONSTRAINT MYTEST_SEQNO_PK PRIMARY KEY,
    USRNAME VARCHAR2(30) CONSTRAINT MYTEST_USERNAME_NN NOT NULL,
    USERID CHAR(13) CONSTRAINT MYTEST_ID_UQNN UNIQUE NOT NULL, --크기가 고정일땐 CHAR로 사용
    BIRTH DATE,
    JOINDATE DATE DEFAULT SYSDATE, --현재 시간 그대로를 받고싶을때
    GENDER CHAR(1) CONSTRAINT MYTEST_GENDER_CK CHECK (GENDER IN('F','N'))
);
--MYTEST 테이블에 데이터 입력

INSERT INTO MYTEST
(SEQNO, USRNAME, USERID, BIRTH, JOINDATE, GENDER) -- 컬럼명
VALUES
(1,'홍길동','201231411123','20/12/31',SYSDATE, 'N'); -- 데이터
-- 다 올릴경우는 컬러명을 빼도 된다,
-- 컬럼명을 생략하 ㄹ경우 데이터는 모두 순서대로 넣어야 한다.
INSERT INTO MYTEST
VALUES
(2,'임꺽정','201231411124','20/12/31',SYSDATE, 'N'); -- 데이터
--DEFAULT로 설정된 컬럼은 생략가능
INSERT INTO MYTEST
(SEQNO, USRNAME, USERID, BIRTH, GENDER) -- 컬럼명
VALUES
(3,'손오공','210512311123','21/05/12', 'F'); -- 데이터
--COMMIT 하면 롤백이 안된다. 롤백은 커밋하기 전에 사용
INSERT INTO MYTEST
(SEQNO, USRNAME, USERID, GENDER) -- 컬럼명
VALUES
(4,'저팔계','210512311133', 'F'); -- 데이터

COMMIT;

--생년월일이 NULL인 데이터를 출력하세요.
SELECT * FROM mytest
WHERE BIRTH IS NULL ORDER BY BIRTH;

-- 성별이 'F'인 데이터를 조회하시오
SELECT * FROM mytest
WHERE GENDER = 'F' ORDER BY BIRTH;

-- 관계를 형성하는 테이블 생성하기
-- 자식 먼저 드랍 후 부모 생성
CREATE TABLE PARENT_1
(
    SEQNO       NUMBER PRIMARY KEY,
    USRNAME  VARCHAR2(20),
    PHONE       VARCHAR2(10)
);
--자식 테이블 생성하기  REFERENCES : 참조하고 있다는걸 의미  PARENT_1(SEQNO) : 어느 테이블과 연결중인지 어느부분에 연결하는지 강조
--  자식테이블(ON DELETE CASCADE) 를 넣어주면 부모가 삭제될시 자식도 같이 삭제됨
CREATE TABLE CHILD_1
(
    NUM_1            NUMBER PRIMARY KEY,
    JUMIN             VARCHAR2(13) NOT NULL,
    ADDRESS       VARCHAR2(50),
    SEQNO           NUMBER REFERENCES PARENT_1(SEQNO) ON DELETE CASCADE
);
DROP TABLE CHILD_1;

--테이블에 데이터 넣기
-- 1) 부모테이블 인설트 삽입
INSERT INTO PARENT_1 VALUES(1,'홍길동','1111');
INSERT INTO PARENT_1 VALUES(2,'저팔계','2222');

-- 2) 자식테이블 인설트 삽입 (마지막은 부모값이랑 연결시켰기 때문에 그 번호에 맞게 연결해줘야한다.)
INSERT INTO CHILD_1 VALUES(11,'111-222','SEOUL',1);
INSERT INTO CHILD_1 VALUES(22,'222-111','DOKU',1);
INSERT INTO CHILD_1 VALUES(33,'333-555','OKASI',2);

SELECT * FROM PARENT_1; --부모
SELECT * FROM CHILD_1;  --자식


