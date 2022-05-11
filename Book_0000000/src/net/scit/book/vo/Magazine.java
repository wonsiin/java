package net.scit.book.vo;

public class Magazine extends Book{
	
	private int year;
	private int month;
	private String type;
	
	public Magazine() {
		
	}
	
	public Magazine(int year, int month, String type) {
		super();
		this.year = year;
		this.month = month;
		this.type = type;
	}


	public void setYear(int year) {
		this.year = year;
	}
	public int getYear() {
		return year;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getMonth() {
		return month;
	}
	public void settype(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}
	
	@Override
	public String toString() {
		return "Id : "+getId() + "Publisher : "+ getPublisher()+ "Title : " + getTitle() + "year" + year + "month"+ month + "type" + type;
	}
	
	

}
