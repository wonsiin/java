drop SEQUENCE Comm_seq;                 --덧글 시퀀스
drop SEQUENCE bulletin_seq;                --일정관리 시퀀스
drop table Comm;                                    --덧글
drop table bulletin;                                  --게시판 테이블
drop table business;                                --할일
drop SEQUENCE schedule_seq;                --일정관리 시퀀스
drop table schedule;                                --일정관리
drop table team;                                      --팀 테이블
drop table cooperation;                            --메인 테이블



create table cooperation                          --메인 테이블
(
    usrid VARCHAR2(20) PRIMARY key,     --유저 아이디
    pass number not null,                          --페스워드
    usrname VARCHAR2(20) not null,         --이름
    teamnumber number not null               --팀넘버
);

create table team                                       --팀 테이블
(
    teamnumber number PRIMARY key,      --팀번호
    teamname varchar2(20)                         --팀이름
);
create SEQUENCE schedule_seq;               --일정관리 시퀀스

create table schedule                                --일정관리 테이블
(
    schedule_seq number PRIMARY key,                                     --시퀀스 number pk
    usrid VARCHAR2(20) REFERENCES cooperation(usrid) ON DELETE CASCADE, --id fk
    condition number CHECK (condition in('0','1','2')),                --상태
    important number CHECK (important in('0','1')),                   --중요도
    startdate date not null,                                                         --시작일
    exdate date not null                                                              --끝나는일
);

create table business                                            --할일 테이블
(
    schedule_seq number REFERENCES schedule(schedule_seq) ON DELETE CASCADE,     --시퀀스 fk
    teamnumber number REFERENCES team(teamnumber) ON DELETE CASCADE,            --team fk
    substance varchar2(2000) not null                                                                                --내용
    --담당자
);

create SEQUENCE bulletin_seq;                                --게시판 시퀀스

create table bulletin                                                --게시판 테이블
(
    bulletin_seq number PRIMARY key,     --게시판 시퀀스 pk
    teamnumber number REFERENCES team(teamnumber) ON DELETE CASCADE,            --team fk
    title varchar2(50) not null,                                                                                           --제목
    substance varchar2(2000) not null                                                                                --내용
     --작성자
);
CREATE SEQUENCE Comm_seq;
create table Comm                                                --덧글 테이블
(
    bulletin_seq number REFERENCES bulletin(bulletin_seq) ON DELETE CASCADE,     --게시판 시퀀스 pk 
    title varchar2(50) not null,                                                                                           --제목
    substance1 varchar2(2000) not null,                                                                                --덧글내용
    Comm_seq number not null
     --작성자
);

