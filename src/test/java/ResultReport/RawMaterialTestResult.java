package ResultReport;

import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import utils.MethodBase;
import utils.PageBase;

/**
 *Author Daclas
 */
public class RawMaterialTestResult extends TestBase {
    @Test
    public void RawMaterialTestResult() throws Exception {
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[3]/div/div");
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]");
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[1]/div/div[2]/div[1]/div/div");
        PageBase.staticWait(01);
        MethodBase.hitEnter();
        PageBase.staticWait(01);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[1]/div/div[2]/div[2]/div/div");
        PageBase.staticWait(01);
        MethodBase.hitEnter(); }

}
