package stepDef;

import Base.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageObject.login_page;

public class login_step extends Config {

    login_page login = new login_page (driver);


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



    }
}
