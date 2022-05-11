package net.scit.book.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import net.scit.book.vo.Book;

public class BookServiceImpl implements BookService {
	List<Book> bookList = new ArrayList<Book>();
	
	@Override
	public int regist(Book book) {
		boolean result = bookList.add(book);
		if(result) return 1;
		
		return 0;
	}
	@Override
	@SuppressWarnings("unchecked")
	public void getFile() {
		File file = null;
		ObjectInputStream ois = null;
		
		try{
			file = new File("book.dat");
			if(!file.exists()) return;
			ois = new ObjectInputStream(new FileInputStream(file));
			bookList = (List<Book>)ois.readObject();
		}catch (IOException | ClassNotFoundException e){
			e.printStackTrace();
		}
		
	}
	@Override
	public void setFile() {
		File file = null;
		ObjectOutputStream oos = null;
		
		try{
			file = new File("book.dat");
			oos = new ObjectOutputStream(new FileOutputStream(file));
			oos.writeObject(bookList);
			oos.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Book selectOne(String id) {
		Book book = null;
		
		for(Book temp : bookList ) {
			if(temp.getId().equals(id)) {
				book = temp;
				break;
			}
		}
		
		return book;
	}

	@Override
	public List<Book> selectAll() {
		return bookList;
	}

	@Override
	public int delete(String id) {
		int no = searchPositionOfBook(id);
		
		if(no == -1) return 0;
		bookList.remove(no);
		
		return 1;
	}

	@Override
	public int update(Book book) {
		int no = searchPositionOfBook(book.getId());
		
		if(no == -1) return 0;
		bookList.set(no, book);
		
		return 1;
	}
	// 전달받은 id를 이용해 bookList에서 데이터를 찾아 위치값을 리턴
	private int searchPositionOfBook(String id) {
		for(int i=0; i<bookList.size(); ++i) {
			if(bookList.get(i).getId().equals(id))
				return i;
		}
			
		return -1;
	}

}
