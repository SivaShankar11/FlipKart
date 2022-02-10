package org.stepdefinition;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.commonaction.CommonAction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartStepDefinition extends CommonAction{


	CommonAction ca= new CommonAction();

	FlipkartLocators lo= new FlipkartLocators();

	@Given("Launch browser")
	public void launch_browser() {

		//		ca.startChrome("https://www.flipkart.com/");

	}

	@When("user enters username password")
	public void user_enters_username_password() throws InterruptedException {
		//		WebElement username = driver.findElement(By.xpath("((//input[@type='text'])[2])"));
		ca.insertText(lo.getUsername(),"9080304979");

		//		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		ca.insertText(lo.getPassword(),"Flipkrt11!" );



	}
	@When("clicks on the login button")
	public void clicks_on_the_login_button() throws InterruptedException {


		//		WebElement loginbtn = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		ca.mouseClick(lo.getLoginbtn());	

	}

	@When("user enters the data on the search bar")
	public void user_enters_the_data_on_the_search_bar() throws InterruptedException {
		//		WebElement searchbar = driver.findElement(By.xpath("(//form[@action='/search'])"));
		ca.mouseClick(lo.getSearchbar());

		//		WebElement inputname = driver.findElement(By.xpath("(//input[@name='q'])"));
		ca.insertText(lo.getInputname(), "redmi mobile");


	}


	@And("clicks on the search button")
	public void clicks_on_the_search_button() throws InterruptedException {
		//		WebElement serchbtn = driver.findElement(By.xpath("(//button[@class='L0Z3Pu'])"));
		ca.mouseClick(lo.getSerchbtn());

	}

	@And("clicks on the item")
	public void clicks_on_the_item() throws InterruptedException {


		//		WebElement selectitem = driver.findElement(By.xpath("(//div[starts-with(text(),'REDMI ')])"));
		ca.mouseClick(lo.getSelectitem());

		ca.goToChildWindow();

	}

	@And("clicks on the add to cart button")
	public void clicks_on_the_add_to_cart_button() throws InterruptedException {

		//		WebElement addtocart = driver.findElement(By.xpath("(//button[contains(@class,'_2KpZ6l')])"));
		ca.mouseClick(lo.getAddtocart());
	}

	@Then("user validates the order by the place order text")
	public void user_validates_the_order_by_the_place_order_text() {

		String value = driver.findElement(By.xpath("(//span[contains(text(),'Place Order')])")).getText();

		System.out.println("The Output");

		System.out.println(value);

	}


}
