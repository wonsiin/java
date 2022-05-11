package net.scit.book.service;

import java.util.List;

import net.scit.book.vo.Book;

//CRUD 
public interface BookService {

    // 등록 (Create)
    public int regist(Book book);

    // 조회 (Read)
    public Book selectOne(String id);

    // 전체조회
    public List<Book> selectAll();

    // public List<Book> selectNovel();
    // public List<Book> selectPublisher(String publisher);
    // public List<Book> selectPublisher(String auther); xx

    // 삭제 (Delete)
    public int delete(String id);

    // 수정 (Update)
    public int update(Book book);

    // 수정이 문제가 된다?
}
