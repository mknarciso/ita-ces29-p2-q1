package web;

public class Purchase {
	private Book book;
	private Customer user;
	private String review;
	private int rate;
	public Purchase(Book book, Customer user){
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
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
}
