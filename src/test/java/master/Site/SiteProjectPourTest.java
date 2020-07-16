package master.Site;

import com.test.qa.testdata.masterdata.AddProjectPourData;
import com.test.qa.tokyo.DisplayDashboard.master.New.SiteNV.SiteProjectPour;
import com.test.qa.tokyo.DisplayDashboard.master.PlantNV.PlantPanel;
import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;

public class SiteProjectPourTest extends TestBase {
    @Test(groups = {"Test","regression"},priority = 2,dataProviderClass = AddProjectPourData.class,dataProvider = "AddProjectPour")
    public void PourName(String PName,String EDesciption) throws Exception{
        PlantPanel.clickMasterPanel();
        SiteProjectPour.SiteNavigationClick();
        SiteProjectPour.PourPanel();
        SiteProjectPour.AddPour();
        SiteProjectPour.EnterPourName(PName);
        SiteProjectPour.ProjectDropDown();
        SiteProjectPour.DescriptionEnter(EDesciption);
        SiteProjectPour.SaveBtn();
    }
    @Test(groups = {"Smoke"},priority=1)
    public void PourName() throws Exception{
        PlantPanel.clickMasterPanel();
        SiteProjectPour.SiteNavigationClick();
        SiteProjectPour.PourPanel();
        SiteProjectPour.AddPour();
        SiteProjectPour.EnterPourName("C12");
        SiteProjectPour.ProjectDropDown();
        SiteProjectPour.DescriptionEnter("jhvdjfb");
        SiteProjectPour.SaveBtn();
    }

}
