package DemoTest1;

import org.junit.Test;

public class TestSuit extends BaseTest {
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegisterationResultPage registerationResultPage = new RegisterationResultPage();
    CompareSuccessPage compareSuccessPage = new CompareSuccessPage();

    @Test
    public void userShouldAbleToRegisterButton() {
        //click on register button
        homePage.clickOnRegisterButton();
        // fill up registration details
        registrationPage.verifyUserIsOnRegisterpage();
        registrationPage.userEntersRegistrationDetails();
        //verify registration success message
        registerationResultPage.verifyUserSeeRegistrationSuccessMessage();
    }


    @Test

    public void userShouldBeAbleToCompareTwoDifferentProductSuccessfully() {
        //select two product & click compare
        homePage.clickOnCompareProduct();
        //verify compare success massage
        compareSuccessPage.verifyUserShouldSeecompareSuccessMassage();

    }

    @Test

    // public void userShouldBeAbleToRefeAProductToFriendverifyEmailSsentSuccess(){
    // click on product
   // homePage.clickOnProduct();


     public void registeredUserShouldBeAbleToReferAProductTOAFriend() {
     homePage.clickOnRegisterButton();
     registrationPage.userEntersRegistrationDetails();

        RegisterationResultPage.verifyUserSeeRegistrationSuccessMessage();

    //click on continue registration
     RegisterationResultPage.pageContinue();

    //click on any product
    // homePage.clickOnProduct();

    //click on product
    //  productPage.clickOnEmail();

    //verify user in product email a friend page
     EmailaFriend.userSh();

    //user entering details
      emailAFriendPage.emailAFriendDetails();


}
}