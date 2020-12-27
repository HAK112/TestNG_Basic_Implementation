package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tester {
	WebDriver driver = null;
	String driverPath = "resource//drivers//chromedriver.exe//";
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", driverPath);
      driver = new ChromeDriver();
	  System.out.println("Rynnning test");
	  driver.get("https://google.com");
  }
}
