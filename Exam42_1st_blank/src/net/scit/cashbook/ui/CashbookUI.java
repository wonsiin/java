package net.scit.cashbook.ui;

import java.util.List;
import java.util.Scanner;

import net.scit.cashbook.dao.CashbookDAO;
import net.scit.cashbook.vo.CashItem;
import net.scit.cashbook.vo.Cashbook;
import net.scit.cashbook.vo.TotalAmount;

public class CashbookUI{
	Scanner keyin = new Scanner(System.in);
	CashbookDAO dao = new CashbookDAO();
	List<CashItem> itemList;

	public CashbookUI() {
		itemList = dao.selectCashItem();
		String choice;

		while(true) {
			mainMenu();
			choice = keyin.nextLine();

			switch(choice) {
			case "1" : input();  		break;
			case "2" : list();   		break;
			case "3" : delete(); 		break;
			case "4" : statistics(); 	break;
			case "0" : 
				System.out.println("** 프로그램을 종료합니다.");
				System.exit(0);
			default :
				System.out.println("err) 메뉴를 다시 선택해 주세요");
			}
		}
	}

	// 메인 메뉴
	private void mainMenu() {
		System.out.println("===== [ 지출 관리] =====");
		System.out.println("    1) 지출 내역 입력");
		System.out.println("    2) 지출 내역 조회");
		System.out.println("    3) 내역 삭제");
		System.out.println("    4) 지출 통계보기");
		System.out.println("    0) 프로그램 종료"); 
		System.out.println("======================");
		System.out.print  ("      선택> ");
	}

	// 지출 내역 입력
	private void input() {
		String itemid;			 //지출아이템 일련번호
		String detail;			//내용
		int amount;				//금액
		String note;				//비고

		System.out.println("\n<< 지출 내역 입력 >>");
		printItemList();
		try {
			System.out.print("### 항목번호 : ");
			itemid = keyin.nextLine();
			if(!(itemid.length() <= 1 && itemid.length() <= 7)) {
				System.out.println("정확한 데이터를 입력해주세요.");
				return;
			}
			System.out.print("### 자세한 내역 : ");
			detail = keyin.nextLine();
			System.out.print("### 금액 : ");
			amount = keyin.nextInt(); 
			keyin.nextLine();
			System.out.print("### 메모할 내용 : ");
			note= keyin.nextLine();
			Cashbook ca = (new Cashbook(0, null, itemid,detail, amount, note));
			dao.insertCashbook(ca);
			int result=0;
			if(ca != null) {
				result = result+1;
			}
			System.out.println(result +"개의 항목이 저장되었습니다.");
		} catch (Exception e) {
			System.out.println("** 데이터 입력이 잘못 되었습니다.");
			keyin.nextLine();
			return;
		}
	}

	// 지출 목록 출력
	private void printItemList() {
		for (CashItem item : itemList) {
				System.out.print(item + "  /  ");
		}
		System.out.println();
	}

	// 지출 내역 조회
	private void list() {
		
		System.out.println("\n<< 월별 지출 보기 >>");
		List<Cashbook> list;

		String date = inputDate();
		if(date == null) {
			System.out.println("데이터가 잘못 입력되었습니다.");
			return;
		}
		list = dao.ReadCashbookByDate(date);
		for(Cashbook b : list) {
			System.out.println(b + "  /  ");
		}
		
		
		
	}

	// 가계부 삭제
	private void delete() {
		int seq;
		String answer;
		int result = 0;
		
		System.out.println("\n<< 내역 삭제 >>");
		
		String date = inputDate();
		
		if(date.equals(null)) {
			System.out.println("내역이 존재하지 않습니다.");
		}
		List<Cashbook> list = dao.ReadCashbookByDate(date);
		for(Cashbook b : list) {
			System.out.println(b + "  /  ");
		}
		System.out.println("** 삭제할 내역 번호를 입력 : ");
		seq = keyin.nextInt();
		keyin.nextLine();
		
		System.out.println("** 삭제하시겟습니까?(y/n) ");
		answer = keyin.nextLine();
		if(answer.equals("y")) {
			result = dao.deleteCashbook(seq);
			System.out.println(result +"개의 지출 내역이 삭제되었습니다.");
			return;
		}else {
			System.out.println("삭제가 취소되었습니다.");
			return;
		}
	}

	// 지출 통계보기
	private void statistics() {
		System.out.println("\n<< 지출 통계보기 >>");
		String date = inputDate();
		if(date == null) {
			System.out.println("데이터가 잘못 입력되었습니다.");
			return;
		}
		List<TotalAmount> list;
		list = dao.statatics(date);
		TotalAmount totalvo = new TotalAmount();
		String itemname;
		int total = 0;
		
		
		for(int i = 0; i < list.size(); i++) {
			total += list.get(i).getTotal();
		}
			
		for(int i = 0; i < list.size(); i++) {
			int money = list.get(i).getTotal();
			System.out.print(list.get(i));
			System.out.printf(" 비율 : %.2f%% %n", (money/(double)total) *100);
		}
		itemname = totalvo.getItemname();
		totalvo.getTotal();
		
		System.out.printf("** 총 지출 합계 :  %,d 원%n%n", total);
		
//		for(TotalAmount t : list) {
//			System.out.println(t + "  /  ");
//		}

	}
	
	// 년도와 월을 입력받는 메소드 
	// 입력받은 년도와 월을 YY/MM 과 같은 형식으로 만들어 리턴한다.
	// 년도와 월은 길이가 각각 2자리여야 한다.
	private String inputDate() {
		String year, month, date = null ;
		System.out.print("년도를 2자리로 입력하세요 : ");
		year = keyin.nextLine();
		System.out.print("월을 2자리로 입력하세요 : ");
		month = keyin.nextLine();
		if(year.length() == 2 && month.length() == 2) 
			date = year +"/" + month;
			return date;
	}
}

