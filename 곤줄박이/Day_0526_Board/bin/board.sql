DROP TABLE reply;
DROP SEQUENCE reply_seq;
DROP TABLE board;
DROP SEQUENCE board_seq;


CREATE TABLE board
(
    boardnum 		NUMBER PRIMARY KEY, --�Խñ۹�ȣ
    writer        	VARCHAR2(30) NOT NULL, --�۾���
    title           VARCHAR2(300) NOT NULL, --����
    text            VARCHAR2(1000) NOT NULL, -- ����
    hitcount    	NUMBER DEFAULT 0,
    regdate        	DATE DEFAULT sysdate  --�ۼ���  
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