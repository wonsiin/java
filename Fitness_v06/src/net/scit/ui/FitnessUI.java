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
			default : System.out.println("err : 메뉴를 다시 선택하세요");
			}
			sc.nextLine(); 
		}
	}
	
	public void menu() {
		System.out.println("=====[관리 프로그램]=====");
		System.out.println("     1. 입   력");
		System.out.println("     2. 전체출력");
		System.out.println("     3. 조   회");
		System.out.println("     4. 삭   제");
		System.out.println("     5. 수   정");
		System.out.println("     6. 총인원");
		System.out.println("     0. 종   료");
		System.out.println("======================");
		System.out.print("     선택 > ");
	}
	public void input() {
		String usrid;
		String usrname;
		double height;
		double weight;
		System.out.print(">번호를 입력하세요(id) : ");
		usrid = sc.next();
		
		if(idCheck(usrid)) {
			System.out.println("** 중복된 아이디가 존재합니다.");
			return;
		}
		System.out.print("> 이 름 : ");
		usrname = sc.next();
		System.out.print(">  키  : ");
		height = sc.nextDouble();
		System.out.print(">몸무계 : ");
		weight = sc.nextDouble();
		
		FitnessVO  vo = new FitnessVO(usrid, usrname, height, weight);
		
		int result = dao.regist(vo);
		System.out.printf("** %d 명 회원가입이 완료되었습니다.",result);
	}
	
	private void getCount() {
		dao.getCount();
	}
	public void output() {
		List<FitnessVO> list = dao.findAll();
		if(list.isEmpty()) {
			System.out.println("** 가입한 회원이 없습니다.");
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
		System.out.print("고객님의 ID는 무엇입니까 : ");
		String co = sc.next();
		
		FitnessVO vo = dao.findById(co);
		
		if(vo == null) {
			System.out.println("** 해당 아이디의 회원이 없습니다.");
			return;
		}
		
		System.out.println(vo);
	}
	
	
	public void delete() {

		String answer,userid;
		System.out.print("삭제할 ID는 무엇입니까 : ");
		userid = sc.next();
		FitnessVO vo = dao.findById(userid);
		if(vo == null) {
			System.out.println("** 해당 아이디의 회원이 없습니다.");
			return;
		}
		System.out.print("** 정말로 탈퇴하시겠습니까? (y/n)");
		answer = sc.next();
		if(answer.equals("y")) {
			dao.delete(userid); // 리턴값을 받지 않아도 된다. ==> 
			System.out.println("** 삭제 완료\n");
			return;
		}else {
			System.out.println("** 삭제 작업이 취소되었습니다.");
		}
	}
	public void update() {
		String usrid;
		String usrname;
		double height;
		double weight;
		System.out.print(">번호를 입력하세요(id) : ");
		usrid = sc.next();
		
		FitnessVO vo = dao.findById(usrid);
		if(vo == null) {
			System.out.println("** 해당 아이디의 회원이 없습니다.");
			return;
		}

		System.out.print("> 이 름 : ");
		usrname = sc.next();
		System.out.print(">  키  : ");
		height = sc.nextDouble();
		System.out.print(">몸무계 : ");
		weight = sc.nextDouble();
		
		vo = new FitnessVO(usrid, usrname, height, weight);
		
		int result = dao.update(vo);
		System.out.printf("** %d 명 회원수정이 완료되었습니다.",result);

	}
	public void ex() {
		System.out.println("**프로그램을 종료합니다.");
		
		
	}

}
