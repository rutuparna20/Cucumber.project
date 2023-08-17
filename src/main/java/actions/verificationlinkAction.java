package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import org.junit.Assert;
import objects.verificationlinkObject;



public class verificationlinkAction {
	public static WebDriver driver;
	verificationlinkObject link=PageFactory.initElements(driver,verificationlinkObject.class);

	public void verifyFirstlink()
	{
		link.firstLink.click();
	
	}
	public void verifyPage() {
		
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("testRigor Tutorial",title);
		//if(title.equals("testRigor Tutorial")) {
			System.out.println("passed");
		//}
	}
		public void verifysecondlink() throws InterruptedException
		{
			driver.navigate().back();
			Thread.sleep(5000);
			link.secondLink.click();
		
		}
		public void verifyPage2() {
			//Assert.assertEquals(null, null);
			String title=driver.getTitle();
			System.out.println(title);
			if(title.equals("katalon-studio-tutorial")) {
				System.out.println("passed");
			}
	}
		public void verifythirdlink() 
		{driver.navigate().back();
			link.thirdLink.click();
		
		}
		public void verifyPage3() {
			//Assert.assertEquals(null, null);
			String title=driver.getTitle();
			System.out.println(title);
			if(title.equals("istqb-foundation-level/")) {
				System.out.println("passed");
			}
	}
}
