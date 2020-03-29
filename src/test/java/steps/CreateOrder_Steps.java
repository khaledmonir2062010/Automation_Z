package steps;

import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ContactInfo_Page;
import pages.HomePage;
import pages.Order_Page;
import pages.Payment_Page;
import tests.TestBase;

public class CreateOrder_Steps extends TestBase{
	
	HomePage HomeObject;
	Order_Page OrderPageObject;
	ContactInfo_Page ContactInfoObject;
	Payment_Page PaymentObject;
	
	@Given("^The user in the Home page$")
	public void the_user_in_the_Home_page() {
		
		HomeObject = new HomePage(driver); 
		HomeObject.StartOrder_Action();   
	}

	@When("^I click on start ordering button$")
	public void i_click_on_start_ordering_button() {
		
		OrderPageObject = new Order_Page(driver);
		//Assert.assertTrue(OrderPageObject.OrderPage_Header.getText().contains("Order Mode"));
		
	}

	@When("^Choose Deleviery Area$")
	public void choose_Deleviery_Area() {
		
		OrderPageObject = new Order_Page(driver);
		OrderPageObject.Select_City();
	    
	}

	@When("^add an item with quantity (\\d+) to the cart$")
	public void add_an_item_with_quantity_to_the_cart(int arg1) {
	  
		double Item_Fees= 2.500;
		double VAT_Fees=0.130;
		double DeliveryFees=221.310;
		String Quantity_value = OrderPageObject.QuantityCount.getAttribute("value");
		double QuantityCou=Double.parseDouble(Quantity_value);
		
		double GrandTotal=(QuantityCou*Item_Fees)+VAT_Fees+DeliveryFees;
		
		
		OrderPageObject = new Order_Page(driver);
		OrderPageObject.Select_Item();
		
		Assert.assertTrue(OrderPageObject.OrderReview_Header.getText().contains("Review order"));
		Assert.assertEquals(OrderPageObject.ActualGrandTotal, GrandTotal);
		
		OrderPageObject.checkoutClick();
		
		
	}

	
	@When("^User Enter \"([^\"]*)\",\"([^\"]*)\"$")
	public void user_Enter(String ContactName, String Num){
	   
		ContactInfoObject =new ContactInfo_Page(driver);
				 
		//Assert.assertTrue(ContactInfoObject.ContactInfo_header.getText().contains("Checkout"));
				 
		ContactInfoObject.EnterContactInfo(ContactName,Num);
	}
	
	@When("^Enter Address Info \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void enter_Address_Info(String Blockno, String streetno, String Houseno) {
		ContactInfoObject = new ContactInfo_Page(driver);
		
		ContactInfoObject.Enter_AddressInfo(Blockno, streetno, Houseno);
	}

	@When("^Click Place order button$")
	public void click_Place_order_button() {
		
		PaymentObject = new Payment_Page(driver);
		PaymentObject.PaymentMethod_Cash();
	    
	}

	@Then("^Order Placed Succesfully$")
	public void order_Placed_Succesfully() {
		

		double Item_Fees= 2.500;
		double VAT_Fees=0.130;
		double DeliveryFees=221.310;
		String Quantity_value = OrderPageObject.QuantityCount.getAttribute("value");
		double QuantityCou=Double.parseDouble(Quantity_value);
		
		double GrandTotal=(QuantityCou*Item_Fees)+VAT_Fees+DeliveryFees;
		
		Assert.assertEquals(OrderPageObject.ActualGrandTotal, GrandTotal);
	    
	}

	

}
