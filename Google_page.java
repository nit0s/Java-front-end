package page_object_git;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Google_page {
	Actions util;
	WebDriver driver;
	WebDriverWait wait;
	
	Google_page(){
		util = new Actions();
		driver = util.configureChrome(driver);
		wait = util.configureDriverWait(wait, driver);
	}//construct
	
	//objects
	By searchBarTextField = By.cssSelector("#lst-ib");
	By searchButton = By.name("btnK");
	By resultsLabelText = By.cssSelector("#resultStats");
	
	
	//methods
	public void openBrowser(){
		util.startBrowser(driver, "https://www.google.com");
	}
	
	public void searchSomething(){
		util.sendTextToElement(driver, wait, searchBarTextField, "hello");
		clickSearchBar(driver,wait);
	}
	
	public void clickSearchBar(WebDriver driver, WebDriverWait wait){
		util.clickElement(driver, searchButton, wait);
	}
	
	public boolean searchReturnResults(){
		return util.isElementPresent(driver, resultsLabelText, wait);
	}
	
	public void closeBrowser(){
		util.closeBrowser(driver);
	}

}
