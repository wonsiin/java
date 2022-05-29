package net.scit.word.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import net.scit.word.dao.WordDAO;
import net.scit.word.vo.Word;

// 단어 맞추기 게임
public class GuessingGame {
	int todayScore;	// 오늘 맞춘 개수
	Scanner keyin = new Scanner(System.in);		

	WordDAO dao = new WordDAO();
	List<Word> todayWord;

	public GuessingGame() {
		System.out.println("\n<< 단어 맞추기 게임 >>");

		todayWord = choiceWord();

		startGame();
	}

	// 단어 맞추기 게임
	// 5번에 거쳐 게임을 실시하여 맞은 경우 DB의 memorize컬럼을 1로 적용
	private void startGame() {
		String word, rightMean;
		Word w = null;
		List<Word> myAnswer = new ArrayList<Word>();

		// Code Here

		result(myAnswer);
	}

	// 게임결과와 점수 출력
	private void result(List<Word> myAnswer) {
		System.out.println("\n## 오늘 맞춘 개수 : " + todayScore);

		for(int i=0; i<myAnswer.size(); ++i) {
			System.out.println(myAnswer.get(i));
		}
	}

	// 오늘의 단어를 랜덤하게 5개 선택하여 반환하는 메소드
	// 선택된 단어는 중복되지 않아야 하고, 외우지 않은 단어여야 한다.
	private List<Word> choiceWord() {
		List<Word> list = dao.listWord();	// DB로 부터 가져온 데이터
		List<Word> choiceWord = new ArrayList<Word>(); // 랜덤하게 선택된 
		Set<Word> choice = new HashSet<>();	// 중복 제거를 위해 사용

		// Code Here
		
		return choiceWord;
	}
}
