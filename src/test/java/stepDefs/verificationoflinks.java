package stepDefs;

import actions.verificationlinkAction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class verificationoflinks {
	verificationlinkAction verify=new verificationlinkAction();
	
	@Given("user launches the url {string}")
	public void user_launches_the_url(String s) {
	   verify.driver.navigate().to(s);
	}

	@Then("clicking on the first link")
	public void clicking_on_the_first_link() {
	    verify.verifyFirstlink();
	}

	@And("checking whether redirecting to the next page or not")
	public void checking_whether_redirecting_to_the_next_page_or_not() {
	   verify.verifyPage();
	  // verify.verifyPage2();
	  // verify.verifyPage3();
	}

	@Then("clicking on the second link")
	public void clicking_on_the_second_link() throws InterruptedException {
	    verify.verifysecondlink();
	}

	@Then("clicking on the third link")
	public void clicking_on_the_third_link() {
	    verify.verifythirdlink();}
	}