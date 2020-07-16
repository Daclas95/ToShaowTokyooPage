package master.category;

import com.test.qa.tokyo.DisplayDashboard.master.EmployeeNV.EmployeeList;
import com.test.qa.tokyo.DisplayDashboard.master.PlantNV.PlantPanel;
import com.test.qa.tokyo.DisplayDashboard.master.categoryNV.MaterialCategory;
import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.logging.Logger;

public class MaterialCategoryTest extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(EmployeeList.class));
    @Test(groups = {"test", "regression" }, priority = 2)
    public void MaterialCategoryTest() throws Exception {
        softAssert = new SoftAssert();
        PlantPanel.clickMasterPanel();
        MaterialCategory.clickCategoryMenu();
        MaterialCategory.clickMaterialCategoryField();
        MaterialCategory.clickAddMaterialCal();
        MaterialCategory.setname("Aggregate");
        MaterialCategory.clickSaveBtn();
    }


    @Test(groups = {"Smoke" }, priority = 1)
    public void MaterialCategorySmokeTest() throws Exception {
        softAssert = new SoftAssert();
        PlantPanel.clickMasterPanel();
        MaterialCategory.clickCategoryMenu();
        MaterialCategory.clickMaterialCategoryField();
        MaterialCategory.clickAddMaterialCal();
        MaterialCategory.setname("Aggregate");
        MaterialCategory.clickSaveBtn();
    }

}
