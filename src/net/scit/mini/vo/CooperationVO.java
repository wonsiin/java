package net.scit.mini.vo;

import java.io.Serializable;

public class CooperationVO implements Serializable, Comparable<CooperationVO>{
	private static final long serialVersionUID = 1L;
	
	private String usrid; 			 	//아이디
	private int pass;						//패스워드
	private String usrname;			//유저이름
	private int teamnumber;		//팀 번호
	private String teamname;		//팀 이름
	
	public CooperationVO() {}
	
	public CooperationVO(String usrid,int pass, String usrname) {
			this.usrid = usrid;
			this.pass = pass;
			this.usrname = usrname;
	}
	
	public CooperationVO(String usrid,int pass, String usrname, int teamnumber, String teamname) {
		this.usrid = usrid;
		this.pass = pass;
		this.usrname = usrname;
		this.teamnumber = teamnumber;
		this.teamname = teamname;
	}
	
	public String getUsrid() {
		return usrid;
	}

	public void setUsrid(String usrid) {
		this.usrid = usrid;
	}

	public int getPass() {
		return pass;
	}

	public void setPass(int pass) {
		this.pass = pass;
	}

	public String getUsrname() {
		return usrname;
	}

	public void setUsrname(String usrname) {
		this.usrname = usrname;
	}

	public int getTeamnumber() {
		return teamnumber;
	}

	public void setTeamnumber(int teamnumber) {
		this.teamnumber = teamnumber;
	}

	public String getTeamname() {
		return teamname;
	}

	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	@Override
	public int compareTo(CooperationVO o) {
		return 0;
	}
 
}
