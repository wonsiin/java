package net.scit.service;

import java.util.Scanner;

import net.scit.vo.FitnessVO;

public class FitnessService {
	private FitnessVO vo; //클래스는 기본값이 null이다. 객체들은 참조하지 않으면 null이다.
	private FitnessTest to;
	
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
			default : System.out.println("err : 메뉴를 다시 선택하세요");
			}
			sc.nextLine(); //stdio 지움
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
		Scanner sc = new Scanner(System.in);
		//임시 변수를 선언해야한다 (지역변수)
		String usrid;
		String usrname;
		double height;
		double weight;
		
		if(vo != null) {
			System.out.println("** 더이상 회원으로 가입하실수 없습니다.");
			return;
		}
		System.out.print(">번호를 입력하세요(id) : ");
		usrid = sc.next();
		System.out.print("> 이 름 : ");
		usrname = sc.next();
		System.out.print(">  키  : ");
		height = sc.nextDouble();
		System.out.print(">몸무계 : ");
		weight = sc.nextDouble();
		
		vo = new FitnessVO(usrid, usrname, height, weight);
		System.out.println("회원가입이 완료되었습니다.");
		
		
	}
	public void output() {
		if(vo != null) vo.output();//재기메소드 (이게 잘못사용되면 메모리부족 현상이 나올수있다)
		else System.out.println("** 가입한 회원이 없습니다.");
		
	}
	
	// 1) 데이터가 존재하는지 확인
	// 2) 아이디 입력받기 --> 아이디를 잘 입력했을때만 출력 .equals()
	public void selectOne(String choice) {
		System.out.print("고객님의 ID는 무엇입니까 : ");
		String co = sc.next();
		if(vo == null) {
			System.out.println("정보가 없습니다.");
		}else if(co.equals(vo.getUsrId())){ //scanner의 equals로 찾아야한다.
		System.out.printf("%s아이디의 %s고객님의조회를 시작합니다.%n키는%.1f이며, 몸무계는 %.1f이고, bmi는 %.1f입니다.%n",vo.getUsrId(),vo.getUserName(),vo.getHeight(),vo.getWeight(),vo.getBmi());
		}else {
			System.out.println("정보를 잘못 입력하셧습니다. 다시 이용해주세요."); return;
		}
	}
	public void delete() {
		String answer;
		if(vo == null) {System.out.print("회원이 없습니다."); return;}
		System.out.print("** 정말로 탈퇴하시겠습니까? (y/n)");
		answer = sc.next();
		//if(answer == "y") {
		if(answer.equals("y")) { //answer.equals안에 있는 값이 y인가? 를 물어볼때 사용
			vo = null;
			return;
		}else {
			System.out.println("** 탈퇴 작업을 취소했습니다.");
		}
	}
	//set()을 이용해서 수정
	public void update() {
		String userid;
		double height,weight;
		userid = sc.next();
		if(vo == null) {
			System.out.println("동일한 회원이 없습니다.");
			return;
		}
		if(vo.getUsrId().equals(userid)) {
			System.out.print("키를 입력해 주세요 : ");
			height = sc.nextDouble();
			vo.setHeight(height);
		}else if(!vo.getUsrId().equals(userid)) {
			System.out.println("** 정보가 존재하지 않습니다.");
		}
		System.out.println();
		
		
//		to();
	}
	public void ex() {
		System.out.println("**프로그램을 종료합니다.");
	}

}
