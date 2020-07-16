package master.Customer;

import com.test.qa.tokyo.DisplayDashboard.master.CustomerNV.Customer;
import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.MethodBase;

public class CustomerTest extends TestBase {
    @Test(groups = {"Test","regression"}, priority = 2)
    public void customerTest() throws Exception {
        softAssert = new SoftAssert();
        Customer.clickMasterMenu();
        Customer.clickCustomer();
        Customer.clickAddCustomer();


        Customer.setCustomerName("Banuja");
        Customer.setAddress("Navali");
        Customer.setContactNO("07698345689");
        Customer.setEmail("banu56@gmail.com");
        // Customer.setdropdownPlant("colombo");
        Customer.setbutCustomerSave();

    }

    @Test(groups = {"Smoke"}, priority = 1)
    public void customerSmokeTest() throws Exception {
        softAssert = new SoftAssert();
        Customer.clickMasterMenu();
        Customer.clickCustomer();
        Customer.clickCustomerField();
        Customer.clickAddCustomer();
        Customer.setCustomerName("tanuja");
        Customer.setAddress("tavali");
        Customer.setContactNO("07698345689");
        Customer.setEmail("tanu56@gmail.com");
        Customer.selectPlantOptionplant();
        Customer.setbutCustomerSave();
        softAssert.assertAll();
    }
}
