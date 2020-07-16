package com.test.qa.tokyo.DisplayDashboard.master.CustomerNV;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import utils.MethodBase;
import utils.PageBase;

import java.util.logging.Logger;

public class DeliveryCycle extends PageBase {

    private static final Logger LOGGER = (Logger) Logger.getLogger(String.valueOf(DeliveryCycle.class));
    private static By masterMenu = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");
    private static By MenuCustomer = By.xpath("//*[@id=\"root\"]/div/section/section/header/ul/li[11]/a");
    private static By fieldDeliverycycle = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[3]/div[1]");
    private static By butaddpour = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[2]/button");
    private static By txtpourname = By.id("pour_name");
    private static By txtproject = By.xpath("//*[@class=\"ant-select-selection__rendered\"]");
    private static By txtdesc= By.id("description");
    private static By busave= By.xpath("/html/body/div[6]/div/div[2]/div/div[2]/div[3]/button[2]");

    public static void clickMasterMenu() {
        getDriver().findElement(masterMenu).click();
    }

    public static void clickMenuCustomer() {
        getDriver().findElement(MenuCustomer).click();
    }

    public static void clickfieldDeliverycycle() {
        getDriver().findElement(fieldDeliverycycle).click();
    }

    public static void clickbutaddpour() {
        getDriver().findElement(butaddpour).click();
    }

    public static void settxtpour(String pour) {
        getDriver().findElement(txtpourname).sendKeys(pour);
    }

    public static void setTxtdesc(String desc) {
        getDriver().findElement(txtdesc).sendKeys(desc);
    }

    public static void clicksave() {
        getDriver().findElement(busave).click();
    }

    public static String getSelectedOption() {
        Select dropDownOption = new Select(getDriver().findElement(txtproject));
        return dropDownOption.getFirstSelectedOption().getText();
    }

    public static void setDropDownOption(int option) {
        Select dropDownOption = new Select(getDriver().findElement(txtproject));
        dropDownOption.selectByIndex(option);
    }

    public static void clicktxtproject() {
        getDriver().findElement(txtproject).click();

    }








}
