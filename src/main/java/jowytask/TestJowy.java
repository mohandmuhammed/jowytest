package jowytask;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestJowy {
	WebDriver driver;
	
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\new\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://subscribe.jawwy.tv/eg-ar");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	@AfterClass
	public void teardown() {
		driver.quit();
		
		
	}
	@Test
	public void verifyTitle() {
		

		String Title = driver.getTitle();	
		String ExpectTitle="جوّي TV | شاهدوا أفلام ومسلسلات أونلاين وبث تلفزيوني مباشر";
		
		Assert.assertEquals(Title, ExpectTitle);
		
	}
	public List<WebElement> bundles()throws Exception{
		return driver.findElements(By.className("plan-title"));} 
	@Test
	public void verifyBundles() throws Exception {
		for(WebElement e : bundles()) {
			System.out.println(e.getText());
		Assert.assertEquals(bundles().get(0).getText(), "لايت");
		Assert.assertEquals(bundles().get(1).getText(), "الأساسية");
		Assert.assertEquals(bundles().get(2).getText(), "بريميوم");

		}
		}
		
		
	}
	
	


