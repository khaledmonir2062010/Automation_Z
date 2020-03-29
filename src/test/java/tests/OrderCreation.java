package tests;

import java.io.FileReader;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencsv.CSVReader;

import pages.ContactInfo_Page;
import pages.HomePage;
import pages.Order_Page;
import pages.Payment_Page;

public class OrderCreation extends TestBase {
	
	
	HomePage HomeObject;
	Order_Page OrderPageObject;
	ContactInfo_Page ContactInfoObject;
	Payment_Page PaymentObject;
	CSVReader reader;
	
	@Test(priority=1)
	public void Sucessfull_OrderCreation()
	{
		
		
		
		//Step_1 of click on start order button 
		HomeObject = new HomePage(driver); 
		
		HomeObject.lang_select();
		HomeObject.StartOrder_Action();
		
		
		//Step_2 of selecting the City
		OrderPageObject = new Order_Page(driver);
		OrderPageObject.Select_City();
		
		
		//Step_3 of select //item,//sub item,//Add to order button//Review order button//checkout button 
		
		OrderPageObject = new Order_Page(driver);
		OrderPageObject.Select_Item();
		
		double Item_Fees= 2.500;
		double VAT_Fees=0.130;
		double DeliveryFees=221.310;
		String Quantity_value = OrderPageObject.QuantityCount.getAttribute("value");
		double QuantityCou=Double.parseDouble(Quantity_value);
		
		double GrandTotal=(QuantityCou*Item_Fees)+VAT_Fees+DeliveryFees;
		
		Assert.assertTrue(OrderPageObject.OrderReview_Header.getText().contains("Review order"));
		Assert.assertEquals(OrderPageObject.ActualGrandTotal, GrandTotal);
		
		OrderPageObject.checkoutClick();
		
		
		//Step_4 of enter contact INFO
		
		ContactInfoObject =new ContactInfo_Page(driver);
		
		Assert.assertTrue(ContactInfoObject.ContactInfo_header.getText().contains("Checkout"));
		
	
	}
	
	
	@Test(priority=2,dependsOnMethods={"Sucessfull_OrderCreation"})
	public void Enteeer_ContactInfo() throws IOException
	{
		
		ContactInfoObject = new ContactInfo_Page(driver);
		
		//get Path of CSV File 
				String CSV_file = System.getProperty("user.dir")+"\\src\\test\\java\\data_excel\\Input.csv";
				reader = new CSVReader(new FileReader(CSV_file));
				String[] csvcell;
				
				//while loop will be executed the last value in CSV File
				while((csvcell=reader.readNext()) !=null)
				{
					String ContactName=csvcell[0];
					String Num = csvcell[1];
					
					ContactInfoObject.EnterContactInfo(ContactName, Num);
					
				}
		
		
		
	}
	
	
	@Test(priority=3,dependsOnMethods={"Enteeer_ContactInfo"})
	public void Enteeer_AddressInfo() throws IOException
	{
		
		ContactInfoObject = new ContactInfo_Page(driver);
		
		//get Path of CSV File 
				String CSV_file = System.getProperty("user.dir")+"\\src\\test\\java\\data_excel\\Input.csv";
				reader = new CSVReader(new FileReader(CSV_file));
				String[] csvcell;
				
				//while loop will be executed the last value in CSV File
				while((csvcell=reader.readNext()) !=null)
				{
					String BlockNum=csvcell[2];
					String StreetNum = csvcell[3];
					String HouseNum = csvcell[4];
					
					ContactInfoObject.Enter_AddressInfo(BlockNum, StreetNum, HouseNum);
					
				}
		
		
		
	}
	
	
	@Test(priority=4,dependsOnMethods={"Enteeer_AddressInfo"})
	public void Proceed_PaymentMethod_Cash()
	{
		PaymentObject = new Payment_Page(driver);
		PaymentObject.PaymentMethod_Cash();
		
		
		double Item_Fees= 2.500;
		double VAT_Fees=0.130;
		double DeliveryFees=221.310;
		String Quantity_value = OrderPageObject.QuantityCount.getAttribute("value");
		double QuantityCou=Double.parseDouble(Quantity_value);
		
		double GrandTotal=(QuantityCou*Item_Fees)+VAT_Fees+DeliveryFees;
		
		Assert.assertEquals(OrderPageObject.ActualGrandTotal, GrandTotal);
		
	}

}
	
