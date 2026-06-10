package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_Demoautomation {

//Declaration 
	@FindBy(xpath = "(//input[@type='text'])[1]") private WebElement FN;
	@FindBy(xpath = "(//input[@type='text'])[2]") private WebElement LN;
	@FindBy(xpath = "//textarea[@rows='3']") private WebElement Add;
	@FindBy(xpath = "//input[@type='email']") private WebElement Em;
	@FindBy(xpath = "//input[@type='tel']") private WebElement ph;
	@FindBy(xpath = "(//input[@type='password'])[1]") private WebElement pwd;
	@FindBy(xpath = "(//input[@type='password'])[2]") private WebElement cnfrmpwd;

//Initialization 
public LoginPage_Demoautomation (WebDriver driver) {
	PageFactory.initElements(driver, this);
}
//Implementation

public WebElement getFN() {
	return FN;
}

public WebElement getLN() {
	return LN;
}

public WebElement getAdd() {
	return Add;
}

public WebElement getEm() {
	return Em;
}

public WebElement getPh() {
	return ph;
}

public WebElement getPwd() {
	return pwd;
}

public WebElement getCnfrmpwd() {
	return cnfrmpwd;
}


	
}
