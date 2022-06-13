--오픈 게시판 (5월 26일)

drop table reply;
drop SEQUENCE reply_seq;

drop table board;
drop SEQUENCE board_seq;

CREATE TABLE board
(
    boardnum number PRIMARY key,         --게시글번호
    writer VARCHAR2(30) not null,     		   --글쓴이
    title varchar2(200) not null,             	       --제목
    text varchar2(1000) not null,          	       --글내용
    hitcount NUMBER DEFAULT 0,       	       --조회수
    regdate Date DEFAULT sysdate     	       --글쓴날
);

create SEQUENCE board_seq;

create table reply
(
    replynum number PRIMARY key,                                                                 		 --댓글 번호
    boardnum number REFERENCES board(boardnum) on DELETE CASCADE,   --관계설정 되어있는 메인글 번호
    writer VARCHAR2(30) not null,                                                                     		 --댓글 쓴이
    text VARCHAR2(500) not null,                                                                     	   	     --댓글 내용
     regdate Date DEFAULT sysdate                                                                  	     --댓글쓴날
);

create SEQUENCE reply_seq;

--샘플 데이터 넣기
insert into board
(boardnum,writer,title,text)
values
(board_seq.nextval,'홍길동','어제는 비가왔어','우산이 없어서...ㅠㅠ');
--게시글 샘플 데이터
insert into reply
(replynum,boardnum,writer,text)
values
(reply_seq.nextval,1,'전우치','그랬어? 잘됐네~~');
--댓글 샘플 데이터
insert into reply
(replynum,boardnum,writer,text)
values
(reply_seq.nextval,1,'저팔게','카와이소~');

SELECT*FROM board;
SELECT*FROM reply;

SELECT hitcount FROM Board where hitcount += 1;