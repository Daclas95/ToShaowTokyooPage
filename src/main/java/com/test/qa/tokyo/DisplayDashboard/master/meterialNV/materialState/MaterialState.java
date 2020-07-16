package com.test.qa.tokyo.DisplayDashboard.master.meterialNV.materialState;

import org.openqa.selenium.By;
import utils.PageBase;

public class MaterialState extends PageBase {

    private static By masterMenu = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");
    private static By MaterialNV = By.xpath("//*[@id=\"root\"]/div/section/section/header/ul/li[10]/a");
    private static By MaterialState = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/div[1]");
    private static By AddMaterialstate = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[2]/button");
    private static By State = By.xpath("//*[@id=\"material_state\"]");
    private static By Savebutton = By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[2]");




    public static void clickMasterPanel() {
        getDriver().findElement(masterMenu).click();
    }
    public static void clickMaterialNV() {
        getDriver().findElement(MaterialNV).click();
    }
    public static void clickMaterialState() {
        getDriver().findElement(MaterialState).click();
    }
    public static void clickAddMaterialstate() {
        getDriver().findElement(AddMaterialstate).click();
    }
    public static void materialStatename (String name) {
        getDriver().findElement(State).sendKeys(name);
    }

    public static void meterialStatesave() {
        getDriver().findElement(Savebutton).click();
    }



}
