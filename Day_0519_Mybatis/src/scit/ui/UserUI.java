package scit.ui;

import java.util.List;
import java.util.Scanner;

import scit.dao.UserDAO;
import scit.vo.User;
import scit.vo.UserVO;


public class UserUI {
	UserDAO  dao = new UserDAO();
	Scanner keyin = new Scanner(System.in);
	
	public UserUI() {
		String choice;
		
		while(true) {
			menu();
			choice = keyin.nextLine();
			
			switch(choice) {
			case"1" : input(); break;
			case"2" : printAll(); break;
			case"0" : 
				System.out.print("** 프로그램을 종료합니다.");
				System.exit(0);
			default :
				System.out.println("** 메뉴를 재 선택해주세요 :");
			
			}
		}
	}



	private void menu() {
		System.out.println("=====[회원 관리]========");
		System.out.println("		1)입 력");
		System.out.println("		2)전체 출력");
		System.out.println("		3)정보 수정");
		System.out.println("		4)탈  퇴");
		System.out.println("		0)종  료");
		System.out.println("===========]========");
		System.out.print("		 >선택 :  ");
	}

	private void input() {
		String title,substance;
		
		System.out.print("> 글 제목 :  ");
		title = keyin.nextLine();
		
		System.out.print("> 내   용 :  ");
		substance = keyin.nextLine();
	
		UserVO vo = new UserVO(title, substance);
		
		int result = dao.insertUser(vo);
		
		System.out.println(result + "명을 저장하엿습니다.");
		
	}
	// 1) 아이디입력받음
	/* 2) findById를 이용해 해당 아이디 존재여부를 확인
	 * 정보가 없다면 리턴
	 * 정보가 있으면 수정할 데이터를 입력받는다.(이름,전화번호,주소)
	 * 
	 *  3) UserDAO.java + UserMapper.java
	 *  updateUser(UserVO vo)
	 *  updateAddress(User user)
	 *  4) update 태그는 파라미터타입은 있고, 리절트 타입은 없다.
	 *  <update id= ""></ update>
	*/
	private void update() {
		String usrid, usrname, phone, address;
		
		System.out.println("> 아이디 : ");
		usrid = keyin.nextLine();
		UserVO vo = dao.findById(usrid);
		if(vo == null) {
			System.out.println("**  아이디가 존재하지 않습니다.");
			return;
		}
		System.out.println("> 바꾸실 이름 : ");
		usrname = keyin.nextLine();
		if(usrname.length() == 0) {
			System.out.println(" ** 이름을 입력해 주세요");
			return;
		}
//		System.out.println("전화번호도 수정 하시겟습니까? : ");
//		string a = keyin
//		if()
		System.out.println("> 바꾸실 전화번호 : ");
		phone = keyin.nextLine();
		if(usrname.length() == 0) {
			System.out.println(" ** 전화번호를 입력해 주세요");
			return;
		}
		
		System.out.println("> 바꾸실 주소 : ");
		address = keyin.nextLine();
		if(usrname.length() == 0) {
			System.out.println(" ** 주소를 입력해 주세요");
			return;
		}
		User user = new User(usrid, usrname, phone, address);
		
		int result = dao.Update(user);
		
		System.out.println(result + "개의 정보 수정 완료!");
		
	}
	
	
	private void delete() {
		String usrid, answer;
		
		System.out.println("> 아이디 : ");
		usrid = keyin.nextLine();
		UserVO vo = dao.findById(usrid);
		if(vo == null) {
			System.out.println("**  아이디가 존재하지 않습니다.");
			return;
		}
		System.out.println(vo);
		System.out.print(" ** 정말 탈퇴 하시겟습니까?(y/n) : ");
		answer = keyin.nextLine();
		
		if(!answer.equals("y")) {
			System.out.print(" ** 탈퇴 작업을 취소 했습니다. ");
			return;
		}
		
		int result = dao.delete(usrid);
		if(result == 1)
			System.out.println(" ** 탈퇴가 완료 되었습니다.");
		
	}                                                                                                                                                                                                                                                                              

	private void printAll() {
		System.out.println("			[전체 회원 조회]			");
		List<User> list = dao.selectAll();
		
		for(User user:list)
			System.out.println(user);
		
		
	}
	
}
