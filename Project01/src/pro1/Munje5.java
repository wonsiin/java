package pro1;

import java.util.Scanner;

public class Munje5 {
	public static void main(String[] args) {
		int pi=10;
		int sa=3;
		int gan=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڴ� �� ���� �Դϱ�? : ");
		pi = sc.nextInt();
		System.out.print("����� �� ���Դϱ�? : ");
		sa = sc.nextInt();
		gan = pi % sa;
		System.out.println("�� ����� ���� �� �ִ� ���� ���� �� " + pi / sa);
		System.out.println("�������� �Դ� ���� ���� �� " + gan);
		
	}
}
