package pageObject;

import Base.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class login_page extends Config {

    public login_page(WebDriver driver){ PageFactory.initElements(driver,this); }

    @FindBy(how = How.XPATH,using = "//*[@id=\"navbarSupportedContent\"]/ul/li[2]/a")
    public WebElement loginPageEl;

   @FindBy(how = How.XPATH,using ="//input[@name=\"email\"]")
    public WebElement IdOrEmailEl;

    @FindBy(how = How.XPATH,using ="//input[@name=\"password\"]")
    public WebElement PasswordEl;

    @FindBy (how =How.XPATH,using = "//input[@type=\"submit\"]")
    public WebElement loginButtonEl;


    //************ login page ^^^^^^^^^^^^elements ////////////
    //************ login page ^^^^^^^^^^^^elements execution ////////////


    // click login option in the right corner of the page
    public void loginPage(){ loginPageEl.click(); }

    // input email or ID
    public void LoginIdOrEmail(){ IdOrEmailEl.sendKeys("osmangani360@gmail.com"); }

    // input password
    public void loginPassword(){
        PasswordEl.sendKeys("osman123");
    }

    // try to login with invalid password
    public void loginInvalidPassword(){ PasswordEl.sendKeys("osman"); }

    // Click login submit button
    public void loginSubmitButton(){ loginButtonEl.click(); }

    // Try to login with Invalid ID

    public void loginWithInvalidID(){

        IdOrEmailEl.sendKeys("osman");


    }










}
