package net.scit.book.service;

import java.util.List;
import net.scit.book.vo.Book;

public interface BookService {
	// ��� (Create)
	public int regist(Book book);
	
	// ��ȸ (Read/Retrieve)
	public Book selectOne(String id);
	
	// ��ü��ȸ
	public List<Book> selectAll();
	
	// public List<Book> selectNovel();
	
	// ���� (Delete)
	public int delete(String id);
	
	// ���� (Update)
	public int update(Book book);
}







