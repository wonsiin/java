package net.scit.dao;

import java.util.List;

import net.scit.vo.Board;
import net.scit.vo.Reply;

public interface ReplyMapper {
			//´ñ±Û ¸ñ·Ï
	public List<Reply> listReply(int boardnum);
			//´ñ±Û ¾²±â
	public int writeReply(Reply Reply);
			//´ñ±Û »èÁ¦
	public int deleteReply(int replynum);
			//´ñ±Û ¼öÁ¤
	public int updateReply(Reply replynum);
	
	public Reply findById(int boardnum);
	
}
