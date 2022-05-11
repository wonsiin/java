package net.scit.book.service;

import java.util.ArrayList;
import java.util.List;

import net.scit.book.vo.Book;

public class BookServiceImpl implements BookService {
	
    List<Book> bookList = new ArrayList<Book>();

    @Override
    public int regist(Book book) {
        boolean result = bookList.add(book);
        if (result)
            return 1;

        return 0;
    }

    @Override
    public Book selectOne(String id){
        Book book = null;

        for (Book temp : bookList){
            if(temp.getId().equals(id))
            book = temp;
            break;
        }
        return book;
    }
        
    @Override
    public List<Book> selectAll(){
        return bookList;
    }

    @Override
    public int delete(String id){
        int no = searchPositionOfBook(id);
        if(no==-1) return 0;
        bookList.remove(no);
        
        return 1;
        
        }
    @Override 
    public int update(Book book) {
    	int no = searchPositionOfBook(book.getId());
    	
    	if (no == -1) return 0;
    	
    	bookList.set(no, book);
    	
    	return 1;
    	
    }
    
    //전달 받은 id를 이용해 bookList에서 데이터를 찾아 위치값을 리턴
    private int searchPositionOfBook(String id) {
    	int no = -1;
    	for(int i=0; i<bookList.size(); ++i) {
    		if(bookList.get(i).getId().equals(id)){
    			return i;
    		}
    	}
    	return no;
    }

	@Override
	public String toString() {
		return "BookServiceImpl [bookList=" + bookList + "]";
	}

    

    }



