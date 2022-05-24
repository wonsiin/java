Create table fitness
(
    Usrid 			varchar2(20) Primary key, --회원id
    usrname	 	varchar2(50) not null,  --회원 이름
    Height 		number(6 , 2) not null,     --키
    weight 		number(6 , 2) not null,     --몸무게
    Bmi 				number (6 , 2) default 0.0,     --신체질량지수
    Bmiresult 	varchar2(20) 
    					check (Bmiresult in('고도비만','중도비만','경도비만','과체중','정상','저체중')) ,      --
    Joindate 		date default sysdate       --가입한 날짜
);