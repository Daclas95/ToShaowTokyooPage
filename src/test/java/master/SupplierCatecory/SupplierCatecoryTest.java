package master.SupplierCatecory;

import com.test.qa.testdata.masterdata.SupplierCatecoryData;
import com.test.qa.tokyo.DisplayDashboard.master.SupplierNV.SupplierCatecory;
import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SupplierCatecoryTest extends TestBase {

    @Test(groups = {"Smoke"}, priority = 1, dataProviderClass = SupplierCatecoryData.class,dataProvider = "Supplierdataprovider")
    public void SupplierCatecorySmokeTest(String Category, String Description) {
        softAssert = new SoftAssert();
        softAssert.assertTrue(SupplierCatecory.isDashboardDisplay(),"is not displayed ");
        SupplierCatecory.clickMasterPanel();
        SupplierCatecory.clickMenuTabSupplier();
        SupplierCatecory.clickSupplierCategory();
        SupplierCatecory.clickAddCatecory();
        SupplierCatecory.setsupplier_category(Category);
        SupplierCatecory.setsupplierCategory_description(Description);
        SupplierCatecory.clickSave();

    }
}

