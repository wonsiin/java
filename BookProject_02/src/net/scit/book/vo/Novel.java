package net.scit.book.vo;

public class Novel extends Book{
	private String author;
	private String genre;
	
	public Novel() {}
	
	public Novel(String author, String genre) {
		this.author = author;
		this.genre = genre;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getAuthor(String author){
		return this.author;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getGenre(String genre){
		return this.genre;
	}
	@Override
	public String toString() {
		return "id = " + super.getId() + " , title = " + super.getTitle() + " , publisher = " + super.getPublisher() + " , author = " + author + " , genre = " + genre;
	}
	
}
