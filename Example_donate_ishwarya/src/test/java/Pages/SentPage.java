package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SentPage {
	protected WebDriver driver=null;
	
	public SentPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By card = By.cssSelector("input[id*='cardNumber']");
	private By day = By.cssSelector("input[id*='expiryDate']");
	private By cvv = By.cssSelector("input[id*='cvvNumber']");
	private By button = By.cssSelector("button[id*='donate-card-contribute']");
	
	public void entercard(String c) {
		driver.findElement(card).sendKeys(c);
		}
	public void enterdate(String d) {
		driver.findElement(day).sendKeys(d);
		}
	public void entercvv(String cvv1) {
		driver.findElement(cvv).sendKeys(cvv1);
		}
	public void click1() {
		driver.findElement(button).sendKeys(Keys.RETURN);
		}
		
}