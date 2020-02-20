package DemoTest1;

import org.junit.Assert;
import org.openqa.selenium.By;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils extends BasePage {


    public static void clickOnElement(By by) {

        driver.findElement(by).click();
    }

    public static String createTimeStamp() {
        DateFormat dateFormat = new SimpleDateFormat("ddMMHHmmss");
        Date date = new Date();
        return (dateFormat.format(date));
    }

    public static void assertURL(String text) {
        Assert.assertTrue(driver.getCurrentUrl().contains(text));
    }

    public static void sendText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public static void assertTexMessage(String message, String expected, By by) {
        String actual = getTextFromElements(by);
        Assert.assertEquals(message, expected, actual);
    }

    public static String getTextFromElements(By by) {
        return driver.findElement(by).getText();

    }

    public static void verifyElementIsDisplayed(By by) {

        Assert.assertTrue(driver.findElement(by).isDisplayed());
    }

}
