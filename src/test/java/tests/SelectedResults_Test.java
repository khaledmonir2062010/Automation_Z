package tests;

import org.testng.annotations.Test;

import pages.HomePage;

public class SelectedResults_Test extends TestBase 
{
	
	String ProductName="Blouses";
	
	HomePage HomeObject;
	
	@Test
	public void USerCanSelectResultedProduct_TC4()
	{
		HomeObject = new HomePage(driver);
		
		
		//Step 2---Search for product
		HomeObject.SearchBlouse(ProductName);
		
		//Step 3---Select the resulted Product
		HomeObject.SelectBlouse();
	}
	

}
