package net.scit.book.service;

import java.util.List;

import net.scit.book.vo.Book;

public interface BookService {
	//�⺻���� ���, ��ȸ, ����, ������ �Է�������Ѵ�.( C R U D) (Create)(Read / Retrieve)(Delete)(Update)
	//��ü��ȸ�� �Ϲ����� Ȯ�θ��ϰ� �ؾ��Ѵ�. admin�� �����ϵ���
	//���(Create)
	public int regist(Book book); //������ return
	
	//��ȸ (Read / Retrieve)
	public Book selectOne(String id); //bookŬ������ return
	
	//��ü��ȸ
	public List<Book> selectAll(); //�������  List�� ����ִ°� ���� ��������
	
//	public List<Book> selectNovel();
//	public List<Book> selectPublisher(String publisher);
//	public List<Book> selectSomthing(String publisher);
	
	//����(Delete)
	public int delete(String id);
	
	
	//����(Update)
	public int update(Book book);
	
	
}
