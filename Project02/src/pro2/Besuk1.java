package pro2;

import java.util.Scanner;


public class Besuk1 {
	public static void main(String[] args) {
		String[] name = new String[10];
		String ka ="";
		Scanner sc = new Scanner(System.in);
		int ja=0;

		for(int i = 0; i < name.length; i++) {
			name[i] = "";
		}
			while (true) {
					System.out.println("=============================================");
				for(int j = 0; j < 1; j++) {
					if(name[j] != null) {
						for(int k=0; k < name.length;k++) {
							if(k == ja-1) {
								name[k] = ka;
							}
							System.out.print("[ " + name[k] + " ]" + " ");
						}
					}
				}
				System.out.println();
				System.out.print("�������� �̸� �Է� : ");
				ka = sc.next();
				System.out.println();
				System.out.print("�¼� �Է� (1~10) : ");
				ja = sc.nextInt();
				System.out.println();
			}
			
	}
	
}
