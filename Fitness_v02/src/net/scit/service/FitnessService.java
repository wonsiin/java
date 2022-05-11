package net.scit.service;

import java.util.Scanner;

import net.scit.vo.FitnessVO;

public class FitnessService {
	private FitnessVO[] member;
	private int count = 0; //현재 회원수
	
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
		Scanner sc = new Scanner(System.in);
		String usrid;
		String usrname;
		double height;
		double weight;
		
		if(count >= member.length) {
			System.out.println("** 더이상 회원으로 가입하실수 없습니다.");
			return;
		}
		
		
		
		System.out.print(">번호를 입력하세요(id) : ");
		usrid = sc.next();
		
		for(int i=0; i < count; ++i) {
			if(member[i].getUsrId().equals(usrid)) {
				System.out.println("회원번호가 중복됩니다.");
				return;
			}
		}
		
		System.out.print("> 이 름 : ");
		usrname = sc.next();
		System.out.print(">  키  : ");
		height = sc.nextDouble();
		System.out.print(">몸무계 : ");
		weight = sc.nextDouble();
		
		
		
		member[count] = new FitnessVO(usrid, usrname, height, weight);
		++count;
		System.out.println("회원가입이 완료되었습니다.");
		
		
		
		
	}
	public void output() {
		if(count == 0) {
			System.out.println("** 가입한 회원이 없습니다.");
			return;
		}
		
		for(int i=0; i< count; ++i) {
			member[i].output();
			System.out.println("현재 총 회원은 " + count + "입니다.");
		}
	}

	public void selectOne(String choice) {
		System.out.print("고객님의 ID는 무엇입니까 : ");
		String co = sc.next();
		if(count == 0) {
			System.out.println("회원이 없습니다.");
			return;
		}
			for(int i =0; i < count; ++i) {
				if(member[i].getUsrId().equals(co)) {
					System.out.printf("%s아이디의 %s고객님의조회를 시작합니다.%n키는%.1f이며, 몸무계는 %.1f이고, bmi는 %.1f입니다.%n",
							member[i].getUsrId(),member[i].getUserName(),member[i].getHeight(),member[i].getWeight(),member[i].getBmi());
					return;
				}
			}
		System.out.println("입력한 아이디가 존재하지 않습니다.");
	}
	public void delete() {

		int su = 0;
		int no = -1;
		String answer,userid;
		
		if(count == 0) {System.out.println("회원이 없습니다."); return;}
		
		System.out.print("삭제할 ID는 무엇입니까 : ");
		userid = sc.next();
		
		for(int i =0;i < count; ++i) {
			if(member[i].getUsrId().equals(userid)|| member[i].equals(userid)) {
				no = i;
				break;
			}
		}
		
		System.out.print("** 정말로 탈퇴하시겠습니까? (y/n)");
		answer = sc.next();
		
		
			if(answer.equals("y")) { 
				for(int i=no;i < count-1;++i) {
					member[i] = member[i+1];
					
				}
				count--;
			}else {
				System.out.println("** 탈퇴 작업을 취소했습니다.");
			}
	
		
	}

	public void update() {
		
		
		int no = -1;
		String userid;
		double height,weight;
		System.out.print("번호를 입력해주세요 : ");
		userid = sc.next();
		if(count == 0) {
			System.out.println("동일한 회원이 없습니다.");
			return;
		}
		
		for(int i =0;i < count; ++i) {
			if(member[i].getUsrId().equals(userid)) {
				no = i;
				break;
			}
		}
		
		if(no == -1) {
			System.out.println("해당 번호는 잘못된 번호입니다.");
			return;
		}
		
		if(member[no].getUsrId().equals(userid)) {
			System.out.print("키를 입력해 주세요 : ");
			height = sc.nextDouble();
			member[no].setHeight(height);
			System.out.println("몸무계를 입력해 주세요 : ");
			weight = sc.nextDouble();
			member[no].setWeight(weight);
		}else if(!member[no].getUsrId().equals(userid)) {
			System.out.println("** 정보가 존재하지 않습니다.");
		}
		
		System.out.println();

	}
	public void ex() {
		System.out.println("**프로그램을 종료합니다.");
	}

}
