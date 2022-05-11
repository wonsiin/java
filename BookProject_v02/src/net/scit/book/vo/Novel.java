package net.scit.book.vo;

public class Novel extends Book {
	private String auther;
	private String genre;
	
	public Novel() {}

	public Novel(String auther, String genre) {
		this.auther = auther;
		this.genre = genre;
	}

	public String getAuther() {
		return auther;
	}

	public void setAuther(String auther) {
		this.auther = auther;
	}

	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	@Override
	public String toString() {
		return super.toString()+ ", auther=" + auther + ", genre=" + genre;
	}
}
