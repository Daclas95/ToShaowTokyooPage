package com.test.qa.tokyo.DisplayDashboard.master.equipmentNV;

import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;
import utils.MethodBase;
import utils.PageBase;

public class Equipment extends PageBase {
    public SoftAssert softAssert;

    // WEB element declartion
    private static By masterMenu =By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");
    private static By equipmenttab = By.xpath(" //*[@id=\"root\"]/div/section/section/header/ul/li[7]/a");
    private static By equipment = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/div[1]");
    private static By addequipment = By.xpath(" //*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[2]/button");
    private static By isEquipmentPageDisplay = By.xpath("//*[@id=\"rcDialogTitle2\"]/div");

    private static By txtequipment =By.id("equipment_name");
    private static By txtdescription =By.id("equipment_description");
    private static By type =By.xpath("//*[@id=\"type\"]/div/div");
    private static By btnsave =By.xpath("/html/body/div[6]/div/div[2]/div/div[2]/div[3]/button[2]");
    private static By EditBtn = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[2]/td[4]/span/a[1]/i");
    private static By DltBtn = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[2]/td[4]/span/a[2]/a/i");
    private static By DltBtnClick = By.xpath("/html/body/div[8]/div/div/div/div[2]/div/div/div[2]/button[2]");
    private static By CheckEquipmentName = By.xpath("/html/body/div[6]/div/div[2]/div/div[2]/div[2]/form/div[2]/div/div/div[1]");
    private static By checkIsDisplayedEquipment = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[1]");

    // method for mastermenu
    public static void clickMasterPanel() {
        getDriver().findElement(masterMenu).click();
    }
    // Method for equipmenttab
    public static void clickequipmenttab() {
        getDriver().findElement(equipmenttab).click();
    }
    // Method for equipment
    public static void clickequipment() {
        getDriver().findElement(equipment).click();
    }
    // Method for addequipment
    public static void clickaddequipment() {
        getDriver().findElement(addequipment).click();
    }
    // Method for setEquipment
    public static void setEquipment(String equname){
        getDriver().findElement(txtequipment).sendKeys(equname);
    }
    // Method for setDescription
    public static void setDescription(String description){
        getDriver().findElement(txtdescription).sendKeys(description);
    }
    // Method for clicktypedropdown

    public static void selecttype() throws Exception {
        getDriver().findElement(type).click();
        MethodBase.hitEnter();
    }
    // Metgod for clicksavebtn
    public static void clicksavebtn(){
        PageBase.staticWait(02);
        getDriver().findElement(btnsave).click();
    }
    public static boolean isDisplayed(){
        return getDriver().findElement(checkIsDisplayedEquipment).isDisplayed();
    }
    public static void clickEditButton(){
        PageBase.staticWait(02);
        getDriver().findElement(EditBtn).click();
    }
    public static void ClickDeletebtn(){
        PageBase.staticWait(03);
        getDriver().findElement(DltBtn).click();

    }
    public static void dlt(){
        PageBase.staticWait(02);
        getDriver().findElement(DltBtnClick).click();
    }
    public static String getEquipmentName (){
        return getDriver().findElement(CheckEquipmentName).getText();
    }
}
