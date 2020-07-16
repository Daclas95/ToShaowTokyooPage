package com.test.qa.tokyo.DisplayDashboard.master.CustomerNV;

import org.openqa.selenium.By;
import utils.MethodBase;
import utils.PageBase;

public class Project extends PageBase {
    private static By masterMenu = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");
    private static By MenuCustomer = By.xpath("//*[@id=\"root\"]/div/section/section/header/ul/li[11]/a");
    private static By project = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]");
    private static By Addproject = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[2]/button");
    private static By projectname = By.id("project_name");
    private static By calender = By.xpath("//*[@id=\"start_date\"]/div/input");
    private static By projectcontactno = By.id("contact_no");
    private static By projectconatctperson = By.id("contact_person");
    private static By projectplant = By.xpath("//*[@id=\"plant\"]/div/div");
    private static By projectdropcustomer = By.xpath("//*[@id=\"customer\"]/div/div");
    private static By save = By.xpath("/html/body/div[10]/div/div[2]/div/div[2]/div[3]/button[2]");




    public static void clickMasterMenu() {
        getDriver().findElement(masterMenu).click();
    }

    public static void clickMenuCustomer() {
        getDriver().findElement(MenuCustomer).click();
    }

    public static void clickproject() {
        getDriver().findElement(project).click();
    }

    public static void clickAddproject() {
        getDriver().findElement(Addproject).click();
    }

    public static void setprojectname(String pname) {
        getDriver().findElement(projectname).sendKeys(pname);
    }

    public static void setprojectcalender() throws Exception {
        getDriver().findElement(calender).click();
        MethodBase.hitEnter();
    }

    public static void setprojectcontactno(String cno) {
        getDriver().findElement(projectcontactno).sendKeys(cno);
    }

    public static void setprojectconatctperson(String cperson) {
        getDriver().findElement(projectconatctperson).sendKeys(cperson);
    }

    public static void selectPlantdropdown() throws Exception {
        getDriver().findElement(projectplant).click();
        PageBase.hitEnter();
    }

    public static void selectcustomerdropdown() throws Exception {
        getDriver().findElement(projectdropcustomer).click();
        PageBase.hitEnter();
    }

    public static void clicksave() {
        getDriver().findElement(save).click();
    }



}
