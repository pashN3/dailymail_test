package StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjects.BookOnlinePage;
import PageObjects.HomePage;
import Utilities.PropertiesReader;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BookOnline {
	
	private WebDriver driver = Hooks.driver;
    private WebDriverWait wait;

    public BookOnline() throws Exception {

        PropertiesReader propertiesReader = new PropertiesReader();
        this.wait = new WebDriverWait(driver, propertiesReader.getTimeout());
   
    }
    
    @Given("^User clicks on book online$")
    public void user_clicks_on_book_online() {
    	  BookOnlinePage bookOnline = new BookOnlinePage(driver, wait);
    	 bookOnline.clickBookOnline();
    }

    @When("^I click continue$")
    public void i_click_continue() {
    	BookOnlinePage bookOnline = new BookOnlinePage(driver, wait);
   	    bookOnline.clickContinue();
    }
    
    @When("^I click continue$")
    public void i_click_continue_again() {
    	BookOnlinePage bookOnline = new BookOnlinePage(driver, wait);
   	    bookOnline.clickContinueAgain();
    }

    @When("^I complete the form$")
    public void i_complete_the_form() throws Throwable {
     BookOnlinePage bookOnline = new BookOnlinePage(driver, wait);
     bookOnline.fillInDetails();
    }

    @When("^Booking details are displayed$")
    public void booking_details_are_displayed() throws Throwable {
    	 BookOnlinePage bookOnline = new BookOnlinePage(driver, wait);
         bookOnline.waitForDetails();
    }

    @Then("^the payemnt amount is as expected$")
    public void the_payemnt_amount_is_as_expected() throws Throwable {
    	BookOnlinePage bookOnline = new BookOnlinePage(driver, wait);
       Assert.assertEquals("£1,899",bookOnline.verifyPayment());
    }
    
    @Then("^first available option is selected$")
    public void first_available_option_is_selected() throws Throwable {
       BookOnlinePage bookOnline = new BookOnlinePage(driver, wait);
       bookOnline.selectOneAdult();
      Assert.assertEquals(true, bookOnline.availableIsSelected());
    }


}
