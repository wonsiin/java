package pro1;

import java.util.Scanner;

public class Munje5 {
	public static void main(String[] args) {
		int pi=10;
		int sa=3;
		int gan=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("피자는 몇 조각 입니까? : ");
		pi = sc.nextInt();
		System.out.print("사람은 몇 명입니까? : ");
		sa = sc.nextInt();
		gan = pi % sa;
		System.out.println("한 사람당 먹을 수 있는 피자 조각 수 " + pi / sa);
		System.out.println("강아지가 먹는 피자 조각 수 " + gan);
		
	}
}
