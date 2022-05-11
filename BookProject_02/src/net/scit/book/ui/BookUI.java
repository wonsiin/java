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
		
		while(true) {
			menu();
			choice = scanner.nextLine();
			
			switch (choice) {
			case "1" : input();		break;
			case "2" : output();	break;
			case "3" : selectOne(choice);	break;
			case "4" : delete();	break;
			case "5" : update();	break;
			case "0" : 				return;
			default : System.out.println("err : �޴��� �ٽ� �����ϼ���");
			}
			scanner.nextLine(); 
		}
	}
	public void menu() {
		System.out.println("=====[���� ���� ���α׷�]=====");
		System.out.println("     1. ��   ��");
		System.out.println("     2. ��ü���");
		System.out.println("     3. ��   ȸ");
		System.out.println("     4. ��   ��");
		System.out.println("     5. ��   ��");
		System.out.println("     0. ��   ��");
		System.out.println("======================");
		System.out.print("     ���� > ");
	}
	//å�� ���� ������ �Է�
	private void input() {
		//Book ���� 			��������
//		String id, title, publisher;
		//Magazine ���� 		������ �ʿ��� ����
		int year, month;
		String type;
		//Novel ���� 			�Ҽ��� �ʿ��� ����
		String author, genre;
		
		String choice; //���ο��� ���
		boolean a=false;
		
		System.out.println("\n>>> ���� ���� �Է� <<<");
		while(true) {
			subMenu();
			choice = scanner.nextLine();
			
			
			switch(choice) {
			case "1" : 
				Novel novel = (Novel) inputBook(new Novel());
//				Book temp = inputBook(new Novel());  //����
				if(novel == null) break;
				
				System.out.println(">�� �� : ");
				author = scanner.nextLine();
				System.out.println(">�� �� : ");
				genre = scanner.nextLine();
				
				novel.setAuthor(author);
				novel.setGenre(genre);
				a = true;
				service.regist(novel);
				
				break;
			case "2" : 
				Magazine magazine = (Magazine) inputBook(new Magazine());
				if(magazine == null) break;
				
				System.out.println(">�� �� : ");
				year = scanner.nextInt();
				scanner.nextLine();
				System.out.println("> ��  : ");
				month = scanner.nextInt();
				scanner.nextLine();
				System.out.println(">�� �� (����/����/�ְ�) : ");
				type = scanner.nextLine();

				
				magazine.setYear(year);
				magazine.setMonth(month);
				magazine.setType(type);
				a = false;
				service.regist(magazine);
				scanner.nextLine();
				break;
			case "0" : return;
			default : System.out.println("err : �޴��� �ٽ� �����ϼ���");;
			}
		}
		
	}
	
	//ȣ�� : inputBook(new Novel)
	//		inputBook(new Magazine)
	private Book inputBook(Book book) { //�Ҽ� ������ �� �������ִ�.
		
			String id, title, publisher;
			
			System.out.println(">ISBN : ");
			id = scanner.nextLine();
			
			if(service.selectOne(id) != null) {
				System.out.println("** ������ ID�� å�� �̹� �ԷµǾ��ֽ��ϴ�.");
				return null;
			}
				
			System.out.println(">å ���� : ");	
			title = scanner.nextLine();
			
			System.out.println(">���ǻ� : ");
			publisher = scanner.nextLine();
			
			
			book.setId(id);
			book.setTitle(title);
			book.setPublisher(publisher);
			scanner.nextLine();
			return book;
	}
	
	private void subMenu() {
		System.out.print("1 ) �Ҽ�		\n2 ) ����		\n0 ) �����޴� : \n ");
	}
	private void output() {
		System.out.println(">>>��ü ���� ���� ��� <<<");
		
		List<Book> bookList = service.selectAll();
		
		Iterator<Book> iter = bookList.iterator();
		
		while(iter.hasNext()){
			System.out.println(iter.next());
			
			System.out.println();
		}
		
		service.selectAll();
		
	}
	
	private void selectOne(String choice) {
		subMenu();
		int a = scanner.nextInt();
		if(a == 1) {
			System.out.println(">ISBN : ");
			choice = scanner.nextLine();
			Novel novel = new Novel();
			novel.getId();
			
			System.out.print(service.selectOne(choice));
			System.out.println();
			
		}else if(a == 2) {
			System.out.println(">ISBN : ");
			choice = scanner.nextLine();
			Magazine magazine = new Magazine();
			magazine.getId();
			
			System.out.print(service.selectOne(choice));
			System.out.println();
		}
		scanner.nextLine();
		return;
	}
	private void delete() {
		String id, answer;
		System.out.println(">>> ���� ���� ���� <<< ");
		boolean a;
		
		System.out.println(">ISBN : ");
		id = scanner.nextLine();
		
		//���翩�� Ȯ��
		Book book = service.selectOne(id);
		if(book == null) {
			System.out.println("�ش� ���̵��� å�� �����ϴ�.");
			return;
		}
		System.out.println(book);
		
		System.out.print("** ���� �����Ͻðٽ��ϱ�? : (y / n)");
		answer = scanner.nextLine();
		
		if(answer.equals("y")) {
			service.delete(id); //���ϰ��� ���� �ʾƵ� �ȴ�.
			System.out.println("������ �Ϸ�Ǿ����ϴ�.\n");
			return;
		}else {
			System.out.println("������ ��ҵǾ����ϴ�.");
		}
		
		
//		System.out.println("id�� �Է��� �ּ��� : ");
//		String id = scanner.nextLine();
//			if(service.selectOne(id) != null) {
//				System.out.println("���� �����Ͻðٽ��ϱ�? : ");
//				String tr = scanner.nextLine();
//				if(tr.equals("y")) {
//					service.delete(id);
//				}else {
//					System.out.println("������ ��ҵǾ����ϴ�.");
//				}
//			}else {
//				System.out.println("�ش� id�� �������� �ʽ��ϴ�.");
//			}
//		
//			scanner.nextLine();
	}
	private void update() {
//		Book book = new Book() {};
//		System.out.println("id�� �Է��� �ּ��� : ");
//		String id = scanner.nextLine();
//		
//		
////		if(id.equals("input")) //�Է��� �ϱ� ���� ȣ��
////		if(service.selectOne(id) != null) {
////			System.out.println("������ å�� �ֽ��ϴ�");
////		}
//		
//		if(service.selectOne(id) != null) {
//			updateBook(book);
//		}else {
//			System.out.println("�ش� id�� �������� �ʽ��ϴ�.");
//		}
		
		
		//Book ���� 			��������
//		String id, title, publisher;
		//Magazine ���� 		������ �ʿ��� ����
		int year, month;
		String type;
		//Novel ���� 			�Ҽ��� �ʿ��� ����
		String author, genre;
		
		String choice; //���ο��� ���
		
		System.out.println("\n>>> ���� ���� ���� <<<");
		while(true) {
			subMenu();
			choice = scanner.nextLine();
			
			
			switch(choice) {
			case "1" : 
				Novel novel = (Novel) updateBook(new Novel(),"update");
//				Book temp = inputBook(new Novel());  //����
				if(novel == null) break;
				
				System.out.println(">�� �� : ");
				author = scanner.nextLine();
				System.out.println(">�� �� : ");
				genre = scanner.nextLine();
				
				novel.setAuthor(author);
				novel.setGenre(genre);
				service.update(novel);
				
				break;
			case "2" : 
				Magazine magazine = (Magazine) updateBook(new Magazine(),"update");
				if(magazine == null) break;
				
				System.out.println(">�� �� : ");
				year = scanner.nextInt();
				scanner.nextLine();
				System.out.println("> ��  : ");
				month = scanner.nextInt();
				scanner.nextLine();
				System.out.println(">�� �� (����/����/�ְ�) : ");
				type = scanner.nextLine();

				magazine.setYear(year);
				magazine.setMonth(month);
				magazine.setType(type);
				service.update(magazine);
				break;
			case "0" : return;
			default : System.out.println("err : �޴��� �ٽ� �����ϼ���");;
			}
		}
	}
	
	public void selectOne1() {
		String id;
		System.out.println(">>> ���� ���� ��ȸ <<<");
		
		System.out.println(">ISBN : ");
		id = scanner.nextLine();
		
		Book book = service.selectOne(id);
		if(book == null) {
			System.out.println("�ش� ���̵��� å�� �����ϴ�.");
			return;
		}
		System.out.println(book);
	}
	
	private Book updateBook(Book book, String who){  // �Ҽ�, ����
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
	
}
