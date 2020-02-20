package DemoTest1;

import org.openqa.selenium.By;

public class CompareSuccessPage extends Utils {
private By _compareSuccessMassage = By.xpath("//div[@class='page-title']");
String expected = " comparproducts";
public void verifyUserShouldSeecompareSuccessMassage(){
   assertURL("compareproducts");
   assertTexMessage("compare message not display",expected,_compareSuccessMassage);


}



}
