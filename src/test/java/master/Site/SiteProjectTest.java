package master.Site;

import com.test.qa.tokyo.DisplayDashboard.master.New.SiteNV.SiteProject;
import com.test.qa.tokyo.DisplayDashboard.master.PlantNV.PlantPanel;
import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SiteProjectTest extends TestBase {
    @Test(groups = {"Test","regression"},priority=2, testName = "siteprojecttest")
    public void AddProjectTest(){
        softAssert = new SoftAssert();
        PlantPanel.clickMasterPanel();
        SiteProject.SiteNavigationClick();
        SiteProject.ProjectBtnClick();
        SiteProject.AddProjectionClick();
    }

    @Test(groups = {"Smoke"},priority=1)
    public void siteProjectSmokeTest(){
        softAssert = new SoftAssert();
        PlantPanel.clickMasterPanel();
        SiteProject.SiteNavigationClick();
        SiteProject.ProjectBtnClick();
        SiteProject.AddProjectionClick();
    }
}
