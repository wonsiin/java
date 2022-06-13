package net.scit.dao;

import java.util.List;

import net.scit.vo.Board;
import net.scit.vo.Reply;

public interface ReplyMapper {
			//댓글 목록
	public List<Reply> listReply(int boardnum);
			//댓글 쓰기
	public int writeReply(Reply Reply);
			//댓글 삭제
	public int deleteReply(int replynum);
			//댓글 수정
	public int updateReply(Reply replynum);
	
	public Reply findById(int boardnum);
	
}

