package net.scit.dao;

import java.util.List;
import java.util.Map;

import net.scit.vo.Board;

public interface BoardMapper {
	// �Խñ� ��ü ���
	public List<Board> listBoard();

	// �Խñ� ���
	public int writeBoard(Board board);

	// �Խñ� ��ȸ
	public Board readBoard(String boardnum);

	// �Խñ� �˻�
	public List<Board> searchBoard(Map<String, Object> map);

	// �Խñ� ����
	public int deleteBoard(String boardnum);

	// �Խñ� ����
	public int updateBoard(Board board);

	// ��ȸ�� ����
	public int incrementHitcount(String boardnum);

	// ��ü �� ��
	public int getCount();
}
