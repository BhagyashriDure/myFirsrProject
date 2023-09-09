package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Ajio {
  @Test
  public void aJio() throws InterruptedException {
	  //System.setProperty("webdriver.chrome.driver","E:\\Bhagyashri\\Testing\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();	  
	  driver.get("https://www.ajio.com/");
	  System.out.println("change here on Ajio");
	 // Assert.fail();
	  Thread.sleep(2000);
	  driver.quit();
  }
}
