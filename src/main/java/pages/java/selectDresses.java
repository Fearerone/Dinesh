package pages.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import URLpackage.baseClass;

public class selectDresses {
WebDriver driver;
 //UI Elements
WebElement dresses = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a"));
WebElement casualdress = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[1]/a"));

//Constructor to initialize current class objects
public selectDresses(WebDriver driver) {
 this.driver=driver;
}


public void casual() {
driver.findElement(By.xpath("//*[@id=\\\"block_top_menu\\\"]/ul/li[2]/ul/li[1]/a")).click();
// return new HomePage(); 
}

}