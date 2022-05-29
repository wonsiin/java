--오픈 게시판 (5월 26일)

drop table reply;
drop SEQUENCE reply_seq;

drop table board;
drop SEQUENCE board_seq;

CREATE TABLE board
(
    boardnum number PRIMARY key,         --게시글번호
    writer VARCHAR2(30) not null,              --글쓴이
    title varchar2(200) not null,                   --제목
    text varchar2(1000) not null,                 --글내용
    hitcount NUMBER DEFAULT 0,              --조회수
    regdate Date DEFAULT sysdate            --글쓴날
);

create SEQUENCE board_seq;

create table reply
(
    replynum number PRIMARY key,                                                                 --댓글 번호
    boardnum number REFERENCES board(boardnum) on DELETE CASCADE,   --관계설정 되어있는 메인글 번호
    writer VARCHAR2(30) not null,                                                                      --댓글 쓴이
    text VARCHAR2(500) not null,                                                                         --댓글 내용
     regdate Date DEFAULT sysdate                                                                        --댓글쓴날
);

create SEQUENCE reply_seq;

--샘플 데이터 넣기
insert into board
(boardnum,writer,title,text,regdate)
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


	UPDATE Board
	SET
	hitcount = hitcount +1
	WHERE
	boardnum = 4;
    
    INSERT INTO Reply
			(replynum,boardnum,writer,text)
			VALUES
			(reply_seq.nextval,1,'슬라임','수루루루루우우우우울');

SELECT*FROM board;
SELECT*FROM reply;
SELECT * FROM BOARD WHERE ;
commit;
SELECT hitcount FROM Board where hitcount += 1;


drop table japanword;
drop SEQUENCE japanword_seq;

create SEQUENCE japanword_seq;
create table japanword
(
    seq number PRIMARY key,                           --일련번호
    word VARCHAR2(200) not null,                                        --단어
    mean VARCHAR2(300) not null,                                       --뜻
    memorize char(1) Default 0 Check (memorize in('0','1'))               --암기여부
);

INSERT INTO japanword (seq, word, mean) VALUES (japanword_seq.nextval, 'おはよう', '아침인사');
INSERT INTO japanword (seq, word, mean) VALUES (japanword_seq.nextval, 'こんにちは', '점심인사');
INSERT INTO japanword (seq, word, mean) VALUES (japanword_seq.nextval, 'こんばんは', '저녁인사');
INSERT INTO japanword (seq, word, mean) VALUES (japanword_seq.nextval, 'あおい', '파랗다');
INSERT INTO japanword (seq, word, mean) VALUES (japanword_seq.nextval, 'あかい', '빨갛다');
INSERT INTO japanword (seq, word, mean) VALUES (japanword_seq.nextval, 'きれいだ', '예쁘다');
INSERT INTO japanword (seq, word, mean) VALUES (japanword_seq.nextval, 'あう', '만나다');
INSERT INTO japanword (seq, word, mean) VALUES (japanword_seq.nextval, 'くる', '오다');
INSERT INTO japanword (seq, word, mean) VALUES (japanword_seq.nextval, 'いく', '가다');
INSERT INTO japanword (seq, word, mean) VALUES (japanword_seq.nextval, 'たべる', '먹다');