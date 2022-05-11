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
				System.out.println("** 프로그램을 종료합니다.");
				return;
			default : System.out.println("err) 메뉴를 다시 선택하세요");
			}
			
		}
	}
	public void menu() {
		System.out.println("===== [도서 관리 프로그램] =====");
		System.out.println("        1. 입  력");
		System.out.println("        2. 전체 출력");
		System.out.println("        3. 조  회");
		System.out.println("        4. 삭  제");
		System.out.println("        5. 수  정");
		System.out.println("        0. 종  료");
		System.out.println("---------------------------");
		System.out.print  ("       선택> ");

	}

	// 책에 대한 정보를 입력
	private void input() {
		// 잡지에 필요한 정보
		int year, month;
		String type;
		
		// 소설에 필요한 정보
		String auther, genre;
		
		String choice;
		System.out.println("\n>>> 도서 정보 입력 <<<");
		
		while(true) {
			subMenu();
			choice = scanner.nextLine();
			
			switch(choice) { 
			case "1" : 
			{
				Novel novel = (Novel) inputBook(new Novel(), "input");
				if(novel == null) break;
				
				System.out.print("> 작가 : ");
				auther = scanner.nextLine();
				if(auther.replaceAll("[^0-9]", "")) {
					
				}
				
				System.out.print("> 장르 : ");
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
				
				System.out.print("> 연도 : ");
				year = scanner.nextInt();
				
				System.out.print("> 월 : ");
				month = scanner.nextInt();
				scanner.nextLine(); // 버퍼 비우기
				
				System.out.print("> 종류(연간/월간/주간) : ");
				type = scanner.nextLine();
				System.out.println();
				
				magazine.setYear(year);
				magazine.setMonth(month);
				magazine.setType(type);
				
				service.regist(magazine);
				
				break;
			}
			case "0" : return;
			default : System.out.println("err) 메뉴를 다시 선택하세요");
			}
		}
	}
	
	private void subMenu() {
		System.out.print("1) 소설   2) 잡지   0) 이전 메뉴 : ");
	}
	
	// 공통부분 입력을 위한 메소드
	private Book inputBook(Book book, String who){  // 소설, 잡지
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
	// 전체 데이터 출력
	private void output() {
		System.out.println(">>> 전체 도서 정보 출력 <<<");
		
		List<Book> bookList = service.selectAll();
		
		Iterator<Book> iter = bookList.iterator();
		
		while(iter.hasNext())
			System.out.println(iter.next());

		System.out.println();
	}
	
	private void update() {
		// 잡지에 필요한 정보
		int year, month;
		String type;
		
		// 소설에 필요한 정보
		String auther, genre;
		
		String choice;
		System.out.println("\n>>> 도서 정보 수정 <<<");
		
		while(true) {
			subMenu();
			choice = scanner.nextLine();
			
			switch(choice) { 
			case "1" : 
			{
				Novel novel = (Novel) inputBook(new Novel(), "update");
				if(novel == null) break;
				
				System.out.print("> 작가 : ");
				auther = scanner.nextLine();
				
				System.out.print("> 장르 : ");
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
				
				System.out.print("> 연도 : ");
				year = scanner.nextInt();
				
				System.out.print("> 월 : ");
				month = scanner.nextInt();
				scanner.nextLine(); 
				
				System.out.print("> 종류(연간/월간/주간) : ");
				type = scanner.nextLine();
				System.out.println();
				
				magazine.setYear(year);
				magazine.setMonth(month);
				magazine.setType(type);
				
				service.update(magazine);
				
				break;
			}
			case "0" : return;
			default : System.out.println("err) 메뉴를 다시 선택하세요");
			}
		}
	}
	
	// 도서정보 삭제
	private void delete() {
		String id, answer;
		System.out.println(">>> 도서 정보 삭제 <<<");
		
		System.out.print("> ISBN : ");
		id = scanner.nextLine();
		
		// 존재여부 확인
		Book book = service.selectOne(id);
		if(book == null) {
			System.out.println("** 해당 아이디의 책이 없습니다.");
			return;
		}
		
		System.out.println(book);
		
		System.out.print("** 정말 삭제하시겠습니까? (y/n) "); 
		answer = scanner.nextLine();
		
		if(answer.equals("y")) {
			service.delete(id); // 리턴값을 받지 않아도 된다. ==> 
			System.out.println("** 삭제 완료\n");
			return;
		}
		System.out.println("** 삭제 작업이 취소되었습니다.");

	}
	private void selectOne() {
		String id;
		System.out.println(">>> 도서 정보 조회 <<<");
		
		System.out.print("> ISBN : ");
		id = scanner.nextLine();
		
		Book book = service.selectOne(id);
		if(book == null) {
			System.out.println("** 해당 아이디의 책이 없습니다.");
			return;
		}
		
		System.out.println(book);
	}
}
