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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "id=" + id + ", title=" + title + ", publisher=" + publisher;
	}
}
