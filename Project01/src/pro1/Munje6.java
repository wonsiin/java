package pro1;

import java.util.Scanner;

public class Munje6 {
	public static void main(String[] args) {
		int bak=0;
		int bu=0;
		int co=0;
		int su=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���׸��ư� �� ���� �Դϱ�? : ");
		bak = sc.nextInt();
		
		System.out.println("��� �ð��� �Է� ���ּ���.(��) : ");
		bu = sc.nextInt();
		
		co = bak / 10;
		su = bu / 30;
			if(bu % 30 == 0) {
				System.out.println("���׸��ư� �� �����Դϱ� : " + bak);
				System.out.println("����ð��� �Է� ���ּ���.(��) : " + bu);
				System.out.println("����ð��� �Է� ���ּ���.(��) : " + (bak + (co * su)));
			}else if (bu % 30 != 0) {
				System.out.println("���׸��ư� �� �����Դϱ� : " + bak);
				System.out.println("����ð��� �Է� ���ּ���.(��) : " + bu);
				System.out.println("����ð��� �Է� ���ּ���.(��) : " + (bak + (co * su)));
			}
		
	}
}
