package DemoTest1;

import org.openqa.selenium.By;

public class ProductPage extends Utils
{

private By _appleMacBook = By.linkText("Apple MacBook Pro 13-inch");
private By _emailFriend = By.linkText("button-2 email-a-friend-button");


    public void clickOnProduct() {
        clickOnElement(_appleMacBook);
        clickOnElement(_emailFriend);
    }
}
