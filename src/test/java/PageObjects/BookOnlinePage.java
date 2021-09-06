package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.BaseClass;

public class BookOnlinePage extends BaseClass{

	public BookOnlinePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		PageFactory.initElements(driver, this);
	}
	 @FindBy(xpath = "//div[@id='book-button-header']/div//div[.='Book Online']")
	 @CacheLookup
	 private WebElement bookOnlineButton;
	 
	 @FindBy(css = ".nbf_tpl_pms_calendar_box.nbf_tpl_pms_calendar_day_available")
	 @CacheLookup
	 private WebElement availableDate;
	 
	 @FindBy(css = ".nbf_fancy_nbf_tpl_pms_continue.nbf_fg_pms_button_text")
	 @CacheLookup
	 private WebElement continueButton;
	 
	 @FindBy(css = ".nbf_fancy_paxButton.nbf_fg_pms_button_text")
	 @CacheLookup
	 private WebElement continueAgainButton;
	 
	 @FindBy(id = "numAdults-f0050aa159413059b0d39248658bdb50")
	 @CacheLookup
	 private WebElement adultDropdown;
	 
	 @FindBy(css = "select#pax-a-title-1")
	 @CacheLookup
	 private WebElement titleDropdown;
	 
	 @FindBy(css = "input#pax-a-first-1")
	 @CacheLookup
	 private WebElement firstName;
	 
	 @FindBy(css = "input#pax-a-last-1")
	 @CacheLookup
	 private WebElement lastName;
	 
	 @FindBy(css = "select#pax-a-dobd-1")
	 @CacheLookup
	 private WebElement dateDropdown;
	  
	 @FindBy(css = "select#pax-a-dobm-1")
	 @CacheLookup
	 private WebElement monthDropdown;
	  
	 @FindBy(css = "select#pax-a-doby-1")
	 @CacheLookup
	 private WebElement yearDropdown;
	 
	 @FindBy(css = "input#contact-name")
	 @CacheLookup
	 private WebElement yourName;
	 
	 @FindBy(css = "input#pax-a-insurance-1-own")
	 @CacheLookup
	 private WebElement insurance;
	
	 @FindBy(css = "input#contact-mobile")
	 @CacheLookup
	 private WebElement mobileNumber;
	 
	 @FindBy(css = "input#contact-email")
	 @CacheLookup
	 private WebElement email;
	 
	 @FindBy(css = "input[name='contact-address1']")
	 @CacheLookup
	 private WebElement addressLine1;
	 
	 @FindBy(css = "input[name='contact-address2']")
	 @CacheLookup
	 private WebElement addressLine2;
	 
	 @FindBy(css = "input#contact-city")
	 @CacheLookup
	 private WebElement city;
	 
	 @FindBy(css = "input#contact-postcode")
	 @CacheLookup
	 private WebElement postcode;
	 
	 @FindBy(css = "select#contact-hearabout")
	 @CacheLookup
	 private WebElement hearAboutUsDropdown;
	 
	 @FindBy(css = "input#errataBox")
	 @CacheLookup
	 private WebElement terms;
	 
	 @FindBy(css = "#nbf_tourdetails > div.body > div.nbf_pms_transport_box > h2")
	 @CacheLookup
	 private WebElement flightDetails;
	 
	 @FindBy(css = ".nbf_grid.nbf_grid--padbottom.nbf_tpl_pms_bf_room > .nbf_grid_item.nbf_tpl_pms_room_colheading.nbf_w20.txt-end")
	 @CacheLookup
	 private WebElement amount;
	 
	  
	 public void clickBookOnline() {
		bookOnlineButton.click();	
	}
	
	public boolean availableIsSelected() {
		return availableDate.isSelected();
		
	}

	public void clickContinue() {
		continueButton.click();
		
	}

	public void selectOneAdult() {
		 Select adult = new Select(adultDropdown);
	      adult.selectByIndex(1);  
	}

	public void fillInDetails() {
		 Select title = new Select(titleDropdown);
	      title.selectByIndex(1); 
	      firstName.sendKeys("test");
	      lastName.sendKeys("testLastName");
	      Select date = new Select(dateDropdown);
	      date.deselectByIndex(1);
	      Select month = new Select(monthDropdown);
	      month.deselectByIndex(3);
	      Select year = new Select(yearDropdown);
	      year.deselectByValue("1987");
	      insurance.click();
	      yourName.sendKeys("testName");
	      mobileNumber.sendKeys("123455");
	      email.sendKeys("test@gmailtest.com");
	      addressLine1.sendKeys("address Line 1");
	      addressLine2.sendKeys("address Line 2");
	      city.sendKeys("city");
	      postcode.sendKeys("aa12bb");
	      Select hearAbout = new Select(hearAboutUsDropdown);
	      hearAbout.deselectByIndex(1);
	      terms.click();
	      
	      
	}

	public void clickContinueAgain() {
		continueAgainButton.click();
		
	}

	public void waitForDetails() throws InterruptedException {
		WaitUntilElementVisible(flightDetails);
		
	}

	public String verifyPayment() {
		return amount.getText();
	}
	

}
