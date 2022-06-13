package net.scit.dao;

import java.util.List;

import net.scit.vo.Reply;

public interface ReplyMapper {

	//��� ���
	public List<Reply> listReply(String boardnum);

	//��� ����
	public int writeReply(Reply reply);
	
	//�ϳ��� ��� ��ü �ҷ�����
	public Reply selectReply(String replynum);
	
	//��� ����
	public int deleteReply(String replynum);
	
	//��� ����
	public int updateReply(Reply reply);
}
