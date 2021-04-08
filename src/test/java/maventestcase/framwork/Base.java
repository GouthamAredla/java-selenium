package maventestcase.framwork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class Base {
	protected String ProjectPath;
	protected WebDriver driver;

	@BeforeGroups(groups = { "TEST_SMOKE", "TEST_SANITY" }) // grops is given to run a particular mathods from all the
															// methods
	public void beforeGroups() {
		System.out.println("Before group");
	}

	@AfterGroups(groups = { "TEST_SMOKE", "TEST_SANITY" }) // wen ever you ues multipul values all give it in { }
	public void afterGroups() {
		System.out.println("After Groups");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before suite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("After suite");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Befor test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}

	@BeforeMethod // @BeforMethod is an annotation
	public void beforMethod() { // firstName is an atribute
		System.out.println("Befor Method");
		ProjectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", ProjectPath + "\\resources\\driver\\chromedriver.exe");

		driver = new ChromeDriver();

	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After method");
		driver.quit();
	}

	@BeforeClass
	public void beforClass() {
		System.out.println("Classes test started:-");
		System.out.println("Befor Class");

	}

	@AfterClass
	public void afterClass() {
		System.out.println("After class");

	}

	@DataProvider(name = "myDataArrye")
	public Object[][] dataProvider() {
		Object[][] object = { { "user1", "password1", "hyderabad" }, { "user2", "password2", "bengalor" },
				{ "user3", "hyderabad", "mumbi" } };
		return object;
	}
}
