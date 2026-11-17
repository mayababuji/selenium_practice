package tests;

import base.BaseSetup;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageScenarios extends BaseSetup {
    @Test
    public void verifyHomePageTitle(){
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,"The Internet");
    }
    @Test
    public void verifyHomePageUrl(){
        String actualUrl = driver.getCurrentUrl();
   Assert.assertTrue(actualUrl.contains("the-internet.herokuapp.com"));
       // Assert.assertEquals(actualUrl,"https://the-internet.herokuapp.com/");
    }
}
