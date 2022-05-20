package scit.main;

import java.util.Scanner;

import scit.dao.UserDAO;
import scit.vo.UserVO;

public class UserMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String usrid;
		String nsrname;
		System.out.println("아이디를 입력해주세요 : " );
		usrid = sc.nextLine();
		System.out.println("이름을 입력해주세요 : " );
		nsrname = sc.nextLine();
		
		
		UserVO vo = new UserVO(usrid, nsrname);
		UserDAO dao = new UserDAO();
		int result = dao.insertUser(vo);
		System.out.println(result + "개의 데이터가 등록됨!");
		System.out.println(vo + "개의 데이터가 등록됨!");
		

	}

}
