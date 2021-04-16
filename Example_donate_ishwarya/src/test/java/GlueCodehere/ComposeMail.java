package GlueCodehere;

//import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.LoginPage;
import Pages.MailPage;
import Pages.SentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ComposeMail {
	
	WebDriver driver = null;
	
	public MailPage mail;
	public LoginPage login;
	public SentPage sent;
	@Given("navigate")
	public void navigate() {
			WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
		 driver.navigate().to("https://staging.igstg.com/fundraiser/help-testdocumentchecklist");
	}
	
	@And("click on user and password")
	public void click_user_pass() throws InterruptedException {
		login = new LoginPage(driver);
		Thread.sleep(2000);
		login.clickuserpass();
	}
	
	@When("^enter (.*) and (.*)$")
	public void valid_credentials(String user, String pass) throws InterruptedException {
		Thread.sleep(2000);
		login.enterEmail(user);
		Thread.sleep(2000);
		login.enterPass(pass);
	}

	@When("user clicks on login")
	public void user_clicks_login() throws InterruptedException {
		Thread.sleep(5000);
		login.login();
	}
	
	@And("enter user and password manually")
	public void type_stg_credentials(String add) throws InterruptedException {
		System.out.println("ENTER THE USER NAME AND PASSWORD OF STAGE AUTH MANUALLY");
		System.out.println("user name: impactguru ;;;;; password: 8nvbil51pp");
		Thread.sleep(10000);

	}

	@And("click on signin manually")
	public void click_signin() throws InterruptedException {
		System.out.println("click on the login button manually");
		Thread.sleep(2000);
	}

	@And("clcik on donate button")
	public void click_donate() throws InterruptedException {
		mail = new MailPage(driver);
		mail.clickdonate();

	}

	@And("fill the information")
	public void donate_info() throws InterruptedException {
		Thread.sleep(2000);
		mail.enteramount();
		mail.entername("full name");
		mail.entername("i@gmail.com");
		mail.enterphone("8902674560");
		mail.entercity("pune");
		Thread.sleep(2000);
	}
	
	@And("click on donate now")
	public void donate_now() throws InterruptedException {
		mail.donatenow();
		Thread.sleep(3000);
	}
	
	@And("Fill card details")
	public void card_details() throws InterruptedException {
		sent = new SentPage(driver);
		sent.entercard("5555555555554444 ");
		sent.enterdate("1023");
		sent.entercvv("545");
		Thread.sleep(3000);
	}
	
	@And("click on contribute")
	public void click_contribute() {
		sent.click1();
	}
	
	@Then("successful")
	public void email_is_sent() {
		System.out.println(driver.getCurrentUrl());
		
	}

}

