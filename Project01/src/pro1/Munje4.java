package pro1;

import java.util.Scanner;

public class Munje4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int gi;
		int si;
		int sil;
		
		System.out.print("�⺻���� �Է����ּ��� : ");
		gi = sc.nextInt();
		System.out.print("�ʰ� �ٹ� �ð� �Է����ּ��� : ");
		si = sc.nextInt();
		
		double se = gi * 0.1;
		
		si = si * 15000;
		
		sil = gi + si - (int)se;
		System.out.print("�Ǽ��ɾ��� : " + sil);
	}
}
