package jowytask;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

class Base {
		public static WebDriver driver;	
		
		@BeforeClass
		public void startUP() throws InterruptedException{
			
			System.setProperty("webdriver.chrome.driver","D:\\new\\chromedriver_win32\\chromedriver.exe");
			
			driver = new ChromeDriver();
			String URL="https://subscribe.jawwy.tv/";
			 driver.get(URL);
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			 driver.manage().window().maximize();

		}
	
		@AfterClass
		 public void TearDownTest()
	     { 
	     driver.close();
	     }
	}

