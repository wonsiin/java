package net.scit.dao;

import java.util.List;
import java.util.Map;

import net.scit.vo.Board;
import net.scit.vo.Reply;

public interface BoardMapper {
	//�Խñ� ��ü ���
	public List<Board> listBoard();
	
	//�Խñ� ���
	public int weiterBoard(Board board); //
	//�Խñ� ��ȸ
	public Board readBoard(int boardunm); //
	//�Խñ� �˻�
	public List<Board>  searchBoard(Map<String, Object> map);
	//�Խñ� ����
	public int deletBoard(int boardunm); //
	//�Խñ� ����
	public int updateBoard(Board board);
	//��ȸ�� ����
	public int incrementHitcount(int boardaunm); //
	//��ü �� ����
	public int getCount();

	public Board findById(int boardnum);

	
	
}
