package net.scit.book.service;

import java.util.ArrayList;
import java.util.List;

import net.scit.book.vo.Book;

public class BookServiceImpl implements BookService {

	List<Book> bookList = new ArrayList<Book>();
	
	
	@Override
	public int regist(Book book) {
		boolean result = bookList.add(book); 	// ��ȯ���� boolean�̱⶧���� boolean��ü�� ��Ƽ�
		if(result) return 1;					// if������ true�� 1���� ��ȯ�ϰ��Ѵ�.
		return 0;								// 1�� �ƴϸ� 0���� ��ȯ
	}
	@Override
	public Book selectOne(String id) {
		Book book = null; //�ʱ�ȭ�� null �� ���� �ϳ��� ����
		
		for(Book temp : bookList) {
			if(temp.getId().equals(id)) {
				book = temp;
				break;
			}
		}
		
		return book; //��ã���� null ã���� ���� ��ȯ
	}
	@Override
	public List<Book> selectAll() {
		return bookList; //bookList�� �������ָ� ��
	}
	@Override
	public int delete(String id) {
		int no = searchPositionOfBook(id); //������ �޼ҵ� �ְ�
		if(no == -1) return 0;				//if������ no���� -1�� ������ �̷���
		bookList.remove(no);				//���� ������ �۾��� �����ض�
		return 1;
	}
	@Override
	public int update(Book book) {
		int no = searchPositionOfBook(book.getId()); // book.getId�� id���� �����´�.
		if(no == -1) return 0;				//if������ no���� -1�� ������ �̷���
		bookList.set(no, book);//���� ������ �۾��� �����ض�
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
	//���޹��� id�� �̿��� booklist���� �����͸� ã�� ��ġ���� ����
	private int searchPositionOfBook(String id) { //��ġ���� ã�� ��Ȱ�� �ϴ� �޼ҵ�
		for(int i = 0; i < bookList.size(); ++i) {
			if(bookList.get(i).getId().equals(id)) {
				return i;				
			}
		}
		return -1;
	}
	
}
