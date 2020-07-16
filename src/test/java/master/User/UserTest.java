package master.User;

import com.test.qa.tokyo.DisplayDashboard.master.EmployeeNV.User;
import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.logging.Logger;

public class UserTest extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(UserTest.class));

    @Test(groups = {"test", "regression","smoke" }, priority = 1)
    public void User() throws Exception {

        softAssert = new SoftAssert();
        softAssert.assertTrue(User.isdashboardDisplay(), "AddEmployeePanal displayed");

        User.clickMastermenu();
        //   softAssert.assertTrue(User.ismastermenuDisplay(), "Mastermenu displayed");

        User.clickEmployee();
        User.clickUser();
        User.clickDelete();

        softAssert.assertAll();
    }
}