package net.scit.ui;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import net.scit.dao.FitnessDAO;
import net.scit.vo.FitnessVO;

public class FitnessUI {
	FitnessDAO dao = new FitnessDAO();
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
			case "6" : getCount();	break;
			case "0" : ex();		return;
			default : System.out.println("err : 정확한 값을 입력해 주세요.");
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
		System.out.println("     6. ���ο�");
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
		
		if(idCheck(usrid)) {
			System.out.println("** �ߺ��� ���̵� �����մϴ�.");
			return;
		}
		System.out.print("> �� �� : ");
		usrname = sc.next();
		System.out.print(">  Ű  : ");
		height = sc.nextDouble();
		System.out.print(">������ : ");
		weight = sc.nextDouble();
		
		FitnessVO  vo = new FitnessVO(usrid, usrname, height, weight);
		
		int result = dao.regist(vo);
		System.out.printf("** %d �� ȸ�������� �Ϸ�Ǿ����ϴ�.",result);
	}
	
	private void getCount() {
		dao.getCount();
	}
	public void output() {
		List<FitnessVO> list = dao.findAll();
		if(list.isEmpty()) {
			System.out.println("** ������ ȸ���� �����ϴ�.");
			return;
		}
		Iterator<FitnessVO> iter = list.iterator();
		
		while(iter.hasNext())
			System.out.println(iter.next());
	}
	
	private boolean idCheck(String usrid) {
		FitnessVO vo = dao.findById(usrid);
		//select .. from fitness where usrid ='abc';
		
		if(vo != null)
			return true;
		return false;
	}

	public void selectOne() {
		String usrid;
		System.out.print("������ ID�� �����Դϱ� : ");
		String co = sc.next();
		
		FitnessVO vo = dao.findById(co);
		
		if(vo == null) {
			System.out.println("** �ش� ���̵��� ȸ���� �����ϴ�.");
			return;
		}
		
		System.out.println(vo);
	}
	
	
	public void delete() {

		String answer,userid;
		System.out.print("������ ID�� �����Դϱ� : ");
		userid = sc.next();
		FitnessVO vo = dao.findById(userid);
		if(vo == null) {
			System.out.println("** �ش� ���̵��� ȸ���� �����ϴ�.");
			return;
		}
		System.out.print("** ������ Ż���Ͻðڽ��ϱ�? (y/n)");
		answer = sc.next();
		if(answer.equals("y")) {
			dao.delete(userid); // ���ϰ��� ���� �ʾƵ� �ȴ�. ==> 
			System.out.println("** ���� �Ϸ�\n");
			return;
		}else {
			System.out.println("** ���� �۾��� ��ҵǾ����ϴ�.");
		}
	}
	public void update() {
		String usrid;
		String usrname;
		double height;
		double weight;
		System.out.print(">��ȣ�� �Է��ϼ���(id) : ");
		usrid = sc.next();
		
		FitnessVO vo = dao.findById(usrid);
		if(vo == null) {
			System.out.println("** �ش� ���̵��� ȸ���� �����ϴ�.");
			return;
		}

		System.out.print("> �� �� : ");
		usrname = sc.next();
		System.out.print(">  Ű  : ");
		height = sc.nextDouble();
		System.out.print(">������ : ");
		weight = sc.nextDouble();
		
		vo = new FitnessVO(usrid, usrname, height, weight);
		
		int result = dao.update(vo);
		System.out.printf("** %d �� ȸ�������� �Ϸ�Ǿ����ϴ�.",result);

	}
	public void ex() {
		System.out.println("**���α׷��� �����մϴ�.");
		
		
	}

}
