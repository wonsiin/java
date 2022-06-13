package net.scit.ui;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import net.scit.dao.BoardDAO;
import net.scit.dao.ReplyDAO;
import net.scit.vo.Board;
import net.scit.vo.Reply;

public class BoardUI {
	Scanner keyin = new Scanner(System.in);
	BoardDAO boardDAO = new BoardDAO();
	ReplyDAO replyDAO = new ReplyDAO();

	public BoardUI() {
		String choice;

		while (true) {
			mainMenu();

			choice = keyin.nextLine();

			switch (choice) {
			case "1":
				input();
				break;
			case "2":
				list();
				break;
			case "3":
				read();
				break;
			case "4":
				delete();
				break;
			case "5":
				update();
				break;
			case "6":
				search();
				break;
			case "0":
				System.out.println("** ���α׷��� �����մϴ�.");
				System.exit(0);
			default:
				System.out.println("err ) �޴��� �ٽ� �������ּ���.��");
			}
			// keyin.nextLine();
		}
	}

	private void input() {
		String writer, title, text;

		System.out.println("> �ۼ���");
		writer = keyin.nextLine();

		if (writer.trim().equals("")) {
			System.out.println("�ۼ��ڰ� �Էµ��� �ʾҽ��ϴ�.");
			return;
		}

		System.out.println(" > ����");
		title = keyin.nextLine();

		if (title.trim().equals("")) {
			System.out.println("������ �Էµ��� �ʾҽ��ϴ�.");
			return;
		}

		System.out.println(" > ����");
		text = keyin.nextLine();

		if (text.trim().equals("")) {
			System.out.println("������ �Էµ��� �ʾҽ��ϴ�.");
			return;
		}

		Board board = new Board(writer, title, text);

		int result = boardDAO.writeBoard(board);

		if (result == 1) {
			System.out.println(result + "�� �Է� �Ϸ�");
		} else {
			System.out.println("���� �߻�");
		}

	}

	private void list() {

		System.out.println("======== �Խñ� ��� ========");

		List<Board> list = boardDAO.listBoard();

		for (Board board : list) {
			System.out.println(board);
		}

	}

	// ������ȸ
	private void read() {

		List<Board> list = boardDAO.listBoard();

		for (Board board : list) {
			System.out.println(list);
		}

		System.out.println("��ȸ�� �� ��ȣ >");
		String boardnum = keyin.next();

		keyin.nextLine();

		Board board = boardDAO.readBoard(boardnum);

		board.output();

		List<Reply> relist = replyDAO.listReply(boardnum);

		for (Reply reply : relist) {
			System.out.println(relist);
		}

		submenu();

		String choice = keyin.nextLine();

		switch (choice) {
		case "1":
			InsertReply(boardnum);
			break;

		case "2":
			UpdateReply();
			break;

		case "3":
			deleteReply();
			break;
		}

	}

	private void InsertReply(String boardnum) {
		String writer, text, title;

		System.out.println("> �ۼ���");
		writer = keyin.nextLine();

		if (writer.trim().equals("")) {
			System.out.println("�ۼ��ڰ� �Էµ��� �ʾҽ��ϴ�.");
			return;
		}

		System.out.println(" > ����");
		text = keyin.nextLine();

		if (text.trim().equals("")) {
			System.out.println("������ �Էµ��� �ʾҽ��ϴ�.");
			return;
		}

		Reply vo = new Reply(boardnum, writer, text);

		int result = replyDAO.writeReply(vo);

		System.out.println(result + "�� ��� �Ϸ�");
	}

	private void UpdateReply() {
		System.out.println("������ ��� ��ȣ >");
		String replynum = keyin.nextLine();

		Reply reply = replyDAO.selectReply(replynum);

		if (reply == null) {
			System.out.println("������ ����� �����ϴ�.");
			return;
		}

		System.out.println("������ ��� ���� > ");
		String newText = keyin.nextLine();

		reply.setText(newText);

		int result = replyDAO.updateReply(reply);

		System.out.println(result + "�� ���� �Ϸ�");

	}

	private void deleteReply() {
		String replynum;

		System.out.println("������ ��� ��ȣ");

		replynum = keyin.nextLine();

		Reply reply = replyDAO.selectReply(replynum);

		if (reply == null) {
			System.out.println("������ ����� �����ϴ�.");
			return;
		}

		System.out.println(reply);

		System.out.println("���� �����Ͻðڽ��ϱ�? (y/n)");

		String ans = keyin.nextLine();

		if (!ans.equals("y")) {
			System.out.println("��� ������ ����մϴ�.");
			return;
		}

		int result = replyDAO.deleteReply(replynum);

		System.out.println(result + "�� ���� �Ϸ�");
	}

	private void submenu() {
		System.out.println("=============[��   ��]=============");
		System.out.println("			1) ��� �ۼ�");
		System.out.println("			2) ��� ����");
		System.out.println("			3) ��� ����");
		System.out.println("----------------------------------");
		System.out.println("   	> ����");
	}

	private void delete() {
		System.out.println("** ������ �����߽��ϴ�.");

		String answer;

		int count = boardDAO.getCount();

		if (count == 0) {
			System.out.println("������ ȸ���� �����ϴ�.");
			return;
		}

		System.out.print("������ �� ��ȣ�� �Է��ϼ��� >>");
		String boardnum = keyin.nextLine();

		Board board = boardDAO.readBoard(boardnum);

		if (board == null) {
			System.out.println("�ش� ���� �������� �ʽ��ϴ�.");
			return;
		}

		System.out.println("�ۼ��ڸ��� �Է��ϼ��� >>");

		String writer = keyin.nextLine();

		if (!board.getWriter().equals(writer)) {
			System.out.println("�ۼ��ڸ��� ��ġ���� �ʽ��ϴ�.");
			return;
		}

		System.out.println("���� �����Ͻðڽ��ϱ�?");

		answer = keyin.nextLine();

		if (answer.equals("y")) {
			int result = boardDAO.deleteBoard(boardnum);

			if (result == 1) {
				System.out.println("���� �Ϸ�");
			} else {
				System.out.println("���� ����");
			}
		} else {
			System.out.println("Ż�� ��ҵǾ����ϴ�.");
		}
	}

	private void update() {
		System.out.println("������ �����߽��ϴ�.");

		int count = boardDAO.getCount();

		if (count == 0) {
			System.out.println("������ ���� �����ϴ�.");
			return;
		}

		System.out.println("������ �� ��ȣ >");
		String boardnum = keyin.next();

		Board board = boardDAO.readBoard(boardnum);

		System.out.println(board);

		String answer = keyin.nextLine();

		System.out.println("���ο� ������ �Է��ϼ���.");
		String title = keyin.nextLine();
		board.setTitle(title);

		System.out.println("���ο� ������ �Է��ϼ���");
		String text = keyin.nextLine();
		board.setText(text);

		int result = boardDAO.updateBoard(board);

		System.out.println(result + "�� ���� �Ϸ�");

	}

	private void search() {
		String searchWord = null, searchItem = null, choice;

		System.out.println("\n     [�Խñ� �˻�]");
		System.out.println("	1) �ۼ��� �˻�    2) ���� �˻�   3) ���� �˻�   0) ���ư���");
		choice = keyin.nextLine();

		switch (choice) {
		case "1":
			searchItem = "writer";
			break;

		case "2":
			searchItem = "title";
			break;

		case "3":
			searchItem = "text";
			break;

		case "4":
			break;

		default:
			System.out.println("** �޴� ���� ����");
			return;
		}

		System.out.print("** �˻�� �Է����ּ���.");
		searchWord = keyin.nextLine();

		Map<String, Object> map = new HashMap<>();

		map.put("searchItem", searchItem);
		map.put("searchWord", searchWord);

		List<Board> list = boardDAO.searchBoard(map);

		System.out.println("<< �˻� ��� >> ");

		if (list == null) {
			System.out.println("�˻� ����� �����ϴ�.");
			return;
		}

		list.forEach(x -> System.out.println(x));
	}

	private void mainMenu() {
		System.out.println("===== [���� �Խ���] =====");
		System.out.println("      1) �Խñ� ����");
		System.out.println("      2) ��ü ��� ��ȸ");
		System.out.println("      3) �Խñ� �б�");
		System.out.println("      4) �Խñ� ����");
		System.out.println("      5) �Խñ� ����");
		System.out.println("      6) �Խñ� �˻�");
		System.out.println("      0) ���α׷� ����");
		System.out.println("=======================");
		System.out.println("         ���� > ");
	}

}
