package master.test.concreeteMixTest;

import com.test.qa.tokyo.DisplayDashboard.master.New.SiteNV.ConcreteMixer;
import com.test.qa.tokyo.DisplayDashboard.master.PlantNV.PlantPanel;
import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ConcreteMixTest extends TestBase {
        @Test(groups = {"Smoke"},priority=1, testName = "ConcreteMixAddDataTest")
        public void ConcreteMixSmokeTest() throws Exception {
            softAssert = new SoftAssert();
            PlantPanel.clickMasterPanel();
            ConcreteMixer.ConcretePanel();
            ConcreteMixer.AddConcreteBtn();
            ConcreteMixer.EnterConcreteMixerNames();
            ConcreteMixer.SelectDDoption1();
            ConcreteMixer.SaveBtn();

        }

}

