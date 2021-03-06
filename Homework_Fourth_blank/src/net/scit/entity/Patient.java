package net.scit.entity;

import java.io.Serializable;



public class Patient implements Serializable, Comparable<Patient>{ 
	private static final long serialVersionUID = 1L;
	private String patientId; 		// 환자번호 
	private String name; 			// 이름
	private int age; 				// 나이
	private Department part; 		// 진료코드(진료과목)
	private int period; 			// 입원기간 
	private int expenses; 			// 진찰비 
	private int hospitalBill ; 		// 입원비
	private int to;
	private int total;
	
	// Code Here
	
	public Patient() {}

	public Patient(String patientId, String name, int age, Department part, int period) {
		this.patientId = patientId;
		this.name = name;
		this.age = age;
		this.part = part;
		this.period = period;
		
		vi(age);
		ip(period);
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
		vi(age);
	}
	public void vi(int age) {
		if(age < 10) {
			expenses = 7000;
		}else if(age >= 10 && age <= 20) {
			expenses = 5000;
		}else if(age >= 20 && age <= 30) {
			expenses = 8000;
		}else if(age >= 30 && age <= 40) {
			expenses = 7000;
		}else if(age >= 40 && age <= 50) {
			expenses = 4500;
		}else if(age > 50) {
			expenses = 2300;
		}
	}
	
	public void ip(int period) {
		if(period < 3) {
			to = 30000; System.out.println(period); ge(period); return;
		}else {
			to = 25000; ge(period); return;
		}
		
	}
	

	public Department getPart() {
		return part;
	}

	public void setPart(Department part) {
		this.part = part;
		
	}
	

	public int getPeriod() {
		return period;
	}

	public void setPeriod(int period) {//입원일
		this.period = period;
		ip(period);
		
	}
	public void ge(int period) {		//입원비
		if(period <= 3) {
			hospitalBill =(to * period);
		}else if(period < 10) {
			hospitalBill =(to * period);
		}else if(period >= 10 && period < 15) {
			hospitalBill =(to * period) - (int)((to * period)* 0.15);
		}else if(period >= 15 && period < 20) {
			hospitalBill =(to * period) - (int)((to * period)* 0.2);
		}else if(period >= 20 && period < 30) {
			hospitalBill =(to * period) - (int)((to * period)* 0.23);
		}else if(period >= 30 && period < 100) {
			hospitalBill =(to * period) - (int)((to * period)* 0.28);
		}else if(period >= 100){
			hospitalBill =(to * period) - (int)((to * period)* 0.32);
			System.out.println((to * period));
			System.out.println((int)((to * period)* 0.32));
		}
		
		tota(hospitalBill,expenses);
		
	}
	public void tota(int to ,int expenses) {
		total = to + expenses;
	}
	
	public int getExpenses() {
		return expenses;
	}
	public int getHospitalBill() {
		return hospitalBill;
	}
	public int getTotal() {
		return total;
	}
	@Override
	public String toString() {
		return "    " +patientId + "      " + name + "      " + part.getBu() + "	    " + expenses + "      "
				+ period + "		" + hospitalBill + "	   " + total;
	}

	@Override
	public int compareTo(Patient o) {
		return this.patientId.compareTo(o.getPatientId());
	}
	//문자타입도 여기 안에서는 int로 인식이 되기도 함.

	
	
	
	
	
	
	
}
