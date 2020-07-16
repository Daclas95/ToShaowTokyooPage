package master.equipment;


import com.test.qa.testdata.masterdata.EquipmentData;
import com.test.qa.tokyo.DisplayDashboard.master.equipmentNV.Equipment;
import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.MethodBase;

/**
 * Author Daclas
 */
public class EquipmentTest extends TestBase {
    @Test(groups = {"Smoke" },priority = 1,dataProviderClass = EquipmentData.class,dataProvider = "plantequipmentdataprovider")
    public void equipment(String EquiName,String Desc,String EditDesc) throws Exception {
        softAssert = new SoftAssert();
        Equipment.clickMasterPanel();
        Equipment.clickequipmenttab();
        Equipment.clickequipment();
        softAssert.assertTrue(Equipment.isDisplayed(),"Sorry we could not find" );
        Equipment.clickaddequipment();
        Equipment.clicksavebtn();
        //here check validation Message
        softAssert.assertEquals(Equipment.getEquipmentName(),"Name can't be empty","there are not equal");
        Equipment.setEquipment(EquiName);
        Equipment.setDescription(Desc);
        Equipment.selecttype();
        Equipment.clicksavebtn();
        // next line for Editing purpose
        Equipment.clickEditButton();
        Equipment.setDescription(EditDesc);
        Equipment.clicksavebtn();
        // this is for check the delete button
        Equipment.ClickDeletebtn();
        Equipment.dlt();



        softAssert.assertAll();
    }

}




