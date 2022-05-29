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
		int result = mapper.weiterBoard(board); //받은 데이터를 데이터 베이스로 옴긴다. i / d /u 는 commit이 들어가야함
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
		
		Board vo = mapper.findById(boardnum);//데이터를 가져올수 있는지 확인  (vo안에서)
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
			 System.out.print("아무것도 존재하지 않습니다.");
			 System.out.println();
			 return 0;
		 }
		System.out.println("게시판 개수는 " + mapper.getCount()+ " 개 입니다. ");
		return 1;
		}
		
}