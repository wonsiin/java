package net.scit.vo;

public class Reply {

	private String replynum;
	private String boardnum;
	private String writer;
	private String text;
	private String regdate;

	public Reply() {
		super();
	}

	public Reply(String boardnum, String writer, String text) {
		super();
		this.boardnum = boardnum;
		this.writer = writer;
		this.text = text;
	}

	public String getReplynum() {
		return replynum;
	}

	public void setReplynum(String replynum) {
		this.replynum = replynum;
	}

	public String getBoardnum() {
		return boardnum;
	}

	public void setBoardnum(String boardnum) {
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
		return "replynum=" + replynum + ", writer=" + writer + ", text=" + text
				+ ", regdate=" + regdate;
	}

}
