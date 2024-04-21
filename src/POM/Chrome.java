package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Chrome {
	
	WebDriver Chrome;
    public String facebookURL = "https://www.facebook.com/";
    String email="EMAIL HERE";
    String pass="PASSWORD HERE";
   
	
	@BeforeMethod
	public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yamama Abu Liel\\Desktop\\QA\\Automation\\chromedriver-win64\\chromedriver.exe");
        Chrome=new ChromeDriver();
        Chrome.get(facebookURL);

	}
	
    @Test
    public void CheckTitleInChrome() 
    {
        String expectedTitle = "Facebook - log in or sign up";
        String actualTitle = Chrome.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }
    
    
    @Test 
    public void ValidLogIn() 
    {
    	LogInPage.email_input(Chrome).sendKeys(email);
    	LogInPage.pass_input(Chrome).sendKeys(pass);
    	LogInPage.loginbtn(Chrome).click();
    	String expectedResult="Facebook";
    	String ActualResult=Chrome.getTitle();
        Assert.assertEquals(expectedResult, ActualResult);
        
    }
    
    
  
    
    
    @AfterMethod
    public void TearDown() {
    	Chrome.close();
    }

    }

