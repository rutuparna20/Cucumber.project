package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class searchStepDef {
	public static WebDriver driver;

@Given("I want to launch the url")
public void i_want_to_launch_the_url() {
  
  hooks.driver.get("https://www.google.com/");
}

@And("entering the value in the search field")
public void entering_the_value_in_the_search_field() {
    hooks.driver.findElement(By.xpath("//*[@name='q']")).sendKeys("selenium");
    
}

@Then("I click on the enter button")
public void i_click_on_the_enter_button() {
	hooks.driver.findElement(By.xpath("//*[@name='q']")).sendKeys(Keys.ENTER);
	
    
}

@And("I should be redirected to the search page")
public void i_should_be_redirected_to_the_search_page() {
   System.out.println(hooks.driver.getTitle());
}
}
