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
				System.out.println("err) 메뉴를 다시 선택해 주세요");
			}
//			keyin.nextLine(); //버퍼 비우기
		}
		
	}
	
	private void input(int boardnum) {
		String writer;
		String text;
		
		System.out.print(">작성자를 입력하세요 : ");
		writer = keyin.nextLine();
		if(writer.trim().equals("")) {	//글자만 입력할수있게 다른게 들어오면 입력안되게
			System.out.println("문자로 입력해주세요");
			return;
		}
		System.out.print(">내용을 입력하세요 : ");
		text = keyin.nextLine();
		if(text.trim().equals("")) {	//글자만 입력할수있게 다른게 들어오면 입력안되게
			System.out.println("문자로 입력해주세요");
			return;
		}
		System.out.println(boardnum);
		Reply reply = new Reply(boardnum,writer, text);
		
		ReplyDao.writeReply(reply);
	}

	private void delete(int boardnum) {
		String answer;
		int replynum;
		System.out.print("삭제할 ID는 무엇입니까 : ");
		replynum = keyin.nextInt();
		keyin.nextLine();
		Reply r = ReplyDao.findById(replynum);
		if(r == null) {
			System.out.println("** 해당 아이디의 회원이 없습니다.");
			return;
		}
		System.out.print("** 정말로 탈퇴하시겠습니까? (y/n)");
		answer = keyin.next();
		if(answer.equals("y")) {
			ReplyDao.deleteReply(replynum); // 리턴값을 받지 않아도 된다. ==> 
			System.out.println("** 삭제 완료\n");
			return;
		}else {
			System.out.println("** 삭제 작업이 취소되었습니다.");
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
		System.out.print(">수정할 번호를 입력하세요 : ");
		replynum = keyin.nextInt();
		keyin.nextLine();
		if(replynum ==r.getReplynum()) {
			System.out.println("** 해당 번호가 없습니다.");
			return;
		}
		System.out.println("======= 수   정 =========");
		System.out.println("> 내용을 입력하세요 : ");
		text = keyin.nextLine();
		if(text.trim().equals("")) {
			System.out.println("문자로 입력해주세요");
			return;
		}
		r = ReplyDao.findById(replynum);
		r.setText(text);
			int result = 	ReplyDao.updateReply(r);
		System.out.printf("** %d 명 수정이 완료되었습니다.",result);
	}

	private void subMenu() {
		System.out.println();
		System.out.println("============[오픈 게시판]===============");
		System.out.println("      1) 덧글 쓰기");
		System.out.println("      2) 덧글 삭제");
		System.out.println("      3) 덧글 수정");
		System.out.println("      4) 전체 덧글");
		System.out.println("      0) 돌아 가기");
		System.out.println("==================================");
		System.out.print	("                선택 > ");
	}
	
	
	
	
	
}
