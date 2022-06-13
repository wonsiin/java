package net.scit.dao;

import java.util.List;

import net.scit.vo.Reply;

public interface ReplyMapper {

	//´ñ±Û ¸ñ·Ï
	public List<Reply> listReply(String boardnum);

	//´ñ±Û ¾²±â
	public int writeReply(Reply reply);
	
	//ÇÏ³ªÀÇ ´ñ±Û °´Ã¼ ºÒ·¯¿À±â
	public Reply selectReply(String replynum);
	
	//´ñ±Û »èÁ¦
	public int deleteReply(String replynum);
	
	//´ñ±Û ¼öÁ¤
	public int updateReply(Reply reply);
}
