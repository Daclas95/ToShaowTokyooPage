package com.test.qa.tokyo.DisplayDashboard.master.SupplierNV;

import com.test.qa.tokyo.DisplayDashboard.master.PlantNV.PlantPanel;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;
import utils.PageBase;

import java.util.logging.Logger;

public class SupplierCatecory extends PageBase {

    public SoftAssert softAssert;

    private static final Logger LOGGER = (Logger) Logger.getLogger(String.valueOf(PlantPanel.class));

    private static By masterMenu = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");
    private static By MenuTabSupplier = By.xpath("//*[@id=\"root\"]/div/section/section/header/ul/li[13]/a");
    private static By SupplierCategory = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]");
    private static By AddCatecory = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[2]/button");
    private static By txtCatecory = By.id("supplier_category");
    private static By txtsupplierCategory_description = By.id("supplierCategory_description");

    private static By butSave = By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[2]");





    public static void clickMenuTabSupplier() {

        getDriver().findElement(MenuTabSupplier).click();
    }

    public static void clickSupplierCategory() {

        getDriver().findElement(SupplierCategory).click();
    }
    public static void clickAddCatecory() {

        getDriver().findElement(AddCatecory).click();
    }

    public static void setsupplier_category(String supplier_category) {

        getDriver().findElement(txtCatecory).sendKeys(supplier_category);
    }

    public static void setsupplierCategory_description(String supplierCategory_description) {

        getDriver().findElement(txtsupplierCategory_description).sendKeys(supplierCategory_description);
    }
    public static void clickSave() {

        getDriver().findElement(butSave).click();

    }
    public static void clickMasterPanel() {

        getDriver().findElement(masterMenu).click();
    }

    public static boolean isDashboardDisplay() {
        return  getDriver().findElement(masterMenu).isDisplayed();

    }
}
