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
		
		System.out.print("년도 입력 : ");
		nun = sc.nextInt();
		System.out.print("월 입력 : ");
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
		
		System.out.println("해당 월은 " + dal + "일 입니다.");
	}	
//		System.out.print("년도 입력 : ");
//		nun = sc.nextInt();
//		System.out.print("월 입력 : ");
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
//			System.out.println("해당 년은 윤년 입니다.");
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
//			System.out.println("해당 년은 평년 입니다.");
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
//			System.out.println("해당 년은 윤년 입니다.");
//		}
//		
//			
//		
//	}
	
}
