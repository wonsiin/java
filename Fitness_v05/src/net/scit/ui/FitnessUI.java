package net.scit.ui;

import java.util.Scanner;

import net.scit.service.FitnessService;
import net.scit.service.FitnessServiceImpl;
import net.scit.vo.FitnessVO;

public class FitnessUI {
	FitnessService ser = new FitnessServiceImpl();
	Scanner sc = new Scanner(System.in);
	
	public FitnessUI() {
		String choice;
		while(true) {
			menu();
			choice = sc.next();
			
			switch (choice) {
			case "1" : input();		break;
			case "2" : output();	break;
			case "3" : selectOne();	break;
			case "4" : delete();	break;
			case "5" : update();	break;
			case "0" : ex();		return;
			default : System.out.println("err : �޴��� �ٽ� �����ϼ���");
			}
			sc.nextLine(); 
		}
	}
	public void menu() {
		System.out.println("=====[���� ���α׷�]=====");
		System.out.println("     1. ��   ��");
		System.out.println("     2. ��ü���");
		System.out.println("     3. ��   ȸ");
		System.out.println("     4. ��   ��");
		System.out.println("     5. ��   ��");
		System.out.println("     0. ��   ��");
		System.out.println("======================");
		System.out.print("     ���� > ");
	}
	public void input() {
		String usrid;
		String usrname;
		double height;
		double weight;
		System.out.print(">��ȣ�� �Է��ϼ���(id) : ");
		usrid = sc.next();
		System.out.print("> �� �� : ");
		usrname = sc.next();
		System.out.print(">  Ű  : ");
		height = sc.nextDouble();
		System.out.print(">������ : ");
		weight = sc.nextDouble();
		ser.regist(new FitnessVO(usrid, usrname, height, weight));
		System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");
	}
	public void output() {
		ser.findAll();
	}

	public void selectOne() {
		System.out.print("������ ID�� �����Դϱ� : ");
		String co = sc.next();
		
		FitnessVO vo = ser.findById(co);
		System.out.println(vo);
		
	}
	public void delete() {

		String answer,userid;
		System.out.print("������ ID�� �����Դϱ� : ");
		userid = sc.next();
		FitnessVO vo = ser.findById(userid);
		if(vo == null) {
			System.out.println("** �ش� ���̵��� ȸ���� �����ϴ�.");
			return;
		}
		System.out.print("** ������ Ż���Ͻðڽ��ϱ�? (y/n)");
		answer = sc.next();
		if(answer.equals("y")) {
			ser.delete(userid); // ���ϰ��� ���� �ʾƵ� �ȴ�. ==> 
			System.out.println("** ���� �Ϸ�\n");
			return;
		}else {
			System.out.println("** ���� �۾��� ��ҵǾ����ϴ�.");
		}
	}
	public void update() {
		String userid;
		double height,weight;
		System.out.print("��ȣ�� �Է����ּ��� : ");
		userid = sc.next();
		FitnessVO vo = ser.findById(userid);
		sc.nextLine();
				System.out.print("> �̸� : ");
				userid = sc.nextLine();
				
				
				System.out.print("> Ű : ");
				System.out.println();
				height = sc.nextInt();
				sc.nextLine();
				System.out.print("> ������ : ");
				System.out.println();
				weight = sc.nextInt();
				sc.nextLine();
				vo.setUsrName(userid);
				vo.setHeight(height);
				vo.setWeight(weight);
				
				ser.update(vo);
				
		
		System.out.println();

	}
	public void ex() {
		ser.setFile();
		System.out.println("**���α׷��� �����մϴ�.");
		
		
	}

}
