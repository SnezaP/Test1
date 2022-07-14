package tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {

    public WebDriver driver;

    @Before

    public void setup () {

 System.setProperty("webdriver.gecko.driver"," C:\\Users\\QA25\\Desktop\\Testproject\\TestProject\\lib\\geckodriver-v0.31.0-win64\\geckodriver.exe")
driver = new FirefoxDriver();
driver.manage().window().maximize();
  
}
@After

public void teardown(){
driver.quit();

}
}
