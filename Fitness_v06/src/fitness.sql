Create table fitness
(
    Usrid 			varchar2(20) Primary key, --ȸ��id
    usrname	 	varchar2(50) not null,  --ȸ�� �̸�
    Height 		number(6 , 2) not null,     --Ű
    weight 		number(6 , 2) not null,     --������
    Bmi 				number (6 , 2) default 0.0,     --��ü��������
    Bmiresult 	varchar2(20) 
    					check (Bmiresult in('����','�ߵ���','�浵��','��ü��','����','��ü��')) ,      --
    Joindate 		date default sysdate 
    
    --������ ��¥.........................................
);
