package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class BistroBoiteslogin extends base{
	public BistroBoiteslogin() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//span[text()='  Account']")
	private WebElement accountbutton;
	public WebElement getAccountbutton() {
		return accountbutton;
	}
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return login;
	}
	public WebElement getSearch() {
		return search;
	}
	@FindBy(id="phone")
	private WebElement username;
	@FindBy(xpath="//input[@name='password'][1]")
	private WebElement password;
	@FindBy(xpath="//button[@name='login'][1]")
	private WebElement login;
	@FindBys({@FindBy(xpath="//a[@class='lte-top-search-ico fa fa-search'][1]"),
		@FindBy(id="lte-top-search-ico-mobile"),
		@FindBy(xpath="//a[@aria-hidden='true'][1]")})
	private WebElement toggle;
	public WebElement getToggle() {
		return toggle;
	}
	@FindBy(xpath="//input[@placeholder='Search']")
	private WebElement search;
	
	public void setAccountbutton(WebElement accountbutton) {
		this.accountbutton = accountbutton;
	}
	public void setUsername(WebElement username) {
		this.username = username;
	}
	public void setPassword(WebElement password) {
		this.password = password;
	}
	public void setLogin(WebElement login) {
		this.login = login;
	}
	public void setSearch(WebElement search) {
		this.search = search;
	}
}
