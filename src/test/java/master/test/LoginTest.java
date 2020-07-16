package master.test;


import com.test.qa.testdata.masterdata.LoginData;
import com.test.qa.tokyo.LoginPage;
import com.test.qa.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest  extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(LoginTest.class);

    @Test(priority=1, dataProviderClass = LoginData.class, dataProvider = "TokyoLogin")
    public void LoginTest(String username,String Password,String status,String alertmsg)  {
        softAssert = new SoftAssert();
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(),"LoginPage Displayed");
        LoginPage.implicitWait(30000);
        LoginPage.login(username,Password);
        if(status.equals("valid") ){
            softAssert.assertTrue(LoginPage.isDashboardPageDisplayed(), "Dashboard Page Display");
            LOGGER.info("Login success");
        }
        else {
            LoginPage.isLoginAlertDisplay();
            softAssert.assertEquals(LoginPage.isLoginAlertDisplay(),alertmsg,"Dashboard Page not Display");
            LOGGER.info(alertmsg);
        }
    }
}
