package net.scit.book.vo;

import java.io.Serializable;

public class Magazine extends Book implements Serializable{
	private static final long serialVersionUID = 2L;
	private int year;
	private int month;
	private String type;
	
	public Magazine() {}
	
	public Magazine(int year, int month, String type) {
		this.year = year;
		this.month = month;
		this.type = type;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return super.toString()+ ", year=" + year + ", month=" + month + ", type=" + type;
	}
}
