-- 2022�� 6�� 42�� 1�� ������

-- �ʿ��� ���̺�� �������� ����
DROP table cashitems;
DROP table cashbook;
DROP SEQUENCE cashbook_seq;

Create TABLE cashitems
(
    itemid VARCHAR2(5) PRIMARY key, --지출아이템 일련번호
    itemname VARCHAR2(100) Not Null --지출 아이템 항목명
);

Create TABLE cashbook
(
    seq number PRIMARY key,
    dates DATE DEFAULT sysdate,
    itemid VARCHAR2(5) REFERENCES cashitems(itemid) on DELETE CASCADE,
    detail VARCHAR2(100) not null,
    amount number,
    note VARCHAR2(300)
);

CREATE SEQUENCE cashbook_seq;

commit;

-- �Ʒ��� ���� �����͸� �Է��Ѵ�.
INSERT INTO cashitems VALUES(1, '식비');
INSERT INTO cashitems VALUES(2, '문화예술');
INSERT INTO cashitems VALUES(3, '미용(의복)');
INSERT INTO cashitems VALUES(4, '교통비');
INSERT INTO cashitems VALUES(5, '경조사비');
INSERT INTO cashitems VALUES(6, '금융(저축 등)');
INSERT INTO cashitems VALUES(7, '기타');

commit;


