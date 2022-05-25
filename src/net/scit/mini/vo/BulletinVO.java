package net.scit.mini.vo;

import java.io.Serializable;

public class BulletinVO implements Serializable, Comparable<BulletinVO>{
	private static final long serialVersionUID = 1L;
	
	private int business_seq; 			 //할일 관리 시퀀스
	private int teamnumber;			//팀번호
	private String substance;			//노트
	private String usrid;					//유저아이디 FK
	
	
	public BulletinVO() {}
	
	public BulletinVO(int business_seq,int teamnumber,String substance, String usrid) {
			this.business_seq = business_seq;					//할일 관리 시퀀스
			this.teamnumber = teamnumber;					//팀번호 fk
			this.substance = substance;								//노트
			this.usrid = usrid;												//유저아이디 FK
	}
	
	public int getBusiness_seq() {
		return business_seq;
	}

	public void setBusiness_seq(int business_seq) {
		this.business_seq = business_seq;
	}

	public int getTeamnumber() {
		return teamnumber;
	}

	public void setTeamnumber(int teamnumber) {
		this.teamnumber = teamnumber;
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
	public int compareTo(BulletinVO o) {
		return 0;
	}
 
}
