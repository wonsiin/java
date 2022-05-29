drop SEQUENCE Comm_seq;                 --���� ������
drop SEQUENCE bulletin_seq;                --�Խ��� ������
drop SEQUENCE business_seq;
drop table Comm;                                    --����
drop table bulletin;                                  --�Խ��� ���̺�
drop table business;                                --����
drop SEQUENCE schedule_seq;                --�������� ������
drop table schedule;                                --��������
drop table team;                                      --�� ���̺�
drop table cooperation;                            --���� ���̺�



create table cooperation                                              --���� ���̺�
(
    usrid VARCHAR2(20) PRIMARY key,                        --���� ���̵�
    pass number not null,                                                --�佺����
    usrname VARCHAR2(20) not null,                               --�̸�
    teamnumber number CHECK (teamnumber in('10','20','30','40','50'))        --���ѹ�
);

create table team                                                           --�� ���̺�
(
    teamnumber number PRIMARY key CHECK (teamnumber in('10','20','30','40','50')),   --����ȣ
    teamname varchar2(20)                                             --���̸�
);
create SEQUENCE schedule_seq;                                --�������� ������

create table schedule                                                   --�������� ���̺�
(
    schedule_seq number PRIMARY key,                                     --������ number pk
    usrid VARCHAR2(20) REFERENCES cooperation(usrid) ON DELETE CASCADE, --id fk
    condition number CHECK (condition in('0','1','2')),                --����
    important number CHECK (important in('0','1')),                   --�߿䵵
    startdate date not null,                                                         --������
    exdate date not null,                                                              --��������
    teamnumber number CHECK (teamnumber in('10','20','30','40','50')) --����ȣ
    
);

create SEQUENCE business_seq;                                           --���� ������

create table business                                                           --���� ���̺�
(
    business_seq number PRIMARY key,                                                                              --������ pk
    teamnumber number CHECK (teamnumber in('10','20','30','40','50')),                --team fk
    substance varchar2(2000) not null,                                                                                     --����
    usrid VARCHAR2(20) REFERENCES cooperation(usrid) ON DELETE CASCADE                     --id fk
);



create SEQUENCE bulletin_seq;                                          --�Խ��� ������

create table bulletin                                                             --�Խ��� ���̺�
(
    bulletin_seq number PRIMARY key,
    title varchar2(50) not null,                                                        --����
    substance varchar2(2000) not null                                           --����
);
drop table bulletin_seq;
drop table bulletin;

drop table Comm_seq;
drop table Comm;
INSERT INTO bulletin
	(title, substance)
	Values
	('����','ȥ����');

CREATE SEQUENCE Comm_seq;                                                --���� ������
create table Comm                                                                         --���� ���̺�
(
                                                                                       --�Խ��� ������ pk 
    title varchar2(50) not null,                                                                --����
    substance1 varchar2(2000) not null,                                            --���۳���
    Comm_seq number not null

);

