package net.scit.mini.vo;

import java.io.Serializable;

public class CommVO implements Serializable, Comparable<CommVO>{
	private static final long serialVersionUID = 1L;
	
	private int bulletin_seq; 							 //게시판 시퀀스 fk
	private String title;										//팀번호
	private String substance1;						//덧글 내용
	private int Comm_seq; 								 //덧글 시퀀스 fk
	private String usrid;									//유저아이디 FK
	
	
	public CommVO() {}
	
	public CommVO(int bulletin_seq,String title,String substance1,int Comm_seq, String usrid) {
			this.bulletin_seq = bulletin_seq;						//게시판 시퀀스 fk
			this.title = title;													//팀번호 fk
			this.substance1 = substance1;							//덧글 내용
			this.Comm_seq = Comm_seq; 			 				//덧글 시퀀스 fk
			this.usrid = usrid;												//유저아이디 FK
	}
	public int getBulletin_seq() {
		return bulletin_seq;
	}

	public void setBulletin_seq(int bulletin_seq) {
		this.bulletin_seq = bulletin_seq;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubstance1() {
		return substance1;
	}

	public void setSubstance1(String substance1) {
		this.substance1 = substance1;
	}

	public int getComm_seq() {
		return Comm_seq;
	}

	public void setComm_seq(int comm_seq) {
		Comm_seq = comm_seq;
	}

	public String getUsrid() {
		return usrid;
	}

	public void setUsrid(String usrid) {
		this.usrid = usrid;
	}

	@Override
	public int compareTo(CommVO o) {
		return 0;
	}
 
}
