package testconfiguration.testNV;

import com.test.qa.testdata.configuredata.MaterialTestData;
import com.test.qa.tokyo.DisplayDashboard.testconfiguration.testNV.MaterialtestPage;
import com.test.qa.tokyo.LoginPage;
import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.logging.Logger;

public class MaterialTest extends TestBase {

    private static final Logger LOGGER =  Logger.getLogger(String.valueOf((MaterialTest.class)));


    @Test(groups = {"Smoke" },priority = 1)
    public void configMaterialSmokeTest() {

        softAssert = new SoftAssert();
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(),"LoginPage Displayed");
        MaterialtestPage.clickconfigurePanel();
        MaterialtestPage.clickMenuTest();
        MaterialtestPage.clickMaterialtestfield();
        MaterialtestPage.clickbutaddTest();
        MaterialtestPage.sendtxtTest();
        MaterialtestPage.clickbutsave();

        softAssert.assertAll();

    }

    @Test(groups = { "test", "regression",},priority = 2,dataProviderClass = MaterialTestData.class,dataProvider = "TestConfig")
    public void TokiyoconfigTestdata(String testname) {

//using soft assert
        softAssert = new SoftAssert();
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "LoginPage Displayed");
        MaterialtestPage.clickconfigurePanel();
        MaterialtestPage.clickMenuTest();
        MaterialtestPage.clickMaterialtestfield();
        MaterialtestPage.clickbutaddTest();
       // MaterialtestPage.sendtxtTest(testname);
        MaterialtestPage.clickbutsave();
        softAssert.assertAll();
    }


}

