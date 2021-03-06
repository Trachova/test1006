package Preparation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by X230 on 10.06.2017.
 */
public class DriverConfiguration {

    protected static WebDriver driver;


    @BeforeMethod
    public void before() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }


    @AfterMethod
    public void after() {
        driver.close();
    }
}
