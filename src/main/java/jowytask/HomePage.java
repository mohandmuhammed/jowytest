package jowytask;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePage extends Base {
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
}
	
	
	
	   public void getEgyptSite() {
		   
		   driver.get("https://subscribe.jawwy.tv/eg-ar");
		    
		}
	   public List<WebElement> bundles()throws Exception{
			return driver.findElements(By.className("plan-title"));	

		
	   }
	   public void getEGBundles() throws Exception {			
			for(WebElement e : bundles()) { 
				//System.out.println(e.getText());
			Assert.assertEquals(bundles().get(0).getText(), "لايت");
			Assert.assertEquals(bundles().get(1).getText(), "الأساسية");
			Assert.assertEquals(bundles().get(2).getText(), "بريميوم");

			}
}
	   public  String GetPrice() {
		   String price= driver.findElement(By.className("trial-cost")).getText();
			return price;
			
			
		}
	   



}
	
	
	
	


