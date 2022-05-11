package pro1;

import java.util.Scanner;

public class Munje2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int je =0;
		boolean a = false,b=false;
		
		System.out.print("정수 값을 입력해 주세요 : ");
		je = sc.nextInt();
		
		if(je % 4 == 0 && je % 5 == 0) {
			System.out.println("4와 5로 나누어 집니다.");
			a = true;
		}else {
			System.out.println("4와 5로 나누어지지 않습니다.");
		}
		if(je % 4 == 0 || je % 5 == 0) {
			System.out.println("4또는 5로 나누어 집니다.");
			b = true;
		}else {
			System.out.println("4또는 5로 나누어지지 않습니다.");
		}
		
		if(a == true && b == true) {
		}else {
			if(je % 5 == 0) {
				System.out.println("5로 나누어 집니다.");
			}
			if(je % 4 == 0) {
				System.out.println("4로 나누어 집니다.");
			}
		}
		
	}
}



