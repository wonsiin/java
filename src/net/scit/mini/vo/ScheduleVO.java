package net.scit.mini.vo;

import java.io.Serializable;

public class ScheduleVO implements Serializable, Comparable<ScheduleVO>{
	private static final long serialVersionUID = 1L;
	
	private int schedule_seq; 			 //일정 관리 시퀀스
	private String usrid;					//유저아이디 FK
	private int condition;					//상태 , 0,1,2
	private int important;				//중요도 0,1
	private String startdate;			//시작일
	private String exdate;				//끝나는일
	private int teamnumber;			//팀번호
	
	public ScheduleVO() {}
	
	public ScheduleVO(int schedule_seq,String usrid,int condition,int important, String startdate, String exdate, int teamnumber) {
			this.schedule_seq = schedule_seq;					//일정 관리 시퀀스
			this.usrid = usrid;												//유저아이디 FK
			this.condition = condition;								//상태 , 0,1,2
			this.important = important;								//중요도 0,1
			this.startdate = startdate;									//시작일
			this.exdate = exdate;											//끝나는일
			this.teamnumber = teamnumber;					//팀번호
	}
	
	public int getSchedule_seq() {
		return schedule_seq;
	}

	public void setSchedule_seq(int schedule_seq) {
		this.schedule_seq = schedule_seq;
	}

	public String getUsrid() {
		return usrid;
	}

	public void setUsrid(String usrid) {
		this.usrid = usrid;
	}

	public int getCondition() {
		return condition;
	}

	public void setCondition(int condition) {
		this.condition = condition;
	}

	public int getImportant() {
		return important;
	}

	public void setImportant(int important) {
		this.important = important;
	}

	public String getStartdate() {
		return startdate;
	}

	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}

	public String getExdate() {
		return exdate;
	}

	public void setExdate(String exdate) {
		this.exdate = exdate;
	}

	public int getTeamnumber() {
		return teamnumber;
	}

	public void setTeamnumber(int teamnumber) {
		this.teamnumber = teamnumber;
	}

	@Override
	public int compareTo(ScheduleVO o) {
		return 0;
	}
 
}
