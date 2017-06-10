package Dumskaya;

import Preparation.DriverConfiguration;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

/**
 * Created by X230 on 10.06.2017.
 */
public class Dumskaya extends DriverConfiguration {
    final String basicURL = "http://dumskaya.net/";

    @BeforeMethod
    public void beforeMethod() {
        driver.get(basicURL);

    }

    @Test
    public void firstFive() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        System.out.println();
        for (int i = 1; i <= 20; i++) {
            String news = driver.findElements(By.cssSelector("[id*='newstr'] >td:not(.newsdatetd):not(.newsdateline")).get(i).getText();
            System.out.println(news);
        }

    }
}

