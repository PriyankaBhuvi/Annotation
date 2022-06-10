package com.annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.FacebookPages.LoginPage;
import com.FacebookPages.SignUpPage;
import com.alertsFrameWindows.Alerts;
import com.automationTest.CheckBox;

public class TestNGAnnotations {
	
	private SignUpPage objSignUpPage;
	private CheckBox  objCheckBox;
	private LoginPage objLoginPage;
	
	
	@BeforeClass
	public void getURL() {
		objSignUpPage.initilizeWebDriver("https://www.facebook.com/campaign/landing.php?campaign_id=16109720371&extra_1=s%7Cc%7C580541310639%7Ce%7Cfacebook%20sign%20up%7C&placement=&creative=580541310639&keyword=facebook%20sign%20up&partner_id=googlesem&extra_2=campaignid%3D16109720371%26adgroupid%3D134258540818%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-5066597374%26loc_physical_ms%3D1007769%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjw14uVBhBEEiwAaufYx_HZsFlaSmY_wtbUUrm8IFEncsWRw6QeI04bu_5PgId99Jk9HpkoERoCUI0QAvD_BwE");
		objLoginPage.initilizeWebDriver("https://demoqa.com/text-box");
		objCheckBox.initilizeWebDriver("https://demoqa.com/checkbox");
	}	
		@BeforeTest
	      public void initializeWeb() {
	          
		SignUpPage objSignUpPage = new SignUpPage() ;
		LoginPage objLoginPage = new LoginPage();
		CheckBox  objCheckBox  = new CheckBox();
 }  
		@BeforeMethod
	  public void getVerifyAllTest() {
		        	  
		  System.out.println("Test Excecuted  ");
		  System.out.println("Test Fail ");
		   System.out.println("Test not Excecuted");
		}
				
          @BeforeSuite
	 public void getVerifyTest() {
			        	  
		System.out.println("Test One  ");
	    System.out.println("Test Two ");
	    System.out.println("Test Three");
          }			
	
		@Test
		public void verifyFacebookFunctionality() {
			objSignUpPage.setFirstNameOnFacebookPage();
			objSignUpPage.setLastNameOnFacebookPage();
			objSignUpPage.getRandomDate();
		}			
			@Test
		public void getVerifyCheckBox() {
				objCheckBox.checkDocumentCheckBox();
			}
	   
		@Test
		public void getVerifyLooginPage() {
			objLoginPage.getFisrtName();
		}
		
		@AfterClass
		public void getTearDown() {
			objSignUpPage.tearDown();
			objLoginPage.tearDown();
			objCheckBox.tearDown();
		}
		
		@AfterSuite
          public void checkTest() {
        	  
        	  System.out.println(" One  ");
        	  System.out.println(" Two ");
        	  System.out.println(" Three");		
		}	
		@AfterTest	
		public void getMethod() {
		 System.out.println("Method One  ");
       	  System.out.println("Method Two ");
       	  System.out.println("Method Three");			
		}
	
	@AfterMethod
	public void getCheck() {
		System.out.println("Test 1st One  ");
     	  System.out.println("Test 2nd ");
     	  System.out.println("Test 3rd");
	}
}




