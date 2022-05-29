package net.scit.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import net.scit.ui.ReplyUI;
import net.scit.vo.Board;
import net.scit.vo.Reply;


public class BoardDAO {
	SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();
	
	public int weiterBoard(Board board) {
		SqlSession session = null;
		session = factory.openSession();
		
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		int result = mapper.weiterBoard(board); //���� �����͸� ������ ���̽��� �ȱ��. i / d /u �� commit�� ������
		session.commit();
		
		
		return result;
	}

	public List<Board> listBoard() {
		SqlSession session = null;
		session = factory.openSession();
		
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		List<Board> list = mapper.listBoard();
		return list;
	}
	
	public Board findById(int boardnum) {
		SqlSession session = null;
		session = factory.openSession();
		
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		
		Board vo = mapper.findById(boardnum);//�����͸� �����ü� �ִ��� Ȯ��  (vo�ȿ���)
		return vo;
	}

	public int deletBoard(int boardnum) {
		SqlSession session = null;
		session = factory.openSession();
		
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		int result = mapper.deletBoard(boardnum);
		if(result == 1) {
			session.commit();
			return 1;
		}
		return 0;
		
	}

	public void searchBoard(Map<String, Object> map) {
		SqlSession session = null;
		session = factory.openSession();
		
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		mapper.searchBoard(map);

		
	}

	public Board readBoard(int boardnum) {
		SqlSession session = null;
		session = factory.openSession();
		
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		Board result = mapper.readBoard(boardnum);
		incrementHitcount(boardnum);
		
		if(result != null) {
			session.commit();
			return result;
		}
		return result;
	}

	private void incrementHitcount(int boardnum) {
		SqlSession session = null;
		session = factory.openSession();
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		mapper.incrementHitcount(boardnum);
		session.commit();
	}

	public int updateBoard(Board board) {
		SqlSession session = null;
		session = factory.openSession();
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		int result = mapper.updateBoard(board);

		if(result == 1) {
			session.commit();
			return 1;
		}
		session.rollback();
		return 0;
	}

	public int getCount() {
		SqlSession session = null;
		session = factory.openSession();
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		int result = mapper.getCount();
		 mapper.getCount();
		 if(mapper.getCount() == 0 ) {
			 System.out.print("�ƹ��͵� �������� �ʽ��ϴ�.");
			 System.out.println();
			 return 0;
		 }
		System.out.println("�Խ��� ������ " + mapper.getCount()+ " �� �Դϴ�. ");
		return 1;
		}
		
}