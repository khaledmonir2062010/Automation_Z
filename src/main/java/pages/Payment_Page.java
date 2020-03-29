package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Payment_Page extends PageBase {

	public Payment_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//Getting Payment Methods Elements
	@FindBy(xpath="//div[@id='root']/div/div/div/div[2]/div/div[3]/div/label[3]/div")
	WebElement CashPM;
	
	@FindBy(css=".ltr-bbnxor")
	WebElement Next_PM;
	
	@FindBy(css=".ltr-bbnxor")
	WebElement Place_order;
	
	
	public void PaymentMethod_Cash()
	{
		clickButton(CashPM);
		clickButton(Next_PM);
		clickButton(Place_order);
		
	
		
	}

}
