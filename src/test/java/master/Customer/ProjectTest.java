package master.Customer;

import com.test.qa.tokyo.DisplayDashboard.master.CustomerNV.Project;
import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ProjectTest extends TestBase {
    @Test(groups = {"Smoke"}, priority = 1)
    public void customerSmokeTest() throws Exception {
        softAssert = new SoftAssert();
        Project.clickMasterMenu();
        Project.clickMenuCustomer();
        Project.clickproject();
        Project.clickAddproject();
        Project.setprojectname("hospit");
        Project.setprojectcalender();
        Project.setprojectcontactno("07789654123");
        Project.setprojectconatctperson("jasmithaya");
        Project.selectPlantdropdown();
        Project.selectcustomerdropdown();
        Project.clicksave();
        softAssert.assertAll();
    }

}
