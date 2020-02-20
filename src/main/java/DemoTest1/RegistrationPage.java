package DemoTest1;

import org.openqa.selenium.By;

public class RegistrationPage extends Utils {

        private By _firstname = By.id("FirstName");
        private By _lastname = By.id("LastName");
        private By _email = By.xpath("//input[@name='Email']");
        private By _password = By.xpath("//input[@name='Password']");
        private By _confirmpassword = By.id("ConfirmPassword");
        private By _registerButton = By.id("register-button");
        private String firstname = "Rajesh";
        private String lastname = "Khana";
        private static String timestamp = createTimeStamp();

        public void verifyUserIsOnRegisterpage(){
            assertURL("register");
        }
        public void userEntersRegistrationDetails(){
            sendText(_firstname, firstname);
            sendText(_lastname, lastname);
            sendText(_email, "testtest"+timestamp+"@test.com");
            sendText(_password, "testtest");
            sendText(_confirmpassword,"testtest");
            clickOnElement(_registerButton);
    }



}
