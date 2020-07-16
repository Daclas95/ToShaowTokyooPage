package master.Role;

import com.test.qa.testdata.masterdata.RoleData;
import com.test.qa.tokyo.DisplayDashboard.master.EmployeeNV.RolePage;
import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;

import java.util.logging.Logger;
/**
 * @Author Banuja
 */

public class RoleTest extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(RolePage.class));

    // use testng and group and use the priority
    @Test(groups = {"test","regression"},priority = 2,dataProviderClass = RoleData.class,dataProvider ="RoleDataTokyo" )


    // to get the values from the data provider using the method
    public void RoleTest(String role,String status,String alertmsg) {
        RolePage.clickMaster();
        RolePage.clickRole();
        RolePage.clickaddRole();
        RolePage.implicitWait(6000);
        RolePage.setRolCongerete(role);
        RolePage.clickSave();

    }

    // testng annotation use , group and smoke
    @Test(groups = {"smoke"},priority = 1)
    public void RoleSmokeTest() {
        RolePage.clickMaster();
        RolePage.clickemployee();
        RolePage.clickRole();
        RolePage.clickaddRole();
//        MethodBase.setText_ByXpath("//*[@id=\"role_name\"]","kkkk");
        RolePage.setRolCongerete("banu");
        RolePage.clickSave();
    }

}
