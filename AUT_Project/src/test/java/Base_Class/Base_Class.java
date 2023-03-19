package Base_Class;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {
     public static WebDriver driver;
   public static ExtentReports extent;
   ExtentSparkReporter spark;
  public static Properties prop;
  @BeforeTest
  public void extentreports() {
	  extent= new ExtentReports();
		spark= new ExtentSparkReporter("target/spark.html");
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("my Report");
		extent.attachReporter(spark);
  }
  
	@BeforeMethod
	public void startup() throws Exception {
		
		 prop = new Properties();
			FileInputStream fs= new FileInputStream("F:\\AUT1_Project\\AUT_Project\\config.properties");
			prop.load(fs);
			
			switch (prop.getProperty("browser")) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				break;
			case "edge":
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
				driver.manage().window().maximize();
				break;
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
				driver.manage().window().maximize();
			default:WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
				break;
			}
		 driver.get(prop.getProperty("url"));
		// driver.manage().timeouts().implicitlyWait(7, TimeUnit.MINUTES);
		 //driver.manage().window().fullscreen();
	}
	
	
	@AfterTest
	public void extentreportclcose() {
		extent.flush();
	}
	@AfterMethod
	public void close() {
		extent.flush();
		driver.quit();
	}
	public String userid() {
	String user =prop.getProperty("username");
		return user;
	}
	public String password() {
		String user =prop.getProperty("password");
			return user;
		}
	
	

}
