package pro1;

import java.util.Scanner;

public class Munje3 {
	public static void main(String[] args) {
		int nun;
		int[] pu= {31,28,31,30,31,30,31,31,30,31,30,31};
		int[] un = {31,29,31,30,31,30,31,31,30,31,30,31};
		int ip;
			
		Scanner sc = new Scanner(System.in);
		System.out.print("�⵵ �Է� : ");
		nun = sc.nextInt();
		System.out.print("�� �Է� : ");
		ip = sc.nextInt();
		
		boolean a = true;
		if(nun % 4 == 0) a = true;
		if(nun % 4 == 0 && nun % 100 == 0) a = false;
		if(nun % 4 == 0 && nun % 100 == 0 && nun % 400 == 0) a = true;
		
		
		if(a == true) {
			for(int i = ip-1; i == ip-1; ++i) {
				System.out.println("�ش� ���� " + un[i] + "�� �Դϴ�.");
			}
		}else {
			for(int i = ip-1; i == ip-1; ++i) {
				System.out.println("�ش� ���� " + pu[i] + "�� �Դϴ�.");				
			}
		}
	}
}
