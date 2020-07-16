package com.test.qa.tokyo.DisplayDashboard.master.PlantNV;

import utils.PageBase;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;
/**
 * @Author Nixsala
 */

public class PlantPanel extends PageBase {

    public SoftAssert softAssert;

   // WEB element declartion
    private static By masterMenu =By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");
    private static By plantPanel = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div/div[1]");
    private static By addPlant = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[2]/button");
    private static By headDisplay = By.xpath("//*[@id=\"rcDialogTitle5\"]/div");
    private static By txtCode = By.id("plant_code");
    private static By txtPlant = By.id("plant_name");
    private static By txtAddress = By.id("plant_address");
    private static By txtContactno = By.id("plant_contactno");
    private static By txtFax = By.id("fax");
    private static By txtPlantdescription = By.id("plant_description");
    private static By butPlantSave = By.xpath("/html/body/div[8]/div/div[2]/div/div[2]/div[3]/div/button[2]");

  // method for mastermenu
    public static void clickMasterPanel() {
        getDriver().findElement(masterMenu).click();
    }
// Method for plantpanel
    public static void clickPlantpanel() {
        getDriver().findElement(plantPanel).click();
    }
// Method for Addpanel
    public static void clickAddpanel() {
        getDriver().findElement(addPlant).click();
    }
 // Method for PlantHeaderDisplay
    public static boolean isPlantHeaderDisplay() {
        return getDriver().findElement(headDisplay).isDisplayed();
    }
// Method for AddplantDisplay
    public static boolean isAddplantDisplay() {
        return getDriver().findElement(addPlant).isDisplayed();
    }

// Method for setCode
    public static void setCode(String code) {
        getDriver().findElement(txtCode).sendKeys(code);
    }
// Method for setName
    public static void setName(String name) {
        getDriver().findElement(txtPlant).sendKeys(name);
    }
// Method for setAddress
    public static void setAddress(String Address) {
        getDriver().findElement(txtAddress).sendKeys(Address);

    }
// Method for setContacno
    public static void setContacno(String contactno) {
        getDriver().findElement(txtContactno).sendKeys(contactno);

    }
// Method for setFax
    public static void setFax(String fax) {
        getDriver().findElement(txtFax).sendKeys(fax);

    }
 // Method for setDescription
    public static void setDescription(String description) {
        getDriver().findElement(txtPlantdescription).sendKeys(description);

    }
 // Method for clickSavebutten
    public static void clickSavebutten() {
        getDriver().findElement(butPlantSave).click();

    }
// Method for isDisplayAddPlantView
    public static boolean isDisplayAddPlantView(){
        return getDriver().findElement(addPlant).isDisplayed();
    }


}



















