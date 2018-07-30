package selenium_test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Selenium_Test {
	WebDriver driver;
  @Test
  public void login() {
	  driver.findElement(By.name("uname")).sendKeys("admin");
	  driver.findElement(By.name("pswd")).sendKeys("pass");
	  driver.findElement(By.xpath("//*[@type='submit']")).click();
	  String breakpoint=driver.findElement(By.tagName("h2")).getText();
	  Assert.assertEquals(breakpoint, "Prolearn");
  }
  @BeforeClass
  public void beforeClass() {
	  //System.setProperty("", arg1)
	  driver= new FirefoxDriver();
	  driver.get("http://ec2-18-216-135-250.us-east-2.compute.amazonaws.com:8090/TestWebapp-1.0/");
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
