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
		return driver;}
	
	public WebDriverWait configureDriverWait(WebDriverWait wait , WebDriver driver){
		wait = new WebDriverWait(driver,8);
	return wait;}
	
	public void clickElement(WebDriver driver, String object , int type , WebDriverWait wait  ){
		
		switch(type){
		case 1:
			wait.until(ExpectedConditions.elementToBeClickable(By.name(object)));
			driver.findElement(By.name(object)).click();
		break;
		case 2:
			wait.until(ExpectedConditions.elementToBeClickable(By.id(object)));
			driver.findElement(By.id(object)).click();
		break;
		case 3:
			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(object)));
			driver.findElement(By.cssSelector(object)).click();
		break;
		case 4:
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(object)));
			driver.findElement(By.xpath(object)).click();
		break;
		}
	}//end clickElement
	
	public void sendTextToElement(WebDriver driver, WebDriverWait wait ,String object , int type , String text  ){
		switch(type){
		case 1:
			wait.until(ExpectedConditions.elementToBeClickable(By.name(object)));
			driver.findElement(By.name(object)).sendKeys(text);
		break;
		case 2:
			wait.until(ExpectedConditions.elementToBeClickable(By.id(object)));
			driver.findElement(By.id(object)).sendKeys(text);
		break;
		case 3:
			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(object)));
			driver.findElement(By.cssSelector(object)).sendKeys(text);
		break;
		case 4:
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(object)));
			driver.findElement(By.xpath(object)).sendKeys(text);
		break;
		}
	}//sendText
	
	public void closeBrowser(WebDriver driver){
		driver.close();
	}//close
	
	public void startBrowser(WebDriver driver, String URL){
		driver.get(URL);
	}
	
	public boolean isElementPresent(WebDriver driver, String object , WebDriverWait wait ){
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#resultStats")));
		int elementPresent = driver.findElements(By.cssSelector(object)).size();
		if( elementPresent > 0 ){
			return true;
			}else{
			return false;	
			}
		}//end isElementPresent 

}
