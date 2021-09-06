package PageObjects;

import Utilities.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BaseClass {

    public HomePage(WebDriver driver, WebDriverWait wait) {

        super(driver, wait);
        PageFactory.initElements(driver, this);
    }
   
    @FindBy(xpath = "/html//img[@id='site-logo']")
    @CacheLookup
    private WebElement logoButton;
    
    @FindBy(xpath = "/html//input[@id='searchtext_freetext_search_form']")
    @CacheLookup
    private WebElement searchBar;
    
    @FindBy(xpath = "//ul[@id='as_ul']/li/a/span[3]/small")
    @CacheLookup
    private WebElement selectOption;
    
    public boolean homePageIsDisplayed() {

        WaitUntilElementVisible(logoButton);
        logoButton.isDisplayed();
        return true;
    }

	public boolean getTitle(String s) {
	    s.equals("Home Page | Mail Travel");
		return true;
	}

	public void fillInSearch(String search) {
		searchBar.sendKeys(search);
		selectOption.click();
		
	}
}