package objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class verificationlinkObject {



@FindBy(xpath="//img[@alt='testRigor']")
public WebElement firstLink;
@FindBy(xpath="//div[text()='Katalon']")
public WebElement secondLink;
@FindBy(xpath="//img[@alt='Test Project']")
public WebElement thirdLink;


}
