package net.scit.mini.vo;

import java.io.Serializable;

public class BusinessVO implements Serializable, Comparable<BusinessVO>{
	private static final long serialVersionUID = 1L;
	
	private int bulletin_seq; 				 //게시판 시퀀스
	private int teamnumber;				//팀번호 fk
	private String title;							//제목
	private String substance;				//내용1
	private String usrid;						//유저아이디 FK
	
	
	public BusinessVO() {}
	
	public BusinessVO(int bulletin_seq,int teamnumber,String title, String substance,String usrid) {
			this.bulletin_seq = bulletin_seq;						//게시판 시퀀스
			this.teamnumber = teamnumber;					//팀번호 fk
			this.title = title;													//노트
			this.substance = substance;								//내용1
			this.usrid = usrid;												//유저아이디 FK
	}
	
	public int getBulletin_seq() {
		return bulletin_seq;
	}

	public void setBulletin_seq(int bulletin_seq) {
		this.bulletin_seq = bulletin_seq;
	}

	public int getTeamnumber() {
		return teamnumber;
	}

	public void setTeamnumber(int teamnumber) {
		this.teamnumber = teamnumber;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubstance() {
		return substance;
	}

	public void setSubstance(String substance) {
		this.substance = substance;
	}

	public String getUsrid() {
		return usrid;
	}

	public void setUsrid(String usrid) {
		this.usrid = usrid;
	}

	@Override
	public int compareTo(BusinessVO o) {
		return 0;
	}
 
}
