package com.test.qa.tokyo.DisplayDashboard.master.equipmentNV;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import utils.MethodBase;
import utils.PageBase;

public class AddPlantEquipment extends PageBase {
    private static By masterMenu = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");
    private static By equipmentPannel = By.xpath("//*[@id=\"root\"]/div/section/section/header/ul/li[7]/a");
    private static By plantequipmentField = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/div[1]");
    private static By btnAddPLantEquip= By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[1]/div/div[2]/button");
    private static By txtserialno = By.id("serial_no");
    private static By dropequipment = By.xpath("//*[@id=\"equipment\"]/div/div");
    private static By dropPlant = By.xpath("//*[@id=\"plant\"]/div/div");
    private static By txtbrandName = By.id("brand_name");
    private static By txtmodelNamee = By.id("model_name");
    private static By txtdescription = By.id("description");
    private static By butSave = By.xpath("/html/body/div[8]/div/div[2]/div/div[2]/div[3]/button[2]");
    private static By Isdisplayed = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[1]/div/div[1]");
    private static By selectDlt = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[2]/td[7]/span/a[2]/a/i");
    private static By clickDltbtn = By.xpath("/html/body/div[11]/div/div/div/div[2]/div/div/div[2]/button[2]");

    public static void clickMasterPanel() {
        getDriver().findElement(masterMenu).click();
    }

    public static void clickEquipmentPanel() {
        getDriver().findElement(equipmentPannel).click();
    }

    public static void clickplantequipmentField() {
        getDriver().findElement(plantequipmentField).click();
    }

    public static void clickAddPlantEquipment() {
        getDriver().findElement(btnAddPLantEquip).click();
    }
    public static void setSerialno(String sno) {
        getDriver().findElement(txtserialno).sendKeys(sno);
    }

    public static void selectPlanteuip() throws Exception {
        PageBase.staticWait(02);
        getDriver().findElement(dropequipment).click();
        PageBase.staticWait(02);
        PageBase.hitEnter();
    }
    public static void selectPlantplant() throws Exception {
        PageBase.staticWait(02);
        getDriver().findElement(dropPlant).click();
        PageBase.staticWait(02);
        PageBase.hitEnter();
    }

    public static void setbrandname(String brandname) {
        getDriver().findElement(txtbrandName).sendKeys(brandname);
    }

    public static void setmodelnmae(String modelname) {
        getDriver().findElement(txtmodelNamee).sendKeys(modelname);
    }

    public static void setdescription(String description) {
        getDriver().findElement(txtdescription).sendKeys(description);
    }

    public static void clickbut() {
        PageBase.staticWait(02);
        getDriver().findElement(butSave).click();
    }
    public static boolean isDisplayed(){
        return getDriver().findElement(Isdisplayed).isDisplayed();
    }
    public static void selectDltBtn () {
        PageBase.staticWait(03);
        getDriver().findElement(selectDlt).click();
    }
    public static void clickDltBtn(){
        PageBase.staticWait(03);
        getDriver().findElement(clickDltbtn).click();
    }

}
