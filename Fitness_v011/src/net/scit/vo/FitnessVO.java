package net.scit.vo;

public class FitnessVO {
	//id, name,Ű,������,bmi,bmi���
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
		//bmi�� ���� ��������� �ܺο��� �� ������ �ϳ��� ������ �ʿ䰡 ����
		if(bmi >= 35) {
			result = "����";
		} else if(bmi >= 30) {
			result = "�ߵ���";
		} else if (bmi >= 25) {
			result = "�浵��";
		} else if (bmi >= 23) {
			result = "��ü��";
		} else if (bmi >= 18.5) {
			result = "����";
		} else {
			result = "��ü��";
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
	//setter �� ���� �����ϴ°� ����
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
	//�ɹ��� ������ ȭ�鿡 ����ϴ� �޼ҵ�
	public void output() {
		System.out.printf(" %s ��° %s�� �ȳ��ϼ���. %n%s���� �ش�Ű��%.1fcm�̸� �����Դ� %.1fkg�Դϴ�.%nbmi�� %.1f�̰�, ��������� %s�Դϴ�.%n",usrid,usrname,usrname,height,weight,bmi,result);
	}
	

	
}
