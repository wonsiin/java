package pro1;

import java.util.Scanner;

public class Munje1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int su;
		
		System.out.println("������ �Է��� �ּ��� : ");
		su = sc.nextInt();
		print(su);
		
	}
	
	public static void print(int a) {
		int aaa = a;
		int aa = aaa / 10;
		aaa = a - aa;
		System.out.println("�������� " + a + "�� �Դϴ�.");
		System.out.println("�ΰ����� " + aa + "�� �Դϴ�.");
		System.out.println("�Ѱ����� " + aaa + "�� �Դϴ�.");
	}
	
}
