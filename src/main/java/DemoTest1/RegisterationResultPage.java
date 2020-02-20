package DemoTest1;

import org.openqa.selenium.By;

public class RegisterationResultPage extends Utils {
    private By _registerSuccessMessage = By.cssSelector("div.result");
    String expected = "Your registration completed";


    public void verifyUserSeeRegistrationSuccessMessage(){
        assertURL("registerresult");
        assertTexMessage("Registration not successful",expected,_registerSuccessMessage);



    }



}
