drop SEQUENCE Comm_seq;                 --���� ������
drop SEQUENCE bulletin_seq;                --�Խ��� ������
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
    teamnumber REFERENCES team(teamnumber) ON DELETE CASCADE        --���ѹ�
);

create table team                                                           --�� ���̺�
(
    teamnumber number PRIMARY key,                        --����ȣ
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
    teamnumber REFERENCES team(teamnumber) ON DELETE CASCADE --����ȣfk
    
);

create SEQUENCE business_seq;                                           --���� ������

create table business                                                           --���� ���̺�
(
    business_seq number PRIMARY key,                                                                              --������ pk
    teamnumber number REFERENCES team(teamnumber) ON DELETE CASCADE,                --team fk
    substance varchar2(2000) not null,                                                                                     --����
    usrid VARCHAR2(20) REFERENCES cooperation(usrid) ON DELETE CASCADE                     --id fk
);

create SEQUENCE bulletin_seq;                                          --�Խ��� ������

create table bulletin                                                             --�Խ��� ���̺�
(
    bulletin_seq number PRIMARY key,                          --�Խ��� ������ pk
    teamnumber number REFERENCES team(teamnumber) ON DELETE CASCADE,       --team fk
    title varchar2(50) not null,                                                        --����
    substance varchar2(2000) not null,                                           --����
    usrid VARCHAR2(20) REFERENCES cooperation(usrid) ON DELETE CASCADE           --id fk
);
CREATE SEQUENCE Comm_seq;                                                --���� ������
create table Comm                                                                         --���� ���̺�
(
    bulletin_seq number REFERENCES bulletin(bulletin_seq) ON DELETE CASCADE,                                                                                       --�Խ��� ������ pk 
    title varchar2(50) not null,                                                                --����
    substance1 varchar2(2000) not null,                                            --���۳���
    Comm_seq number not null,
    usrid VARCHAR2(20) REFERENCES cooperation(usrid) ON DELETE CASCADE
);