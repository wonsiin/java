package net.scit.book.service;

import java.util.List;
import net.scit.book.vo.Book;

public interface BookService {
	// 등록 (Create)
	public int regist(Book book);
	
	// 조회 (Read/Retrieve)
	public Book selectOne(String id);
	
	// 전체조회
	public List<Book> selectAll();
	
	// public List<Book> selectNovel();
	
	// 삭제 (Delete)
	public int delete(String id);
	
	// 수정 (Update)
	public int update(Book book);
}







