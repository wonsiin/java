package pro1;

import java.util.Scanner;

public class Munje1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int su;
		
		System.out.println("가격을 입력해 주세요 : ");
		su = sc.nextInt();
		print(su);
		
	}
	
	public static void print(int a) {
		int aaa = a;
		int aa = aaa / 10;
		aaa = a - aa;
		System.out.println("받은돈은 " + a + "원 입니다.");
		System.out.println("부과세는 " + aa + "원 입니다.");
		System.out.println("총가격은 " + aaa + "원 입니다.");
	}
	
}
