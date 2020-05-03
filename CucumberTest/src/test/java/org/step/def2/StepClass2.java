package org.step.def2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.page.fact.FlipcartLogin;
import org.page.object.model.Baseclass;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepClass2 extends Baseclass {
	WebDriver driver;
	
	@Before
	public void setup() throws Exception {
		
		configpro = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\Sate\\eclipse-workspace\\CucumberTest\\PropertyFolder\\prop.properties");
		configpro.load(file);
		String str = configpro.getProperty("browser");
		if (str.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", configpro.getProperty("chromepath"));
			 driver = new ChromeDriver();
			 		}else if (str.equals("firefox")) {
			System.setProperty("webdriver.chrome.driver", configpro.getProperty("chromepath"));
			 driver = new ChromeDriver();
		}
		
		
		
	}
	@After
	public void aftertest() {
		
		driver.close();
		System.out.println("close");
	}

	@Given("The user should land the broser")
	public void the_user_should_land_the_broser() throws Exception {

System.out.println(" landed ");
		Thread.sleep(2000);
	}

	@Given("The user Should land flipcart login page")
	public void the_user_Should_land_flipcart_login_page() {

		driver.get(configpro.getProperty("url"));
	}

	@When("The user should enter valid credentials of flipcart")
	public void the_user_should_enter_valid_credentials_of_flipcart() {
		System.out.println(" valid");

	}

	@Then("the user shold reach homepage of flipcart")
	public void the_user_shold_reach_homepage_of_flipcart() throws Exception {
		System.out.println(" flipcart");

		Thread.sleep(2000);
	}

}
