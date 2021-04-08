package maven.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage {
	WebDriver driver;
	By byFrstName = By.name("firstname");
	By byLastName = By.xpath("//input[@name='lastname']");
	By byMobileNumber = By.xpath("//input[@name='reg_passwd__']");
	By byPassword = By.xpath("//input[@name='reg_passwd__']");
	By byGender = By.xpath("//input[@value='2']");

	public void signUpNewAccount() {
		driver.findElement(byFrstName).sendKeys("goutham");
		driver.findElement(byLastName).sendKeys("reddy");

		driver.findElement(byMobileNumber).sendKeys("924123546");

		driver.findElement(byPassword).sendKeys("okayletsgo");

		driver.findElement(byGender).click();

	}

	public void selectMonth() {

		WebElement elementMonth = driver.findElement(By.id("month"));

		Select month = new Select(elementMonth);
		month.selectByIndex(11);

	}

	public void selectDay() {
		Select day = new Select(driver.findElement(By.id("day")));
		day.selectByValue("18");
	}

	public void selectYesr() {

		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByValue("1994");

	}

	public SignUpPage(WebDriver driver) {
		this.driver = driver;
	}
}
