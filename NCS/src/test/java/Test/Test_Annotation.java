package Test;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page_object_model.LoginOrSignUpPages;

public class Test_Annotation {

	private Webdriver driver;
	private HomePage homePage;
	private signInPage signInPage;
	
	
	
	@BeforeSuite
	void beforeSuite() {
		System.out.println("Before suite Annotation ");
	}
	
	@Parameters("browser")
	
	@BeforeTest 
	void launchBrowser(String expectedBrowser) {

	if ( expectedBrowser.equals("Chrome"))
	   {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	   }
	If ( expectedBrowser.equals(“firefox”)
	   {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	   }
	If ( expectedBrowser.equals(“Opera”)
	   {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	   }

		
		System.out.println("BeforeTest annotation  ");
		
	}
	
	@BeforeClass  
	void beforeClass() {
	  System.out.println("Beforeclass annotation");
	}
	
			@BeforeMethod  //Open URL
			void beforemethod() {	
				System.out.println("Before Method annotation");
			} 
	
					@Test (enabled = false)
					void testA () {
						 System.out.println("testA Annotation ");
						
					}
					@Test
					void testB() {
						System.out.println("testB Annotation");
					}
					
					@Test
					void testC() {
						System.out.println("testC Annotation");
					}
					
					@Test
					void testD() {
						System.out.println("testD Annotation");
					}
					
			@AfterMethod
			void aftmethod() {
			System.out.println("after_Method annotation");
			}
	
	@AfterClass
	void afterclass() {
		System.out.println("after_class annotation ");
	}
	
	@AfterTest
	void aftertest() {
		System.out.println("Aftertest annotation ");
	}
	@AfterSuite
	void afterSuite() {
		System.out.println("After suite Annotation");
	}
}
