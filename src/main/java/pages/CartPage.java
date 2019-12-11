package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends PageBase{

	public CartPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css=".button-medium > span")
	WebElement Checkout_btn;
	
	@FindBy(css=".standard-checkout > span")
	WebElement Proceedtocheckout_btn;
	
	@FindBy(id="cgv")
	WebElement AgreementCheckbox;
	
	@FindBy(linkText="Pay by bank wire (order processing will be longer)")
	WebElement bankwire;
	
	@FindBy(css=".columns-container")
	WebElement Confirmorder;
	
	
	public void ClickCheckout()
	{
		clickButton(Checkout_btn);
		
	}
	
	
	public void ProceedtocheckOut()
	{
		clickButton(Proceedtocheckout_btn);
		clickButton(AgreementCheckbox);
		clickButton(Proceedtocheckout_btn);
		clickButton(bankwire);
		clickButton(Confirmorder);
	}
	

}
