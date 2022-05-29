package net.scit.word.ui;

import java.util.List;
import java.util.Scanner;

import net.scit.word.dao.WordDAO;
import net.scit.word.service.GuessingGame;
import net.scit.word.vo.Word;

public class GuessingGameUI{
	Scanner keyin = new Scanner(System.in);
	WordDAO dao = new WordDAO();
	
	public GuessingGameUI() {
		String choice;
		while(true) {
			mainMenu();
			choice = keyin.nextLine();
			
			switch(choice) {
			case "1" : list();  	break;
			case "2" : add();   	break;
			case "3" : search();   	break;
			case "4" : update(); 	break;
			case "5" : delete(); 	break;
			case "6" : guessingGame(); break;
			case "0" : 
				System.out.println("** 프로그램을 종료합니다.");
				System.exit(0);
			default :
				System.out.println("err) 메뉴를 다시 선택해 주세요");
			}
			//keyin.nextLine(); // 버퍼 비우기
		}
	}
	
	// 메인 메뉴
	private void mainMenu() {
		System.out.println("===== [일본어 단어 외우기] =====");
		System.out.println("       1) 전체 목록 조회");
		System.out.println("       2) 단어 추가");
		System.out.println("       3) 단어 찾기");
		System.out.println("       4) 단어 수정");
		System.out.println("       5) 단어 삭제");
		System.out.println("       6) 단어 맞추기 게임");
		System.out.println("       0) 프로그램 종료");
		System.out.println("============================");
		System.out.print  ("          선택> ");
	}
	

	// 전체 단어 조회
	private void list() {
		System.out.println("\n<< 전체 단어 조회 >>");
		
		// Code Here
		
		
	}

	// 새로운 단어 추가
	private void add() {
		String word, mean;
		System.out.println("\n<< 새로운 단어 등록 >>");
		
		System.out.print("> 단어 : ");
		word = keyin.nextLine();
		if(word.trim().equals("")) {
			System.out.println("err) 단어를 입력해주세요");
			return;
		}
		
		System.out.print("> 뜻 : ");
		mean = keyin.nextLine();

		if(mean.trim().equals("")) {
			System.out.println("err) 단어의 뜻을 입력해주세요");
			return;
		}
		
		// Code Here
		
		System.out.println("** 새로운 단어가 등록되었습니다.\n");
	}

	// 단어 찾기
	private void search() {
		String word;
		System.out.println("\n<< 단어 찾기 >>");
		
		System.out.print("> 단어 : ");
		word = keyin.nextLine();
		if(word.trim().equals("")) {
			System.out.println("err) 단어를 입력해주세요");
			return;
		}		
	
		Word findWord = dao.findByWord(word);
		if(findWord == null) {
			System.out.println("** 단어가 없습니다.");
			return;
		}
		
		System.out.println(findWord);
	}
	
	// 단어 수정
	private void update() {
		String word, mean;
		
		System.out.println("\n<< 단어 수정 >>");
		
		// Code here
	}
	
	// 단어 삭제
	private void delete() {
		String word, answer;
		int result = 0;
		
		System.out.println("\n<< 단어 삭제 >>");
		
		// Code Here
		
		System.out.println(result +"개 단어가 삭제되었습니다.");
	}
	// 단어 맞추기 게임
	private void guessingGame() {
		GuessingGame game = new GuessingGame();
	}
}
