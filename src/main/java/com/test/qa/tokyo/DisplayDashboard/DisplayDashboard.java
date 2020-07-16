package com.test.qa.tokyo.DisplayDashboard;

import utils.PageBase;
import org.openqa.selenium.By;

public class DisplayDashboard extends PageBase {
    private static By DashBoard = By.xpath("//div[@class=\"logo\"]");

    public static boolean isDisplayDashboardPannel()
    {
        return getDriver().findElement(DashBoard).isDisplayed();
    }

}
