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

    @And("I input valid ID and invalid password")
    public void iInputValidIDAndInvalidPassword() {


        loginStep.loginPage();
        loginStep.LoginIdOrEmail();
        loginStep.loginInvalidPassword();

    }


    @And("I input Invalid ID and valid password")
    public void iInputInvalidIDAndValidPassword() {

        loginStep.loginPage();
        loginStep.loginWithInvalidID();
        loginStep.loginPassword();

    }
}
