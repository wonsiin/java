package net.scit.dao;

import java.util.List;

import net.scit.vo.Board;
import net.scit.vo.Reply;

public interface ReplyMapper {
			//��� ���
	public List<Reply> listReply(int boardnum);
			//��� ����
	public int writeReply(Reply Reply);
			//��� ����
	public int deleteReply(int replynum);
			//��� ����
	public int updateReply(Reply replynum);
	
	public Reply findById(int boardnum);
	
}
