package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.stepdefination.UserLogin;

public class Login extends UserLogin {

	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "nav-link-accountList-nav-line-1")
	private WebElement signin;

	@FindBy(id = "twotabsearchtextbox")
	private WebElement searchItem;

	@FindBy(xpath = "(//img[@class='s-image'])[3]")
	private WebElement addItem;

	@FindBy(id = "add-to-cart-button")
	private WebElement addItemtoCart;

	@FindBy(id = "hlb-ptc-btn-native")
	private WebElement proceedtoCheckout;
	
	@FindBy(id = "continue")
	private WebElement clickcontinue;
	
	@FindBy(id = "ap_email")
	private WebElement email;
	
	@FindBy(xpath = "(//span[@class='a-list-item'])")
	private WebElement checkErrormsg;

	public WebElement signin() {
		return signin;
	}

	public WebElement getSearch_item() {
		return searchItem;
	}

	public WebElement getaddItem() {
		return addItem;
	}

	public WebElement getaddItemtoCart() {
		return addItemtoCart;
	}

	public WebElement getproceedtoCheckout() {
		return proceedtoCheckout;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getcontinue() {
		return clickcontinue;
	}
	public WebElement geterrorMsg() {
		return checkErrormsg;
	}

}
