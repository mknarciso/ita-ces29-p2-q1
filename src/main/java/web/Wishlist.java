package web;

public class Wishlist {
	private Book book;
	private Customer user;
	public Wishlist(Book book, Customer user){
		this.setBook(book);
		this.setUser(user);
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public Customer getUser() {
		return user;
	}
	public void setUser(Customer user) {
		this.user = user;
	}
}
