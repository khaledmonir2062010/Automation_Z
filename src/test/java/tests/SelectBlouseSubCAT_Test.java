package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;

public class SelectBlouseSubCAT_Test extends TestBase {
	
	
	HomePage HomeObject;
	
	@Test
	public void UserCanSelectBlouseSUBCAT_TC3()
	{
		HomeObject =new HomePage(driver);
		
		//Step2&3---Hover on Women menu and select Blouses Sub CAT
		HomeObject.SelectBlouseCAT();
		Assert.assertTrue(driver.findElement(By.className("category-name")).isDisplayed());
	}
	

}
