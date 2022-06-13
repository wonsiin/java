package net.scit.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import net.scit.vo.BoardVO;
import net.scit.vo.UserVO;

public class BoardDAO {
	SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();
	
	
	public int getCount(UserVO vo) {
		SqlSession session = null;
		session = factory.openSession();
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		 mapper.getCount();
		 if(mapper.getCount() == 0 ) {
			 System.out.print("아무것도 존재하지 않습니다.");
			 System.out.println();
			 return 0;
		 }
		 session.commit();
		System.out.println("게시판 개수는 " + mapper.getCount()+ " 개 입니다. ");
		return 1;
		}
	
	public List<BoardVO> listBoard(String teamnum) {
		SqlSession session = null;
		session = factory.openSession();
		
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		List<BoardVO> list = mapper.listBoard(teamnum);
		session.commit();
		return list;
	}
	

	
	public List<BoardVO> adminlistBoard(UserVO vo) {
		SqlSession session = null;
		session = factory.openSession();
		
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		List<BoardVO> list = mapper.adminlistBoard();
		session.commit();
		return list;
	}
	
	public BoardVO readBoard(String b_num) {
		SqlSession session = null;
		session = factory.openSession();
		
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		BoardVO result = mapper.readBoard(b_num);
		session.commit();
		return result;
	}
	
	


	public int weiterBoard(BoardVO board) {
		SqlSession session = null;
		session = factory.openSession();
		
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		int result = mapper.weiterBoard(board);
		session.commit();
		return result;
	}
	
	public BoardVO beBoard(String b_num) {
		SqlSession session = null;
		session = factory.openSession();
		
		
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		BoardVO result = mapper.beBoard(b_num);

		session.commit();
		
		return result;
	}
	
	

	public void deletBoard(String b_num) {
		SqlSession session = null;
		session = factory.openSession();
		
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		mapper.deletBoard(b_num);

		session.commit();
	}

	public List<BoardVO> searchBoard(Map<String, Object> map) {
		SqlSession session = null;
		session = factory.openSession();

		BoardMapper mapper = session.getMapper(BoardMapper.class);

		List<BoardVO> list = mapper.searchBoard(map);
		session.commit();
		return list;
		
	}

	public int updateBoard(BoardVO board) {
		SqlSession session = null;
		session = factory.openSession();

		BoardMapper mapper = session.getMapper(BoardMapper.class);

		int result = mapper.updateBoard(board);
		session.commit();
		return result;
	}
	
}