package net.scit.mini.ui;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import net.scit.mini.dao.CooperationDAO;
import net.scit.mini.vo.CooperationVO;


public class CooperationUI {
	CooperationDAO dao = new CooperationDAO();
	Scanner sc = new Scanner(System.in);
	
	public CooperationUI() {
		String choice;
		while(true) {
			menu();
			choice = sc.next();
			
			switch (choice) {
			case "1" : input();			break;
			case "2" : output();			break;
			case "3" : selectOne();	break;
			case "4" : delete();			break;
			case "5" : update();			break;
			case "6" : getCount();		break;
			case "0" : ex();					return;
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
		System.out.println("     6. ���ο�");
		System.out.println("     0. ��   ��");
		System.out.println("======================");
		System.out.print("     ���� > ");
	}
	public void input() {
		String usrid;
		int pass;
		String usrname;
		int teamnumber;
		String teamname;
		System.out.print(">���̵� �Է��ϼ���(id) : ");
		usrid = sc.next();
		
		if(idCheck(usrid)) {
			System.out.println("** �ߺ��� ���̵� �����մϴ�.");
			return;
		}
		System.out.print(">  ��й�ȣ  : ");
		pass = sc.nextInt();
		sc.nextLine();
		System.out.print("> �� �� : ");
		usrname = sc.next();
		sc.nextLine();
		System.out.print(">����ȣ : ");
		teamnumber = sc.nextInt();
		sc.nextLine();
		System.out.print(">���̸� : ");
		teamname = sc.next();
		sc.nextLine();
		
		CooperationVO  vo = new CooperationVO(usrid, pass, usrname, teamnumber,teamname);
		
		int result = dao.regist(vo);
		System.out.printf("** %d �� ȸ�������� �Ϸ�Ǿ����ϴ�.",result);
	}
	
	private void getCount() {
		dao.getCount();
	}
	public void output() {
		List<CooperationVO> list = dao.findAll();
		if(list.isEmpty()) {
			System.out.println("** ������ ȸ���� �����ϴ�.");
			return;
		}
		Iterator<CooperationVO> iter = list.iterator();
		
		while(iter.hasNext())
			System.out.println(iter.next());
	}
	
	private boolean idCheck(String usrid) {
		CooperationVO vo = dao.findById(usrid);
		//select .. from fitness where usrid ='abc';
		
		if(vo != null)
			return true;
		return false;
	}

	public void selectOne() {
		String usrid;
		System.out.print("������ ID�� �����Դϱ� : ");
		String co = sc.next();
		
		CooperationVO vo = dao.findById(co);
		
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
		CooperationVO vo = dao.findById(userid);
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
		int pass;
		String usrname;
		int teamnumber;
		String teamname;
		
		System.out.print(">���̵� �Է��ϼ���(id) : ");
		usrid = sc.next();
		
		CooperationVO vo = dao.findById(usrid);
		if(vo == null) {
			System.out.println("** �ش� ���̵��� ȸ���� �����ϴ�.");
			return;
		}

		System.out.print("> ��й�ȣ : ");
		pass = sc.nextInt();
		sc.nextLine();
		System.out.print(">  �̸�  : ");
		usrname = sc.next();
		sc.nextLine();
		System.out.print(">�� �ѹ� : ");
		teamnumber = sc.nextInt();
		sc.nextLine();
		System.out.print(">�� �̸� : ");
		teamname = sc.next();
		sc.nextLine();
		
		vo = new CooperationVO(usrid, pass, usrname, teamnumber,teamname);
		
		int result = dao.update(vo);
		System.out.printf("** %d �� ȸ�������� �Ϸ�Ǿ����ϴ�.",result);

	}
	public void ex() {
		System.out.println("**���α׷��� �����մϴ�.");
		
		
	}

}
