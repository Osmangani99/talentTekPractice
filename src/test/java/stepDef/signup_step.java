package stepDef;

import Base.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageObject.signup_page;

public class signup_step extends Config {

    signup_page login = new signup_page(driver);


    @Given("I am at TalentTek")
    public void iAmAtTalentTek() {

    }

    @And("I verify there is placeHolder for userName and Password")
    public void iVerifyThereIsPlaceHolderForUserNameAndPassword() {

        login.firstnamePlaceHolder();
        login.lastNamePlaceHolder();
        login.emailPlaceHolder();
        login.passwordPlaceholder();
        login.ConfirmPassHolder();
        login.monthDropDown();
        login.dayDropDown();
        login.yearDropDown();
        login.genderSelect();
        login.agreeCkeckBoxClick();
        login.submitButton();


    }

    @And("I verify email should be unit")
    public void iVerifyEmailShouldBeUnit() {


        login.UniqueEmailVerification();

    }
}
