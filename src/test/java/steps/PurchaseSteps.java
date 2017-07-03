package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;

import web.Book;
import web.Customer;
import web.Customer.type;
import web.Purchase;
import web.WebStore;
public class PurchaseSteps {
	private Customer user;
	private String bookName;
	private WebStore rendered;
	private Book book;
	private Purchase purchase;
	
	
	@Given("I am a costumer")
	 public void fetchUser() {
		 user = new Customer(type.Novice);
		 rendered = new WebStore(user);
	 }
	@Given("I have found the book Navegando pelo Mundo")
	 public void foundBook(){
		bookName = "Navegando pelo Mundo";
		rendered.openSearch(bookName);
		book = rendered.fetchResult();
	}
	@When("I click on save to wishlist") 
	 public void saveToWishlist(){
		rendered.saveToWishlist(book,user);
	}
	@When("I click on buy") 
	 public void makePurchase(){
		purchase = rendered.makePurchase(book,user);
	}
	@Then("It will be on my wishlist") 
	 public void isOnWishlist(){
		assertThat(rendered.getWishlistFirst(user),is(book));
	}
	@Then("I will make the purchase") 
	 public void purchaseMade(){
		assertThat(rendered.getFirstPurchase(user),is(purchase));
	}
	@Given("I have made a purchase")
	public void madePurchase(){
		user = new Customer(type.Novice);
		rendered = new WebStore(user);
		bookName = "Navegando pelo Mundo";
		rendered.openSearch(bookName);
		book = rendered.fetchResult();
		purchase = rendered.makePurchase(book,user);
	}
	@When("I rate it") 
	 public void rateIt(){
		rendered.ratePurchase(purchase,5);
	}
	@Then("My rate will be saved") 
	 public void getRate(){
		assertThat(rendered.getRate(purchase),is(5));
	}

	@When("I review it") 
	 public void reviewIt(){
		rendered.reviewPurchase(purchase,"good");
	}
	@Then("My review will be saved") 
	 public void getReview(){
		assertThat(rendered.getReview(purchase),is("good"));
	}
}
