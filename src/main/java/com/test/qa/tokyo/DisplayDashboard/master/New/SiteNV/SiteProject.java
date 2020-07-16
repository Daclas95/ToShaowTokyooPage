package com.test.qa.tokyo.DisplayDashboard.master.New.SiteNV;

import org.openqa.selenium.By;
import utils.PageBase;

public class SiteProject extends PageBase {
    public static By SiteNavigation = By.xpath("//*[@id=\"root\"]/div/section/section/header/ul/li[16]/a");
    public static By ProjectBtn = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]");
    public static By AddProjectBtn = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[2]/button");

    public static void SiteNavigationClick(){
        getDriver().findElement(SiteNavigation).click();
    }
    public static void ProjectBtnClick(){
        getDriver().findElement(ProjectBtn).click();
    }
    public static void AddProjectionClick(){
        getDriver().findElement(AddProjectBtn).click();
    }
}
