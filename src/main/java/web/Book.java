package web;

public class Book implements Product {
	private String title;
	public Book(String title) {
		this.title=title;
	}
	public String getTitle() {
		return title;
	}

}
