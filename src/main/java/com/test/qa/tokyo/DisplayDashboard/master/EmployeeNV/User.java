package com.test.qa.tokyo.DisplayDashboard.master.EmployeeNV;

import org.openqa.selenium.By;
import utils.PageBase;

public class User extends PageBase {
    private static By masterMenu = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");
    private static By btnemployee = By.xpath("//*[@id=\"root\"]/div/section/section/header/ul/li[15]/a");
    private static By btbuser = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[4]/div[1]");
    private static By btnDelete =By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[5]/td[8]/span/a[2]/a/i/svg");



    public static boolean isdashboardDisplay() {
        return getDriver().findElement(masterMenu).isDisplayed();
    }
    public static void clickMastermenu(){
        getDriver().findElement(masterMenu).click();
    }

    //    public static boolean ismastermenuDisplay() {
//        return getDriver().findElement(masterMenu).isDisplayed();
//    }
    public static void clickEmployee (){
        getDriver().findElement(btnemployee).click();
    }
    public static void clickUser (){
        getDriver().findElement(btbuser).click();
    }
    public static void clickDelete(){
        getDriver().findElement(btnDelete).click();
    }
}
