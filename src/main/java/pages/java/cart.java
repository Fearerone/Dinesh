package pages.java;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import URLpackage.baseClass;

public class cart {
	WebDriver driver;
	 //UI Elements
	WebElement box = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/h5"));
	WebElement buy = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span"));
	WebElement checkOut = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));
	//Constructor to initialize current class objects
	public cart(WebDriver driver) {
	 this.driver=driver;
	}


	  public void AddCart() { 
		  driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span")).click();
		  driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")).click();
	  // return new HomePage(); 
	  }
}
