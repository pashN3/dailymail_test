package StepDefinitions;

import PageObjects.HomePage;
import Utilities.PropertiesReader;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NaviagtionSteps {

    private WebDriver driver = Hooks.driver;
    private WebDriverWait wait;

    public NaviagtionSteps() throws Exception {

        PropertiesReader propertiesReader = new PropertiesReader();
        this.wait = new WebDriverWait(driver, propertiesReader.getTimeout());
   
    }
    
    @Given("^User opens browser$")
    public void launch(){
    }
    
    @When("^I naviagte to mailtravel page$")
    public void naviagte(){
    	  HomePage home = new HomePage(driver, wait);
          Assert.assertTrue(home.homePageIsDisplayed());
    }
    
    @Then("^the mailtavel page is displayed$")
    public void the_mailtavel_page_is_displayed() {
        HomePage home = new HomePage(driver, wait);
        Assert.assertTrue(home.getTitle(driver.getTitle()));
  }
}