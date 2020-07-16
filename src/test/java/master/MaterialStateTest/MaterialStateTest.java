package master.MaterialStateTest;

import com.test.qa.testdata.masterdata.MaterialStateDataTest;
import com.test.qa.tokyo.DisplayDashboard.master.meterialNV.materialState.MaterialState;
import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;

public class MaterialStateTest extends TestBase {

    @Test(groups = {"test","regression"},priority = 2,dataProviderClass = MaterialStateDataTest.class ,dataProvider = "Materialstatedataprovider")
    public void TokyoMaterialStateTest ( String statenature) {
        //softAssert = new SoftAssert();
        MaterialState.clickMasterPanel();
        MaterialState.clickMaterialNV();
        MaterialState.clickAddMaterialstate();
        MaterialState.materialStatename(statenature);
        MaterialState.meterialStatesave();

    }
    @Test(groups = {"Smoke"}, priority = 1)
    public void StateSmokeTest () {
        MaterialState.clickMasterPanel();
        MaterialState.clickMaterialNV();
        MaterialState.clickAddMaterialstate();
        MaterialState.materialStatename("Solid");
        MaterialState.meterialStatesave();

    }

}
