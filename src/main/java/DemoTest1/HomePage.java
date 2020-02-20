package DemoTest1;

import org.openqa.selenium.By;

public class HomePage extends Utils {



    private By _registerLink = By.linkText("Register");
    private By _compareFirstProduct = By.xpath("//div/div[2]/div/div[2]/div[3]/div[2]/input[@value='Add to compare list']");
    private By _compareSecondProduct = By.xpath("//div/div[3]/div/div[2]/div[3]/div[2]/input[@value='Add to compare list']");
  //  private By _compareProduct = By.linkText("product comparison");
    private By _noteBooks = By.linkText("Notebooks");
    private By _compareProduct = By.linkText("product comparison");
  //  private By _compareProduct = By.cssSelector("div.bar-notification.success");
// private By _productClick = By.xpath("//*[@id=\"bar-notification\"]/div/p");
  private By _displayBarField = By.cssSelector("div.bar-notification.success");
    //  private By _displayBarField = By.cssSelector("div#bar-notification");
    private By _productClick = By.linkText("Apple MacBook Pro 13-inch");

  // private By _productClick = By.xpath("Show details for Apple MacBook Pro 13-inch");





    public void clickOnRegisterButton() {
        clickOnElement(_registerLink);
    }



    public void clickOnCompareProduct() {
        clickOnElement(_compareFirstProduct);
        //verifying
       // verifyElementIsDisplayed(_displayBarField);
        clickOnElement(_compareSecondProduct);
        //verifying
        clickOnElement(_compareProduct);
       // verifyElementIsDisplayed(_displayBarField);

        clickOnElement(_compareProduct);
    }
   // public void clickOnProduct(){
    //   clickOnElement(_productClick);
   // }

    public void clickOnProduct() {
        clickOnElement(_noteBooks);

    }

    }