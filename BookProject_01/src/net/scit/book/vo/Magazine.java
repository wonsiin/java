package net.scit.book.vo;

public class Magazine extends Book{
	private int year;
	private int month;
	private String type; //한정되어있다.
	
	public Magazine() {}
	public Magazine(int year, int month, String type) {
		this.year = year;
		this.month = month;
		this.type = type;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	public int getYear() {
		return this.year;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getMonth() {
		return this.month;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return this.type;
	}
	@Override
	public String toString() {
		return "year = " + year + ", month = " + month + ", type = " + type;
	}
	
}
