package org.page.object.model;

import java.awt.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Baseclass {
	
	public static WebDriver driver;
	public static Properties configpro;
	
	
	
	public static void loadchromebrowser()  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sate\\eclipse-workspace\\Automation\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
			
}

public static void loadgfirefoxbrowser() {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Sate\\eclipse-workspace\\CucumberTest\\Driver\\chromedriver.exe");
	 driver = new ChromeDriver();
	
}
public static void loadurl(String Url) {
	driver.get(Url);

}

public static void input(WebElement element , String input) {
element.sendKeys(input);	

}


public static void click(WebElement element ) {
element.click();	

}




public static void closedriver( ) {
driver.close();

}


public static void select(WebElement element,String input) {
	Select se= new Select(element);
	se.selectByValue(input);
	
	
}


public static void select2(WebElement element,int input) {
	Select sc2= new Select(element);
	sc2.selectByIndex(input);
	
}
public static void select3(List element,WebElement input) {
	Select sc3= new Select(input);
	sc3.getAllSelectedOptions();

}

public static void actions(WebElement element ) {
	Actions acc = new Actions(driver);
	acc.moveToElement(element).perform();
	/*acc.contextClick(element).perform();
	acc.dragAndDrop(element, element);
	acc.click().perform();
	acc.click(element).perform();
	acc.doubleClick(element).perform();*/
	
}
public static void waits(int TimeOut) {
	driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);

}



}