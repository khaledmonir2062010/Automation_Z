package tests;

import java.io.FileReader;
import java.io.IOException;

import org.testng.annotations.Test;

import com.opencsv.CSVReader;

import pages.Create_AccountPage;
import pages.HomePage;
import pages.SigninPage;

public class CreateNewUserCSV_Test extends TestBase{
	
	HomePage homeobject;
	SigninPage SigninObject;
	Create_AccountPage CreateAccountObject;
	
	CSVReader reader;
	
	//********************************Create A new User Account***************************************
	//*************************************TEST CASE 1****************************************************

	@Test(priority=1)
	public void UserCanRegisterSuccessfully_TC1() throws IOException
	{
		
		//get Path of CSV File 
		String CSV_file = System.getProperty("user.dir")+"\\src\\test\\java\\data_excel\\Input.csv";
		reader = new CSVReader(new FileReader(CSV_file));
		
		String[] csvcell;
		
		//while loop will be executed the last value in CSV File
		while((csvcell=reader.readNext()) !=null)
		{
			String Email=csvcell[0];
			String firstname = csvcell[1]; 
			String lastName = csvcell[2]; 
			String password = csvcell[3]; 
			String Address = csvcell[4]; 
			String CityName=csvcell[5];
			String MobileNumber=csvcell[6];
			String StateName=csvcell[7];
			String ZipCodee=csvcell[8];
			String CountryID=csvcell[9];
			String AliasName=csvcell[10];
			
			homeobject = new HomePage(driver);
			homeobject.OpenSignIN_Link();
			SigninObject = new SigninPage(driver);
			CreateAccountObject = new Create_AccountPage(driver);
			//Step3---Enter Valid Email Address
			
			SigninObject.Enter_EmailAddress(Email);
			
			
			//Step4---Click on Create Account button
			
			SigninObject.CLick_CreateAcc_btn();
			
		
			//Step5---Fill The Required Data(Personal Info)
			CreateAccountObject.SelectGender();
			CreateAccountObject.Enter_PersonalInfo_Data(firstname, lastName,password,Email);
			
			//Step6---Fill The Required Data(Address Info)
			CreateAccountObject.Enter_AddressInfo_Data(firstname, lastName, Address, CityName, MobileNumber,StateName,
					ZipCodee, CountryID, AliasName);
		}
		
		homeobject.SignOut_Link();	
	}
	
	//********************************Authenticate as a new User**********************************************
		//*************************************TEST CASE 2****************************************************
	@Test(priority=2,dependsOnMethods={"UserCanRegisterSuccessfully_TC1"})
	public void Successfull_Login_TC2() throws IOException 
	{
		//get Path of CSV File 
				String CSV_file = System.getProperty("user.dir")+"\\src\\test\\java\\data_excel\\Input.csv";
				reader = new CSVReader(new FileReader(CSV_file));
				
				String[] csvcell;
				
				//while loop will be executed the last value in CSV File
				while((csvcell=reader.readNext()) !=null)
				{
					String Email=csvcell[0];
					String password = csvcell[3]; 
					
					//Step1--Click on Sign-in Link
					homeobject = new HomePage(driver);
					homeobject.OpenSignIN_Link();
					//Step2 & 3--Enter Email and Password and click login
					SigninObject.Enter_LoginCredentials(Email, password);
				}
		
					//Step4---Click Sign-OUT Button
					homeobject.SignOut_Link();
			
	}
	

}
