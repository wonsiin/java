package net.scit.dao;

import java.util.List;

import net.scit.vo.Reply;

public interface ReplyMapper {

	//댓글 목록
	public List<Reply> listReply(String boardnum);

	//댓글 쓰기
	public int writeReply(Reply reply);
	
	//하나의 댓글 객체 불러오기
	public Reply selectReply(String replynum);
	
	//댓글 삭제
	public int deleteReply(String replynum);
	
	//댓글 수정
	public int updateReply(Reply reply);
}
