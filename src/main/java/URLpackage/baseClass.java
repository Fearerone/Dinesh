package URLpackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.java.pageLogin;

public class baseClass {
	public static WebDriver driver;
	public pageLogin loginPage;

	@BeforeMethod
	public void setup() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\mduraipandi\\Downloads\\chromedriver_win32.zip\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	loginPage = new pageLogin(null);
}
	@AfterMethod
	public void tearDown() {
	driver.close();
	}
	}

