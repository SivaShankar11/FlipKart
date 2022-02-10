package org.stepdefinition;
import java.awt.List;

import org.commonaction.CommonAction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;


public class FlipkartLocators extends CommonAction  {

	public FlipkartLocators()

	{
		PageFactory.initElements(driver, this);
	}


	//private Webelement btn =driver.findelement(By.xpath("//a[text()='sssss]"));



	@FindBy(xpath="((//input[@type='text'])[2])")
	private WebElement username;

	@FindBy(xpath="//input[@type='password']")
	private WebElement password;

	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement loginbtn;

	@FindBy(xpath="(//form[@action='/search'])")
	private WebElement searchbar;

	@FindBy(xpath="(//input[@name='q'])")
	private WebElement inputname;

	@FindBy(xpath="(//button[@class='L0Z3Pu'])")
	private WebElement serchbtn;

	@FindBy(xpath="(//div[starts-with(text(),'REDMI ')])")
	private WebElement selectitem;

	@FindBy(xpath="(//button[contains(@class,'_2KpZ6l')])")
	private WebElement addtocart;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	public WebElement getSearchbar() {
		return searchbar;
	}

	public WebElement getInputname() {
		return inputname;
	}

	public WebElement getSerchbtn() {
		return serchbtn;
	}

	public WebElement getSelectitem() {
		return selectitem;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}
}