package example;

import java.util.Scanner;

public class ArrayExampleTest {
	
	public static void main(String[] args) {
		int[] iary = new int[5];
		
		for(int i = 0; i < iary.length; ++i) {
			System.out.print("���� �Է����ּ��� : ");
			Scanner sc = new Scanner(System.in);
			System.out.print("iary[" + i + "] == >"); //���°�� �������� ǥ���Ҽ��ִ�.
			iary[i] = sc.nextInt();

		}
		System.out.println(" ## �Էµ� ���");
		for(int i=0; i < iary.length; ++i) {
			System.out.print(iary[i] + " ");
		}
			

	}
}
