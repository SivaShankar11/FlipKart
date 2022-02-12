package org.commonaction;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonAction {

	public static WebDriver driver;
	//	public Actions a= new Actions(driver);
	public void startChrome(String url)
	{ 

		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}


	public void mouseClick(WebElement ele) throws InterruptedException
	{
		ele.click();
		Thread.sleep(1000);


	}

	public void insertText(WebElement ele, String value) throws InterruptedException
	{
		ele.sendKeys(value);

		Thread.sleep(3000);

	}

	public void mouseOver(WebElement ele, String value) throws InterruptedException
	{
		Actions a= new Actions(driver);


		a.moveToElement(ele).build().perform();
		Thread.sleep(3000);

	}

	public void goToChildWindow()
	{
		String parentwindow = driver.getWindowHandle(); 
		System.out.println(parentwindow);

		Set<String> allwindowname = driver.getWindowHandles();
		for (String onebyonewindow : allwindowname) {
			System.out.println(onebyonewindow); 
			if(!parentwindow.equals(onebyonewindow))
			{
				driver.switchTo().window(onebyonewindow);
			}
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

		}
	}

	public void frameSwitchUsingId(String Id)
	{
		driver.switchTo().frame(Id);
	}
	public void frameSwitchUsingName(String name)
	{
		driver.switchTo().frame(name);
	}
	public void frameSwitchUsingIndex(int num)
	{
		driver.switchTo().frame(num);	
	}



public void closeBrowser()
{
	driver.close();
}

public void closeAllBrowser() throws InterruptedException
{
	Thread.sleep(3000);
	driver.quit();
}

public static int x=1;
	 public static void takepic() throws IOException
	 {
		 TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("./pictures//image"+".png"));
		x++;
	 
	 }
}





