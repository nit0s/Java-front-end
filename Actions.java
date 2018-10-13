package page_object_git;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actions {

	public WebDriver configureChrome(WebDriver driver){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\carlos.becerra\\Desktop\\setUp\\ncd\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
		}
	
	public WebDriverWait configureDriverWait(WebDriverWait wait , WebDriver driver){
		wait = new WebDriverWait(driver,8);
	return wait;}
	
	public void clickElement( WebDriver driver, By object , WebDriverWait wait ){
		wait.until(ExpectedConditions.elementToBeClickable(object));
		driver.findElement(object).click();
	}//end clickElement
	
	public void sendTextToElement(WebDriver driver, WebDriverWait wait ,By object , String text  ){
		wait.until(ExpectedConditions.elementToBeClickable(object));
		driver.findElement(object).sendKeys(text);
	}//sendText
	
	public void closeBrowser(WebDriver driver){
		driver.close();
	}//close
	
	public void startBrowser(WebDriver driver, String URL){
		driver.get(URL);
	}
	
	public boolean isElementPresent(WebDriver driver,By object , WebDriverWait wait ){
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#resultStats")));
		int elementPresent = driver.findElements(object).size();
		if( elementPresent > 0 ){
			return true;
			}else{
			return false;	
			}
		}//end isElementPresent 

}
