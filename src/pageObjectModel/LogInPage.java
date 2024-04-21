package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage { 
	
 public static WebElement email_input(WebDriver driver) {
	 WebElement email=driver.findElement(By.name("email"));
	 return email;
 } 
 
 
 public static WebElement pass_input(WebDriver driver) {
	 WebElement pass=driver.findElement(By.name("pass"));
	 return pass;
 }
 
 public static WebElement loginbtn(WebDriver driver) {
	 WebElement btn=driver.findElement(By.name("login"));
	 return btn;
 }
 
}
