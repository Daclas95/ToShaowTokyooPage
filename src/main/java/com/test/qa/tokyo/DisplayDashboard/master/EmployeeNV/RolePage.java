package com.test.qa.tokyo.DisplayDashboard.master.EmployeeNV;

import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;
import utils.PageBase;
/**
 * @Author Banuja
 */

public class RolePage extends PageBase {
    public SoftAssert softAssert;

    // web element delcartion
    private static By masterMenu = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");
    private static By employee = By.xpath("//*[@id=\"root\"]/div/section/section/header/ul/li[15]/a");
    private static By roleMenu = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]");
    private static By addRole = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[2]/button");
    private static By txtCongerete = By.xpath("//*[@id=\"role_name\"]");
    private static By btnSave = By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[2]");

    //Method for clickMaster
    public static void clickMaster() {

        getDriver().findElement(masterMenu).click();
    }
    //Method for clickRole
    public static void clickRole() {

        getDriver().findElement(roleMenu).click();
    }
    //Method for clickaddRole
    public static void clickaddRole() {

        getDriver().findElement(addRole).click();
    }
    //Method for setRolCongerete
    public static void setRolCongerete(String congeretemixter) {

        getDriver().findElement(txtCongerete).sendKeys(congeretemixter);
    }
    //Method for clickSave
    public static void clickSave() {

        getDriver().findElement(btnSave).click();
    }
    //Method for isDisplayRole
    public static boolean isDisplayRole() {

        return getDriver().findElement(roleMenu).isDisplayed();
    }
    //Method for getRoleAlert
    public static boolean getRoleAlert() {

        return getDriver().findElement(roleMenu).isDisplayed();
    }
    public static void clickemployee(){
        getDriver().findElement(employee).click();
    }
}
