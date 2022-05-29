--���� �Խ��� (5�� 26��)

drop table reply;
drop SEQUENCE reply_seq;

drop table board;
drop SEQUENCE board_seq;

CREATE TABLE board
(
    boardnum number PRIMARY key,         --�Խñ۹�ȣ
    writer VARCHAR2(30) not null,              --�۾���
    title varchar2(200) not null,                   --����
    text varchar2(1000) not null,                 --�۳���
    hitcount NUMBER DEFAULT 0,              --��ȸ��
    regdate Date DEFAULT sysdate            --�۾���
);

create SEQUENCE board_seq;

create table reply
(
    replynum number PRIMARY key,                                                                 --��� ��ȣ
    boardnum number REFERENCES board(boardnum) on DELETE CASCADE,   --���輳�� �Ǿ��ִ� ���α� ��ȣ
    writer VARCHAR2(30) not null,                                                                      --��� ����
    text VARCHAR2(500) not null,                                                                         --��� ����
     regdate Date DEFAULT sysdate                                                                        --��۾���
);

create SEQUENCE reply_seq;

--���� ������ �ֱ�
insert into board
(boardnum,writer,title,text,regdate)
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


	UPDATE Board
	SET
	hitcount = hitcount +1
	WHERE
	boardnum = 4;
    
    INSERT INTO Reply
			(replynum,boardnum,writer,text)
			VALUES
			(reply_seq.nextval,1,'������','������������');

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
    seq number PRIMARY key,                           --�Ϸù�ȣ
    word VARCHAR2(200) not null,                                        --�ܾ�
    mean VARCHAR2(300) not null,                                       --��
    memorize char(1) Default 0 Check (memorize in('0','1'))               --�ϱ⿩��
);

INSERT INTO japanword (seq, word, mean) VALUES (japanword_seq.nextval, '���Ϫ誦', '��ħ�λ�');
INSERT INTO japanword (seq, word, mean) VALUES (japanword_seq.nextval, '����˪���', '�����λ�');
INSERT INTO japanword (seq, word, mean) VALUES (japanword_seq.nextval, '����Ъ��', '�����λ�');
INSERT INTO japanword (seq, word, mean) VALUES (japanword_seq.nextval, '������', '�Ķ���');
INSERT INTO japanword (seq, word, mean) VALUES (japanword_seq.nextval, '������', '������');
INSERT INTO japanword (seq, word, mean) VALUES (japanword_seq.nextval, '���쪤��', '���ڴ�');
INSERT INTO japanword (seq, word, mean) VALUES (japanword_seq.nextval, '����', '������');
INSERT INTO japanword (seq, word, mean) VALUES (japanword_seq.nextval, '����', '����');
INSERT INTO japanword (seq, word, mean) VALUES (japanword_seq.nextval, '����', '����');
INSERT INTO japanword (seq, word, mean) VALUES (japanword_seq.nextval, '���٪�', '�Դ�');