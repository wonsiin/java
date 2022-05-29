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
				System.out.print("** ���α׷��� �����մϴ�.");
				System.exit(0);
			default :
				System.out.println("** �޴��� �� �������ּ��� :");
			
			}
		}
	}



	private void menu() {
		System.out.println("=====[ȸ�� ����]========");
		System.out.println("		1)�� ��");
		System.out.println("		2)��ü ���");
		System.out.println("		3)���� ����");
		System.out.println("		4)Ż  ��");
		System.out.println("		0)��  ��");
		System.out.println("===========]========");
		System.out.print("		 >���� :  ");
	}

	private void input() {
		String title,substance;
		
		System.out.print("> �� ���� :  ");
		title = keyin.nextLine();
		
		System.out.print("> ��   �� :  ");
		substance = keyin.nextLine();
	
		UserVO vo = new UserVO(title, substance);
		
		int result = dao.insertUser(vo);
		
		System.out.println(result + "���� �����Ͽ����ϴ�.");
		
	}
	// 1) ���̵��Է¹���
	/* 2) findById�� �̿��� �ش� ���̵� ���翩�θ� Ȯ��
	 * ������ ���ٸ� ����
	 * ������ ������ ������ �����͸� �Է¹޴´�.(�̸�,��ȭ��ȣ,�ּ�)
	 * 
	 *  3) UserDAO.java + UserMapper.java
	 *  updateUser(UserVO vo)
	 *  updateAddress(User user)
	 *  4) update �±״� �Ķ����Ÿ���� �ְ�, ����Ʈ Ÿ���� ����.
	 *  <update id= ""></ update>
	*/
	private void update() {
		String usrid, usrname, phone, address;
		
		System.out.println("> ���̵� : ");
		usrid = keyin.nextLine();
		UserVO vo = dao.findById(usrid);
		if(vo == null) {
			System.out.println("**  ���̵� �������� �ʽ��ϴ�.");
			return;
		}
		System.out.println("> �ٲٽ� �̸� : ");
		usrname = keyin.nextLine();
		if(usrname.length() == 0) {
			System.out.println(" ** �̸��� �Է��� �ּ���");
			return;
		}
//		System.out.println("��ȭ��ȣ�� ���� �Ͻðٽ��ϱ�? : ");
//		string a = keyin
//		if()
		System.out.println("> �ٲٽ� ��ȭ��ȣ : ");
		phone = keyin.nextLine();
		if(usrname.length() == 0) {
			System.out.println(" ** ��ȭ��ȣ�� �Է��� �ּ���");
			return;
		}
		
		System.out.println("> �ٲٽ� �ּ� : ");
		address = keyin.nextLine();
		if(usrname.length() == 0) {
			System.out.println(" ** �ּҸ� �Է��� �ּ���");
			return;
		}
		User user = new User(usrid, usrname, phone, address);
		
		int result = dao.Update(user);
		
		System.out.println(result + "���� ���� ���� �Ϸ�!");
		
	}
	
	
	private void delete() {
		String usrid, answer;
		
		System.out.println("> ���̵� : ");
		usrid = keyin.nextLine();
		UserVO vo = dao.findById(usrid);
		if(vo == null) {
			System.out.println("**  ���̵� �������� �ʽ��ϴ�.");
			return;
		}
		System.out.println(vo);
		System.out.print(" ** ���� Ż�� �Ͻðٽ��ϱ�?(y/n) : ");
		answer = keyin.nextLine();
		
		if(!answer.equals("y")) {
			System.out.print(" ** Ż�� �۾��� ��� �߽��ϴ�. ");
			return;
		}
		
		int result = dao.delete(usrid);
		if(result == 1)
			System.out.println(" ** Ż�� �Ϸ� �Ǿ����ϴ�.");
		
	}                                                                                                                                                                                                                                                                              

	private void printAll() {
		System.out.println("			[��ü ȸ�� ��ȸ]			");
		List<User> list = dao.selectAll();
		
		for(User user:list)
			System.out.println(user);
		
		
	}
	
}
