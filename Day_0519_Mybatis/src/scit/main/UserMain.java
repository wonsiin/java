package scit.main;

import java.util.Scanner;

import scit.dao.UserDAO;
import scit.vo.UserVO;

public class UserMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String usrid;
		String nsrname;
		System.out.println("���̵� �Է����ּ��� : " );
		usrid = sc.nextLine();
		System.out.println("�̸��� �Է����ּ��� : " );
		nsrname = sc.nextLine();
		
		
		UserVO vo = new UserVO(usrid, nsrname);
		UserDAO dao = new UserDAO();
		int result = dao.insertUser(vo);
		System.out.println(result + "���� �����Ͱ� ��ϵ�!");
		System.out.println(vo + "���� �����Ͱ� ��ϵ�!");
		

	}

}
