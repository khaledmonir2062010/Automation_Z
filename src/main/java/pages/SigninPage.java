package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SigninPage extends PageBase{

	public SigninPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//The Email Address Text Box element for Creating New Account
	
	@FindBy (id="email_create")
	WebElement EmailAddress_Create;
	
	@FindBy(id="SubmitCreate")
	WebElement CreateAccount_Butn;
	
	public void Enter_EmailAddress(String Email)
	{	
		
		clearText(EmailAddress_Create);
		setTextElementText(EmailAddress_Create, Email);
	
	}
	
	
	public void CLick_CreateAcc_btn()
	{
		
		clickButton(CreateAccount_Butn);
		
	}
	
	
	//Sign-in Fields(Elements)
	@FindBy(id="email")
	WebElement SigninEmail;
	
	@FindBy(id="passwd")
	WebElement SigninPass;
	
	@FindBy(id="SubmitLogin")
	WebElement Loginbtn;
	
	
	public void Enter_LoginCredentials(String Email, String Pass_wd)
	{
		clearText(SigninEmail);
		setTextElementText(SigninEmail, Email);
		
		clearText(SigninPass);
		setTextElementText(SigninPass, Pass_wd);
		
		clickButton(Loginbtn);
	}
	

}
