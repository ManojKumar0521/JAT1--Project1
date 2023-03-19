package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Factory;

import com.aventstack.extentreports.ExtentTest;

import Base_Class.Base_Class;

public class PMI_page extends Base_Class{
	ExtentTest report;
	@FindBy (xpath="//input[@placeholder='Username']")
	WebElement username;
	@FindBy (name="password")
	WebElement password;
	@FindBy (xpath="//button[@type='submit']")
	WebElement logbutton;
	@FindBy (xpath="//span[text()='PIM']")
	WebElement Pmi;
	@FindBy (xpath="//li//a[text()='Add Employee']")
	WebElement AddEmplo;
	@FindBy (xpath="//div//input[@placeholder='Middle Name']/ancestor::div//input[@placeholder='First Name']")
	WebElement FirstName;
	@FindBy (xpath="//div//input[@placeholder='Middle Name']")
	WebElement midname;
	@FindBy (xpath="//div//input[@placeholder='Last Name']")
	WebElement lastname;
	//@FindBy (xpath="//label[text()='Employee Id']//following::div[1]")
	//WebElement employeeid;
	//@FindBy (xpath="//div//button[@class='oxd-icon-button employee-image-action']")
	//WebElement imageAdd;
	@FindBy (xpath="//div[@class='oxd-form-actions']//following::button[2]")
	WebElement Submit;
	@FindBy (xpath="//h6[text()='Manoj kumar']")
	WebElement personaldetails;
	@FindBy(xpath ="//div//input[@class='oxd-input oxd-input--active']//following::div[39]//label")
	WebElement checkcox;
	@FindBy(xpath = "//div//input[@class='oxd-input oxd-input--active']//following::div[45]")
	WebElement user;
	@FindBy(xpath = "//div//input[@class='oxd-input oxd-input--active']//following::div[63]")
	WebElement pass;
	@FindBy(xpath = "//div//input[@class='oxd-input oxd-input--active']//following::div[67]")
	WebElement confpass;
	@FindBy(xpath="//div//h6[text()='Mano kumar']")
	WebElement manokumar;
	//PMI_TC_02
	@FindBy(xpath="//li//a[text()='Employee List']")
	WebElement employe_list;
	@FindBy(xpath="//div[@class='oxd-table-cell-actions']//button[2]")
	WebElement employe_list_edit;
	@FindBy(xpath="//label[text()='Nationality']//following::div[1]")
	WebElement Nationality;
	@FindBy(xpath="//label[text()='Nationality']//following::div[2]")
	WebElement Marital_Status;
	@FindBy(xpath="//label[text()='Nationality']//following::div[19]")
	WebElement DOB_YMD;
	@FindBy(xpath="//label[text()='Smoker']//following::i[1]")
	WebElement checkbox_smoker;
	@FindBy(xpath="//div//label[text()='Blood Type']//following::div[1]")
	WebElement bloodgroup_dropdown;
	@FindBy(xpath="//div//textarea")
	WebElement comment;
	@FindBy(xpath="//p[text()=' * Required']//following::button[1]")
	WebElement savebutton_01;
	@FindBy(xpath="//label[text()='Nationality']//following::div[57]//button")
	WebElement savebutton_2;
	//TC_PMI_03
	//div//div[text()='0267']//following::button[1]
	@FindBy(xpath="//div[7]//button//following::button[2]//i[@class='oxd-icon bi-trash']")
	WebElement Deleit_button;
	@FindBy(xpath="//div//p[text()='Are you Sure?']//following::i")
	WebElement deleit_yes;
	
	

	
	
	
	public PMI_page(){
		PageFactory.initElements(driver, this);

}
	public void PMI_adding_functon() throws Exception {
		report = extent.createTest("verify PMI_page").assignDevice("windoes");
		   report.info("Testing the PMI_Page ");
		  
		   Actions act = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.MINUTES);
		
		username.sendKeys(userid());
		password.sendKeys(password());
		logbutton.click();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.MINUTES);
		Pmi.click();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.MINUTES);
		AddEmplo.click();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.MINUTES);
		FirstName.sendKeys("Mano");
		midname.sendKeys("j");
	lastname.sendKeys("kumar");
	//act.moveToElement(checkcox).click().build().perform();
	//user.sendKeys("Mano");
	//driver.findElement(By.xpath("//div//input[@class='oxd-input oxd-input--active']//following::div[68]//button[@type='submit']")).click();
	//act.keyDown(Submit, Keys.ENTER).build().perform();
   // act.moveToElement(Submit).click().build().perform();
	//WebElement button = driver.findElement(By.xpath("//div[@class='oxd-form-actions']//following::button[2]"));
	Submit.click();
	//JavascriptExecutor executor = (JavascriptExecutor) driver;
	//executor.executeScript("arguments[0].click();",button);
 //driver.manage().timeouts().implicitlyWait(7, TimeUnit.MINUTES);
	
     if(manokumar.isDisplayed()) {
    	 report.pass("Employe personal ditails added.");
     }else {
    	 report.fail("Empolye personal ditails is failed to added.");
     }
	}


          public void PMI_edting_function() {
        	  report = extent.createTest("TC_PMI_02page").assignDevice("windoes");
   		   report.info("Testing the PMI_Page02 ");
   		 Actions act = new Actions(driver);
   		   
   		   
   		driver.manage().timeouts().implicitlyWait(7, TimeUnit.MINUTES);
   		username.sendKeys(userid());
		password.sendKeys(password());
		logbutton.click();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.MINUTES);
		Pmi.click();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.MINUTES);
   		   
        	  employe_list.click();
        	  driver.manage().timeouts().implicitlyWait(7, TimeUnit.MINUTES);
        	  
        	  employe_list_edit.click();
        	  driver.manage().timeouts().implicitlyWait(7, TimeUnit.MINUTES);
        	 
        	 //elect se=new Select(Nationality);
        	//se.selectByVisibleText("Indian");
        	 //river.manage().timeouts().implicitlyWait(7, TimeUnit.MINUTES);
     // 	checkbox_smoker.click();
        	  //lect sc=new Select(Marital_Status);
        	//sc.selectByVisibleText("Single");
        	//driver.manage().timeouts().implicitlyWait(7, TimeUnit.MINUTES);
        	act.moveToElement(DOB_YMD).sendKeys("1999-07-07").build().perform();
        	driver.manage().timeouts().implicitlyWait(7,TimeUnit.MINUTES);
        	act.moveToElement(checkbox_smoker).build().perform();
        	  driver.manage().timeouts().implicitlyWait(7, TimeUnit.MINUTES);
        	 
        act.moveToElement(savebutton_01).build().perform();
        	driver.manage().timeouts().implicitlyWait(7, TimeUnit.MINUTES);
        	act.moveToElement(savebutton_2).build().perform();
        	driver.manage().timeouts().implicitlyWait(7, TimeUnit.MINUTES);
        	
        	 if(savebutton_01.isDisplayed()) {
        		 report.pass("the employe details  were added");
        		 
        	 }else {
        		report.fail("the employe details were not added");
        	 }
         }
          
         public void PMI_page_3() {
        	 report = extent.createTest("TC_PMI_03page").assignDevice("windoes");
     		   report.info("Testing the PMI_Page03 ");
     		 Actions act = new Actions(driver);
     		   
     		   
     		driver.manage().timeouts().implicitlyWait(7, TimeUnit.MINUTES);
     		username.sendKeys(userid());
  		password.sendKeys(password());
  		logbutton.click();
  		driver.manage().timeouts().implicitlyWait(7, TimeUnit.MINUTES);
  		Pmi.click();
  		driver.manage().timeouts().implicitlyWait(7, TimeUnit.MINUTES);
     		   
          	  employe_list.click();
          	  driver.manage().timeouts().implicitlyWait(7, TimeUnit.MINUTES);
        	 
        	act.moveToElement(Deleit_button).click().build().perform();
        	  driver.manage().timeouts().implicitlyWait(7, TimeUnit.MINUTES);
        	
        	act.moveToElement(deleit_yes).click().build().perform();
        	  driver.manage().timeouts().implicitlyWait(7, TimeUnit.MINUTES);
        
        	  if(deleit_yes.isDisplayed()) {
        		  report.pass("sussesfuly deleited the exesting employee details");
        		  
        	  }else {
        		  report.fail("employee details was not deleted");
        		  
        	  }
         
			

		}
          
          
          
          }
	


