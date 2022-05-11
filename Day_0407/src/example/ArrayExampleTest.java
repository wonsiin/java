package example;

import java.util.Scanner;

public class ArrayExampleTest {
	
	public static void main(String[] args) {
		int[] iary = new int[5];
		
		for(int i = 0; i < iary.length; ++i) {
			System.out.print("값을 입력해주세요 : ");
			Scanner sc = new Scanner(System.in);
			System.out.print("iary[" + i + "] == >"); //몇번째에 넣을건지 표시할수있다.
			iary[i] = sc.nextInt();

		}
		System.out.println(" ## 입력된 결과");
		for(int i=0; i < iary.length; ++i) {
			System.out.print(iary[i] + " ");
		}
			

	}
}
