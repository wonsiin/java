package net.scit.vo;

public class FitnessVO {
	//id, name,키,몸무게,bmi,bmi결과
	private String usrid;
	private String usrname;
	private double height;
	private double weight;
	private double bmi;
	private String result;
	
	public FitnessVO() {}
	
	public FitnessVO(String usrid, String usrname, double height, double weight) {
			this.usrid = usrid;
			this.usrname = usrname;
			this.height = height;
			this.weight = weight;
			
			calcBmi();
	}
	
	private void calcBmi() {
		double tmp;
		tmp = this.height * 0.01;
		
		this.bmi = this.weight / (tmp * tmp);
//		this.bmi = (this.height * this.height) / this.weight;
		setResult();
	}
	
	
	public double getBmi() {
		return this.bmi;
	}
	
	private void setResult() {
		//bmi에 대한 결과값으로 외부에서 이 데이터 하나만 접근할 필요가 없다
		if(bmi >= 35) {
			result = "고도비만";
		} else if(bmi >= 30) {
			result = "중도비만";
		} else if (bmi >= 25) {
			result = "경도비만";
		} else if (bmi >= 23) {
			result = "과체중";
		} else if (bmi >= 18.5) {
			result = "정상";
		} else {
			result = "저체중";
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
	//setter 는 값을 수정하는게 목적
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
	//맴버의 정보를 화면에 출력하는 메소드
	public void output() {
		System.out.printf(" %s 번째 %s님 안녕하세요. %n%s님의 해당키는%.1fcm이며 몸무게는 %.1fkg입니다.%nbmi는 %.1f이고, 최종결과는 %s입니다.%n",usrid,usrname,usrname,height,weight,bmi,result);
	}
	

	
}
