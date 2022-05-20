DROP TABLE USRADDR;
DROP TABLE USR;

CREATE TABLE USR
(
    usrid varchar2(20) PRIMARY key,
    username VARCHAR2(20) not null
);

CREATE TABLE USRADDR
(
    usrid VARCHAR2(20) UNIQUE REFERENCES usr(usrid) on DELETE CASCADE,
    phone VARCHAR2(20) not null,
    address VARCHAR2(50) not null
);
