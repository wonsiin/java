package pro3.one.value;

import java.util.Scanner;

public class Gek1_Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		String id;
		int pw;
		String name;
		Gek1_VO vo = new Gek1_VO();

		while (true) {
			print();
			System.out.print("���� : " );
			a = sc.nextInt();
			if(a == 1) {
				System.out.print("ID �Է� : " );
					id = sc.next();
					vo.setId(id);
				System.out.print("PW �Է� : " );
					pw = sc.nextInt();
					vo.setPw(pw);
				System.out.print("�̸� �Է� : " );
					name = sc.next();
					vo.setName(name);
			}
			if(a == 2) {
				System.out.println("ID : " +  vo.getId());
				System.out.println("PW : " +  vo.getPw());
				System.out.println("�̸� : " +  vo.getName());
				break;
			}
		}

	}
	
	
	
	public static void print() {
		System.out.println("========================");
		System.out.println(" 1 . �� ��");
		System.out.println(" 2 . �� ��");
		System.out.println("========================");

	}
}
