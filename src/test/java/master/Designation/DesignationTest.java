package master.Designation;

import com.test.qa.testdata.masterdata.DesignationDataTest;
import com.test.qa.tokyo.DisplayDashboard.master.EmployeeNV.Designation;
import com.test.qa.tokyo.DisplayDashboard.master.EmployeeNV.EmployeeList;
import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.MethodBase;
import utils.PageBase;

public class DesignationTest extends TestBase {

        @Test(groups = {"regression"},priority = 2,dataProviderClass = DesignationDataTest.class ,dataProvider = "Desigantiondataprovider")
    public void TokyoDesignationTest( String Desigination,String Description) {
            Designation.clickMasterPanel();
            Designation.clickemployee();
            Designation.clickAddDesignation();
            Designation.setdesignation(Desigination);
            Designation.DesignationDescription(Description);
            Designation.DesignationSave();

    }
    @Test(groups = {"Smoke"}, priority = 1)
    public void DesignationTest() {
        softAssert = new SoftAssert();
        Designation.clickMasterPanel();
        Designation.clickemployee();
        Designation.clickAddDesignation();
        Designation.DesignationSave();
        PageBase.staticWait(01);
        softAssert.assertEquals(MethodBase.get_Text("/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[2]"),"Name can't be empty","there are not equal");
        Designation.setdesignation("employeeadd");
        Designation.DesignationDescription("employee");
        Designation.DesignationSave();
        softAssert.assertEquals(MethodBase.get_Text("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[2]/div[2]"),"Name can't be empty","there are not equal");

    }

}
