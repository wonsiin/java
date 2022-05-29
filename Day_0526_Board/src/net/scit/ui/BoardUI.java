package net.scit.ui;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import net.scit.dao.BoardDAO;
import net.scit.vo.Board;

public class BoardUI {
	Scanner keyin = new Scanner(System.in);
	Map<String, Object> map= new HashMap<>();
	BoardDAO boardDao = new BoardDAO();
//	ReplyDAO ReplyDao = new ReplyDAO();
	
	public BoardUI() {
		String choice;
		while(true) {
			mainMenu();
			choice = keyin.nextLine();
			
			switch (choice) {
			case "1": input(); break;
			case "2": list(); break;
			case "3": read(); break;
			case "4": delete(); break;
			case "5": update(); break;
			case "6": search(); break;
			case "7": count(); break;
			case "0": 
				System.out.println("** ���α׷��� �����մϴ�.");
				System.exit(0);
			default:
				System.out.println("err) �޴��� �ٽ� ������ �ּ���");
			}
//			keyin.nextLine(); //���� ����
		}
	}

	private void count() {
		boardDao.getCount();
		
	}

	private void input() {
		String writer;
		String title;
		String text;
		
		System.out.print(">������ �Է��ϼ��� : ");
		title = keyin.nextLine();
		if(title.trim().equals("")) {	//���ڸ� �Է��Ҽ��ְ� �ٸ��� ������ �Է¾ȵǰ�
			System.out.println("���ڷ� �Է����ּ���");
			return;
		}
		System.out.print(">�ۼ��ڸ� �Է��ϼ��� : ");
		writer = keyin.nextLine();
		if(writer.trim().equals("")) {	//���ڸ� �Է��Ҽ��ְ� �ٸ��� ������ �Է¾ȵǰ�
			System.out.println("���ڷ� �Է����ּ���");
			return;
		}
		System.out.println(">������ �Է��ϼ��� : ");
		text = keyin.nextLine();
		if(text.trim().equals("")) {	//���ڸ� �Է��Ҽ��ְ� �ٸ��� ������ �Է¾ȵǰ�
			System.out.println("���ڷ� �Է����ּ���");
			return;
		}
		Board board = new Board(writer, title, text);
		
		int result = boardDao.weiterBoard(board);
		map.put(board.getText(), board);
		System.out.printf("** %d �� ȸ�������� �Ϸ�Ǿ����ϴ�.",result);
	}

	private void list() {
		List<Board> list = boardDao.listBoard();
		Iterator<Board> iter = list.iterator();
		
		while(iter.hasNext())
			System.out.println(iter.next());
		System.out.println();
	}

	private void read() {
		int boardnum;
		list();
		System.out.print(">���� ��ȣ�� �Է��ϼ��� : ");
		boardnum = keyin.nextInt();
		keyin.nextLine();
		Board result = boardDao.readBoard(boardnum);
		
		System.out.println(result.getText());
		
		new ReplyUI(result.getBoardnum());
		
		
		
		
	}

	private void delete() {
		String answer;
		int boardnum;
		System.out.print("������ ID�� �����Դϱ� : ");
		boardnum = keyin.nextInt();
		keyin.nextLine();
		Board b = boardDao.findById(boardnum);
		if(b == null) {
			System.out.println("** �ش� ���̵��� ȸ���� �����ϴ�.");
			return;
		}
		System.out.print("** ������ Ż���Ͻðڽ��ϱ�? (y/n)");
		answer = keyin.next();
		if(answer.equals("y")) {
			boardDao.deletBoard(boardnum); // ���ϰ��� ���� �ʾƵ� �ȴ�. ==> 
			System.out.println("** ���� �Ϸ�\n");
			return;
		}else {
			System.out.println("** ���� �۾��� ��ҵǾ����ϴ�.");
		}
		
	}

	private void update() {
		int boardnum;
		String title;
		String text;
		list();
		System.out.print(">������ ��ȣ�� �Է��ϼ��� : ");
		boardnum = keyin.nextInt();
		keyin.nextLine();
		if(boardnum == 0) {
			System.out.println("** �ش� ��ȣ�� �����ϴ�.");
			return;
		}
		System.out.println("====��  ��====");
		System.out.print("> ������ �����ΰ��� : ");
		title = keyin.nextLine();
		if(title.trim().equals("")) {
			System.out.println("���ڷ� �Է����ּ���");
			return;
		}
		System.out.println("> ������ �Է��ϼ��� : ");
		text = keyin.nextLine();
		if(text.trim().equals("")) {
			System.out.println("���ڷ� �Է����ּ���");
			return;
		}
		Board board = boardDao.readBoard(boardnum);
		board.setText(text);
		board.setTitle(title);
		
		int result = boardDao.updateBoard(board);
		System.out.printf("** %d �� ������ �Ϸ�Ǿ����ϴ�.",result);
		
	}

	private void search() {
		List<Board> list = boardDao.listBoard();
		Iterator<Board> iter = list.iterator();
		Board board = new Board();
		keyin.nextLine();
		System.out.print("> ������ ã�� �ܾ �Է��ϼ��� : ");
		String a = keyin.nextLine();
		map.put(a, board);
		while(iter.hasNext())
			System.out.println(iter.next());
		
		boardDao.searchBoard(map);
		System.out.println(map.size());
	}

	private void mainMenu() {
		System.out.println();
		System.out.println("============[���� �Խ���]===============");
		System.out.println("      1) �Խñ� ����");
		System.out.println("      2) ��ü ��� ��ȸ");
		System.out.println("      3) �Խñ� �б�");
		System.out.println("      4) �Խñ� ����");
		System.out.println("      5) �Խñ� ����");
		System.out.println("      6) �Խñ� �˻�");
		System.out.println("      7) �� �Խñ� ��");
		System.out.println("      0) ���α׷� ����");
		System.out.println("==================================");
		System.out.print	("                ���� > ");
	}
}
