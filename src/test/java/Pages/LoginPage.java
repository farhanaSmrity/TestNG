package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class LoginPage {
    @FindBy(className = "login")
    WebElement btnLogin;
    @FindBy(id = "email")
    WebElement txtEmail;
    @FindBy(id = "passwd")
    WebElement txtPassword;
    @FindBy(id = "SubmitLogin")
    WebElement btnSubmit;
//    @FindBy(className = "logout")
//    WebElement btnLogout;

    @FindBy(xpath = "//header/div[2]/div[1]/div[1]/nav[1]/div[2]/a[1]")
    public
    WebElement btnLogout;
    @FindBy(className = "header_user_info")
    List<WebElement> lblUsername;
    @FindBy(id="email_create")
    WebElement textEmailReg;
    @FindBy(id="SubmitCreate")
    WebElement btnSubmitCreate;
    @FindBy(id="id_gender1")
    WebElement rb1;
    @FindBy(id="customer_firstname")
    WebElement txtFirstName;
    @FindBy(id="customer_lastname")
    WebElement txtLastName;

    @FindBy(id="days")
    WebElement cbDate;
    @FindBy(id="months")
    WebElement cbMonths;
    @FindBy(id="years")
    WebElement cbYears;

    @FindBy(id = "company")
    WebElement txtCompanyName;
    @FindBy(name="address1")
    WebElement txtAddress;
    @FindBy(id = "address2")
    WebElement txtAddressTwo;
    @FindBy(name="city")
    WebElement txtCity;
    @FindBy(id="id_state")
    WebElement cbState;
    @FindBy(id="postcode")
    WebElement txtPostCode;
    @FindBy(id="other")
    WebElement txtOthers;
    @FindBy(name = "phone")
    WebElement txtHomePhone;
    @FindBy(id="phone_mobile")
    WebElement txtMobile;
    @FindBy(name = "alias")
    WebElement txtFutureRefer;
    @FindBy(id="submitAccount")
    WebElement btnSubmitAccount;
    @FindBy(xpath = "//li[contains(text(),'Authentication failed.')]")
    WebElement lblAuthError;
    @FindBy(xpath = "//li[contains(text(),'Invalid email address')]")
    WebElement lblInvalidEmailValidationMassage;
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void doReg(String email, String password, String mobile, String phone){
        btnLogin.click();
        textEmailReg.sendKeys(email);
        btnSubmitCreate.click();
        rb1.click();
        txtFirstName.sendKeys("Test");
        txtLastName.sendKeys("User");
        txtCompanyName.sendKeys("Test Limited");
        txtAddress.sendKeys("Alabama");
        txtAddressTwo.sendKeys("Road no 2");
        txtCity.sendKeys("Alabama");
        Select state = new Select(cbState); ///option
        state.selectByValue("1");
        txtPostCode.sendKeys("10100");
        txtOthers.sendKeys("This is a Test");
        txtPassword.sendKeys(password);
        Select date = new Select((cbDate));
        date.selectByValue("6");
        Select month = new Select((cbMonths));
        month.selectByValue("5");
        Select year = new Select((cbYears));
        year.selectByValue("2000");
        txtHomePhone.sendKeys(phone);
        txtMobile.sendKeys(mobile);
        txtFutureRefer.sendKeys("Sydney road no 4");
        btnSubmitAccount.click();
        btnLogout.click();

    }
    public String doLogin(String email, String password){
        btnLogin.click();
        txtEmail.sendKeys(email);
        txtPassword.sendKeys(password);
        btnSubmit.click();
        return lblUsername.get(0).getText();
    }

    public String doLoginWithValidEmailandWrongPassword(String email, String password){
        btnLogin.click();
        txtEmail.sendKeys(email);
        txtPassword.sendKeys(password);
        btnSubmit.click();
        return lblAuthError.getText();
    }
    public String doLoginWithInvalidEmail(String email, String password){
        btnLogin.click();
        txtEmail.sendKeys(email);
        txtPassword.sendKeys(password);
        btnSubmit.click();
        return lblInvalidEmailValidationMassage.getText();
    }
}
