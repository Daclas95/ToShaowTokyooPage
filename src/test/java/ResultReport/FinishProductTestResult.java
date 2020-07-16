package ResultReport;

import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import utils.MethodBase;
/**
  *Author Daclas
  */
public class FinishProductTestResult extends TestBase {

    @Test
    public void FinishProductTestResult(){
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[3]/div/div");
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]\n");
    }
}
