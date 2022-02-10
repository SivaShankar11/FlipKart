package org.stepdefinition;

import org.commonaction.CommonAction;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends CommonAction {
	
	CommonAction ca = new CommonAction();
	String url="https://www.flipkart.com/";
	
	
	@Before
	
	public void beforeAll()
	{
		ca.startChrome(url);
	}
	
	@After
	
	public void afterAll() throws InterruptedException
	{
		
	ca.closeAllBrowser();
	
	}
	
	
	 
}
