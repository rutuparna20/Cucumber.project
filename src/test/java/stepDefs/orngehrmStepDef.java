package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class orngehrmStepDef {
	@Given("user launches the URL")
	public void user_launches_the_url() throws InterruptedException {
		 hooks.driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 Thread.sleep(3000);
	}

	@And("entering the value in USERNAME")
	public void entering_the_value_in_username() {
	   hooks.driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	}

	@And("entering the value in PASSWORD")
	public void entering_the_value_in_password() {
		 hooks.driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	}

	@Then("clicking on the login button")
	public void clicking_on_the_login_button() throws InterruptedException {
	    hooks.driver.findElement(By.xpath("//button[@type='submit']")).click();
	    System.out.println("logged in");
	    Thread.sleep(3000);
	}

	@And("landed in the nextpage")
	public void landed_in_the_nextpage() {
		System.out.println(hooks.driver.getTitle());
	}

	

	@Then("validating the Admin field by clicking on it whether its redirecting to the required page or not")
	public void validating_the_admin_field_by_clicking_on_it_whether_its_redirecting_to_the_required_page_or_not() throws InterruptedException {
	    hooks.driver.findElement(By.xpath("//span[text()='Admin']")).click();
	    Thread.sleep(3000);
	   WebElement ele=hooks.driver.findElement(By.xpath("//h6[text()='Admin']"));
	 String text= ele.getText();
	    System.out.println(text);
	    if(text.equals("Admin")){
	    	System.out.println("passed");}
	    }
	  
	

	@Then("validating the PIM field by clicking on it whether its redirecting to the required page or not")
	public void validating_the_pim_field_by_clicking_on_it_whether_its_redirecting_to_the_required_page_or_not() throws InterruptedException {
		 hooks.driver.findElement(By.xpath("//span[text()='PIM']")).click();
		    Thread.sleep(3000);
		   WebElement ele=hooks.driver.findElement(By.xpath("//h6[text()='PIM']"));
		 String text= ele.getText();
		    System.out.println(text);
		    if(text.equals("PIM")){
		    	System.out.println("passed");}
	}

	@Then("validating the Leave field by clicking on it whether its redirecting to the required page or not")
	public void validating_the_leave_field_by_clicking_on_it_whether_its_redirecting_to_the_required_page_or_not() throws InterruptedException {
		hooks.driver.findElement(By.xpath("//span[text()='Leave']")).click();
	    Thread.sleep(3000);
	   WebElement ele=hooks.driver.findElement(By.xpath("//h6[text()='Leave']"));
	 String text= ele.getText();
	    System.out.println(text);
	    if(text.equals("Leave")){
	    	System.out.println("passed");}
	}

}
