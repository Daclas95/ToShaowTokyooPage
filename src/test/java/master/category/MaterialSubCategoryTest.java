package master.category;

import com.test.qa.tokyo.DisplayDashboard.master.EmployeeNV.EmployeeList;
import com.test.qa.tokyo.DisplayDashboard.master.PlantNV.PlantPanel;
import com.test.qa.tokyo.DisplayDashboard.master.categoryNV.MaterialSubCategory;
import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.logging.Logger;

public class MaterialSubCategoryTest extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(EmployeeList.class));

    @Test(groups = {"Smoke" }, priority = 1)
    public void MaterialSubCategorySmokeTest() throws Exception {
        softAssert = new SoftAssert();
        PlantPanel.clickMasterPanel();
        MaterialSubCategory.clickCategoryMenu();
        MaterialSubCategory.clickMaterialSubCategory();
        MaterialSubCategory.clickAddMaterialSubCategory();
        MaterialSubCategory.setTxtPrefix("SE");
        MaterialSubCategory.setTxtname("Fine Aggregrate");
        MaterialSubCategory.selectMaterialCategoryOption1();
        MaterialSubCategory.ClickSavebtn();
    }
}
