package com.test.qa.tokyo.DisplayDashboard.testconfiguration.testNV;

import utils.MethodBase;
import utils.PageBase;

public class MaterialtestPage extends PageBase {


    private static String testconfiguration =("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/a[1]/div/div");
    private static String MenuTest = ("//*[@id=\"root\"]/div/section/section/header/ul/li[4]/a");
    private static String Materialtestfield = ("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div/div[1]");
    private static String butaddTest = ("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[2]/button");
    private static String txtTest = ("test_name");
    private static String butsave = ("/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[2]");

    public static void clickconfigurePanel() {
        MethodBase.isDisplayed_ByXpath(testconfiguration);
        MethodBase.click_ByXpath(testconfiguration);


    }
    public static void clickMaterialtestfield() {
        MethodBase.isDisplayed_ByXpath(Materialtestfield);
        MethodBase.click_ByXpath(Materialtestfield);


    }


    public static void clickMenuTest() {
        MethodBase.isDisplayed_ByXpath(MenuTest);
        MethodBase.click_ByXpath(MenuTest);


    }

    public static void clickbutaddTest() {
        MethodBase.click_ByXpath(butaddTest);


    }
    public static void sendtxtTest() {
        MethodBase.sendKeys(txtTest,"Gravity");
        MethodBase.setText_ByID(txtTest,"Gravity");


    }
    public static void clickbutsave() {
        MethodBase.click_ByXpath(butsave);


    }



}

