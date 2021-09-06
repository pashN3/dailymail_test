package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjects.HomePage;
import PageObjects.MoreInfoPage;
import Utilities.PropertiesReader;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MoreInfoSteps {
	
	private WebDriver driver = Hooks.driver;
    private WebDriverWait wait;

    public MoreInfoSteps () throws Exception {

        PropertiesReader propertiesReader = new PropertiesReader();
        this.wait = new WebDriverWait(driver, propertiesReader.getTimeout());
   
    }
    
    @Given("^User types 'India' in search$")
    public void user_types_India_in_search() throws Throwable {
    	 HomePage home = new HomePage(driver, wait);
    	 home.fillInSearch("India");
    }

    @SuppressWarnings("deprecation")
	@When("^the options are displayed$")
    public void the_options_are_displayed() throws Throwable {
      MoreInfoPage moreInfoPage = new MoreInfoPage(driver, wait);
      Assert.assertEquals(true, moreInfoPage.validateOptions());
    }

    @When("^user clicks more info on first option$")
    public void user_clicks_more_info_on_first_option() throws Throwable {
    	MoreInfoPage moreInfoPage = new MoreInfoPage(driver, wait);
    	moreInfoPage.clickOnMoreInfo();     
    }

    @Then("^the telephone number$")
    public void the_telephone_number() throws Throwable {
    	MoreInfoPage moreInfoPage = new MoreInfoPage(driver, wait);
    	Assert.assertTrue(moreInfoPage.telephoneNumberExists());      
    }

    @Then("^price$")
    public void price() throws Throwable {
    	MoreInfoPage moreInfoPage = new MoreInfoPage(driver, wait);
    	Assert.assertTrue(moreInfoPage.priceExists());
    }

    @Then("^days are dsiplayed$")
    public void days_are_dsiplayed() throws Throwable {
    	MoreInfoPage moreInfoPage = new MoreInfoPage(driver, wait);
    	Assert.assertTrue(moreInfoPage.daysAreDisplayed());
    }

}
