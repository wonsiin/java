package pro1;

import java.util.Scanner;

public class Munje2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int je =0;
		boolean a = false,b=false;
		
		System.out.print("���� ���� �Է��� �ּ��� : ");
		je = sc.nextInt();
		
		if(je % 4 == 0 && je % 5 == 0) {
			System.out.println("4�� 5�� ������ ���ϴ�.");
			a = true;
		}else {
			System.out.println("4�� 5�� ���������� �ʽ��ϴ�.");
		}
		if(je % 4 == 0 || je % 5 == 0) {
			System.out.println("4�Ǵ� 5�� ������ ���ϴ�.");
			b = true;
		}else {
			System.out.println("4�Ǵ� 5�� ���������� �ʽ��ϴ�.");
		}
		
		if(a == true && b == true) {
		}else {
			if(je % 5 == 0) {
				System.out.println("5�� ������ ���ϴ�.");
			}
			if(je % 4 == 0) {
				System.out.println("4�� ������ ���ϴ�.");
			}
		}
		
	}
}



