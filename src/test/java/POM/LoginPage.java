package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//Declaration
	@FindBy(xpath = "") private WebElement un;
	@FindBy(xpath = "") private WebElement pwd;
	@FindBy(xpath = "") private WebElement loginBtn;
	//Initialization
public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);}
	
	//Implementation
public WebElement getUn() {
	return un;
}
public WebElement getPwd() {
	return pwd;
}
public WebElement getLoginBtn() {
	return loginBtn;
}


}
