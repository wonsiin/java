package pro1;

import java.util.Scanner;

public class Munje4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int gi;
		int si;
		int sil;
		
		System.out.print("기본급을 입력해주세요 : ");
		gi = sc.nextInt();
		System.out.print("초과 근무 시간 입력해주세요 : ");
		si = sc.nextInt();
		
		double se = gi * 0.1;
		
		si = si * 15000;
		
		sil = gi + si - (int)se;
		System.out.print("실수령액은 : " + sil);
	}
}
