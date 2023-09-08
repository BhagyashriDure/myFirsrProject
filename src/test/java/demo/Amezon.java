package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amezon {
  @Test
  public void amezonTest() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  //System.setProperty("webdriver.chrome.driver","E:\\Bhagyashri\\Testing\\chromedriver.exe");
	  driver.get("https://www.amazon.in/");	  
	  Thread.sleep(2000);
	  driver.quit();
  }
}
