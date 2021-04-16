package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class MailPage {
	protected WebDriver driver=null;
	
	public MailPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By donate_btn = By.cssSelector("a[id*='cmp-nfr-top-side-donate']");
	private By amount = By.cssSelector("button[id*='story-popup-donate-amt-option2']");
	private By name = By.cssSelector("input[id*='full_name']");
	private By email = By.cssSelector("input[id*='email_receipt']");
	private By phone = By.cssSelector("input[id*='mobile']");
	private By city1 = By.cssSelector("input[id*='city_text']");
	private By donate1_btn = By.cssSelector("input[id*='story-popup-donate-button']");
	
	public void clickdonate() {
		driver.findElement(donate_btn).sendKeys(Keys.ENTER);
	}
	
	public void enteramount() {
		driver.findElement(amount).sendKeys(Keys.RETURN);
	}
	
	public void entername(String name1) {
		driver.findElement(name).sendKeys(name1);
	}
	
	public void enteremail(String emailid) {
		driver.findElement(email).sendKeys(emailid);
	}
	
	public void enterphone(String no) {
		driver.findElement(phone).sendKeys(no);
	}
	
	public void entercity(String city) {
		driver.findElement(city1).sendKeys(city);
	}
	public void donatenow() {
		driver.findElement(donate1_btn).sendKeys(Keys.ENTER);
	}
	
}
