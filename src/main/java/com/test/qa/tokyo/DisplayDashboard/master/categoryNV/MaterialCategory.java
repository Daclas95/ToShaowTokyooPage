package com.test.qa.tokyo.DisplayDashboard.master.categoryNV;

import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;
import utils.PageBase;

/**
 * @Author vinthusha
 */
public class MaterialCategory extends PageBase {
    public SoftAssert softAssert;

    private static By CategoryMenu = By.xpath("//*[@id=\"root\"]/div/section/section/header/ul/li[7]/a\n");
    private static By MaterialCategoryField = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/div[1]");
    private static By AddMaterialCal= By.xpath(" //*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[2]/button");
    private static By Txtname = By.id("category_name");
    private static By SaveBtn = By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[2]");


    public static void clickCategoryMenu() {
        getDriver().findElement(CategoryMenu).click();
    }
    public static void clickMaterialCategoryField() {
        getDriver().findElement(MaterialCategoryField).click();
    }
    public static void clickAddMaterialCal() {
        getDriver().findElement(AddMaterialCal).click();
    }
    public static void setname(String name) {
        getDriver().findElement(Txtname).sendKeys(name);
    }
    public static void clickSaveBtn() {
        getDriver().findElement(SaveBtn).click();
    }
}
