package test.java;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.java.cart;

public class cartTest {
	@Test
	public void verifybuy() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\mduraipandi\\Downloads\\chromedriver_win32.zip\\chromedriver.exe");

	 WebDriver driver= new ChromeDriver();
	 cart buy = new cart(driver);
	 driver.manage().window().maximize();
	 driver.get("http://automationpractice.com/index.php?id_category=9&controller=category");
	 buy.AddCart();

	 String actualURL= driver.getCurrentUrl();

	 String expectedURL= "http://automationpractice.com/index.php?controller=order";
	 Assert.assertEquals(actualURL, expectedURL);
	}
	// @AfterMethod
	// public void tearDown() {
	// driver.close();

	}

