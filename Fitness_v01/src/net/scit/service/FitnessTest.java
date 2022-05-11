package net.scit.service;

import java.util.Scanner;

import net.scit.vo.FitnessVO;

public class FitnessTest {
	Scanner sc = new Scanner(System.in);
	FitnessVO fc = new FitnessVO();
	public FitnessTest() {
		double co;
		String choice;
		while(true) {
			su();
//			if() {}
			choice = sc.next();
			co = sc.nextDouble();
			
			switch (choice) {
			case "1" : fc.setUsrId(choice);		break;
			case "2" : fc.setUsrName(choice);	break;
			case "3" : fc.setHeight(co);	break;
			case "4" : fc.setWeight(co);	break;
			default : System.out.println("err : 메뉴를 다시 선택하세요");
			}
			sc.nextLine(); //stdio 지움
		}
	}
	
	
	public void su() {
		System.out.println("=====[수정 목록]=====");
		System.out.println("     1. 아 이 디");
		System.out.println("     2. 이   름");
		System.out.println("     3.   키  ");
		System.out.println("     4. 몸 무 계");
		System.out.println("======================");
		System.out.print("     선택 > ");
	}
}
