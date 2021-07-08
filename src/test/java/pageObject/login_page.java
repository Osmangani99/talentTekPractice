package pageObject;

import Base.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class login_page extends Config {


     public login_page (WebDriver driver){ PageFactory.initElements(driver,this); }


     @FindBy(how = How.XPATH,using ="//input[@placeholder=\"First Name\"]")
    public WebElement firstNameEl;

     @FindBy(how = How.XPATH,using = "//input[@placeholder=\"Last Name\"]")
     public WebElement lastNameEL;

     @FindBy(how = How.XPATH,using = "//input[@placeholder=\"Your Email\"]")
     public WebElement emailEL;

     @FindBy(how = How.XPATH,using = "//input[@placeholder=\"Password\"]")
     public WebElement passwordEl;

     @FindBy(how = How.XPATH,using ="//input[@placeholder=\"Confirm Password\"]")
     public WebElement ConfirmPasswordEL;

     @FindBy(how = How.XPATH,using ="//select[@name=\"month\"]")
     public WebElement DOBMonthEl;

     @FindBy(how = How.XPATH,using  ="//select[@name=\"day\"]")
     public WebElement DOBDayEl;

     @FindBy (how = How.XPATH, using ="//select[@name=\"year\"]")
     public WebElement DOBYearEl;

     @FindBy(how = How.ID,using = "male")
     public WebElement genderEl;

     @FindBy(how = How.ID,using = "defaultCheck1")
     public WebElement agreeCheckBoxEl;






     //****************** login page^^^^^^^element ***********


    public void firstnamePlaceHolder(){

        firstNameEl.sendKeys("osman");
        boolean firstNameField = firstNameEl.isDisplayed();
        String firstNameFieldText = firstNameEl.getText();
        System.out.println("*************////////(First Name Place Holder)////////***********");
        System.out.println("First Name Place holder is Displayed-------->"+firstNameField);
        System.out.println(firstNameFieldText); }


 public void lastNamePlaceHolder(){

        lastNameEL.sendKeys("Gani");
        boolean lastNameField = lastNameEL.isDisplayed();
        System.out.println("*************////////(last Name Place Holder)////////***********");
        System.out.println("Last Name Place holder is Displayed---------->"+lastNameField); }

 public void emailPlaceHolder(){

        emailEL.sendKeys("osmangani360@gmail.com");
        boolean emailField = emailEL.isDisplayed();
        System.out.println("************////////////(Email address Place Holder )/////////*********");
        System.out.println("Email address place holder----------->"+emailField); }


        public void passwordPlaceholder(){

        passwordEl.sendKeys("osman123");
        boolean passwordField = passwordEl.isDisplayed();
        System.out.println("**************///////////(password place holder )//////*********");
        System.out.println("Password place holder----------->"+passwordField);

        }

        public void ConfirmPassHolder(){

        ConfirmPasswordEL.sendKeys("osman123");
        boolean confirmPassField = ConfirmPasswordEL.isDisplayed();
        System.out.println("**************///////////(Confirm password place holder )//////*********");
        System.out.println("Confirm password place holder----------->"+confirmPassField);
        }


        public void monthDropDown(){

            Select enterMonths = new Select(DOBMonthEl);
            enterMonths.selectByIndex(8); }

            public void dayDropDown(){

        Select enterDay = new Select(DOBDayEl);
        enterDay.selectByIndex(6); }

        public void yearDropDown (){

        Select enterYear = new Select(DOBYearEl);
        enterYear.selectByValue("1956"); }

        public void genderSelect(){

          genderEl.click();
          boolean genderField = genderEl.isDisplayed();
          System.out.println("Gender radio button for male is displayed-------------->"+genderField); }

          public void agreeCkeckBoxClick(){

        agreeCheckBoxEl.click();
        boolean agreeCheckBoxField = agreeCheckBoxEl.isDisplayed();
        System.out.println("Trams and condition check box is Displayed------------->"+agreeCheckBoxField); }






}
