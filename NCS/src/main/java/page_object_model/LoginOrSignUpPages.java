package page_object_model;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginOrSignUpPages {
	
	@FindBy (xpath = "//div[text()='Sign up']")
	private WebElement sign;
	
	@FindBy (xpath = "//input[@class='search-bar-input util-ellipsis']")
	private WebElement search;
	
	@FindBy (xpath = "//a[text()='t shirt']")
	private WebElement shirt;
	
	//private Actions act;  //Globale Action object declare 
	
	private WebDriverWait wait;
	
	private WebDriver driver;
	 
	//----------------------------------------------------------------------------------
	
	public LoginOrSignUpPages(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		
//		act = new Actions(driver);   // initialize Action object 
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	//----------------------------------------------------------------------------------
	
	public void sear() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		search.sendKeys("0001");
		System.out.println("User_2 Repository");
		System.out.println("User_2 Repository");
	}
	
	//-------------------------------------------------------------------------
	
	public void creat() {	
	wait.until(ExpectedConditions.visibilityOf(sign))	;
	sign.click();
	}
	//-----------------------------------------------------------------------
	public void tshirt() {	
		shirt.click();
		}
	
	
	}









/*@FindBy (xpath = "//input[contains(@type,'text')]") 
	private WebElement username;
	
	@FindBy (xpath = "//input[contains(@type,'password')]") 
	private WebElement password;
	
	@FindBy (xpath = "//button[@name='login']") 
	private WebElement LoginButton;
	
	public void Group() {
		username.sendKeys("mithileshsherekar@gmail.com");
		password.sendKeys("1234asd");
		LoginButton.click();
	}*/
