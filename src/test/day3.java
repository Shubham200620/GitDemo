package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	
	@BeforeClass
	public void befoclass()
	{
		System.out.println("before executing any method in class");
	}
	
	@AfterClass
	public void afteclass()
	{
		System.out.println("after executing any method in class");
	}
	
	@Parameters({"URL","APIKey/usrname"})
	@Test
	public void WebloginCarLoan(String urlname, String key)
	{
		//selenium
		System.out.println("weblogincar");
		System.out.println(urlname);
		System.out.println(key);
		
	}
	
	@BeforeMethod
	public void beforeevery()
	{
		System.out.println("I Will execute before every test method in day 3 class");
	}
	
	@AfterMethod
	public void afterevery()
	{
		System.out.println("I Will execute after every test method in day 3 class");
	}
	
	@Test
	public void MobilesigninCarLoan()
	{
		//Appium
		System.out.println("Mobile SIGNIN");
		
	}
	
	@BeforeSuite
	public void Bfsuite()
	{
		System.out.println("I am no 1");
	}
	
	@Test(dataProvider="getData")
	public void MobilesignoutCarLoan(String username, String password)
	{
		//Appium
		System.out.println("Mobile SIGNOUT");
		System.out.println(username);
		System.out.println(password);
		
	}
	
	@Test(groups= {"Smoke"})
	public void MobileLoginCarLoan()
	{
		//Appium
		System.out.println("Mobilelogincar");
		
	}
	
	@Test(dependsOnMethods= {"WebloginCarLoan"})
	public void APIcarLoan()
	{
		//Rest API automation
		System.out.println("APIlogincar");
		
	}
	
	@DataProvider
	public Object[][] getData()
	{
		//1st combination - username password - good credit history
		//2nd - username password - no credit history
		//3rd - fraudelent credit history
		
		Object[][] data = new Object[3][2];
		//1st Set
		data[0][0] = "firstusername";
		data[0][1] = "firstpassword";
		//Columns in the row are nothing but values for the particular combination(row)
		
		//2nd Set
		data[1][0] = "secondsetusername";
		data[1][1] = "secondpassword";
		
		//2nd Set
		data[2][0] = "thirdsetusername";
		data[2][1] = "thirdpassword";
		return data;
	}
	
	
	

}
