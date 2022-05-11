package net.scit.book.ui;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import net.scit.book.service.BookService;
import net.scit.book.service.BookServiceImpl;
import net.scit.book.vo.Book;
import net.scit.book.vo.Magazine;
import net.scit.book.vo.Novel;

public class BookUI {
	Scanner scanner = new Scanner(System.in);
	BookService service = new BookServiceImpl();

	public BookUI() {
		String choice;
		service.getFile();
		
		while(true) {
			menu();
			choice = scanner.nextLine();

			switch(choice) {
			case "1" : input();     break;
			case "2" : output();    break;
			case "3" : selectOne(); break;
			case "4" : delete();    break;
			case "5" : update();    break;
			case "0" : 
				service.setFile();
				System.out.println("** ���α׷��� �����մϴ�.");
				return;
			default : System.out.println("err) �޴��� �ٽ� �����ϼ���");
			}
			
		}
	}
	public void menu() {
		System.out.println("===== [���� ���� ���α׷�] =====");
		System.out.println("        1. ��  ��");
		System.out.println("        2. ��ü ���");
		System.out.println("        3. ��  ȸ");
		System.out.println("        4. ��  ��");
		System.out.println("        5. ��  ��");
		System.out.println("        0. ��  ��");
		System.out.println("---------------------------");
		System.out.print  ("       ����> ");

	}

	// å�� ���� ������ �Է�
	private void input() {
		// ������ �ʿ��� ����
		int year, month;
		String type;
		
		// �Ҽ��� �ʿ��� ����
		String auther, genre;
		
		String choice;
		System.out.println("\n>>> ���� ���� �Է� <<<");
		
		while(true) {
			subMenu();
			choice = scanner.nextLine();
			
			switch(choice) { 
			case "1" : 
			{
				Novel novel = (Novel) inputBook(new Novel(), "input");
				if(novel == null) break;
				
				System.out.print("> �۰� : ");
				auther = scanner.nextLine();
				if(auther.replaceAll("[^0-9]", "")) {
					
				}
				
				System.out.print("> �帣 : ");
				genre = scanner.nextLine();
				System.out.println();
		
				novel.setAuther(auther);
				novel.setGenre(genre);
				
				service.regist(novel);
				
				break;
			}
			case "2" : 
			{
				Magazine magazine = (Magazine)inputBook(new Magazine(), "input");
				if(magazine == null) break;
				
				System.out.print("> ���� : ");
				year = scanner.nextInt();
				
				System.out.print("> �� : ");
				month = scanner.nextInt();
				scanner.nextLine(); // ���� ����
				
				System.out.print("> ����(����/����/�ְ�) : ");
				type = scanner.nextLine();
				System.out.println();
				
				magazine.setYear(year);
				magazine.setMonth(month);
				magazine.setType(type);
				
				service.regist(magazine);
				
				break;
			}
			case "0" : return;
			default : System.out.println("err) �޴��� �ٽ� �����ϼ���");
			}
		}
	}
	
	private void subMenu() {
		System.out.print("1) �Ҽ�   2) ����   0) ���� �޴� : ");
	}
	
	// ����κ� �Է��� ���� �޼ҵ�
	private Book inputBook(Book book, String who){  // �Ҽ�, ����
		// ���� ����
		String id, title, publisher;
				
		System.out.print("> ISBN : ");
		id = scanner.nextLine(); 
	
		// �ߺ� ������ ���� Ȯ��
		if(who.equals("input" )) // �Է��� �ϱ� ���� ȣ���
			if(service.selectOne(id) != null) {
				System.out.println("** ������ ID�� å�� �̹� �ԷµǾ��ֽ��ϴ�.\n");
				return null;
			} 
		else if(who.equals("update" ))
			if(service.selectOne(id) == null) {
				System.out.println("** �ش��ϴ� ID�� å�� �����ϴ�.\n");
				return null;
			} 	
		
		System.out.print("> å���� : ");
		title = scanner.nextLine(); 
		
		System.out.print("> ���ǻ� : ");
		publisher = scanner.nextLine();
		
		book.setId(id);
		book.setTitle(title);
		book.setPublisher(publisher);
		
		return book;
	}
	// ��ü ������ ���
	private void output() {
		System.out.println(">>> ��ü ���� ���� ��� <<<");
		
		List<Book> bookList = service.selectAll();
		
		Iterator<Book> iter = bookList.iterator();
		
		while(iter.hasNext())
			System.out.println(iter.next());

		System.out.println();
	}
	
	private void update() {
		// ������ �ʿ��� ����
		int year, month;
		String type;
		
		// �Ҽ��� �ʿ��� ����
		String auther, genre;
		
		String choice;
		System.out.println("\n>>> ���� ���� ���� <<<");
		
		while(true) {
			subMenu();
			choice = scanner.nextLine();
			
			switch(choice) { 
			case "1" : 
			{
				Novel novel = (Novel) inputBook(new Novel(), "update");
				if(novel == null) break;
				
				System.out.print("> �۰� : ");
				auther = scanner.nextLine();
				
				System.out.print("> �帣 : ");
				genre = scanner.nextLine();
				System.out.println();
		
				novel.setAuther(auther);
				novel.setGenre(genre);
				
				service.update(novel);
				
				break;
			}
			case "2" : 
			{
				Magazine magazine = (Magazine)inputBook(new Magazine(), "update");
				if(magazine == null) break;
				
				System.out.print("> ���� : ");
				year = scanner.nextInt();
				
				System.out.print("> �� : ");
				month = scanner.nextInt();
				scanner.nextLine(); 
				
				System.out.print("> ����(����/����/�ְ�) : ");
				type = scanner.nextLine();
				System.out.println();
				
				magazine.setYear(year);
				magazine.setMonth(month);
				magazine.setType(type);
				
				service.update(magazine);
				
				break;
			}
			case "0" : return;
			default : System.out.println("err) �޴��� �ٽ� �����ϼ���");
			}
		}
	}
	
	// �������� ����
	private void delete() {
		String id, answer;
		System.out.println(">>> ���� ���� ���� <<<");
		
		System.out.print("> ISBN : ");
		id = scanner.nextLine();
		
		// ���翩�� Ȯ��
		Book book = service.selectOne(id);
		if(book == null) {
			System.out.println("** �ش� ���̵��� å�� �����ϴ�.");
			return;
		}
		
		System.out.println(book);
		
		System.out.print("** ���� �����Ͻðڽ��ϱ�? (y/n) "); 
		answer = scanner.nextLine();
		
		if(answer.equals("y")) {
			service.delete(id); // ���ϰ��� ���� �ʾƵ� �ȴ�. ==> 
			System.out.println("** ���� �Ϸ�\n");
			return;
		}
		System.out.println("** ���� �۾��� ��ҵǾ����ϴ�.");

	}
	private void selectOne() {
		String id;
		System.out.println(">>> ���� ���� ��ȸ <<<");
		
		System.out.print("> ISBN : ");
		id = scanner.nextLine();
		
		Book book = service.selectOne(id);
		if(book == null) {
			System.out.println("** �ش� ���̵��� å�� �����ϴ�.");
			return;
		}
		
		System.out.println(book);
	}
}
