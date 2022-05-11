package net.scit.book.service;

import java.util.ArrayList;
import java.util.List;

import net.scit.book.vo.Book;

public class BookServiceImpl implements BookService {

	List<Book> bookList = new ArrayList<Book>();
	
	
	@Override
	public int regist(Book book) {
		boolean result = bookList.add(book); 	// 반환값이 boolean이기때문에 boolean객체에 담아서
		if(result) return 1;					// if문으로 true면 1값을 반환하게한다.
		return 0;								// 1이 아니면 0값을 반환
	}
	@Override
	public Book selectOne(String id) {
		Book book = null; //초기화는 null 로 변수 하나를 생성
		
		for(Book temp : bookList) {
			if(temp.getId().equals(id)) {
				book = temp;
				break;
			}
		}
		
		return book; //못찾으면 null 찾으면 값을 반환
	}
	@Override
	public List<Book> selectAll() {
		return bookList; //bookList를 리턴해주면 끝
	}
	@Override
	public int delete(String id) {
		int no = searchPositionOfBook(id); //변수에 메소드 넣고
		if(no == -1) return 0;				//if문으로 no값이 -1로 왔으면 이렇게
		bookList.remove(no);				//값이 있으면 작업을 이행해라
		return 1;
	}
	@Override
	public int update(Book book) {
		int no = searchPositionOfBook(book.getId()); // book.getId로 id값을 가져온다.
		if(no == -1) return 0;				//if문으로 no값이 -1로 왔으면 이렇게
		bookList.set(no, book);//값이 있으면 작업을 이행해라
		return 1;
		
//		for(int i = 0; i < bookList.size(); ++i) {
//			Book b = bookList.get(i);
//			if(b.getId().equals(book.getId())) {
//				bookList.set(i,book);
//				return 1;				
//			}
//		}
//		return 0;
	}
	//전달받은 id를 이용해 booklist에서 데이터를 찾아 위치값을 리턴
	private int searchPositionOfBook(String id) { //위치값만 찾는 역활을 하는 메소드
		for(int i = 0; i < bookList.size(); ++i) {
			if(bookList.get(i).getId().equals(id)) {
				return i;				
			}
		}
		return -1;
	}
	
}
