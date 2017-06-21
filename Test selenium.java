package com.example.tests;

//import java.util.regex.Pattern;
//import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Keys;

public class TestSelenium {
  private WebDriver driver;
  private String baseUrl;
 // private boolean acceptNextAlert = true;
 // private StringBuffer verificationErrors = new StringBuffer();

  @BeforeTest(alwaysRun = true)
  public void setUp() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "C:\Automation\Selenium template\chromedriver.exe");
    driver = new ChromeDriver();
    baseUrl = "http://www.phptravels.net/";
    //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testSelenium() throws Exception {
    driver.get(baseUrl);
    driver.findElement(By.class("select2-chosen")).clear();
    driver.findElement(By.class("select2-chosen")).sendKeys("Miami");
    driver.sendKeys(Keys.RETURN);
  }

  @AfterTest(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

/*  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }*/
}
