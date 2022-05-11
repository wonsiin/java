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
	Scanner sc = new Scanner(System.in);
	BookService service = new BookServiceImpl();
	
	Book bg = new Magazine();
	Magazine mg = new Magazine();
	Novel nv = new Novel();

	public BookUI() {
		String choice;
		while (true) {
			menu();
			choice = sc.next();
			sc.nextLine();
			switch (choice) {
			case "1":
				input();
				break;
			case "2":
				output();
				break;
			case "3":
				selectOne();
				break;
			case "4":
				delete();
				break;
			case "5":
				update();
				break;
			case "0":
				System.out.println("종료합니다.");
				return;
			default:
				System.out.println("err) 메뉴를 다시 선택하세요 !");
				//
			}
		}

	}

	public void menu() {
		System.out.println("=====Book Manager=====");
		System.out.println("1. Put");
		System.out.println("2. Whole print");
		System.out.println("3. View");
		System.out.println("4. Delete");
		System.out.println("5. Modify");
		System.out.println("0. Quit");
		System.out.println("=====================");
		
	}
	// 책에 대한 정보를 입력
	private void input() {
		
		//공통 정보
		String id, title, publisher,choice;
		//잡지에 필요한 정보
		int year, month;
		String type;
		//소설에 필요한 정보
		String auther, genre;
		System.out.println("\n>>도서 정보 입력<<");
		while(true) {
			subMenu();
			choice = sc.nextLine();
			switch(choice) {
			case "1" : 
				
//	Novel temp = (Novel) inputBook(new Novel());
//	if(temp == null) break;
//	System.out.println("> 작가 :");
//	auther = sc.nextLine();
//	System.out.println("> 동료 :");
//	genre = sc.nextLine();
//	System.out.println();
//	novel.setAuther(auther);
//	novel.setGenre(genre);
//	service regist(novel);
				
				if(enroll()==-1) break;
				
				System.out.println(">장르	 : ");
				genre = sc.nextLine();	
				System.out.println(">작가 : ");
				auther = sc.nextLine();
				
				Novel novel = new Novel(auther, genre);
				novel.setId(bg.getId());
				novel.setPublisher(bg.getPublisher());
				novel.setTitle(bg.getTitle());
				
				service.regist(novel);
				
				return;
				
				
			case "2" : 
				if(enroll()==-1) return;
				
				System.out.println(">Type : ");
				type = sc.nextLine();
				System.out.println(">연도 : ");
				year = sc.nextInt();
				sc.nextLine();
				System.out.println(">월 : ");
				month = sc.nextInt();
				sc.nextLine();
				
				Magazine mag = new Magazine(year, month, type);
				mag.setId(bg.getId());
				mag.setTitle(bg.getTitle());
				mag.setPublisher(bg.getPublisher());
				
				service.regist(mag);
				
			case "0" : return;
			default : System.out.println("메뉴 다시 입력 하세요요요요요요요요");break;
			}
		}
	}	

	private void subMenu() {
		System.out.println("1) 소설    2) 잡지    0) 이전 메뉴로 : ");
		
	}
	
	
//	private Book inputBook(Book book) {
//		String id, title, publisher;
//		
//		System.out.println(">ISBN : ");
//		id=sc.nextLine();
//		
//		if(service.selectOne(id)!= null) {
//			System.out.println("똑같은 아이디가 이미 입력 되었습니다.");
//			return null;
//		}
		
//		System.out.println(">책 제목 : ");
//		title=sc.nextLine();
//		System.out.println(">출판사 : ");
//		publisher=sc.nextLine();
		
//		book.setId(id);
//		book.setTitle(title);
//		book.setPublisher(publisher);
//	
//		
//	}
	
	
	private int enroll() {
		System.out.println("ID : ");
		bg.setId(sc.nextLine());
		
		if(service.selectOne(bg.getId()) != null) {
			System.out.println("동일한 아이디가 존재한다요.");
			return -1;
			
		}					
		
		System.out.println("퍼블리셔 : ");
		bg.setPublisher(sc.nextLine());
		System.out.println("제목 : ");
		bg.setTitle(sc.nextLine());
		return 0;
	}

	private void update() {
		String id;
		System.out.println("ID : ");
		id = sc.nextLine();
		
		
		if(service.selectOne(id).toString().contains("genre")) {
				System.out.println("소설 입니다.");
				nv.setId(bg.getId());
				nv.setTitle(sc.nextLine());
				nv.setPublisher(sc.nextLine());
				nv.setGenre(sc.nextLine());
				nv.setAuthor(sc.nextLine());
				service.update(nv);
		}else {
				System.out.println("잡지 입니다.");
				mg.setId(bg.getId());
				mg.setTitle(sc.nextLine());
				mg.setPublisher(sc.nextLine());
				mg.setYear(sc.nextInt());
				mg.setMonth(sc.nextInt());
				mg.settype(sc.nextLine());
				service.update(mg);
			}
			
			
			
		}
		
			
			
//			service.toString().contains(")
		
		
		// TODO Auto-generated method stub
		
	
//	public int update(Book book) {
//    	int no = searchPositionOfBook(book.getId());
//    	
//    	if (no == -1) return 0;
//    	
//    	bookList.set(no, book);
//    	
//    	return 1;
//    	
//    }
//    
//    //전달 받은 id를 이용해 bookList에서 데이터를 찾아 위치값을 리턴
//    private int searchPositionOfBook(String id) {
//    	int no = -1;
//    	for(int i=0; i<bookList.size(); ++i) {
//    		if(bookList.get(i).getId().equals(id)){
//    			return i;
//    		}
//    	}
//    	return no;
//    }


	private void delete() {
		String no;
		System.out.println("ID : ");
		bg.setId(sc.nextLine());
		
		
// Book book = service.selectOne(id);
// if(book == null){
//		System.out.println("해당 아이디의 책이 없다");
//		return;
//	}
//	System.out.println(book);
//	System.out.println("정말 삭제하시겠습니까? (y/n) ");
//	answer = sc.nextLine();
//	
//	if(answer.equals("Y")) {
//		service.delete(id);
//		System.out.println("** 삭제 완료 \n");
//		return;
//	}
//		System.out.println("** 삭제 작업이 취소되었습니다.");
		
		if(service.selectOne(bg.getId()) != null) {
			System.out.println(service.selectOne(bg.getId()).toString());
			System.out.println("혼또니 삭제? (y,n)");
			no=sc.nextLine();
			if(no.equals("y")) {
				service.delete(bg.getId());
				System.out.println("삭제 했더용");
			}else{
				System.out.println("삭제 안할거에용");
			}
		}else {
			System.out.println("똑같은 아이디가 없더용 ");
		}
		
		// TODO Auto-generated method stub
		
	}

	private void selectOne() {
		System.out.println("아이디 입력해주세용 : ");
		bg.setId(sc.nextLine());
		if(service.selectOne(bg.getId()) != null) {
			System.out.println(service.selectOne(bg.getId()).toString());
		}
		
	}

	private void output() {
		System.out.println(">>전체 출력 <<");
		List<Book> bookList = service.selectAll();
		
		Iterator<Book> iter = bookList.iterator();
		
		while(iter.hasNext())
			System.out.println(iter.next());
		
		System.out.println();
		
	}


}
