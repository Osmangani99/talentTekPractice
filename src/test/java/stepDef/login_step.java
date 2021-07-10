package stepDef;

import Base.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageObject.login_page;

import java.sql.Driver;

public class login_step extends Config {

    login_page loginStep = new login_page(driver);

    @Given("I am at TalentTek login page")
    public void iAmAtTalentTekLoginPage() {

    }

    @And("I input valid ID and password")
    public void iInputValidIDAndPassword() {

        loginStep.loginPage();
        loginStep.LoginIdOrEmail();
        loginStep.loginPassword();

    }

    @And("I click login")
    public void iClickLogin() {

        loginStep.loginSubmitButton();
    }
}
