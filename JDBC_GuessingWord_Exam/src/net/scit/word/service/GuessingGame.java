package net.scit.word.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import net.scit.word.dao.WordDAO;
import net.scit.word.vo.Word;

// �ܾ� ���߱� ����
public class GuessingGame {
	int todayScore;	// ���� ���� ����
	Scanner keyin = new Scanner(System.in);		

	WordDAO dao = new WordDAO();
	List<Word> todayWord;

	public GuessingGame() {
		System.out.println("\n<< �ܾ� ���߱� ���� >>");

		todayWord = choiceWord();

		startGame();
	}

	// �ܾ� ���߱� ����
	// 5���� ���� ������ �ǽ��Ͽ� ���� ��� DB�� memorize�÷��� 1�� ����
	private void startGame() {
		String word, rightMean;
		Word w = null;
		List<Word> myAnswer = new ArrayList<Word>();

		// Code Here

		result(myAnswer);
	}

	// ���Ӱ���� ���� ���
	private void result(List<Word> myAnswer) {
		System.out.println("\n## ���� ���� ���� : " + todayScore);

		for(int i=0; i<myAnswer.size(); ++i) {
			System.out.println(myAnswer.get(i));
		}
	}

	// ������ �ܾ �����ϰ� 5�� �����Ͽ� ��ȯ�ϴ� �޼ҵ�
	// ���õ� �ܾ�� �ߺ����� �ʾƾ� �ϰ�, �ܿ��� ���� �ܾ�� �Ѵ�.
	private List<Word> choiceWord() {
		List<Word> list = dao.listWord();	// DB�� ���� ������ ������
		List<Word> choiceWord = new ArrayList<Word>(); // �����ϰ� ���õ� 
		Set<Word> choice = new HashSet<>();	// �ߺ� ���Ÿ� ���� ���

		// Code Here
		
		return choiceWord;
	}
}
