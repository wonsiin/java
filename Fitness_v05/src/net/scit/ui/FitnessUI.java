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
		System.out.print("> 이 름 : ");
		usrname = sc.next();
		System.out.print(">  키  : ");
		height = sc.nextDouble();
		System.out.print(">몸무계 : ");
		weight = sc.nextDouble();
		ser.regist(new FitnessVO(usrid, usrname, height, weight));
		System.out.println("회원가입이 완료되었습니다.");
	}
	public void output() {
		ser.findAll();
	}

	public void selectOne() {
		System.out.print("고객님의 ID는 무엇입니까 : ");
		String co = sc.next();
		
		FitnessVO vo = ser.findById(co);
		System.out.println(vo);
		
	}
	public void delete() {

		String answer,userid;
		System.out.print("삭제할 ID는 무엇입니까 : ");
		userid = sc.next();
		FitnessVO vo = ser.findById(userid);
		if(vo == null) {
			System.out.println("** 해당 아이디의 회원이 없습니다.");
			return;
		}
		System.out.print("** 정말로 탈퇴하시겠습니까? (y/n)");
		answer = sc.next();
		if(answer.equals("y")) {
			ser.delete(userid); // 리턴값을 받지 않아도 된다. ==> 
			System.out.println("** 삭제 완료\n");
			return;
		}else {
			System.out.println("** 삭제 작업이 취소되었습니다.");
		}
	}
	public void update() {
		String userid;
		double height,weight;
		System.out.print("번호를 입력해주세요 : ");
		userid = sc.next();
		FitnessVO vo = ser.findById(userid);
		sc.nextLine();
				System.out.print("> 이름 : ");
				userid = sc.nextLine();
				
				
				System.out.print("> 키 : ");
				System.out.println();
				height = sc.nextInt();
				sc.nextLine();
				System.out.print("> 몸무계 : ");
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
		System.out.println("**프로그램을 종료합니다.");
		
		
	}

}
