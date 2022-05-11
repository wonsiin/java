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
			
			System.out.print("���� : ");
			a = sc.next();
			
			switch (a) {
			case "1" : ipr();		break;
			case "2" : out();		break;
			case "3" : ipg();		break;
			case "4" : cul();		break;
			case "5" : son();		break;
			case "6" : ex();		return;
			default : System.out.println("err : �޴��� �ٽ� �����ϼ���");
			}
			sc.nextLine(); 
		}
	}
	public void ex() {
		System.out.println("**���α׷��� �����մϴ�.");
	}
	public void ipr() {
		String name;
		String geja;
		int money;

		System.out.print("�̸��� �Է����ּ��� : ");
		name = sc.next();
		System.out.print("���¸� �Է��� �ּ��� : ");
		geja = sc.next();
			if(geja.charAt(3) != '-') {
				System.out.println("4��°�� - �� �ٿ��ּ��� : ");
				return;
			}
		System.out.print("���� �Է����ּ��� : ");
		money = sc.nextInt();
		System.out.println();
		
		vo[count] = new Un_VO(name, geja, money);
		count++;
}
	public void out() {
			for(int i=0;i < count; i++) {
				System.out.print("���� : " + vo[i].getName() + " ���¹�ȣ " + vo[i].getGeja() + " �ܰ� " + vo[i].getMoney());
				System.out.println();
		}
	}
	public void ipg() {
		System.out.print("�Ա��� ���¸� �Է� : " );
		String a = sc.next();
		
		for(int i=0;i < count; i++) {
			if(vo[i].getGeja().equals(a)) {
				int no;
				int geja;
				int ii;
				int iii;
					System.out.print("�Աݱݾ��� �Է� : " );
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
		System.out.print("����� ���¸� �Է� : " );
		String a = sc.next();
		
		for(int i=0;i < count; i++) {
			if(vo[i].getGeja().equals(a)) {
				int no;
				int geja;
				int ii;
				int iii;
					System.out.print("��ݱݾ��� �Է� : " );
					geja = sc.nextInt();
					for(int y =0;y < count; ++y) {
						if(vo[i].getGeja().equals(a)) {
							no = y;
							iii = vo[no].getMoney();
							if(iii < geja) {
								System.out.println("��ݾ��� �� ������ �����ϴ�.");
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
		System.out.print("�۱��� ���¸� �Է� : " );
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
				
				System.out.print("�۱ݹ��� ���¸� �Է� : " );
				aa = sc.next();
				for(int y =0;y < count; ++y) {
					if(vo[y].getGeja().equals(aa)) {
						no1 = y;
						iii = vo[no1].getMoney();
						System.out.print("�۱ݱݾ� �Է� : " );
							geja = sc.nextInt();
							if(jjj < geja) {
								System.out.println("�۱ݱݾ��� �� Ŭ�� �����ϴ�.");
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
		System.out.println(" 1 . �� �� �� ��");
		System.out.println(" 2 . �� ü �� ��");
		System.out.println(" 3 . ��      ��");
		System.out.println(" 4 . ��      ��");
		System.out.println(" 5 . ��      ��");
		System.out.println(" 6 . ���α׷�����");
		System.out.println("=====================================");
	}
}
