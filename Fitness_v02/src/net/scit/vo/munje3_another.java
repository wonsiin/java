package net.scit.vo;

import java.util.Scanner;

public class munje3_another {
	public static void main(String[] args) {
		int nun;
		int dal;
		int il;
		int nal;
		int un;
		int nn;
			
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�⵵ �Է� : ");
		nun = sc.nextInt();
		System.out.print("�� �Է� : ");
		dal = sc.nextInt();
		
		if(dal == 2) {
			dal = 28;
		} else {
			
			if(dal <= 7) {
				if(dal % 2 == 0) {
					dal = 30;
				} else {
					dal = 31;
				}
			} else if(dal >= 8){
				if(dal % 2 == 0) {
					dal = 31;
				} else {
					dal = 30;
				}
				
			}
		}	
		
		System.out.println("�ش� ���� " + dal + "�� �Դϴ�.");
	}	
//		System.out.print("�⵵ �Է� : ");
//		nun = sc.nextInt();
//		System.out.print("�� �Է� : ");
//		un = sc.nextInt();
//
//		if(nun % 4 == 0) {
//			for(int i=1;i< dal.length; i++) {
//				
//				if(i % 2 == 1) {
//					dal[i] = i;
//					nn = 31;
//					il[i] = nn;
//				}else if(i % 2 == 0 || i != 2) {
//					dal[i] = i;
//					nn = 30;
//					il[i] = nn;
//				} 
//				if(i == 2) {
//					dal[i] = i;
//					nn = 28;
//					il[i] = nn;
//				}
//				System.out.println(il[un]);
//			}
//			System.out.println("�ش� ���� ���� �Դϴ�.");
//		}
//		else if(nun % 4 == 0 && nun % 100 == 0) {
//			
//			for(int i=1;i< dal.length; i++) {
//				if(i % 2 == 1) {
//					dal[i] = i;
//					nn = 31;
//					il[i] = nn;
//				}else if(i % 2 == 0 || i != 2) {
//					dal[i] = i;
//					nn = 30;
//					il[i] = nn;
//				} 
//				if(i == 2) {
//					dal[i] = i;
//					nn = 29;
//					il[i] = nn;
//				}
//				System.out.println(il[un]);
//			}
//			System.out.println("�ش� ���� ��� �Դϴ�.");
//		}else if (nun % 4 == 0 && nun % 100 == 0 && nun % 400 == 0) {
//			
//			for(int i=1;i< dal.length; i++) {
//				if(i % 2 == 1) {
//					dal[i] = i;
//					il[i] = 31;
//				}else if(i % 2 == 0 || i != 2) {
//					dal[i] = i;
//					il[i] = 30;
//				} 
//				if(i == 2) {
//					dal[i] = i;
//					il[i] = 28;
//				}
//				System.out.println(il[un]);
//			}
//			System.out.println("�ش� ���� ���� �Դϴ�.");
//		}
//		
//			
//		
//	}
	
}
