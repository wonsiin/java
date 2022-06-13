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
				System.out.println("** 프로그램을 종료합니다.");
				System.exit(0);
			default:
				System.out.println("err ) 메뉴를 다시 선택해주세요.ㄴ");
			}
			// keyin.nextLine();
		}
	}

	private void input() {
		String writer, title, text;

		System.out.println("> 작성자");
		writer = keyin.nextLine();

		if (writer.trim().equals("")) {
			System.out.println("작성자가 입력되지 않았습니다.");
			return;
		}

		System.out.println(" > 제목");
		title = keyin.nextLine();

		if (title.trim().equals("")) {
			System.out.println("제목이 입력되지 않았습니다.");
			return;
		}

		System.out.println(" > 내용");
		text = keyin.nextLine();

		if (text.trim().equals("")) {
			System.out.println("내용이 입력되지 않았습니다.");
			return;
		}

		Board board = new Board(writer, title, text);

		int result = boardDAO.writeBoard(board);

		if (result == 1) {
			System.out.println(result + "건 입력 완료");
		} else {
			System.out.println("오류 발생");
		}

	}

	private void list() {

		System.out.println("======== 게시글 목록 ========");

		List<Board> list = boardDAO.listBoard();

		for (Board board : list) {
			System.out.println(board);
		}

	}

	// 개별조회
	private void read() {

		List<Board> list = boardDAO.listBoard();

		for (Board board : list) {
			System.out.println(list);
		}

		System.out.println("조회할 글 번호 >");
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
		String writer, text;

		System.out.println("> 작성자");
		writer = keyin.nextLine();

		if (writer.trim().equals("")) {
			System.out.println("작성자가 입력되지 않았습니다.");
			return;
		}

		System.out.println(" > 내용");
		text = keyin.nextLine();

		if (text.trim().equals("")) {
			System.out.println("내용이 입력되지 않았습니다.");
			return;
		}

		Reply vo = new Reply(boardnum, writer, text);

		int result = replyDAO.writeReply(vo);

		System.out.println(result + "건 등록 완료");
	}

	private void UpdateReply() {
		System.out.println("수정할 댓글 번호 >");
		String replynum = keyin.nextLine();

		Reply reply = replyDAO.selectReply(replynum);

		if (reply == null) {
			System.out.println("수정할 댓글이 없습니다.");
			return;
		}

		System.out.println("수정할 댓글 내용 > ");
		String newText = keyin.nextLine();

		reply.setText(newText);

		int result = replyDAO.updateReply(reply);

		System.out.println(result + "건 수정 완료");

	}

	private void deleteReply() {
		String replynum;

		System.out.println("삭제할 댓글 번호");

		replynum = keyin.nextLine();

		Reply reply = replyDAO.selectReply(replynum);

		if (reply == null) {
			System.out.println("수정할 댓글이 없습니다.");
			return;
		}

		System.out.println(reply);

		System.out.println("정말 삭제하시겠습니까? (y/n)");

		String ans = keyin.nextLine();

		if (!ans.equals("y")) {
			System.out.println("댓글 삭제를 취소합니다.");
			return;
		}

		int result = replyDAO.deleteReply(replynum);

		System.out.println(result + "건 삭제 완료");
	}

	private void submenu() {
		System.out.println("=============[댓   글]=============");
		System.out.println("			1) 댓글 작성");
		System.out.println("			2) 댓글 수정");
		System.out.println("			3) 댓글 삭제");
		System.out.println("----------------------------------");
		System.out.println("   	> 선택");
	}

	private void delete() {
		System.out.println("** 삭제를 선택했습니다.");

		String answer;

		int count = boardDAO.getCount();

		if (count == 0) {
			System.out.println("삭제할 회원이 없습니다.");
			return;
		}

		System.out.print("삭제할 글 번호를 입력하세요 >>");
		String boardnum = keyin.nextLine();

		Board board = boardDAO.readBoard(boardnum);

		if (board == null) {
			System.out.println("해당 글이 존재하지 않습니다.");
			return;
		}

		System.out.println("작성자명을 입력하세요 >>");

		String writer = keyin.nextLine();

		if (!board.getWriter().equals(writer)) {
			System.out.println("작성자명이 일치하지 않습니다.");
			return;
		}

		System.out.println("정말 삭제하시겠습니까?");

		answer = keyin.nextLine();

		if (answer.equals("y")) {
			int result = boardDAO.deleteBoard(boardnum);

			if (result == 1) {
				System.out.println("삭제 완료");
			} else {
				System.out.println("삭제 실패");
			}
		} else {
			System.out.println("탈퇴가 취소되었습니다.");
		}
	}

	private void update() {
		System.out.println("수정을 선택했습니다.");

		int count = boardDAO.getCount();

		if (count == 0) {
			System.out.println("수정할 글이 없습니다.");
			return;
		}

		System.out.println("삭제할 글 번호 >");
		String boardnum = keyin.next();

		Board board = boardDAO.readBoard(boardnum);

		System.out.println(board);

//		String answer = keyin.nextLine();

		System.out.println("새로운 제목을 입력하세요.");
		String title = keyin.nextLine();
		board.setTitle(title);

		System.out.println("새로운 본문을 입력하세요");
		String text = keyin.nextLine();
		board.setText(text);

		int result = boardDAO.updateBoard(board);

		System.out.println(result + "건 수정 완료");

	}

	private void search() {
		String searchWord = null, searchItem = null, choice;

		System.out.println("\n     [게시글 검색]");
		System.out.println("	1) 작성자 검색    2) 제목 검색   3) 내용 검색   0) 돌아가기");
		choice = keyin.nextLine();
		switch (choice) {
		case "1":	searchItem = "writer";	break;
		case "2":	searchItem = "title";break;
		case "3":searchItem = "text";break;
		default:
			System.out.println("** 메뉴 선택 오류");
			return;
		}
		System.out.print("** 검색어를 입력해주세요.");
		searchWord = keyin.nextLine();
		Map<String, Object> map = new HashMap<>();
		map.put("searchItem", searchItem);
		map.put("searchWord", searchWord);
		List<Board> list = boardDAO.searchBoard(map);
		System.out.println("<< 검색 결과 >> ");
		if (list == null) {
			System.out.println("검색 결과가 없습니다.");
			return;
		}

		list.forEach(x -> System.out.println(x));
	}

	private void mainMenu() {
		System.out.println("===== [오픈 게시판] =====");
		System.out.println("      1) 게시글 쓰기");
		System.out.println("      2) 전체 목록 조회");
		System.out.println("      3) 게시글 읽기");
		System.out.println("      4) 게시글 삭제");
		System.out.println("      5) 게시글 수정");
		System.out.println("      6) 게시글 검색");
		System.out.println("      0) 프로그램 종료");
		System.out.println("=======================");
		System.out.println("         선택 > ");
	}

}