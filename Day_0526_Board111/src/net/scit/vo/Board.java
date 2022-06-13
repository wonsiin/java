package net.scit.vo;

public class Board {
	private int boardnum;
	private String writer;
	private String title;
	private String  text;
	private int  hitcount;
    private String regdate;

	public Board() {}
	
	public Board(String writer, String title, String text) {
		this.writer = writer;
		this.title = title;
		this.text = text;
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getHitcount() {
		return hitcount;
	}
	public void setHitcount(int hitcount) {
		this.hitcount = hitcount;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	@Override
	public String toString() {
		return 	boardnum+ "	"+writer+"	"+title+"	"+hitcount+"	"+regdate;
	}	

}
