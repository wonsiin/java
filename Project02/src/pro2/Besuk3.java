package pro2;

import java.util.Scanner;

public class Besuk3 {
	public static void main(String[] args) {
		String[] bk = new String[50];
		Scanner sc = new Scanner(System.in);
		int count=0;

			while (true) {
				for(int i = 0; i < bk.length; i++) {
				System.out.print("å ������ �Է����ּ��� : ");
				bk[i] = sc.nextLine();
				if(bk[i].equals("")) {
					print(count);
					for(int j = 0; j < count; j++) {
						System.out.print(bk[j] + " / ");
					}
					return;
				}
				count++;
					for(int j = 0; j < count; j++) {
						System.out.print(bk[j] + " / " );
						
					}
					if(count == bk.length) {
						System.out.println();
						System.out.println("\n** ����� ��" + count + "���� �о����ϴ�.");
						return;
					}
					System.out.println();
					
				}
			}
			
	}
	private static void print(int count) {
		System.out.println("\n** ����� ��" + count + "���� �о����ϴ�.");
	}
}
