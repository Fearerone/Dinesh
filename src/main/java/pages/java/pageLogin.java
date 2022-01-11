package pages.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import URLpackage.baseClass;

public class pageLogin {
WebDriver driver;
 //UI Elements
WebElement email = driver.findElement(By.id("email"));
WebElement pass = driver.findElement(By.id("passwd"));
WebElement LoginBtn = driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span"));

//Constructor to initialize current class objects
public pageLogin(WebDriver driver) {
 this.driver=driver;
}

  public void login() { 
  driver.findElement(By.id("email")).sendKeys("dragonballdinesh@gmail.com");
  driver.findElement(By.id("passwd")).sendKeys("Dinesh1234");
  driver.findElement(By.xpath("//*[@id=\\\"SubmitLogin\\\"]/span")).click();
  // return new HomePage(); 
  }
 
}