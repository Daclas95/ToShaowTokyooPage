package com.test.qa.tokyo.DisplayDashboard.master.EmployeeNV;


import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;
import utils.PageBase;
/**
 * @Author Jathumithran
 */


public class Designation extends PageBase {

    public SoftAssert softAssert;

    private static By masterMenu = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");
    private static By employee = By.xpath("//*[@id=\"root\"]/div/section/section/header/ul/li[15]/a");
    private static By Designation = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[3]");
    private static By AddDesignation = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[2]/button");
    private static By designation = By.xpath("//*[@id=\"designation_name\"]");
    private static By Description = By.xpath("//*[@id=\"designation_description\"]");
    private static By Savebutton = By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[2]");

    private static By Designationheader = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[1]");
    private static By AddDesignationHeadder = By.xpath("//*[@id=\"rcDialogTitle2\"]/div/p");


    public static void clickMasterPanel() {
        getDriver().findElement(masterMenu).click();
    }
    public static void clickemployee(){
        getDriver().findElement(employee).click();
    }
    public static void clickDesignation() {
        getDriver().findElement(Designation).click();
    }
    public static void clickAddDesignation() {
        getDriver().findElement(AddDesignation).click();
    }
    public static void setdesignation (String name) {
        getDriver().findElement(designation).sendKeys(name);
    }
    public static void DesignationDescription (String dis) {
        getDriver().findElement(Description).sendKeys(dis);
    }
    public static void DesignationSave() {
        getDriver().findElement(Savebutton).click();
    }
    public static boolean isDesignationPageDisplayed() {
        return getDriver().findElement(Designationheader).isDisplayed();
    }
    public static boolean isAddDesignationPageDisplayed() {
        return getDriver().findElement(AddDesignationHeadder).isDisplayed();

    }

}
