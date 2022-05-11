package pro3.tree.value;

import java.util.Scanner;

public class Un_Manager {
	private Un_VO[] vo;
	int count = 0;
	Scanner sc = new Scanner(System.in);
	
	public Un_Manager(){
		vo =new Un_VO[3];
		String a;
		while(true) {
			print();
			
			System.out.print("선택 : ");
			a = sc.next();
			
			switch (a) {
			case "1" : ipr();		break;
			case "2" : out();		break;
			case "3" : ipg();		break;
			case "4" : cul();		break;
			case "5" : son();		break;
			case "6" : ex();		return;
			default : System.out.println("err : 메뉴를 다시 선택하세요");
			}
			sc.nextLine(); 
		}
	}
	public void ex() {
		System.out.println("**프로그램을 종료합니다.");
	}
	public void ipr() {
		String name;
		String geja;
		int money;

		System.out.print("이름을 입력해주세요 : ");
		name = sc.next();
		System.out.print("계좌를 입력해 주세요 : ");
		geja = sc.next();
			if(geja.charAt(3) != '-') {
				System.out.println("4번째에 - 를 붙여주세요 : ");
				return;
			}
		System.out.print("돈을 입력해주세요 : ");
		money = sc.nextInt();
		System.out.println();
		
		vo[count] = new Un_VO(name, geja, money);
		count++;
}
	public void out() {
			for(int i=0;i < count; i++) {
				System.out.print("성명 : " + vo[i].getName() + " 계좌번호 " + vo[i].getGeja() + " 잔고 " + vo[i].getMoney());
				System.out.println();
		}
	}
	public void ipg() {
		System.out.print("입금할 계좌를 입력 : " );
		String a = sc.next();
		
		for(int i=0;i < count; i++) {
			if(vo[i].getGeja().equals(a)) {
				int no;
				int geja;
				int ii;
				int iii;
					System.out.print("입금금액을 입력 : " );
					geja = sc.nextInt();
					for(int y =0;y < count; ++y) {
						if(vo[i].getGeja().equals(a)) {
							no = y;
							iii = vo[no].getMoney();
							ii = iii + geja;
							vo[no].setMoney(ii);		
						}
					}
			}
		}
	}
	public void cul() {
		System.out.print("출금할 계좌를 입력 : " );
		String a = sc.next();
		
		for(int i=0;i < count; i++) {
			if(vo[i].getGeja().equals(a)) {
				int no;
				int geja;
				int ii;
				int iii;
					System.out.print("출금금액을 입력 : " );
					geja = sc.nextInt();
					for(int y =0;y < count; ++y) {
						if(vo[i].getGeja().equals(a)) {
							no = y;
							iii = vo[no].getMoney();
							if(iii < geja) {
								System.out.println("출금액이 더 많을수 없습니다.");
								return;
							}
							ii = iii - geja;
							vo[no].setMoney(ii);
						}
					}
			}
		}
	}
	public void son() {
		System.out.print("송금할 계좌를 입력 : " );
		String a = sc.next();
		for(int i=0;i < count; i++) {
			if(vo[i].getGeja().equals(a)) {
				int no;
				int no1;
				int geja;
				int iii;
				int jjj;
				int hap;
				String aa;
				no = i;
				jjj = vo[no].getMoney();
				
				System.out.print("송금받을 계좌를 입력 : " );
				aa = sc.next();
				for(int y =0;y < count; ++y) {
					if(vo[y].getGeja().equals(aa)) {
						no1 = y;
						iii = vo[no1].getMoney();
						System.out.print("송금금액 입력 : " );
							geja = sc.nextInt();
							if(jjj < geja) {
								System.out.println("송금금액이 더 클수 없습니다.");
							}
							hap = jjj - geja;
							vo[no].setMoney(hap);
							hap = iii + geja;
							vo[no1].setMoney(hap);			
			}
		}
			}
		}
}
	public static void print() {
		System.out.println();
		System.out.println("=====================================");
		System.out.println(" 1 . 계 좌 등 록");
		System.out.println(" 2 . 전 체 출 력");
		System.out.println(" 3 . 입      금");
		System.out.println(" 4 . 출      금");
		System.out.println(" 5 . 송      금");
		System.out.println(" 6 . 프로그램종료");
		System.out.println("=====================================");
	}
}
