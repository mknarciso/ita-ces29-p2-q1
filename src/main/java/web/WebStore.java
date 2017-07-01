package web;

public class WebStore {
	private boolean isSimple;
	private Customer user;
	private String title;
	public WebStore(Customer user) {
		this.user = user;
	}
	public void openSearch(String name){
		if(!user.isExperiencedWithComputers()){
			System.out.println("Very simple search interface");
			setSimple(true);
		} else {
			setSimple(false);
			System.out.println("Complex search interface");
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
	
}
