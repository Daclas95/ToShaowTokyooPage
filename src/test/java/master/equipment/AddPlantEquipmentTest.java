package master.equipment;

import com.test.qa.testdata.masterdata.EquipmentData;
import com.test.qa.tokyo.DisplayDashboard.master.equipmentNV.AddPlantEquipment;
import com.test.qa.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.MethodBase;

/**
 * Author Daclas
 */
public class AddPlantEquipmentTest extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(AddPlantEquipmentTest.class);
    @Test(groups = {"Smoke"}, priority = 1,dataProviderClass = EquipmentData.class,dataProvider = "equipmentdataprovider")
    public void plantequipmentSmokeTest(String serialNo,String BrandNo,String ModelNo,String Discription) throws Exception {
        LOGGER.info("Start Add plant equipment data");
        softAssert = new SoftAssert();
        AddPlantEquipment.clickMasterPanel();
        AddPlantEquipment.clickEquipmentPanel();
        AddPlantEquipment.clickplantequipmentField();
        softAssert.assertTrue(AddPlantEquipment.isDisplayed(), "Page is not visible");
        AddPlantEquipment.clickAddPlantEquipment();
        AddPlantEquipment.clickbut();
        softAssert.assertEquals(MethodBase.get_Text("/html/body/div[8]/div/div[2]/div/div[2]/div[2]/form/div[1]/div[1]/div/div[1]"),"Serial No can't be empty","there are not equal");
        AddPlantEquipment.setSerialno(serialNo);
        AddPlantEquipment.selectPlanteuip();
        AddPlantEquipment.selectPlantplant();
        AddPlantEquipment.setbrandname(BrandNo);
        AddPlantEquipment.setmodelnmae(ModelNo);
        AddPlantEquipment.setdescription(Discription);
        AddPlantEquipment.clickbut();
        AddPlantEquipment.selectDltBtn();
        AddPlantEquipment.clickDltBtn();
        softAssert.assertAll();
    }
}




   /* @Test(groups = {"test", "regression"}, priority = 2, dataProviderClass = EquipmentData.class, dataProvider = "equipmentdataprovider")
    public void TokiyoequipmentTest(String serialno, String equipment, String plant, String brandname, String modelname, String descripion) throws Exception {
        softAssert = new SoftAssert();
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "LoginPage Displayed");
        PlantPanel.clickMasterPanel();
        AddPlantEquipment.clickEquipmentPanel();
        AddPlantEquipment.clickAddPlantEquipment();
        AddPlantEquipment.setSerialno(serialno);

        AddPlantEquipment.setbrandname(brandname);
        AddPlantEquipment.setmodelnmae(modelname);
        AddPlantEquipment.setdescription(descripion);
        AddPlantEquipment.clickbut();
        softAssert.assertAll();

    }*/







