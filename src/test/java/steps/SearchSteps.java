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
import web.WebStore;
public class SearchSteps {
	private Customer user;
	private String bookName;
	private WebStore rendered;
	private Book book;
	
	@Given("I am a hard core sailor")
	 public void fetchUser() {
		 user = new Customer(type.HardCore);
		 rendered = new WebStore(user);
	 }
	@Given("I have no experience with computers")
	 public void hasExperience() {
		 assertThat(user.isExperiencedWithComputers(),is(false));
	 }
	@When("I want to buy a book with title (.*)")
	 public void setBookName(String name){
		bookName = name;
		rendered.openSearch(bookName);
	}
	@Then("I want to find the book Im looking for")
	 public void fetchBook(){
		book = rendered.fetchResult();
		assertThat(book.getTitle(),is(bookName));
	}
	
	@Then("dont want to feel stupid") 
	 public void simpleInterface(){
		assertThat(rendered.isSimple(),is(true));
	}
}
