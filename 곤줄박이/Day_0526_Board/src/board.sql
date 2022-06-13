DROP TABLE reply;
DROP SEQUENCE reply_seq;
DROP TABLE board;
DROP SEQUENCE board_seq;


CREATE TABLE board
(
    boardnum 		NUMBER PRIMARY KEY, --게시글번호
    writer        	VARCHAR2(30) NOT NULL, --글쓴이
    title           VARCHAR2(300) NOT NULL, --제목
    text            VARCHAR2(1000) NOT NULL, -- 내용
    hitcount    	NUMBER DEFAULT 0,
    regdate        	DATE DEFAULT sysdate  --작성일  
);

CREATE SEQUENCE board_seq;

CREATE TABLE reply
(  
    replynum 		NUMBER PRIMARY KEY,
    boardnum 		NUMBER REFERENCES board(boardnum) ON DELETE CASCADE,
    writer  		VARCHAR2(30) NOT NULL,
    text 			VARCHAR2(500) NOT NULL,
    regdate 		DATE DEFAULT sysdate
);

CREATE SEQUENCE reply_seq;