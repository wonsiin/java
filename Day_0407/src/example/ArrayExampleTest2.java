package example;

import java.util.Scanner;

public class ArrayExampleTest2 {
	
	public static void main(String[] args) {
		int[] iary = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < iary.length; ++i) {
			System.out.print("���� �Է����ּ��� : ");
			System.out.print("iary[" + i + "] == >");
			iary[i] = sc.nextInt();
		}
		
		System.out.println(" ## �Էµ� ���");
		for(int i=0; i < iary.length; ++i) {
			System.out.print(iary[i] + " ");
		}
		
		
//		System.out.println();
//		System.out.println("iary�� �迭 ��ġ�� �ٲٽðٽ��ϱ�? (y/n)");
//		boolean a = sc.nextBoolean();
//		
//		if(a == true) {
			int sa;
			for(int i = 0;i < iary.length/2;++i) {
				sa = iary[i];
				iary[i] = iary[iary.length-(i+1)];
				iary[iary.length-(i+1)] = sa;
			}
//		}
			System.out.println();
			System.out.println(" ## �Էµ� ���");
			for(int i=0; i < iary.length; ++i) {
				System.out.print(iary[i] + " ");
			}
			

	}
	
}
