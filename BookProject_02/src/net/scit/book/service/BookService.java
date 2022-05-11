package net.scit.book.service;

import java.util.List;

import net.scit.book.vo.Book;

public interface BookService {
	//기본으로 등록, 조회, 삭제, 수정을 입력해줘야한다.( C R U D) (Create)(Read / Retrieve)(Delete)(Update)
	//전체조회는 일반인은 확인못하게 해야한다. admin만 가능하도록
	//등록(Create)
	public int regist(Book book); //정수로 return
	
	//조회 (Read / Retrieve)
	public Book selectOne(String id); //book클레스에 return
	
	//전체조회
	public List<Book> selectAll(); //목록으로  List로 들어있는값 전부 가져오기
	
//	public List<Book> selectNovel();
//	public List<Book> selectPublisher(String publisher);
//	public List<Book> selectSomthing(String publisher);
	
	//삭제(Delete)
	public int delete(String id);
	
	
	//수정(Update)
	public int update(Book book);
	
	
}
