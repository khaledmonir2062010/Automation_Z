package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Create_AccountPage extends PageBase{

	public Create_AccountPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	//*****PERSONAL INFORMATION ELEMENTS FIELDS
	//*****************************************
	@FindBy(id="id_gender1")
	WebElement TitleCheckbox;
	
	@FindBy(id="customer_firstname")
	WebElement Firstname_Field;
	
	@FindBy(id="customer_lastname")
	WebElement Lastname_Field;
	
	@FindBy(id="email")
	WebElement Email_Field;
	
	@FindBy(id="passwd")
	WebElement Password_Field;
	
	
	public void SelectGender()
	{
		clickButton(TitleCheckbox);
	}
	
	public void Enter_PersonalInfo_Data(String FristNameField, String lastNameField,String Passwrd,String Email1)
	{
		setTextElementText(Firstname_Field, FristNameField);
		setTextElementText(Lastname_Field, lastNameField);
		clearText(Email_Field);
		setTextElementText(Email_Field, Email1);
		setTextElementText(Password_Field, Passwrd);
	}
	
	//*****YOUR ADDRESS INFORMATION ELEMENTS FIELDS
	//*********************************************	
	@FindBy(id="firstname")
	WebElement Address_Firstname;
	
	@FindBy(id="lastname")
	WebElement Address_LastName;
	
	@FindBy(id="address1")
	WebElement Address_Field;
	
	@FindBy(id="city")
	WebElement CityField;
	
	@FindBy(id="id_state")
	WebElement StateSelection;
	
	@FindBy(id="postcode")
	WebElement ZipCode;
	
	@FindBy(id="id_country")
	WebElement CountrySelection;
	
	@FindBy(id="phone_mobile")
	WebElement MobileNum;
	
	@FindBy(id="alias")
	WebElement AliasAddress;
	
	@FindBy(id="submitAccount")
	WebElement Registerbtn;
	
	
	public void Enter_AddressInfo_Data(String ADDFname, String ADDLname, 
			String AddressField,String CName, String MobNUM, String StateName, String ZipCodee, String CountryID, String AliasName)
	{
		clearText(Address_Firstname);
		setTextElementText(Address_Firstname, ADDFname);
		
		clearText(Address_LastName);
		setTextElementText(Address_LastName, ADDLname);
		
		clearText(Address_Field);
		setTextElementText(Address_Field, AddressField);
		
		clearText(CityField);
		setTextElementText(CityField,CName);
		
		select = new Select(StateSelection);
		select.selectByVisibleText(StateName);
		
		clearText(ZipCode);
		setTextElementText(ZipCode, ZipCodee);
		
		select = new Select(CountrySelection);
		select.selectByVisibleText(CountryID);
		
		clearText(MobileNum);
		setTextElementText(MobileNum, MobNUM);
		
		clearText(AliasAddress);
		setTextElementText(AliasAddress, AliasName);
		
		clickButton(Registerbtn);
	}
}
