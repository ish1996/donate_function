package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	protected WebDriver driver=null;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	private By user_btn = By.id("auth-local-btn");
	private By user = By.cssSelector("input[id*='username']");
	private By pass = By.cssSelector("input[id*='password']");
	private By login_btn = By.cssSelector("input[id*='submit']");
	public void clickuserpass() {
		driver.findElement(user_btn).sendKeys(Keys.RETURN);
	}
	
	public void enterEmail(String userName) {
		driver.findElement(user).sendKeys(userName);
	}
	public void enterPass(String Pass) {
		driver.findElement(pass).sendKeys(Pass);
	}
	public void login() {
		driver.findElement(login_btn).sendKeys(Keys.RETURN);
	}
}
