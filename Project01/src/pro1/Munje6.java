package pro1;

import java.util.Scanner;

public class Munje6 {
	public static void main(String[] args) {
		int bak=0;
		int bu=0;
		int co=0;
		int su=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("박테리아가 몇 마리 입니까? : ");
		bak = sc.nextInt();
		
		System.out.println("경과 시간을 입력 해주세요.(분) : ");
		bu = sc.nextInt();
		
		co = bak / 10;
		su = bu / 30;
			if(bu % 30 == 0) {
				System.out.println("박테리아가 몇 마리입니까 : " + bak);
				System.out.println("경과시간을 입력 해주세요.(분) : " + bu);
				System.out.println("경과시간을 입력 해주세요.(분) : " + (bak + (co * su)));
			}else if (bu % 30 != 0) {
				System.out.println("박테리아가 몇 마리입니까 : " + bak);
				System.out.println("경과시간을 입력 해주세요.(분) : " + bu);
				System.out.println("경과시간을 입력 해주세요.(분) : " + (bak + (co * su)));
			}
		
	}
}
