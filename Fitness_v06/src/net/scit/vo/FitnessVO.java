package net.scit.vo;

import java.io.Serializable;

public class FitnessVO implements Serializable, Comparable<FitnessVO>{
	private static final long serialVersionUID = 1L;
	
	private String usrid;
	private String usrname;
	private double height;
	private double weight;
	private double bmi;
	private BmiResult bmiResult;
	private String joindate;
	
	public FitnessVO() {}
	
	public FitnessVO(String usrid, String usrname, double height, double weight) {
			this.usrid = usrid;
			this.usrname = usrname;
			this.height = height;
			this.weight = weight;
			
			setBmi();
	}
	
	private void setBmi() { // DB�� �����Ҷ� ���
		double tmp;
		tmp = this.height * 0.01;
		
		this.bmi = this.weight / (tmp * tmp);
		setResult();
	}
	
	
	public double getBmi() {
		return this.bmi;
	}
	
	private void setResult() {
		if(bmi >= 35) {
			bmiResult = BmiResult.����;
		} else if(bmi >= 30) {
			bmiResult = BmiResult.�ߵ���;
		} else if (bmi >= 25) {
			bmiResult = BmiResult.�浵��;
		} else if (bmi >= 23) {
			bmiResult = BmiResult.��ü��;
		} else if (bmi >= 18.5) {
			bmiResult = BmiResult.����;
		} else {
			bmiResult = BmiResult.��ü��;
		}
	}
	
	public void setUsrId(String usrid) {
		this.usrid = usrid;
	}
	public String getUsrId() {
		return usrid;
	}
	public void setUsrName(String usrname) {
		this.usrname = usrname;
	}
	public String getUserName() {
		return usrname;
	}
	
	

	public void setHeight(double height) {
		this.height = height;
		setBmi();
	}
	public double getHeight() {
		return height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
		setBmi();
	}
	public double getWeight() {
		return weight;
	}
	public void output() {
		System.out.printf(" %s ��° %s�� �ȳ��ϼ���. %n%s���� �ش�Ű��%.1fcm�̸� �����Դ� %.1fkg�Դϴ�.%nbmi�� %.1f�̰�, ��������� %s�Դϴ�.%n",usrid,usrname,usrname,height,weight,bmi,bmiResult);
	}
	
	public String getJoindate() {
		return joindate;
	}

	public void setJoindate(String joindate) {
		this.joindate = joindate;
	}
	
	@Override
	public String toString() {
		//�Ҽ��� ���� 2�ڸ��� ���
		//%6.2f
		String temp = String.format("���̵� :%5s, �̸� :%8s, Ű :%6.2f, ������ :%6.2f, BMI :%6.2f, ��� :%s", usrid,usrname,height,weight,bmi,bmiResult);
		return temp;
	}

	@Override
	public int compareTo(FitnessVO o) {
		return this.usrid.compareTo(o.getUsrId());
	}
	//��ü�� ���ļ����� �𸣱⶧���� int�� ���� �Ű� ������ �����ش�.
	

	//Math �� �����ڰ� ����.

	
}
