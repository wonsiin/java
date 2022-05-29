package net.scit.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import net.scit.vo.Board;
import net.scit.vo.Reply;

public class ReplyDAO {
	SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();
	
	public int writeReply(Reply reply) {
		SqlSession session = null;
		session = factory.openSession();
		
		ReplyMapper mapper = session.getMapper(ReplyMapper.class);
		int result = mapper.writeReply(reply);
		session.commit();
		
		
		return result;
	}

	public Reply findById(int replynum) {
		SqlSession session = null;
		session = factory.openSession();
		
		ReplyMapper mapper = session.getMapper(ReplyMapper.class);
		Reply r = mapper.findById(replynum);//데이터를 가져올수 있는지 확인  (vo안에서)
		return r;
	}

	public int deleteReply(int boardnum) {
		SqlSession session = null;
		session = factory.openSession();
		
		ReplyMapper mapper = session.getMapper(ReplyMapper.class);
		int result = mapper.deleteReply(boardnum);
		if(result == 1) {
			session.commit();
			return 1;
		}
		return 0;
		
	}

	public List<Reply> listReply(int boardnum) {
		SqlSession session = null;
		session = factory.openSession();
		
		ReplyMapper mapper = session.getMapper(ReplyMapper.class);
		List<Reply> list = mapper.listReply(boardnum);
		return list;
	}

	public int updateReply(Reply reply) {
		SqlSession session = null;
		session = factory.openSession();
		ReplyMapper mapper = session.getMapper(ReplyMapper.class);
		int result = mapper.updateReply(reply);
		
		if(result == 1) {
			session.commit();
			return 1;
		}
		session.rollback();
		return 0;
	}
	
}
