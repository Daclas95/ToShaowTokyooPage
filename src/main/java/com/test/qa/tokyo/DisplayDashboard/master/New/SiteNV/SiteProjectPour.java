package com.test.qa.tokyo.DisplayDashboard.master.New.SiteNV;

import org.openqa.selenium.By;
import utils.PageBase;

public class SiteProjectPour extends PageBase {
    public static By SiteNavigation = By.xpath("//*[@id=\"root\"]/div/section/section/header/ul/li[16]/a");
    public static By Pour = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]");
    public static By AddPour = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[2]/button");
    public static By PourName = By.id("pour_name");
    public static By Project  = By.xpath("//*[@id=\"project\"]/div");
    public static By Description = By.id("description");
    public static By Save = By.xpath("/html/body/div[6]/div/div[2]/div/div[2]/div[3]/button[2]");

    public static void SiteNavigationClick(){
        getDriver().findElement(SiteNavigation).click();
    }
    public static void PourPanel() {
        getDriver().findElement(Pour).click();
    }
    public static void AddPour() {
        getDriver().findElement(AddPour).click();
    }
    public static void EnterPourName(String PName) {
        getDriver().findElement(PourName).sendKeys(PName);
    }
    public static void ProjectDropDown() throws Exception {
        getDriver().findElement(Project).click();
        PageBase.hitEnter();
    }
    public static void DescriptionEnter(String description) {
        getDriver().findElement(Description).sendKeys(description);
    }
    public static void SaveBtn() {
        getDriver().findElement(Save).click();
    }
}
