package com.test.qa.tokyo.DisplayDashboard.samples;

import org.openqa.selenium.By;
import utils.MethodBase;
import utils.PageBase;

public class IncommingSample extends PageBase {

    public static void clickMasterMenu() {
        MethodBase.clear_ById("//h1[contains(text(),'Master')]");
    }


}
