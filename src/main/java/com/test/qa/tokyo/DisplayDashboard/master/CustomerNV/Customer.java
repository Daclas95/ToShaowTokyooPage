package com.test.qa.tokyo.DisplayDashboard.master.CustomerNV;

import com.test.qa.tokyo.DisplayDashboard.master.PlantNV.PlantPanel;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import utils.MethodBase;
import utils.PageBase;

import java.util.logging.Logger;

public class Customer extends PageBase {
    public SoftAssert softAssert;

    private static final Logger LOGGER = (Logger) Logger.getLogger(String.valueOf(PlantPanel.class));
    private static By masterMenu = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");
    private static By MenuCustomer = By.xpath("//*[@id=\"root\"]/div/section/section/header/ul/li[11]/a");
    private static By customerField = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/div[1]");
    private static By btnAddCustomer = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[2]/button");
    private static By txtCustomerName = By.id("customer_name");
    private static By txtAddress = By.id("customer_address");
    private static By txtContactNO = By.id("customer_contactno");
    private static By txtEmail = By.id("customer_email");
    private static By dropdownPlant = By.xpath("//*[@id=\"customer_plant\"]/div/div");
    private static By butCustomerSave = By.xpath("/html/body/div[6]/div/div[2]/div/div[2]/div[3]/button[2]");

    public static void clickMasterMenu() {
        getDriver().findElement(masterMenu).click();
    }

    public static void clickCustomer() {
        getDriver().findElement(MenuCustomer).click();
    }

    public static void clickCustomerField() {
        getDriver().findElement(customerField).click();
    }

    public static void clickAddCustomer() {
        getDriver().findElement(btnAddCustomer).click();
    }

    public static void setCustomerName(String Name) {

        getDriver().findElement(txtCustomerName).sendKeys(Name);
    }

    public static void setAddress(String Addresss)
    {
        getDriver().findElement(txtAddress).sendKeys(Addresss);
    }

    public static void setContactNO(String Contact)
    {
        getDriver().findElement(txtContactNO).sendKeys(Contact);
    }

    public static void setEmail(String Email) {

        getDriver().findElement(txtEmail).sendKeys(Email);
    }



    public static void selectPlantOptionplant() throws Exception {
        getDriver().findElement(dropdownPlant).click();
        PageBase.hitEnter();
    }


        public static void setbutCustomerSave() {

        getDriver().findElement(butCustomerSave).click();
    }



}
