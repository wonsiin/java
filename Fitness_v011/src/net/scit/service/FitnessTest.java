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
			default : System.out.println("err : �޴��� �ٽ� �����ϼ���");
			}
			sc.nextLine(); //stdio ����
		}
	}
	
	
	public void su() {
		System.out.println("=====[���� ���]=====");
		System.out.println("     1. �� �� ��");
		System.out.println("     2. ��   ��");
		System.out.println("     3.   Ű  ");
		System.out.println("     4. �� �� ��");
		System.out.println("======================");
		System.out.print("     ���� > ");
	}
}
