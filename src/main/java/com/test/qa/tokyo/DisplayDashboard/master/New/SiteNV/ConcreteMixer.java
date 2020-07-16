package com.test.qa.tokyo.DisplayDashboard.master.New.SiteNV;

import org.openqa.selenium.By;
import utils.PageBase;

public class ConcreteMixer extends PageBase {
    private static By ConcreteMixerBtn = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]");
    private static By AddConcreteMixerBtn = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[1]/div/div[2]/button");
    private static By EnterConcreteMixerName = By.xpath("//*[@id=\"name\"]");
    private static By SaveBtn = By.xpath("/html/body/div[5]/div/div[2]/div/div[2]/div[3]/button[2]");
    //private static final Logger LOGGER = Logger.getLogger(ConcreteMixer.class);

    private static By DltBtn = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[1]/td[3]/span/a[2]/a");
    private static By selectDDOption = By.xpath("//*[@class=\"ant-select-selection__rendered\"]");

    public static void ConcretePanel() {

        getDriver().findElement(ConcreteMixerBtn).click();
    }
    public static void AddConcreteBtn(){
        getDriver().findElement(AddConcreteMixerBtn).click();
    }
    public static void EnterConcreteMixerNames(){
        getDriver().findElement(EnterConcreteMixerName).sendKeys("Mixer-A");
    }

    public static void SelectDDoption1() throws Exception {
        getDriver().findElement(selectDDOption).click();
        PageBase.hitEnter();
    }


    public static void SaveBtn(){
    PageBase.waiTillClickable(SaveBtn,8000);
        getDriver().findElement(SaveBtn).click();
    }
    public static void DleBtn() {
        PageBase.waiTillClickable(DltBtn,8000);
        getDriver().findElement(DltBtn).click();

    }

}
