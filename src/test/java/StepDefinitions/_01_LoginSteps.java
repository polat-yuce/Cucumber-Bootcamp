package StepDefinitions;

//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;   //Yukarıdaki 3 impotrun yerine aşağıdaki yazılabilir

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.*;

public class _01_LoginSteps {
    DialogContent dc = new DialogContent();

    @Given("Navigate to Campus")
    public void navigate_to_campus() {
        System.out.println("Site açıldı");
        GWD.getDriver().get("https://test.mersys.io/");
    }

    @When("Enter username and password and click login button")
    public void enter_username_and_password_and_click_login_button() {
        System.out.println("Username ve şifre gönderildi");

//         Login ekranı gözükene kadar bekle
//        dc.username.sendKeys("turkeyts");
//        dc.password.sendKeys("Techno2025.%");
//        dc.loginButton.click();

        dc.mySendKeys(dc.username, "turkeyts");
        dc.mySendKeys(dc.password, "Techno2025.%");
        dc.myClick(dc.loginButton);


    }

    @Then("User should login successfully")
    public void user_should_login_successfully() {
        //System.out.println("Siteye girildiği doğrulandı");

//        WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.textToBePresentInElement(dc.headText,"Internship"));
//
//        Assert.assertTrue(dc.headText.getText().equals("Internship") );

        dc.LoginContainsText(dc.headText,"Internship");
    }


}
