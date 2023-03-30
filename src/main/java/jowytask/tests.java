package jowytask;

import static org.testng.Assert.assertTrue;
import org.testng.Assert;
import org.testng.annotations.Test;

public class tests extends Base {
	HomePage eg= new HomePage(driver);
	AEPage AE= new AEPage(driver);
	IraqPage Iq= new IraqPage(driver);
	
	@Test
	public void verifyEgSite()throws Exception {
		eg.getEgyptSite();
		String EGURL = driver.getCurrentUrl();	
		String ExpectURL="https://subscribe.jawwy.tv/eg-ar";
		Assert.assertEquals(EGURL, ExpectURL);
		eg.getEGBundles();
		String EgPrice = eg.GetPrice();
		assertTrue(EgPrice.contains("جنيه مصري") );
	}
	@Test
	public void validateAESite() throws Exception {
			AE.gotoAEURL();			
			String Title = driver.getCurrentUrl();	
			String ExpectTitle="https://subscribe.jawwy.tv/ae-ar";			
			Assert.assertEquals(Title, ExpectTitle);
			AE.GetAEBundles();
			String AEPrice = AE.GetPrice();
			assertTrue(AEPrice.contains("درهم إماراتي") );
		}
	@Test
	public void validateIraqSite() throws Exception {
		 Iq.gotoiqURL();			
			String Title = driver.getCurrentUrl();	
			String ExpectTitle="https://subscribe.jawwy.tv/iq-ar";			
			Assert.assertEquals(Title, ExpectTitle);
			Iq.GetIqBundles();
			String AEPrice = Iq.GetPrice();
			assertTrue(AEPrice.contains("دينار عراقي") );
		}
	
	
	
	
}
// you can apply this approach for all other countries 
