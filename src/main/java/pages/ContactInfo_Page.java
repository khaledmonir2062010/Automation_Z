package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactInfo_Page extends PageBase {

	public ContactInfo_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	// Enter Contact Information Details//
	
	
	@FindBy(className="ltr-qm0ffh e1iliclz0")
	
	public WebElement ContactInfo_header;
	
	@FindBy(css=".ltr-129ov2p:nth-child(2) .ltr-3fy5rz")
	
	WebElement ContactName_Element;
	
	@FindBy(css=".react-phone-number-input__input")
	
	WebElement ContactNum_Element;
	
	@FindBy(css=".ez1ieiq2")
	WebElement Next_btn;
	
	
	
	public void EnterContactInfo(String ContactName, String num)
	{
		setTextElementText(ContactName_Element, ContactName);
		setTextElementText(ContactNum_Element, num);
		
		clickButton(Next_btn);
		
	}
	
	
	//Getting Address Fields Elements
	
	@FindBy(css=".ltr-129ov2p:nth-child(5) .ltr-3fy5rz")
	WebElement blockno;
	
	@FindBy(css=".ltr-129ov2p:nth-child(6) .ltr-3fy5rz")
	WebElement streetno;
	
	@FindBy(id="houseNo")
	WebElement houseno;
	
	@FindBy(css=".ltr-bbnxor")
	WebElement Nextbtn_Delivery;
	
	public void Enter_AddressInfo(String BlockNum, String StreetNum, String HouseNum)
	{
		
		setTextElementText(blockno, BlockNum);
		setTextElementText(streetno, StreetNum);
		setTextElementText(houseno, HouseNum);
		
		clickButton(Nextbtn_Delivery);
	
	}
	
	
	
	
	
	
	

}
