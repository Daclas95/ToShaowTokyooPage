package com.test.qa.tokyo.DisplayDashboard.master;


import org.openqa.selenium.By;
import utils.PageBase;

public class DisplayPlant extends PageBase {

    private static By masterDisplay = By.xpath("//h1[contains(text(),'Master')]");

    public static boolean isDisplayPlantPanel(){
        return getDriver().findElement(masterDisplay).isDisplayed();
    }
}
