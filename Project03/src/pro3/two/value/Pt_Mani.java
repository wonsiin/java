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
				
				System.out.print("���� : ");
				a = sc.next();
				
				switch (a) {
				case "1" : ptIp();		break;
				case "2" : ptS();		break;
				case "3" : ex();		return;
				default : System.out.println("err : �޴��� �ٽ� �����ϼ���");
				}
				sc.nextLine(); 
			}
		}
		public void ptIp() {
			String name;
			String jon;
			int nai;

			System.out.print("�̸��� �Է����ּ��� : ");
			name = sc.next();
			System.out.print("������ �Է��� �ּ��� : ");
			jon = sc.next();
			System.out.print("���̸� �Է����ּ��� : ");
			nai = sc.nextInt();
			System.out.println();
			
			v[count] = new Pt_VO(name,jon,nai);
			count++;
	}
		
		public void ptS() {
			for(int i = 0; i < count; ++i) {
				System.out.println("�̸� : " + v[i].getName() + " ���� : " + v[i].getNai() + " ���� : " + v[i].getJon());
			}
		}
	
	
	
	
	
	
	
	
	
	public void print() {
		System.out.println("===========PetShop===========");
		System.out.println(" 1 . �ֿϵ������	");
		System.out.println(" 2 . �� ü �� ��	");
		System.out.println(" 3 . ���α׷�����	");
		System.out.println("=============================");
	}
	public void ex() {
		System.out.println("**���α׷��� �����մϴ�.");
	}
}
