package TestRunner;

import Base.Setup;
import Pages.LoginPage;
import Utils.Utils;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

public class SignupTestRunner extends Setup {
    @Test(priority = 1,groups = "signup_smoke")
    public void userReg() throws IOException, ParseException, InterruptedException {
        driver.get("http://automationpractice.com/");
        LoginPage loginPage = new LoginPage(driver);
        int id = Utils.generateRandomId(10,1000);
        String email = "user"+id+"@test.com";
        String  password = "P@ssword123";
        int phn = Utils.generateRandomPhn(1,100000000);
        String phone = "1"+ phn;
        int mbl = Utils.generateRandomMbl(1,1000000000);
        String mobile = "1"+ mbl;
        loginPage.doReg(email,password,mobile,phone);
        Utils utils = new Utils();
        utils.readData(utils.getLatestUser()-1);
        String name =  loginPage.doLogin(utils.getEmail(),utils.getPassword());
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(name.contains("Test User"));
        Assert.assertTrue(loginPage.btnLogout.isDisplayed(), String.valueOf(true));
        //Thread.sleep(5000);
        //Utils.Utils utils = new Utils.Utils(driver);
        utils.saveData(email,password);
        loginPage.btnLogout.click();
    }
}
