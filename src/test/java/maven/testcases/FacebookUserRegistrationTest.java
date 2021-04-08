package maven.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import maven.pages.LoginPage;
import maven.pages.SignUpPage;
import maventestcase.framwork.Base;

public class FacebookUserRegistrationTest extends Base {
	@Test
	public void FacebookUserRegistrationTest() {

		driver.get("http://www.facebook.com");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		LoginPage loginPage = new LoginPage(driver);
		loginPage.clickCreateNewAccountButton();

		SignUpPage signUp = new SignUpPage(driver);
		signUp.signUpNewAccount();
		signUp.selectMonth();
		signUp.selectDay();
		signUp.selectYesr();

	}
}
