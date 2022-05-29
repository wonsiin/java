package net.scit.vo;

import java.io.Serializable;

public class FitnessVO implements Serializable, Comparable<FitnessVO>{
	private static final long serialVersionUID = 1L;
	
	private String usrid;
	private String usrname;
	private double height;
	private double weight;
	private double bmi;
	private String bmiResult;
	private String joindate;
	
	public FitnessVO() {}
	
	public FitnessVO(String usrid, String usrname, double height, double weight) {
			this.usrid = usrid;
			this.usrname = usrname;
			this.height = height;
			this.weight = weight;

			calcBmi();
	}
 
	public String getUsrid() {
		return usrid;
	}

	public void setUsrid(String usrid) {
		this.usrid = usrid;
	}

	public String getUsrname() {
		return usrname;
	}

	public void setUsrname(String usrname) {
		this.usrname = usrname;
	}

	public String getBmiResult() {
		return bmiResult;
	}

	public void setBmiResult(String bmiResult) {
		this.bmiResult = bmiResult;
	}

	public void setBmi(double bmi) {
		this.bmi = bmi;
	}

	private void calcBmi() { // DB랑 연동할때 사용
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
			bmiResult = "고도비만";
		} else if(bmi >= 30) {
			bmiResult = "중도비만";
		} else if (bmi >= 25) {
			bmiResult = "경도비만";
		} else if (bmi >= 23) {
			bmiResult = "과체중";
		} else if (bmi >= 18.5) {
			bmiResult = "정상";
		} else {
			bmiResult = "저체중";
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
		calcBmi();
	}
	public double getHeight() {
		return height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
		calcBmi();
	}
	public double getWeight() {
		return weight;
	}
	public void output() {
		System.out.printf(" %s 번째 %s님 안녕하세요. %n%s님의 해당키는%.1fcm이며 몸무게는 %.1fkg입니다.%nbmi는 %.1f이고, 최종결과는 %s, 가입일은 %s 입니다.%n",usrid,usrname,usrname,height,weight,bmi,bmiResult,joindate
			);
	}
	
	public String getJoindate() {
		return joindate;
	}

	public void setJoindate(String joindate) {
		this.joindate = joindate;
	}
	
	@Override
	public String toString() {
		//소수점 이하 2자리씩 출력
		//%6.2f
		String temp = String.format("아이디 :%5s, 이름 :%8s, 키 :%6.2f, 몸무계 :%6.2f, BMI :%6.2f, 결과 :%s, 가입일 :%s", usrid,usrname,height,weight,bmi,bmiResult,joindate);
		return temp;
	}

	@Override
	public int compareTo(FitnessVO o) {
		return this.usrid.compareTo(o.getUsrId());
	}
	//객체를 정렬순서를 모르기때문에 int로 값을 매겨 순서를 정해준다.
	

	//Math 는 생성자가 없다.

	
}
