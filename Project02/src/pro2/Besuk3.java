package pro2;

import java.util.Scanner;

public class Besuk3 {
	public static void main(String[] args) {
		String[] bk = new String[50];
		Scanner sc = new Scanner(System.in);
		int count=0;

			while (true) {
				for(int i = 0; i < bk.length; i++) {
				System.out.print("책 제목을 입력해주세요 : ");
				bk[i] = sc.nextLine();
				if(bk[i].equals("")) {
					print(count);
					for(int j = 0; j < count; j++) {
						System.out.print(bk[j] + " / ");
					}
					return;
				}
				count++;
					for(int j = 0; j < count; j++) {
						System.out.print(bk[j] + " / " );
						
					}
					if(count == bk.length) {
						System.out.println();
						System.out.println("\n** 당신은 총" + count + "권을 읽었습니다.");
						return;
					}
					System.out.println();
					
				}
			}
			
	}
	private static void print(int count) {
		System.out.println("\n** 당신은 총" + count + "권을 읽었습니다.");
	}
}
