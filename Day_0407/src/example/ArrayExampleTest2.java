package example;

import java.util.Scanner;

public class ArrayExampleTest2 {
	
	public static void main(String[] args) {
		int[] iary = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < iary.length; ++i) {
			System.out.print("값을 입력해주세요 : ");
			System.out.print("iary[" + i + "] == >");
			iary[i] = sc.nextInt();
		}
		
		System.out.println(" ## 입력된 결과");
		for(int i=0; i < iary.length; ++i) {
			System.out.print(iary[i] + " ");
		}
		
		
//		System.out.println();
//		System.out.println("iary의 배열 위치를 바꾸시겟습니까? (y/n)");
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
			System.out.println(" ## 입력된 결과");
			for(int i=0; i < iary.length; ++i) {
				System.out.print(iary[i] + " ");
			}
			

	}
	
}
