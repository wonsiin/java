package pro1;

import java.util.Scanner;

public class Munje7 {
	public static void main(String[] args) {
		int a;
		String b = "����A";
		String d = "����B";
		String[] c = new String[11];
		int q1 = 0;
		int w2 = 0;
		int count1 = 0;
		int count2 = 0;
		Scanner sc = new Scanner(System.in);
		
		for(int j =0; j < c.length; ++j) {
				System.out.print("���� �Է� (1. ����A 2.����B) : ");
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
			System.out.printf("����A %dǥ, ����B %dǥ%n",count1,count2);
			System.out.println("����A�� ��ǥ ���� �� �����ϴ�");
		}else {
			System.out.printf("����A %dǥ, ����B %dǥ%n",count1,count2);
			System.out.println("����B�� ��ǥ ���� �� �����ϴ�");
		}
	}

}
