package net.scit.service;

import java.util.Scanner;

import net.scit.vo.FitnessVO;

public class FitnessService {
	private FitnessVO[] member;
	private int count = 0; //���� ȸ����
	
	Scanner sc = new Scanner(System.in);
	
	public FitnessService(int max) {
		member = new FitnessVO[max];
		String choice;
		while(true) {
			menu();
			choice = sc.next();
			
			switch (choice) {
			case "1" : input();		break;
			case "2" : output();	break;
			case "3" : selectOne(choice);	break;
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
		Scanner sc = new Scanner(System.in);
		String usrid;
		String usrname;
		double height;
		double weight;
		
		if(count >= member.length) {
			System.out.println("** ���̻� ȸ������ �����ϽǼ� �����ϴ�.");
			return;
		}
		
		
		
		System.out.print(">��ȣ�� �Է��ϼ���(id) : ");
		usrid = sc.next();
		
		for(int i=0; i < count; ++i) {
			if(member[i].getUsrId().equals(usrid)) {
				System.out.println("ȸ����ȣ�� �ߺ��˴ϴ�.");
				return;
			}
		}
		
		System.out.print("> �� �� : ");
		usrname = sc.next();
		System.out.print(">  Ű  : ");
		height = sc.nextDouble();
		System.out.print(">������ : ");
		weight = sc.nextDouble();
		
		
		
		member[count] = new FitnessVO(usrid, usrname, height, weight);
		++count;
		System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");
		
		
		
		
	}
	public void output() {
		if(count == 0) {
			System.out.println("** ������ ȸ���� �����ϴ�.");
			return;
		}
		
		for(int i=0; i< count; ++i) {
			member[i].output();
			System.out.println("���� �� ȸ���� " + count + "�Դϴ�.");
		}
	}

	public void selectOne(String choice) {
		System.out.print("������ ID�� �����Դϱ� : ");
		String co = sc.next();
		if(count == 0) {
			System.out.println("ȸ���� �����ϴ�.");
			return;
		}
			for(int i =0; i < count; ++i) {
				if(member[i].getUsrId().equals(co)) {
					System.out.printf("%s���̵��� %s��������ȸ�� �����մϴ�.%nŰ��%.1f�̸�, ������� %.1f�̰�, bmi�� %.1f�Դϴ�.%n",
							member[i].getUsrId(),member[i].getUserName(),member[i].getHeight(),member[i].getWeight(),member[i].getBmi());
					return;
				}
			}
		System.out.println("�Է��� ���̵� �������� �ʽ��ϴ�.");
	}
	public void delete() {

		int su = 0;
		int no = -1;
		String answer,userid;
		
		if(count == 0) {System.out.println("ȸ���� �����ϴ�."); return;}
		
		System.out.print("������ ID�� �����Դϱ� : ");
		userid = sc.next();
		
		for(int i =0;i < count; ++i) {
			if(member[i].getUsrId().equals(userid)|| member[i].equals(userid)) {
				no = i;
				break;
			}
		}
		
		System.out.print("** ������ Ż���Ͻðڽ��ϱ�? (y/n)");
		answer = sc.next();
		
		
			if(answer.equals("y")) { 
				for(int i=no;i < count-1;++i) {
					member[i] = member[i+1];
					
				}
				count--;
			}else {
				System.out.println("** Ż�� �۾��� ����߽��ϴ�.");
			}
	
		
	}

	public void update() {
		
		
		int no = -1;
		String userid;
		double height,weight;
		System.out.print("��ȣ�� �Է����ּ��� : ");
		userid = sc.next();
		if(count == 0) {
			System.out.println("������ ȸ���� �����ϴ�.");
			return;
		}
		
		for(int i =0;i < count; ++i) {
			if(member[i].getUsrId().equals(userid)) {
				no = i;
				break;
			}
		}
		
		if(no == -1) {
			System.out.println("�ش� ��ȣ�� �߸��� ��ȣ�Դϴ�.");
			return;
		}
		
		if(member[no].getUsrId().equals(userid)) {
			System.out.print("Ű�� �Է��� �ּ��� : ");
			height = sc.nextDouble();
			member[no].setHeight(height);
			System.out.println("�����踦 �Է��� �ּ��� : ");
			weight = sc.nextDouble();
			member[no].setWeight(weight);
		}else if(!member[no].getUsrId().equals(userid)) {
			System.out.println("** ������ �������� �ʽ��ϴ�.");
		}
		
		System.out.println();

	}
	public void ex() {
		System.out.println("**���α׷��� �����մϴ�.");
	}

}
