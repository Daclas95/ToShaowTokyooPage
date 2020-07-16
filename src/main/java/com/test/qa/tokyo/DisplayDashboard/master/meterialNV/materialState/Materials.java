package com.test.qa.tokyo.DisplayDashboard.master.meterialNV.materialState;

import org.openqa.selenium.By;
import utils.PageBase;

public class Materials extends PageBase {

    private static By masterMenu = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");
    private static By MaterialNV = By.xpath("//*[@id=\"root\"]/div/section/section/header/ul/li[10]/a");
    private static By MaterialsBtn = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]");
    private static By AddMaterialsBtn = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[2]/button");
    private static By homeBtn=By.xpath("//*[@id=\"root\"]/div/section/section/header/ul/a[2]/div");
    //private static By MaterialsBtn = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]");

    private static By MaterialName = By.xpath("//*[@id=\"material_name\"]");
    private static By Materialdescription = By.xpath("//*[@id=\"description\"]");

    private static By Subcategory = By.xpath("//*[@id=\"sub_category\"]/div/div");

    private static By MaterialNature = By.xpath("//*[@id=\"material_nature\"]/div/div");

//    private static By SaveBtn = By.xpath("//span[contains( text(),'Save') ]");

   //private static By SaveBtn = By.xpath("/html/body/div[7]/div/div[2]/div/div[2]/div[3]/button[2]");
    private static By SaveBtn = By.cssSelector("body > div:nth-child(14) > div > div.ant-modal-wrap > div > div.ant-modal-content > div.ant-modal-footer > button.ant-btn.sc-kgoBCf.ewWveO");
    //private static By SaveBtn = By.xpath("//span[contains(text(),'Save')]");
    private static By SubCategoryDrop =By.xpath("//*[@id=\"47b3fb57-4437-4344-8d79-371cac7cc58c\"]/ul/li[1]");



    public static void SelectSubcatogry() throws Exception {
        waiTillVisible(Subcategory,20);
        getDriver().findElement(Subcategory).click();
       //waiTillClickable(Subcategory,15);
        staticWait(2);



        hitEnter();
        //PageBase.waiTillVisible(SubCategoryDrop,10);

    }
    public static void SelectMaterialNature() throws Exception {
        getDriver().findElement(MaterialNature).click();
        waiTillClickable(MaterialNature,100);
        hitEnter();
    }


    public static void clickSave() {
        waiTillVisible(SaveBtn,20);
        getDriver().findElement(SaveBtn).click();

    }



    public static void clickMasterPanel() {
        getDriver().findElement(masterMenu).click();
    }
    public static void clickMaterialNV() {
        getDriver().findElement(MaterialNV).click();
    }
    public static void clickMaterials() {
        getDriver().findElement(MaterialsBtn).click();
    }
    public static void clickAddMaterials() {
        getDriver().findElement(AddMaterialsBtn).click();
        implicitWait(10);
    }
    public static void MaterialName (String name) {

        getDriver().findElement(MaterialName).sendKeys(name);
    }
    public static void DesignationName (String name) {

        getDriver().findElement(Materialdescription).sendKeys(name);
    }
    public static void clickHome() {
        getDriver().findElement(homeBtn).click();
        implicitWait(10);
    }


}
