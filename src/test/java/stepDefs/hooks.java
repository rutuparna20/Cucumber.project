package stepDefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import actions.verificationlinkAction;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
	public static WebDriver driver;
	 
	 @Before
	 public void setUp() {
	  System.out.println("Inside before hook");
	  verificationlinkAction.driver= new ChromeDriver();
	  verificationlinkAction.driver.manage().window().maximize();
	 }
	 
	 @After
	 public void tearDown() {
	  System.out.println("Inside after hook");
	  //verificationlinkAction.driver.quit();
	 }
	}

