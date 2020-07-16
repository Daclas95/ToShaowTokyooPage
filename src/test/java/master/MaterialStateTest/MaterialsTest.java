package master.MaterialStateTest;

import com.test.qa.testdata.masterdata.MaterialsDataTest;
import com.test.qa.tokyo.DisplayDashboard.master.meterialNV.materialState.Materials;
import com.test.qa.utils.TestBase;

import org.testng.annotations.Test;


public class MaterialsTest extends TestBase {
    @Test(groups = {"test", "regression"},priority = 2,dataProviderClass = MaterialsDataTest.class ,dataProvider = "Materialdataprovider")

    public void TokyoMaterialStateTest (String MaterialName , String Description) throws Exception {
        //softAssert = new SoftAssert();
        Materials.clickMasterPanel();
        Materials.clickMaterialNV();
        Materials.clickMaterials();
        Materials.clickAddMaterials();
        Materials.SelectSubcatogry();
        Materials.SelectMaterialNature();
        Materials.MaterialName(MaterialName);
        Materials.DesignationName(Description);
        Materials.clickSave();


    }
    @Test(groups = {"Smoke"}, priority = 1)
    public void StateSmokeTest () throws Exception {
        Materials.clickMasterPanel();
        Materials.clickMaterialNV();
        Materials.clickMaterials();
        Materials.clickAddMaterials();
        Materials.SelectSubcatogry();
        Materials.SelectMaterialNature();
        Materials.MaterialName("riversand");
        Materials.DesignationName("buy");
        Materials.clickSave();
    }
}
