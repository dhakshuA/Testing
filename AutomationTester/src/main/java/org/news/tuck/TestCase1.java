package org.news.tuck;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase1 {
	
	WebDriver driver;
	@BeforeMethod
	public void beforetest() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sate\\eclipse-workspace\\AutomationTester\\Drive\\Driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("http://stage-newstuck.onemindindia.com/#/login");
			}
	
	
	@Test(priority =1)
	public void test1() throws Exception {
	
	driver.get("http://stage-newstuck.onemindindia.com/#/login");
	driver.findElement(By.xpath("//*[@placeholder='User ID']")).sendKeys("StageCurator");
	driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("$tageN3w5tuckCu6ato6");
	driver.findElement(By.xpath("//*[@value='Login']")).click();
	TakesScreenshot tk = (TakesScreenshot)driver;
	File source = tk.getScreenshotAs(OutputType.FILE);
	File desti = new File("C:\\Users\\Sate\\eclipse-workspace\\AutomationTester\\target\\ScreenShot/report1.jpg");
	FileUtils.copyFile(source,desti);
	System.out.println("Screen Shot Taken");
}
	
	@Test(priority =2)
	public void test2() throws Exception {
	
	driver.findElement(By.xpath("//*[@placeholder='User ID']")).sendKeys("StageCurator");
	driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("");
	driver.findElement(By.xpath("//*[@value='Login']")).click();
	TakesScreenshot tk = (TakesScreenshot)driver;
	File source = tk.getScreenshotAs(OutputType.FILE);
	File desti = new File("C:\\Users\\Sate\\eclipse-workspace\\AutomationTester\\target\\ScreenShot/report2.jpg");
	FileUtils.copyFile(source,desti);
	System.out.println("Screen Shot Taken");
	
	
	}

	
	@Test(priority =3)
	public void test3() throws Exception {
	
	driver.findElement(By.xpath("//*[@placeholder='User ID']")).sendKeys("");
	driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("$tageN3w5tuckCu6ato6");
	driver.findElement(By.xpath("//*[@value='Login']")).click();
	TakesScreenshot tk = (TakesScreenshot)driver;
	File source = tk.getScreenshotAs(OutputType.FILE);
	File desti = new File("C:\\Users\\Sate\\eclipse-workspace\\AutomationTester\\target\\ScreenShot/report3.jpg");
	FileUtils.copyFile(source,desti);
	System.out.println("Screen Shot Taken");
}
	
	@Test(priority =4)
	public void test4() throws Exception {
	
	driver.findElement(By.xpath("//*[@placeholder='User ID']")).sendKeys("");
	driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys(" ");
	driver.findElement(By.xpath("//*[@value='Login']")).click();
	TakesScreenshot tk = (TakesScreenshot)driver;
	File source = tk.getScreenshotAs(OutputType.FILE);
	File desti = new File("C:\\Users\\Sate\\eclipse-workspace\\AutomationTester\\target\\ScreenShot/report4.jpg");
	FileUtils.copyFile(source,desti);
	System.out.println("Screen Shot Taken");
}
	
	@Test(priority =5)
	public void test5() throws Exception {
	
	driver.get("http://stage-newstuck.onemindindia.com/#/login");
	driver.findElement(By.xpath("//*[@placeholder='User ID']")).sendKeys("StageCurator");
	driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("$tageN3w5tuckCu6ato6");
	driver.findElement(By.xpath("//*[@value='Login']")).click();
	System.out.println(" The Sub Editor is able to View the List of News ");
	TakesScreenshot tk = (TakesScreenshot)driver;
	File source = tk.getScreenshotAs(OutputType.FILE);
	File desti = new File("C:\\Users\\Sate\\eclipse-workspace\\AutomationTester\\target\\ScreenShot/report/test5.jpg");
	FileUtils.copyFile(source,desti);
	System.out.println("Screen Shot Taken");
	
	}


	@Test(priority =6)
	public void test6() throws Exception {
	
	driver.get("http://stage-newstuck.onemindindia.com/#/login");
	driver.findElement(By.xpath("//*[@placeholder='User ID']")).sendKeys("StageCurator");
	driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("$tageN3w5tuckCu6ato6");
	driver.findElement(By.xpath("//*[@value='Login']")).click();
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	driver.navigate().refresh();
	System.out.println(" The Sub Editor is able to View the Updated News ");
	TakesScreenshot tk = (TakesScreenshot)driver;
	File source = tk.getScreenshotAs(OutputType.FILE);
	File desti = new File("C:\\Users\\Sate\\eclipse-workspace\\AutomationTester\\target\\ScreenShot/report/test6.jpg");
	FileUtils.copyFile(source,desti);
	System.out.println("Screen Shot Taken");
	
	
	}
	
	@Test(priority =7)
	public void test7() throws Exception {
	driver.get("http://stage-newstuck.onemindindia.com/#/login");
	driver.findElement(By.xpath("//*[@placeholder='User ID']")).sendKeys("StageCurator");
	driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("$tageN3w5tuckCu6ato6");
	driver.findElement(By.xpath("//*[@value='Login']")).click();
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	driver.findElement(By.xpath("(//div[@role='button'])[2]")).click();
	driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
	WebElement chooseHours =driver.findElement(By.xpath("(//li[@role='button'])[5]"));
	chooseHours.click();
	driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
	driver.findElement(By.xpath("(//div[@role='button'])[2]")).click();
	driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
	WebElement choosedate =driver.findElement(By.xpath("(//li[@role='button'])[8]"));
	choosedate.click();
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	WebElement date =driver.findElement(By.xpath("(//div[text()='1'])[1]"));
	date.click();
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	System.out.println(" The Sub Editor is able to View the News for selcted date ");
	TakesScreenshot tk = (TakesScreenshot)driver;
	File source = tk.getScreenshotAs(OutputType.FILE);
	File desti = new File("C:\\Users\\Sate\\eclipse-workspace\\AutomationTester\\target\\ScreenShot/report/test7.jpg");
	FileUtils.copyFile(source,desti);
	System.out.println("Screen Shot Taken");
	}
	
	
	@Test(priority =8)
	public void test8() throws Exception {
	
	driver.get("http://stage-newstuck.onemindindia.com/#/login");
	driver.findElement(By.xpath("//*[@placeholder='User ID']")).sendKeys("StageCurator");
	driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("$tageN3w5tuckCu6ato6");
	driver.findElement(By.xpath("//*[@value='Login']")).click();
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	System.out.println(" The Sub Editor is able to View the News bsed on City Source and category - Is Not Visible ");
	TakesScreenshot tk = (TakesScreenshot)driver;
	File source = tk.getScreenshotAs(OutputType.FILE);
	File desti = new File("C:\\Users\\Sate\\eclipse-workspace\\AutomationTester\\target\\ScreenShot/report/test8.jpg");
	FileUtils.copyFile(source,desti);
	System.out.println("Screen Shot Taken");
	
}

	
	@Test(priority =9)
	public void test9() throws Exception {
	
	driver.get("http://stage-newstuck.onemindindia.com/#/login");
	driver.findElement(By.xpath("//*[@placeholder='User ID']")).sendKeys("StageCurator");
	driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("$tageN3w5tuckCu6ato6");
	driver.findElement(By.xpath("//*[@value='Login']")).click();
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	System.out.println(" The Sub Editor is able to View the Current News - Default ");
	TakesScreenshot tk = (TakesScreenshot)driver;
	File source = tk.getScreenshotAs(OutputType.FILE);
	File desti = new File("C:\\Users\\Sate\\eclipse-workspace\\AutomationTester\\target\\ScreenShot/report/test9.jpg");
	FileUtils.copyFile(source,desti);
	System.out.println("Screen Shot Taken");
	
}
	
	
	@Test(priority =10)
	public void test10() throws Exception {
	
	driver.get("http://stage-newstuck.onemindindia.com/#/login");
	driver.findElement(By.xpath("//*[@placeholder='User ID']")).sendKeys("StageCurator");
	driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("$tageN3w5tuckCu6ato6");
	driver.findElement(By.xpath("//*[@value='Login']")).click();
	driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
	WebElement cat = driver.findElement(By.xpath("(//div[@class='form-check'])[1]"));
	String category = cat.getText();
	System.out.println(category);
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	System.out.println(" The Sub Editor is able to View the The details are category, Time of publication ");
	TakesScreenshot tk = (TakesScreenshot)driver;
	File source = tk.getScreenshotAs(OutputType.FILE);
	File desti = new File("C:\\Users\\Sate\\eclipse-workspace\\AutomationTester\\target\\ScreenShot/report/test10.jpg");
	FileUtils.copyFile(source,desti);
	System.out.println("Screen Shot Taken");
	
	
	
	}

	
	@AfterMethod
	public void aftertest() throws Exception {
		driver.quit();	
		System.out.println("TEST PASS");
	}
	
}
