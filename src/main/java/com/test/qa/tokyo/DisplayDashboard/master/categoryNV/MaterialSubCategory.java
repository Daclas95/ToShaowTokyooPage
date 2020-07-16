package com.test.qa.tokyo.DisplayDashboard.master.categoryNV;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import utils.PageBase;

/**
 * @Author vinthusha
 */

public class MaterialSubCategory extends PageBase {
    public SoftAssert softAssert;

    private static By CategoryMenu = By.xpath("//*[@id=\"root\"]/div/section/section/header/ul/li[6]/a");
    private static By MaterialSubCategory = By.xpath(" //*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/div[1]");
    private static By AddMaterialSubCategory = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[1]/div/div[2]/button");
    private static By TxtPrefix = By.xpath("//*[@id=\"prefix\"]");
    private static By Txtname = By.id("subcategory_name");
    private static By materialCategory = By.id("material_category");
    private static By ClickSavebtn = By.xpath("/html/body/div[5]/div/div[2]/div/div[2]/div[3]/button[2]");


    public static void clickCategoryMenu() {
        getDriver().findElement(CategoryMenu).click();
    }
    public static void clickMaterialSubCategory() {
        getDriver().findElement(MaterialSubCategory).click();
    }
    public static void clickAddMaterialSubCategory() {
        getDriver().findElement(AddMaterialSubCategory).click();
    }
    public static void setTxtPrefix(String prefix) {

        getDriver().findElement(TxtPrefix).sendKeys(prefix);
    }
    public static void setTxtname(String name) {
        getDriver().findElement(Txtname).sendKeys(name);
    }

        public static void setDropDownOption(String option) {
            Select dropDownOption = new Select(getDriver().findElement(  materialCategory));
            dropDownOption.selectByVisibleText(option);
        }
        public static void selectMaterialCategoryOption1() throws Exception {
            getDriver().findElement( materialCategory).click();
            PageBase.hitEnter();
    }
    public static void ClickSavebtn() {
        getDriver().findElement(ClickSavebtn).click();
    }
}

