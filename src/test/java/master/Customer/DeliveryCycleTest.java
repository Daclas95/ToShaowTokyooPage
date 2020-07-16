package master.Customer;

import com.test.qa.tokyo.DisplayDashboard.master.CustomerNV.Customer;
import com.test.qa.tokyo.DisplayDashboard.master.CustomerNV.DeliveryCycle;
import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.MethodBase;

public class DeliveryCycleTest extends TestBase {

    @Test(groups = {"Smoke"}, priority = 1)
    public void customerSmokeTest() throws Exception {
        softAssert = new SoftAssert();
        DeliveryCycle.clickMasterMenu();
        DeliveryCycle.clickMenuCustomer();
        DeliveryCycle.clickfieldDeliverycycle();
        DeliveryCycle.clickbutaddpour();
        DeliveryCycle.settxtpour("p01");
        DeliveryCycle.clicktxtproject();
        MethodBase.hitEnter();
        DeliveryCycle.setTxtdesc("pour");
        DeliveryCycle.clicksave();
        softAssert.assertAll();
    }
}



