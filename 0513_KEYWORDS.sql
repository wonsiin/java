select * from v$reserved_words
ORDER by keyword;

select count(*) from v$reserved_words
ORDER by keyword; --����� ����� Ȯ�� ����.

select KEYWORD from v$reserved_words
ORDER by keyword; --Ű���� Ȯ��