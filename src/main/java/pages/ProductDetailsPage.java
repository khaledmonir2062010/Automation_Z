package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends PageBase {

	public ProductDetailsPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(css=".exclusive > span")
	WebElement AddCart_btn;
	
	public void addtocart()
	{
		clickButton(AddCart_btn);
	}

}
