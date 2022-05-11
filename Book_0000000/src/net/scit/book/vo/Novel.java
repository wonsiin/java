package net.scit.book.vo;

public class Novel extends Book{
	private String author;
	private String genre;
	
	public Novel() {
		
	}
	public Novel(String author, String genre) {
		this.author = author;
		this.genre = genre;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String author () {
		return author;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getGenre() {
		return genre;
	}
	@Override
	public String toString() {
		return "Id : "+getId() + "Publisher : "+ getPublisher()+ "Title : " + getTitle() + "author" + author + "+ genre + " + genre; 
				
	}

}
