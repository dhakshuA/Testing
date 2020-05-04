package org.stepsefinition;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.page.object.model.Baseclass;
import org.pom.pagefactory.CardDetails;
import org.pom.pagefactory.HomeTest;
import org.pom.pagefactory.LoginTest;
import org.pom.pagefactory.ShippingAndPayment;
import org.pom.pagefactory.ShopTest;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import net.bytebuddy.utility.privilege.GetSystemPropertyAction;

public class StepDefinition  extends Baseclass{
	
  
	@Given("the user should launch chrome browser")
	public void the_user_should_launch_chrome_browser() {

		loadchromebrowser();
		System.out.println("launched in hook");
	}

	@Given("load the url")
	public void load_the_url()  {
	loadurl("   https://champsofdenmark.com/account/login  ");

	}

	@When("the user should login with username and password")
	public void the_user_should_login_with_username_and_password(DataTable data) throws Exception {
			LoginTest lg = new LoginTest();
			//List<Map<String, String>> li = data.asMaps(String.class ,String.class);
		//List<List<String>> li =data.asLists(String.class);
			List<String> li=data.asList(String.class );
			
	input(lg.getEmail(),li.get(0));
	input(lg.getPass(),li.get(1));
	click(lg.getLogin());

	
	}

	@When("the user should landed on Homepage")
	public void the_user_should_landed_on_Homepage() {
		HomeTest ht =new HomeTest();
		click(ht.getHome());
	}
	@Then("the user sshould click on boy imagae.")
	public void the_user_sshould_click_on_boy_imagae() {
		HomeTest ht =new HomeTest();
		click(ht.getBoy());
	System.out.println( "Tittle ");
	driver.navigate().back();
	}

	@Then("the user should return to home page and click on girl image.")
	public void the_user_should_return_to_home_page_and_click_on_girl_image() throws Exception {
		HomeTest ht =new HomeTest();
		click(ht.getGirl());
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}
	
	
	@Given("the user should select Tianna Dress")
	public void the_user_should_select_Tianna_Dress() throws Exception {
	
		ShopTest st = new ShopTest();
		click(st.getShopnow());
		
	}

	@When("the user should get the size")
	public void the_user_should_get_the_size() {
		ShopTest st = new ShopTest();
		click(st.getSizeofdress());
	}

	@Then("the user should get the quantity")
	public void the_user_should_get_the_quantity() {
		ShopTest st = new ShopTest();
		st.getSizeincrease().click();
	}

	@Then("the user should select product and Add to Cart")
	public void the_user_should_select_product_and_Add_to_Cart() {
		ShopTest st = new ShopTest();
		st.getAddtocart().click();
	driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
	}

	@Then("checkout")
	public void chheckout() {
		ShopTest st = new ShopTest();
	st.getCheckout().click();   
	}


	@Given("the user should enter the Address page")
	public void the_user_should_enter_the_Address_page() throws Exception {
		Thread.sleep(2000);
		ShippingAndPayment sp = new ShippingAndPayment();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

	input(sp.getcompany(), " ARGUS COSMETICS");
	input(sp.getAddress(), " no 50/64 sadaiappan lane");
	input(sp.getCity()	, " chennai");
	select(sp.getCountry(), "India");
	select(sp.getState(), "TN");
	input(sp.getPincode(), "600018");
	input(sp.getPhonenumber(), "9092267752");
	sp.getContinueshipping().click();
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}

	@When("the user should get the size and contiune to shipping")
	public void the_user_should_get_the_size_and_contiune_to_shipping() {
	
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}

	@Then("the user should click on the statndard button and contiue to payment")
	public void the_user_should_click_on_the_statndard_button_and_contiue_to_payment() {
	
	ShippingAndPayment sp = new ShippingAndPayment();
	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	sp.getShippingmethod().click();
	sp.getcontinuetopayment().click();
	}

	@Then("the user should select quick pay and same as shipping Address and complete order")
	public void the_user_should_select_quick_pay_and_same_as_shipping_Address_and_complete_order() throws Exception {
		driver.manage().timeouts().implicitlyWait(400, TimeUnit.SECONDS);
		ShippingAndPayment sp = new ShippingAndPayment();
		sp.getquickpay().click();
		Thread.sleep(2000);
		sp.getSameshipping();
		Thread.sleep(2000);
		click(sp.getCompleteorder());
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
	}

	@Given("The user should enter the card number")
	public void the_user_should_enter_the_card_number(DataTable data) {
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		List<String >li = data.asList();

		CardDetails cd =new CardDetails();
		input(cd.getcardnumber(),li.get(0));
		
	}

	@When("The user should enter Expiry date")
	public void the_user_should_enter_Expiry_date(DataTable data) {
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		List<String >li = data.asList();
		
		CardDetails cd =new CardDetails();
		input(cd.getexpirymonth(), li.get(0));
		input(cd.getexpiryyear(), li.get(0));
	}

	@When("the user should enter the CVV")
	public void the_user_should_enter_the_CVV(DataTable data) {
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		List<String >li = data.asList();
		CardDetails cd =new CardDetails();
		input(cd.getcvv(), li.get(0)); 
		
	
	}

	@Then("click on pay")
	public void click_on_pay() {
		driver.quit();
		
	}

	
	
	
	
	
	
	
	
		
}