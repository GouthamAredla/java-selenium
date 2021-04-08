package maven.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	// @FindBy(linkText = "Create New Account")
	// private WebElement btnCreateNewAccount;

	// Another way to do it
	By btnCreateNewAccount = By.linkText("Create New Account");

	public void clickCreateNewAccountButton() {
		// btnCreateNewAccount.click();
		driver.findElement(btnCreateNewAccount).click();

	}

	public LoginPage(WebDriver driver) {
		this.driver = driver;
//		PageFactory.initElements(driver, FacebookLoginPage.class);
	}
}
