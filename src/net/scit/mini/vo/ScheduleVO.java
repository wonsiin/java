package net.scit.mini.vo;

import java.io.Serializable;

public class ScheduleVO implements Serializable, Comparable<ScheduleVO>{
	private static final long serialVersionUID = 1L;
	
	private int schedule_seq; 			 //���� ���� ������
	private String usrid;					//�������̵� FK
	private int condition;					//���� , 0,1,2
	private int important;				//�߿䵵 0,1
	private String startdate;			//������
	private String exdate;				//��������
	private int teamnumber;			//����ȣ
	
	public ScheduleVO() {}
	
	public ScheduleVO(int schedule_seq,String usrid,int condition,int important, String startdate, String exdate, int teamnumber) {
			this.schedule_seq = schedule_seq;					//���� ���� ������
			this.usrid = usrid;												//�������̵� FK
			this.condition = condition;								//���� , 0,1,2
			this.important = important;								//�߿䵵 0,1
			this.startdate = startdate;									//������
			this.exdate = exdate;											//��������
			this.teamnumber = teamnumber;					//����ȣ
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
