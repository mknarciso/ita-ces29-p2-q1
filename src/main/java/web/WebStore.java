package web;

import java.util.ArrayList;

public class WebStore {
	private boolean isSimple, hasRecomendation, advancedDelivery;
	private Customer user;
	private String title;
	private ArrayList <Wishlist> wishlists;
	private ArrayList <Purchase> purchases;
	public WebStore(Customer user) {
		this.user = user;
		wishlists = new ArrayList<Wishlist>();
		purchases = new ArrayList<Purchase>();
	}
	public void openSearch(String name){
		if(!user.isExperiencedWithComputers()){
			System.out.println("Very simple search interface");
			hasRecomendation = false;
			setSimple(true);
		} else {
			hasRecomendation = true;
			setSimple(false);
			System.out.println("Complex search interface");
		}
		if(user.isSailor()){
			advancedDelivery = false;
		} else {
			advancedDelivery = true;
		}
		title = name;
	}
	public boolean isSimple() {
		return isSimple;
	}
	public void setSimple(boolean isSimple) {
		this.isSimple = isSimple;
	}
	public Book fetchResult() {
		return new Book(title);
	}
	public Boolean hasRecomendations(String bookName) {
		if (hasRecomendation&&title.equals(bookName))
			return true;
		return false;
	}
	public Boolean hasAdvancedDelivery() {
		return advancedDelivery;
	}
	public void saveToWishlist(Book book, Customer user){
		wishlists.add(new Wishlist(book,user));
	}
	public Purchase makePurchase(Book book, Customer user){
		Purchase compra = new Purchase(book,user);
		purchases.add(compra);
		return compra;
	}
	public Book getWishlistFirst(Customer user) {
		for(int i=0;i<wishlists.size();i++){
			if(wishlists.get(i).getUser()==user)
				return wishlists.get(i).getBook();
		}
		return null;
	}
	public Purchase getFirstPurchase(Customer user2) {
		for(int i=0;i<purchases.size();i++){
			if(purchases.get(i).getUser()==user)
				return purchases.get(i);
		}
		return null;
	}
	public void ratePurchase(Purchase purchase, int rate) {
		Purchase atual;
		for(int i=0;i<purchases.size();i++){
			if(purchases.get(i)==purchase){
				atual = purchase;
				atual.setRate(rate);
			}
		}
	}
	public int getRate(Purchase purchase) {
		for(int i=0;i<purchases.size();i++){
			if(purchases.get(i)==purchase){
				return purchases.get(i).getRate();
			}
		}
		return 0;
	}
	public void reviewPurchase(Purchase purchase, String review) {
		Purchase atual;
		for(int i=0;i<purchases.size();i++){
			if(purchases.get(i)==purchase){
				atual = purchase;
				atual.setReview(review);
			}
		}	
	}
	public String getReview(Purchase purchase) {
		for(int i=0;i<purchases.size();i++){
			if(purchases.get(i)==purchase){
				return purchases.get(i).getReview();
			}
		}
		return null;
	}
}
