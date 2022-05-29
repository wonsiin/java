package net.scit.ui;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import net.scit.dao.ReplyDAO;
import net.scit.vo.Board;
import net.scit.vo.Reply;

public class ReplyUI {
	Scanner keyin = new Scanner(System.in);
	ReplyDAO ReplyDao = new ReplyDAO();
	
	public ReplyUI(int boardnum) {
		

		
		while(true) {
			subMenu();
			String choice = keyin.nextLine();
			
			switch (choice) {
			case "1": input(boardnum); break;
			case "2": delete(boardnum); break;
			case "3": update(); break;
			case "4": list(boardnum); break;
			case "0": 
				return;
			default:
				System.out.println("err) �޴��� �ٽ� ������ �ּ���");
			}
//			keyin.nextLine(); //���� ����
		}
		
	}
	
	private void input(int boardnum) {
		String writer;
		String text;
		
		System.out.print(">�ۼ��ڸ� �Է��ϼ��� : ");
		writer = keyin.nextLine();
		if(writer.trim().equals("")) {	//���ڸ� �Է��Ҽ��ְ� �ٸ��� ������ �Է¾ȵǰ�
			System.out.println("���ڷ� �Է����ּ���");
			return;
		}
		System.out.print(">������ �Է��ϼ��� : ");
		text = keyin.nextLine();
		if(text.trim().equals("")) {	//���ڸ� �Է��Ҽ��ְ� �ٸ��� ������ �Է¾ȵǰ�
			System.out.println("���ڷ� �Է����ּ���");
			return;
		}
		System.out.println(boardnum);
		Reply reply = new Reply(boardnum,writer, text);
		
		ReplyDao.writeReply(reply);
	}

	private void delete(int boardnum) {
		String answer;
		int replynum;
		System.out.print("������ ID�� �����Դϱ� : ");
		replynum = keyin.nextInt();
		keyin.nextLine();
		Reply r = ReplyDao.findById(replynum);
		if(r == null) {
			System.out.println("** �ش� ���̵��� ȸ���� �����ϴ�.");
			return;
		}
		System.out.print("** ������ Ż���Ͻðڽ��ϱ�? (y/n)");
		answer = keyin.next();
		if(answer.equals("y")) {
			ReplyDao.deleteReply(replynum); // ���ϰ��� ���� �ʾƵ� �ȴ�. ==> 
			System.out.println("** ���� �Ϸ�\n");
			return;
		}else {
			System.out.println("** ���� �۾��� ��ҵǾ����ϴ�.");
		}
	}
	
	private void list(int boardnum) {
		List<Reply> list = ReplyDao.listReply(boardnum);
		Iterator<Reply> iter = list.iterator();
		
		while(iter.hasNext())
			System.out.println(iter.next());
		System.out.println();
	}

	private void update() {
		int replynum;
		String text;
		Reply r = new Reply();
		System.out.print(">������ ��ȣ�� �Է��ϼ��� : ");
		replynum = keyin.nextInt();
		keyin.nextLine();
		if(replynum ==r.getReplynum()) {
			System.out.println("** �ش� ��ȣ�� �����ϴ�.");
			return;
		}
		System.out.println("======= ��   �� =========");
		System.out.println("> ������ �Է��ϼ��� : ");
		text = keyin.nextLine();
		if(text.trim().equals("")) {
			System.out.println("���ڷ� �Է����ּ���");
			return;
		}
		r = ReplyDao.findById(replynum);
		r.setText(text);
			int result = 	ReplyDao.updateReply(r);
		System.out.printf("** %d �� ������ �Ϸ�Ǿ����ϴ�.",result);
	}

	private void subMenu() {
		System.out.println();
		System.out.println("============[���� �Խ���]===============");
		System.out.println("      1) ���� ����");
		System.out.println("      2) ���� ����");
		System.out.println("      3) ���� ����");
		System.out.println("      4) ��ü ����");
		System.out.println("      0) ���� ����");
		System.out.println("==================================");
		System.out.print	("                ���� > ");
	}
	
	
	
	
	
}
