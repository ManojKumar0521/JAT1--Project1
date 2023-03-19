 package Pages;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.aventstack.extentreports.ExtentTest;

import Base_Class.Base_Class;

public class Login_page extends Base_Class {
	ExtentTest report;
	@FindBy (xpath="//input[@placeholder='Username']")
	WebElement username;
	@FindBy (name="password")
	WebElement password;
	@FindBy (xpath="//button[@type='submit']")
	WebElement logbutton;
	@FindBy (xpath="//span[text()='Dashboard']")
	WebElement dashboard;
	@FindBy (xpath="//p[text()='Invalid credentials']")
	WebElement invaled;
	
	public Login_page(){
		PageFactory.initElements(driver, this);
	}
	public void orangelogin() {
		
		report = extent.createTest("verify login page").assignCategory("smoke").assignDevice("windoes");
	   report.info("testing the login page");
	  driver.manage().timeouts().implicitlyWait(7, TimeUnit.MINUTES);
	  driver.manage().window().maximize();
	  username.sendKeys(userid());
		password.sendKeys(password());
		logbutton.click();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.MINUTES);
	  if(dashboard.isDisplayed()){
		  report.pass("The user is logged in successfully");
	  }else {report.fail("The user is not logged in successfully ");
	  }
	  
	}
	  public void orangeinvalidlog() {
			
		report= extent.createTest("verify login page2").assignCategory("smoke").assignDevice("windoes");
		   report.info("testing the login page");
		  driver.manage().timeouts().implicitlyWait(7, TimeUnit.MINUTES);
		
		  username.sendKeys(userid());
			password.sendKeys("123@admin");
			logbutton.click();
			driver.manage().timeouts().implicitlyWait(7, TimeUnit.MINUTES);
       System.out.println(invaled.getText().contentEquals("Invalid credentials"));
if( invaled.getText().contentEquals("Invalid credentials")) {
	report.pass("A valid error message for invalid credentials is displayed. ");
}else {
	report.fail("A valid error message for invalid credentials is not displayed.");
}


		 }
	}

