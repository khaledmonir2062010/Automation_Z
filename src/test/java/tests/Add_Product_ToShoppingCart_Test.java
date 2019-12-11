package tests;

import java.io.FileReader;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencsv.CSVReader;

import pages.CartPage;
import pages.HomePage;
import pages.ProductDetailsPage;
import pages.SigninPage;

public class Add_Product_ToShoppingCart_Test extends TestBase
{

String ProductName="Blouses";
	
	HomePage HomeObject;
	SigninPage SigninObject;
	ProductDetailsPage productDetailsObject;
	CartPage cartobject;
	CSVReader reader;
	
	@Test(priority=1)
	public void UserCanCheckoutSelectedProduct()
	{
		HomeObject = new HomePage(driver);
		//Step 1---Search for the Product you need
		HomeObject.SearchBlouse(ProductName);
		
		//Step 2---Select Product
		HomeObject.SelectBlouse();
	}
	
	@Test(priority=2)
	public void AddtoShoppingCArt()
	{
		//Step 3---Click on AddtoCart
		productDetailsObject.addtocart();
				
	}
	
	@Test(priority=3)
	public void UserCanCheckOut()
	{
		cartobject = new CartPage(driver);
		
		//Step 4---CLick on Check out button
		
		cartobject.ClickCheckout();
		
		Assert.assertTrue(true);
	}
	
	@Test(priority=4)
	public void ProceedCheckout() throws IOException
	{
		//Step 5---Proceed on check out by enter email and pass
		cartobject = new CartPage(driver);
		//get Path of CSV File 
				String CSV_file = System.getProperty("user.dir")+"\\src\\test\\java\\data_excel\\Input.csv";
				reader = new CSVReader(new FileReader(CSV_file));
				
				String[] csvcell;
				
				//while loop will be executed the last value in CSV File
				while((csvcell=reader.readNext()) !=null)
				{
					String Email=csvcell[0];
					String password = csvcell[3];
				
					SigninObject.Enter_LoginCredentials(Email, password);
					
				}
				//Step 6&7---proceed on checkout by confirming the shipping add-select payment method
				cartobject.ProceedtocheckOut();
				
		
	}
	
	
	
}
