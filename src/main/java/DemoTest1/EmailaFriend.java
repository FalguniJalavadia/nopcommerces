package DemoTest1;

import org.openqa.selenium.By;

public class EmailaFriend extends Utils {

    private By _friendEmail = By.linkText("friend-email");
    private By _yourEmail = By.xpath("//input[@class='your-email']");
    private By _messageTextbox = By.cssSelector("textarea#PersonalMessage");
    private By _sendemail = By.linkText("send-email");
    private String friendEmail = "sdr@gmail.com";
    private String yourEmail = "wer@gmail.com";
    private String TextBox = "NICE PRODUCT";

 public void userShouldEmailFriend(){
     sendText( _friendEmail,friendEmail);
     sendText(_yourEmail,yourEmail);
     sendText(_messageTextbox,TextBox);
     clickOnElement(_sendemail);
 }






}
