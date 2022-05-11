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
			default : System.out.println("err : 메뉴를 다시 선택하세요");
			}
			scanner.nextLine(); 
		}
	}
	public void menu() {
		System.out.println("=====[도서 관리 프로그램]=====");
		System.out.println("     1. 입   력");
		System.out.println("     2. 전체출력");
		System.out.println("     3. 조   회");
		System.out.println("     4. 삭   제");
		System.out.println("     5. 수   정");
		System.out.println("     0. 종   료");
		System.out.println("======================");
		System.out.print("     선택 > ");
	}
	//책에 대한 정보를 입력
	private void input() {
		//Book 정보 			공통정보
//		String id, title, publisher;
		//Magazine 정보 		잡지에 필요한 정보
		int year, month;
		String type;
		//Novel 정보 			소설에 필요한 정보
		String author, genre;
		
		String choice; //내부에서 사용
		boolean a=false;
		
		System.out.println("\n>>> 도서 성보 입력 <<<");
		while(true) {
			subMenu();
			choice = scanner.nextLine();
			
			
			switch(choice) {
			case "1" : 
				Novel novel = (Novel) inputBook(new Novel());
//				Book temp = inputBook(new Novel());  //가능
				if(novel == null) break;
				
				System.out.println(">작 가 : ");
				author = scanner.nextLine();
				System.out.println(">장 르 : ");
				genre = scanner.nextLine();
				
				novel.setAuthor(author);
				novel.setGenre(genre);
				a = true;
				service.regist(novel);
				
				break;
			case "2" : 
				Magazine magazine = (Magazine) inputBook(new Magazine());
				if(magazine == null) break;
				
				System.out.println(">연 도 : ");
				year = scanner.nextInt();
				scanner.nextLine();
				System.out.println("> 월  : ");
				month = scanner.nextInt();
				scanner.nextLine();
				System.out.println(">종 류 (연간/월간/주간) : ");
				type = scanner.nextLine();

				
				magazine.setYear(year);
				magazine.setMonth(month);
				magazine.setType(type);
				a = false;
				service.regist(magazine);
				scanner.nextLine();
				break;
			case "0" : return;
			default : System.out.println("err : 메뉴를 다시 선택하세요");;
			}
		}
		
	}
	
	//호출 : inputBook(new Novel)
	//		inputBook(new Magazine)
	private Book inputBook(Book book) { //소설 잡지를 다 받을수있다.
		
			String id, title, publisher;
			
			System.out.println(">ISBN : ");
			id = scanner.nextLine();
			
			if(service.selectOne(id) != null) {
				System.out.println("** 동일한 ID의 책이 이미 입력되어있습니다.");
				return null;
			}
				
			System.out.println(">책 제목 : ");	
			title = scanner.nextLine();
			
			System.out.println(">출판사 : ");
			publisher = scanner.nextLine();
			
			
			book.setId(id);
			book.setTitle(title);
			book.setPublisher(publisher);
			scanner.nextLine();
			return book;
	}
	
	private void subMenu() {
		System.out.print("1 ) 소설		\n2 ) 잡지		\n0 ) 이전메뉴 : \n ");
	}
	private void output() {
		System.out.println(">>>전체 도서 정보 출력 <<<");
		
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
		System.out.println(">>> 도서 정보 삭제 <<< ");
		boolean a;
		
		System.out.println(">ISBN : ");
		id = scanner.nextLine();
		
		//존재여부 확인
		Book book = service.selectOne(id);
		if(book == null) {
			System.out.println("해당 아이디의 책이 없습니다.");
			return;
		}
		System.out.println(book);
		
		System.out.print("** 정말 삭제하시겟습니까? : (y / n)");
		answer = scanner.nextLine();
		
		if(answer.equals("y")) {
			service.delete(id); //리턴값을 받지 않아도 된다.
			System.out.println("삭제가 완료되었습니다.\n");
			return;
		}else {
			System.out.println("삭제가 취소되었습니다.");
		}
		
		
//		System.out.println("id를 입력해 주세요 : ");
//		String id = scanner.nextLine();
//			if(service.selectOne(id) != null) {
//				System.out.println("정말 삭제하시겟습니까? : ");
//				String tr = scanner.nextLine();
//				if(tr.equals("y")) {
//					service.delete(id);
//				}else {
//					System.out.println("삭제가 취소되었습니다.");
//				}
//			}else {
//				System.out.println("해당 id는 존재하지 않습니다.");
//			}
//		
//			scanner.nextLine();
	}
	private void update() {
//		Book book = new Book() {};
//		System.out.println("id를 입력해 주세요 : ");
//		String id = scanner.nextLine();
//		
//		
////		if(id.equals("input")) //입력을 하기 위해 호출
////		if(service.selectOne(id) != null) {
////			System.out.println("동일한 책이 있습니다");
////		}
//		
//		if(service.selectOne(id) != null) {
//			updateBook(book);
//		}else {
//			System.out.println("해당 id는 존재하지 않습니다.");
//		}
		
		
		//Book 정보 			공통정보
//		String id, title, publisher;
		//Magazine 정보 		잡지에 필요한 정보
		int year, month;
		String type;
		//Novel 정보 			소설에 필요한 정보
		String author, genre;
		
		String choice; //내부에서 사용
		
		System.out.println("\n>>> 도서 성보 수정 <<<");
		while(true) {
			subMenu();
			choice = scanner.nextLine();
			
			
			switch(choice) {
			case "1" : 
				Novel novel = (Novel) updateBook(new Novel(),"update");
//				Book temp = inputBook(new Novel());  //가능
				if(novel == null) break;
				
				System.out.println(">작 가 : ");
				author = scanner.nextLine();
				System.out.println(">장 르 : ");
				genre = scanner.nextLine();
				
				novel.setAuthor(author);
				novel.setGenre(genre);
				service.update(novel);
				
				break;
			case "2" : 
				Magazine magazine = (Magazine) updateBook(new Magazine(),"update");
				if(magazine == null) break;
				
				System.out.println(">연 도 : ");
				year = scanner.nextInt();
				scanner.nextLine();
				System.out.println("> 월  : ");
				month = scanner.nextInt();
				scanner.nextLine();
				System.out.println(">종 류 (연간/월간/주간) : ");
				type = scanner.nextLine();

				magazine.setYear(year);
				magazine.setMonth(month);
				magazine.setType(type);
				service.update(magazine);
				break;
			case "0" : return;
			default : System.out.println("err : 메뉴를 다시 선택하세요");;
			}
		}
	}
	
	public void selectOne1() {
		String id;
		System.out.println(">>> 도서 정보 조회 <<<");
		
		System.out.println(">ISBN : ");
		id = scanner.nextLine();
		
		Book book = service.selectOne(id);
		if(book == null) {
			System.out.println("해당 아이디의 책이 없습니다.");
			return;
		}
		System.out.println(book);
	}
	
	private Book updateBook(Book book, String who){  // 소설, 잡지
		// 공통 정보
		String id, title, publisher;
				
		System.out.print("> ISBN : ");
		id = scanner.nextLine(); 
	
		// 중복 데이터 유무 확인
		if(who.equals("input" )) // 입력을 하기 위해 호출시
			if(service.selectOne(id) != null) {
				System.out.println("** 동일한 ID의 책이 이미 입력되어있습니다.\n");
				return null;
			} 
		else if(who.equals("update" ))
			if(service.selectOne(id) == null) {
				System.out.println("** 해당하는 ID의 책이 없습니다.\n");
				return null;
			} 	
		
		System.out.print("> 책제목 : ");
		title = scanner.nextLine(); 
		
		System.out.print("> 출판사 : ");
		publisher = scanner.nextLine();
		
		book.setId(id);
		book.setTitle(title);
		book.setPublisher(publisher);
		
		return book;
	}
	
}
