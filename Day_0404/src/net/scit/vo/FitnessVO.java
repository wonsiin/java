package net.scit.vo;

public class FitnessVO {
	//id, name,Å°,¸ö¹«°Ô,bmi,bmi°á°ú
	private String usrid;
	private String usrname;
	private double height;
	private double weight;
	private double bmi;
	private double result;
	
	public FitnessVO() {}
	
	public double height(double height) {
		this.height = height * 0.01;
		return this.height;
	}
	
	public double bmi() {
		this.bmi = (this.height * this.height) / this.weight;
		return this.bmi;
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
		height(height);
	}
	public double getHeight() {
		return height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getWeight() {
		return weight;
	}
	public void setBmi(double bmi) {
		this.bmi = bmi;
	}
	public double getBmi() {
		return bmi;
	}
	public void setResult(double result) {
		this.result = result;
	}
	public double getResult() {
		return result;
	}
	
//	public static void main(String[] args) {
//		FitnessVO fi = new FitnessVO();
//		fi.setUsrName("È«±æµ¿");
//		fi.setUsrId("1");
//		fi.setHeight(180);  
//		System.out.println(fi.height);
//		fi.setWeight(50);
//		System.out.println(fi.bmi);
//		System.out.println(fi.usrid + " , " + fi.usrname + " , " + fi.height + " , " + fi.weight + " , " + fi.bmi + " , " + fi.result);
//	}
	
}
