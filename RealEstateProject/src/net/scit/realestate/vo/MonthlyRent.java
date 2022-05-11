package net.scit.realestate.vo;

public class MonthlyRent extends RealEstate{
	private int monthlyRent;
	
	public MonthlyRent() {}
	public MonthlyRent(int monthlyRent){
		this.monthlyRent = monthlyRent;
	}
	public MonthlyRent(String adString, String hoString, int size,int monthlyRent) {
		super(adString,hoString,size);
		this.monthlyRent = monthlyRent;
	}
	public int getMonthlyRent() {
		return monthlyRent;
	}
	public void setMonthlyRent(int monthlyRent) {
		this.monthlyRent = monthlyRent;
	}
	@Override
	public String toString() {
		return super.toString() + "MonthlyRent [monthlyRent=" + monthlyRent + "]";
	}
}
