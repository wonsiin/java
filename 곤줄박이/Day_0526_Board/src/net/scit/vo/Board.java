package net.scit.vo;

public class Board {
	private String boardnum;
	private String writer;
	private String title;
	private String text;
	private int hitcount;
	private String regdate;

	public Board() {
		// TODO Auto-generated constructor stub
	}

	public Board(String writer, String title, String text) {
		super();
		this.writer = writer;
		this.title = title;
		this.text = text;
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

	public void output() {
		System.out.println("| 번호 | " + boardnum + " | 작성자 | " + writer + " | 제 목 | " + title + "             | 조회수 | " + hitcount
				+ "\n" + text

		);
	}

	@Override
	public String toString() {
		
		String temp = String.format("%s %3s %8s %d %s", boardnum, writer, title, hitcount, regdate);
		
		return temp;
	}

}
