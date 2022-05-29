package net.scit.word.dao;

import java.util.List;

import net.scit.word.vo.Word;

/**
 * Mapper XML�� SQL�� ��� �޼���
 */

public interface WordMapper {
	// �ܾ� �߰�
	public int appendWord(Word word);
	
	// �ܾ� ��� 	
	public List<Word> listWord();
	
	// �ܾ� ã��
	public Word findByWord(String word);
	
	// �ܾ� ����
	public int deleteWord(int seq);
	
	// �ܾ� ����
	public int updateWord(Word word);
	
	// �� �ܾ��
	public int totalWords();
}
