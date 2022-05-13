select * from v$reserved_words
ORDER by keyword;

select count(*) from v$reserved_words
ORDER by keyword; --출력이 몇개인지 확인 가능.

select KEYWORD from v$reserved_words
ORDER by keyword; --키워드 확인