package net.scit.board.vo;

import java.util.Date;

public class Borad {
	//맴버변수 == 인스턴스 변수
	private int seqno;
	private	String writer;
	private String title;
	private String content;
	private Date regdate;
	private int hitcount;
	private String attchFile;
	
	//기본 생성자
	public Borad() {}
	
	//오버생성자
	public Borad(int seqno, String writer, String title, String content, Date regdate, int hitcount, String attchFile) {
		this.seqno = seqno;
		this.writer = writer;
		this.title = title;
		this.content = content;
		this.regdate = regdate;
		this.hitcount = hitcount;
		this.attchFile = attchFile;
		
	}
	
	//setter getter
public void setSeqno (int seqno) {
	this.seqno = seqno;
}
public int getSeqno () {
	return seqno;
}
public void setWriter (String writer) {
	this.writer = writer;
}
public String getWriter () {
	return writer;
}
public void setTitle (String title) {
	this.title = title;
}
public String getTitle () {
	return title;
}
public void setContent (String content) {
	this.content = content;
}
public String getContent () {
	return content;
}
public void setRegdate (Date regdate) {
	this.regdate = regdate;
}
public Date getRegdate () {
	return regdate;
}
public void setHitcount (int hitcount) {
	this.hitcount = hitcount;
}
public int getHitcount () {
	return hitcount;
}
public void setAttchFile (String attchFile) {
	this.attchFile = attchFile;
}
public String getAttchFile () {
	return attchFile;
}

	
}
