package pro1;

import java.util.Scanner;

public class Munje7 {
	public static void main(String[] args) {
		int a;
		String b = "제안A";
		String d = "제안B";
		String[] c = new String[11];
		int q1 = 0;
		int w2 = 0;
		int count1 = 0;
		int count2 = 0;
		Scanner sc = new Scanner(System.in);
		
		for(int j =0; j < c.length; ++j) {
				System.out.print("선택 입력 (1. 제안A 2.제안B) : ");
				a = sc.nextInt();
				
					if(a == 1) {
						++count1;
						c[j] = b;
					}else if(a == 2) {
						count2++;
						c[j] = d;
					}
		}
		for(int i = 0; i < c.length; ++i) {
			
			System.out.print(c[i] +  " ");
		}
		if(count1 > count2) {
			System.out.printf("제안A %d표, 제안B %d표%n",count1,count2);
			System.out.println("제안A가 득표 수가 더 많습니다");
		}else {
			System.out.printf("제안A %d표, 제안B %d표%n",count1,count2);
			System.out.println("제안B가 득표 수가 더 많습니다");
		}
	}

}
