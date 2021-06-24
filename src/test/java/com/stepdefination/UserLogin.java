package com.stepdefination;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pom.Login;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import cucumber.api.java.Before;

public class UserLogin {

	public static WebDriver driver;
	public String chromeExe;
	public String url;
	Login login;
	FileInputStream fileInput = null;


	@Before
	public void setUp() throws IOException {
		File file = new File("src/test/resource/config.properties");
		String dir = System.getProperty("user.dir");
		fileInput = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fileInput);
		chromeExe = prop.getProperty("CHROME_EXE");
		url = prop.getProperty("URL");
		System.setProperty("webdriver.chrome.driver",chromeExe);
		driver = new ChromeDriver();
		driver.get(url);
		login = new Login(driver);

	}

	@Given("User is Logged in")
	public void user_is_Logged_in() {
		login.signin().click();
		driver.navigate().back();
	}

	@When("enter {string} in search textbox")
	public void search_item(String text) {
		login.getSearch_item().sendKeys(text);
		login.getSearch_item().sendKeys(Keys.ENTER);
	}

	@Then("add item to checkout")
	public void addItem() {
		login.getaddItem().click();
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));

	}

	@Then("add item to cart")
	public void addItemtoCart() {
		login.getaddItemtoCart().click();

	}

	@Then("proceed to checkout")
	public void proceedtoCheckout() {
		login.getproceedtoCheckout().click();

	}
	@When("enter invalid email {string}")
	public void enterEmail(String email) {
		login.getEmail().sendKeys(email);
		login.getcontinue().click();

	}
	@Then("verify the error message {string}")
	public void checkError(String msg) {
		Assert.assertEquals(login.geterrorMsg().getText(), msg);

	}
	
}
