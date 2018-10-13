package page_object;

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
	String searchBarTextField = "#lst-ib";//css
	String searchButton = "btnK";//name
	String resultsLabelText = "#resultStats";//css
	
	//methods
	public void openBrowser(){
		util.startBrowser(driver, "https://www.google.com");
	}
	
	public void searchSomething(){
		util.sendTextToElement(driver, wait, searchBarTextField, 3, "hello");
		clickSearchBar(driver,1,wait);
	}
	
	public void clickSearchBar(WebDriver driver, int type, WebDriverWait wait){
		util.clickElement(driver, searchButton, type, wait);
	}
	
	public boolean searchReturnResults(){
		return util.isElementPresent(driver, resultsLabelText, wait);
	}
	
	public void closeBrowser(){
		util.closeBrowser(driver);
	}

}
