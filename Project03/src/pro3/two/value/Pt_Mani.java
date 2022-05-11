package pro3.two.value;

import java.util.Scanner;

public class Pt_Mani {
	private Pt_VO[] v;
	Scanner sc = new Scanner(System.in);
	
	int count = 0;
	
		public Pt_Mani() {
			v = new Pt_VO[3];
			String a;
			while(true) {
				print();
				
				System.out.print("선택 : ");
				a = sc.next();
				
				switch (a) {
				case "1" : ptIp();		break;
				case "2" : ptS();		break;
				case "3" : ex();		return;
				default : System.out.println("err : 메뉴를 다시 선택하세요");
				}
				sc.nextLine(); 
			}
		}
		public void ptIp() {
			String name;
			String jon;
			int nai;

			System.out.print("이름을 입력해주세요 : ");
			name = sc.next();
			System.out.print("종류를 입력해 주세요 : ");
			jon = sc.next();
			System.out.print("나이를 입력해주세요 : ");
			nai = sc.nextInt();
			System.out.println();
			
			v[count] = new Pt_VO(name,jon,nai);
			count++;
	}
		
		public void ptS() {
			for(int i = 0; i < count; ++i) {
				System.out.println("이름 : " + v[i].getName() + " 나이 : " + v[i].getNai() + " 종류 : " + v[i].getJon());
			}
		}
	
	
	
	
	
	
	
	
	
	public void print() {
		System.out.println("===========PetShop===========");
		System.out.println(" 1 . 애완동물등록	");
		System.out.println(" 2 . 전 체 출 력	");
		System.out.println(" 3 . 프로그램종료	");
		System.out.println("=============================");
	}
	public void ex() {
		System.out.println("**프로그램을 종료합니다.");
	}
}
