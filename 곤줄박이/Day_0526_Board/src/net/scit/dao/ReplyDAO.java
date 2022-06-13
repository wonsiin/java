package net.scit.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import net.scit.vo.Reply;

public class ReplyDAO {

	SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();

	public List<Reply> listReply(String boardnum) {
		SqlSession session = null;
		session = factory.openSession();

		ReplyMapper mapper = session.getMapper(ReplyMapper.class);

		List<Reply> list = mapper.listReply(boardnum);

		return list;
	}

	public int writeReply(Reply vo) {
		SqlSession session = null;
		session = factory.openSession();

		ReplyMapper mapper = session.getMapper(ReplyMapper.class);

		int result = mapper.writeReply(vo);
		session.commit();

		return result;
	}

	public Reply selectReply(String boardnum) {
		SqlSession session = null;
		session = factory.openSession();

		ReplyMapper mapper = session.getMapper(ReplyMapper.class);

		Reply reply = mapper.selectReply(boardnum);

		return reply;
	}

	public int updateReply(Reply reply) {
		SqlSession session = null;
		session = factory.openSession();

		ReplyMapper mapper = session.getMapper(ReplyMapper.class);

		int result = mapper.updateReply(reply);
		session.commit();

		return result;
	}

	public int deleteReply(String replynum) {
		SqlSession session = null;
		session = factory.openSession();

		ReplyMapper mapper = session.getMapper(ReplyMapper.class);

		int result = mapper.deleteReply(replynum);
		session.commit();

		return result;
	}

}
