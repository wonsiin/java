package net.scit.ui;

import java.util.List;
import java.util.Scanner;

import net.scit.dao.BlikeDAO;
import net.scit.dao.BoardDAO;
import net.scit.dao.UserDAO;
import net.scit.vo.BlikeVO;
import net.scit.vo.BoardVO;
import net.scit.vo.UserVO;

public class BlikeUI {
	Scanner sc = new Scanner(System.in);
	UserDAO dao = new UserDAO();
	BoardDAO bdao = new BoardDAO();
	BlikeDAO ldao = new BlikeDAO();
	
	public BlikeUI(UserVO vo, String b_num) {
		
		likeMenu();
		String choice = sc.nextLine();

		switch (choice) {
		case "1":
			Up(vo, b_num);
			break;

		case "2":
			De(vo, b_num);
			break;

		case "3":
			new BoardUI();
		default:
			System.out.println("err) 메뉴를 다시 선택해 주세요");
			List(vo,b_num);
			break;
		case "0":
			//new BoardUI(vo);
		}
	}
	
	private void count(UserVO vo,String b_num) {
		ldao.getCount(b_num);
	}
	
	private void Up(UserVO vo, String b_num) { //덧글입력
		String usrid;
		usrid = vo.getUsrid();
		
		BlikeVO vo1 = (new BlikeVO(b_num, usrid));
		String vo2 =ldao.saga(b_num);
		System.out.println(vo2);
		if(vo2 == null) {
			 BoardVO bvo = bdao.beBoard(b_num);
			 bvo.setB_hitcount(ldao.getCount(vo1.getB_num()));
			 bdao.hitBoard(bvo);
			ldao.Up(vo1);
			System.out.println("추천완료 되었습니다!");
		}else {
			System.out.println("이미 추천하셧습니다.");
			return;
		}
		
	}
	
	private void De(UserVO vo, String b_num) {
		String usrid;
		usrid = vo.getUsrid();
		BlikeVO vo1 = (new BlikeVO(b_num, usrid));
		if(vo.getUsrid().equals(vo1.getUsrid())) {
			ldao.De(vo1);
			System.out.println("추천이 취소 되었습니다!");
			return;
		}else {
			System.out.println("잘못 입력하셧습니다.");
			return;
		}
	}
	
	
	
	private void likeMenu() {
		System.out.println();
		System.out.println("============[추천 하시겟습니까?]===============");
		System.out.println("      1) 추천!				2)추천취소!			3)돌아가기");
		System.out.println("==================================");
		System.out.print	("                선택 > ");
	}
	
}
