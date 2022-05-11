package example;

import java.util.Scanner;

public class ArrayExampleTest3 {
	
	public static void main(String[] args) {
		int[] iary = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < iary.length; ++i) {
			System.out.print("값을 입력해주세요 : ");
			System.out.print("iary[" + i + "] == >");
			iary[i] = sc.nextInt();
		}
		System.out.println(" 교환 전 결과");
			print(iary);
			exchange(iary);
			System.out.println(" 교환 후 결과");
			print(iary);

	}
	
	public static void print(int[] iary) {
		for(int i=0; i < iary.length; ++i) {
			System.out.print(iary[i] + " ");
		}
		System.out.println();
	}
	
	public static void exchange(int[] iary) {
		int sa;
		for(int i = 0;i < iary.length/2;++i) {
			sa = iary[i];
			iary[i] = iary[iary.length-(i+1)];
			iary[iary.length-(i+1)] = sa;
		}
	}
	
}
