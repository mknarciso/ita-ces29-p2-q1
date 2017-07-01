package web;

public class WebStore {
	private boolean isSimple, hasRecomendation, advancedDelivery;
	private Customer user;
	private String title;
	public WebStore(Customer user) {
		this.user = user;
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
	
}
