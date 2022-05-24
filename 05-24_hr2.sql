
Drop table fitness;
Create table fitness
(
    Usrid varchar2(20) Primary key, --회원id
    usrname varchar2(50) not null,  --회원 이름
    Height number(6 , 2) not null,     --키
    weight number(6 , 2) not null,     --몸무게
    Bmi number (6 , 2) default 0.0,     --신체질량지수
    Bmiresult varchar2(20) 
    check (Bmiresult in('고도비만','중도비만','경도비만','과체중','정상','저체중')) ,      --
    Joindate date default sysdate       --가입한 날짜
);

--날짜 설정
select to_char(sysdate, 'YYYY-MM-DD HH:MI') from dual;


컬럼명
Usrid varchar2(20) Primary key, --가입한 회원ID
usrname varchar2(50) not null -- 가입한 회원의 이름
							-- 총 6자리중 , 소수점2자리
Height number(6 , 2) not null --키cm
Height number(6 , 2) not null --몸무게kg
Bmi number (6 , 2) default 0.0 --BMI(kg) default 값을 안넣어도됨
Bmiresult varchar2(20) check --
Joindate date default sysdate