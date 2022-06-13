--���� �Խ��� (5�� 26��)

drop table reply;
drop SEQUENCE reply_seq;

drop table board;
drop SEQUENCE board_seq;

CREATE TABLE board
(
    boardnum number PRIMARY key,         --�Խñ۹�ȣ
    writer VARCHAR2(30) not null,     		   --�۾���
    title varchar2(200) not null,             	       --����
    text varchar2(1000) not null,          	       --�۳���
    hitcount NUMBER DEFAULT 0,       	       --��ȸ��
    regdate Date DEFAULT sysdate     	       --�۾���
);

create SEQUENCE board_seq;

create table reply
(
    replynum number PRIMARY key,                                                                 		 --��� ��ȣ
    boardnum number REFERENCES board(boardnum) on DELETE CASCADE,   --���輳�� �Ǿ��ִ� ���α� ��ȣ
    writer VARCHAR2(30) not null,                                                                     		 --��� ����
    text VARCHAR2(500) not null,                                                                     	   	     --��� ����
     regdate Date DEFAULT sysdate                                                                  	     --��۾���
);

create SEQUENCE reply_seq;

--���� ������ �ֱ�
insert into board
(boardnum,writer,title,text)
values
(board_seq.nextval,'ȫ�浿','������ �񰡿Ծ�','����� ���...�Ф�');
--�Խñ� ���� ������
insert into reply
(replynum,boardnum,writer,text)
values
(reply_seq.nextval,1,'����ġ','�׷���? �ߵƳ�~~');
--��� ���� ������
insert into reply
(replynum,boardnum,writer,text)
values
(reply_seq.nextval,1,'���Ȱ�','ī���̼�~');

SELECT*FROM board;
SELECT*FROM reply;

SELECT hitcount FROM Board where hitcount += 1;