package testconfiguration.configuretestNV;

import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import utils.MethodBase;
/*
Author vinthusha.L
 */
public class ConfigureTest_1 extends TestBase {
    @Test
    public void test01() throws Exception {
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/a[1]/div/div");//click configuration
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[9]/a");//click configure test
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/div/div[3]/div");//click configure test 1
        MethodBase.click_ByXpath("//*[@id=\"test\"]/div/div");//click drop down
        Thread.sleep(3000);
        MethodBase.hitEnter();
        MethodBase.click_ByXpath("//*[@id=\"test_type\"]/div/div");//click test type
        Thread.sleep(3000);
        MethodBase.hitEnter();
        MethodBase.setText_ByID("prefix","MC");//set prefix
        MethodBase.click_ByXpath("//*[@id=\"main_category\"]/div/div");//click main category
        Thread.sleep(3000);
        MethodBase.hitEnter();
        MethodBase.click_ByXpath("//*[@id=\"sub_category\"]/div/div"); // click subcategory
        Thread.sleep(3000);
        MethodBase.hitEnter();
        MethodBase.setText_ByID("resultLabel","test"); // set test result type
        MethodBase.setText_ByID("days","7"); // set days
        MethodBase.click_ById("coretest");// click key test
        MethodBase.click_ById("equation_exist"); // click test equation*/
        //MethodBase.click_ById("isBulkTrial");  /* click Without Trial*/
        MethodBase.setText_ByID("description","data");// set description
        MethodBase.setText_ByID("procedure","procedure"); // set procedure
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div[2]/div[5]/button");// click submit
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[3]/button");// c;lick next page
    }
}