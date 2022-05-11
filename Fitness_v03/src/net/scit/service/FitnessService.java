package net.scit.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import net.scit.vo.FitnessVO;

public class FitnessService {
	List<FitnessVO> list = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	public FitnessService() {
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
	
	private boolean idCheck(String usrid) {
		for(int i=0; i < list.size(); ++i) {
			if(list.get(i).getUsrId().equals(usrid)) {
				System.out.println("ȸ����ȣ�� �ߺ��˴ϴ�.");
				
			}
		}
		return true;
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		String usrid;
		String usrname;
		double height;
		double weight;

		System.out.print(">��ȣ�� �Է��ϼ���(id) : ");
		usrid = sc.next();
		
		for(int i=0; i < list.size(); ++i) {
			if(list.get(i).getUsrId().equals(usrid)) {
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
		
		
		
		list.add(new FitnessVO(usrid, usrname, height, weight));
		System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");
		
		
		
		
	}
	public void output() {
		if(list.isEmpty()) {
			System.out.println("** ������ ȸ���� �����ϴ�.");
			return;
		}
		Iterator<FitnessVO> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
//		for(int i=0; i< list.size(); ++i) {
//			member[i].output();
//			System.out.println("���� �� ȸ���� " + list.size() + "�Դϴ�.");
//		}
	}

	public void selectOne(String choice) {
		System.out.print("������ ID�� �����Դϱ� : ");
		String co = sc.next();
		if(list.isEmpty()) {
			System.out.println("ȸ���� �����ϴ�.");
			return;
		}
			for(int i =0; i < list.size(); ++i) {
				if(list.get(i).getUsrId().equals(co)) {
					System.out.printf("%s���̵��� %s��������ȸ�� �����մϴ�.%nŰ��%.1f�̸�, ������� %.1f�̰�, bmi�� %.1f�Դϴ�.%n",
							list.get(i).getUsrId(),list.get(i).getUserName(),list.get(i).getHeight(),list.get(i).getWeight(),list.get(i).getBmi());
					return;
				}
			}
		System.out.println("�Է��� ���̵� �������� �ʽ��ϴ�.");
	}
	public void delete() {

		int su = 0;
		int no = -1;
		String answer,userid;
		
		if(list.isEmpty()) {System.out.println("ȸ���� �����ϴ�."); return;}
		
		System.out.print("������ ID�� �����Դϱ� : ");
		userid = sc.next();
		
		for(int i =0;i < list.size(); ++i) {
			if(list.get(i).getUsrId().equals(userid)) {
				no = i;
				break;
			}
		}
		
		System.out.print("** ������ Ż���Ͻðڽ��ϱ�? (y/n)");
		answer = sc.next();
		
		
			if(!answer.equals("y")) { 
				System.out.println("** Ż�� �۾��� ����߽��ϴ�.");
			}
			
			list.remove(no);
			System.out.println("**Ż�� �۾��� �Ϸ��Ͽ����ϴ�.");
	
		
	}

	public void update() {
		
		
		int no = -1;
		String userid;
		double height,weight;
		System.out.print("��ȣ�� �Է����ּ��� : ");
		userid = sc.next();
		if(list.isEmpty()) {
			System.out.println("������ ȸ���� �����ϴ�.");
			return;
		}
		
		for(int i =0;i < list.size(); ++i) {
			if(list.get(i).getUsrId().equals(userid)) {
				no = i;
				break;
			}
		}
		
		if(no == -1) {
			System.out.println("�ش� ��ȣ�� �߸��� ��ȣ�Դϴ�.");
			return;
		}
		
		if(list.get(no).getUsrId().equals(userid)) {
			System.out.print("Ű�� �Է��� �ּ��� : ");
			height = sc.nextDouble();
			list.get(no).setHeight(height); 				//set�����
			System.out.println("�����踦 �Է��� �ּ��� : ");
			weight = sc.nextDouble();
			list.get(no).setWeight(weight);					//set�����
		}else if(!list.get(no).getUsrId().equals(userid)) {
			System.out.println("** ������ �������� �ʽ��ϴ�.");
		}
		
		System.out.println();

	}
	public void ex() {
		System.out.println("**���α׷��� �����մϴ�.");
	}

}
