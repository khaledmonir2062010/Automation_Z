package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {
	
	public HomePage(WebDriver driver) {
		super(driver);
		action= new Actions(driver);
		
	}
	
	
	//The Sign-in Element With its method
	
	@FindBy(className="login")
	WebElement Signin_Link;
	
	public void OpenSignIN_Link()
	{
		
		clickButton(Signin_Link);
		
	}
	
	
	//Signout Link Element
	
	@FindBy(className="logout")
	WebElement SignOut_link;
	
	public void SignOut_Link()
	{
		clickButton(SignOut_link);
	}
	
	//Women Category Element
	@FindBy(css="a href.sfHover > .sf-with-ul")
	WebElement WomenCAT;
	
	@FindBy(linkText="Blouses")
	WebElement BlouseSubCAT;
	
	
	public void SelectBlouseCAT()
	{
		action
		.moveToElement(WomenCAT)
		.moveToElement(BlouseSubCAT)
		.click()
		.build()
		.perform();
	}
	
	//Search Bar Element
	@FindBy(id="search_query_top")
	WebElement Searchbar;
	
	@FindBy(name="submit_search")
	WebElement SubmitSearch;
	
	@FindBy(css=".product_img_link > .replace-2x")
	WebElement BlouseView;
	
	public void SearchBlouse(String ProductName)
	{
		setTextElementText(Searchbar, ProductName);
		
		clickButton(SubmitSearch);
		
	}
	
	public void SelectBlouse()
	{
		
		clickButton(BlouseView);
		
	}

}
