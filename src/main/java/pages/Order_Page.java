package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Order_Page extends PageBase {

	public Order_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	//Assertion Order Page Header//
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/header/h1")
	public WebElement OrderPage_Header;
	
	
	//Click on Country//
	
	@FindBy(xpath="//div[@id='accordion__panel-1']/ul/li/div")
	WebElement CitySel;
	
	
	public void Select_City()
	{
		
		clickButton(CitySel);
		
	}
	
	
	
	//Select Items for ordering//
	
	@FindBy(css=".e1b3lgmq0:nth-child(2) .ltr-1jdp7ii")
	WebElement ItemSel;
	
	@FindBy(css=".ltr-a1v1zr:nth-child(1) .ltr-8y3b7s")
	WebElement	SubItemSel;
	
	@FindBy(className="")
	WebElement Quantity;
	
	@FindBy(css=".ltr-bbnxor")
	WebElement AddToOrder;
	
	@FindBy(css=".ltr-bbnxor")
	WebElement ReviewOrder;
	
	@FindBy(className="ltr-qm0ffh e1iliclz0")
	
	public WebElement OrderReview_Header;
	
	
	
	@FindBy(className="ltr-6emwgz")
	
	public WebElement QuantityCount;
	
	@FindBy(className="ltr-1i60a19 e1iliclz0")
	
	public WebElement ActualGrandTotal;
	
	
	public void Select_Item()
	{
		
		clickButton(ItemSel);
		clickButton(SubItemSel);
		//Quantity action//
		
		clickButton(AddToOrder);
		clickButton(ReviewOrder);	
		
	}
	
	//Checkout Selection//
	@FindBy(className="ez1ieiq2 ltr-bepcnw e1b3lgmq0")
	
	WebElement Checkout_btn;
	
	
	public void checkoutClick()
	{
		
		clickButton(Checkout_btn);
	}
	
	

}
