package net.scit.book.vo;

public abstract class Book {
	private String id;
	private String title;
	private String publisher;
	
	public Book() {}
	public Book(String id, String title, String publisher) {
		this.id = id;
		this.title = title;
		this.publisher = publisher;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return this.id;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return this.title;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getPublisher() {
		return this.publisher;
	}
	@Override
	public String toString() {
		return "id = " + id + " title = " + title + "publisher = " + publisher;
	}
}
