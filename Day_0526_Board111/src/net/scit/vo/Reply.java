package net.scit.vo;

public class Reply {
	private int replynum;
	private int boardnum;
	private String writer;
	private String text;
	private String regdate;
	
	
	public Reply() {}

	public Reply(int boardnum, String writer, String text) {
		this.boardnum = boardnum;
		this.writer = writer;
		this.text = text;
	}

	public int getReplynum() {
		return replynum;
	}
	public void setReplynum(int replynum) {
		this.replynum = replynum;
	}
	public int getBoardnum() {
		return boardnum;
	}
	public void setBoardnum(int boardnum) {
		this.boardnum = boardnum;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	@Override
	public String toString() {
		return "No : " + replynum + "	, 게시판 번호 :	" + boardnum + "	, 작성자 :	" + writer
				+ "	, 내용 : 	" + text + "	, 날짜 : 	" + regdate;
	}
}
