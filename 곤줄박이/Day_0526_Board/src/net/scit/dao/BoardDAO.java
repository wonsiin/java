package net.scit.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import net.scit.vo.Board;

public class BoardDAO {

	SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();

	public int writeBoard(Board board) {
		SqlSession session = null;
		session = factory.openSession();

		BoardMapper mapper = session.getMapper(BoardMapper.class);

		int result = mapper.writeBoard(board);
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

	public Board readBoard(String boardnum) {
		SqlSession session = null;
		session = factory.openSession();

		BoardMapper mapper = session.getMapper(BoardMapper.class);

		mapper.incrementHitcount(boardnum);
		Board board = mapper.readBoard(boardnum);

		session.commit();
		return board;

	}

	public List<Board> searchBoard(Map<String, Object> map) {
		SqlSession session = null;
		session = factory.openSession();

		BoardMapper mapper = session.getMapper(BoardMapper.class);

		List<Board> list = mapper.searchBoard(map);
		
		return list;

	}

	public int deleteBoard(String boardnum) {
		SqlSession session = null;
		session = factory.openSession();

		BoardMapper mapper = session.getMapper(BoardMapper.class);

		int result = mapper.deleteBoard(boardnum);
		session.commit();

		return result;
	}

	public int updateBoard(Board board) {

		SqlSession session = null;
		session = factory.openSession();

		BoardMapper mapper = session.getMapper(BoardMapper.class);

		int result = mapper.updateBoard(board);
		session.commit();

		return result;

	}

	public int getCount() {
		SqlSession session = null;
		session = factory.openSession();

		BoardMapper mapper = session.getMapper(BoardMapper.class);

		int result = mapper.getCount();

		return result;
	}
}
