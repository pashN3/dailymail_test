package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.BaseClass;

public class MoreInfoPage extends BaseClass {
	public MoreInfoPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		PageFactory.initElements(driver, this);
	}
	
	 @FindBy(xpath = "/html/body/div[3]/div/div[2]/div[2]/div/div[2]/div[2]/div/div[1]/a/div[3]/button")
	  @CacheLookup
	  private WebElement moreInfoButton;
	  
	 @FindBy(xpath = "/html//a[@id='supplier-phone']")
	 @CacheLookup
	 private WebElement telephoneNumber;
	 
	 @FindBy(css = "span#price-pin_days-from")
	 @CacheLookup
	 private WebElement days;
	 
	 @FindBy(css = "div#price-pin_cc_newmarket  .ibecurr")
	 @CacheLookup
	 private WebElement price;


	public boolean validateOptions() {
		return moreInfoButton.isDisplayed();
		
	}

	public void clickOnMoreInfo() {
		moreInfoButton.click();		
	}

	public boolean telephoneNumberExists() {
		telephoneNumber.getText().startsWith("080");
		return false;
	}

	public boolean priceExists() {
		return price.isDisplayed();
	}

	public boolean daysAreDisplayed() {
		return days.isDisplayed();
	}

}
