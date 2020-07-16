package com.test.qa.tokyo.DisplayDashboard.master.EmployeeNV;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import utils.PageBase;
/**
 * @Author L.Vinthusha
 */

public class EmployeeList extends PageBase {
    public SoftAssert softAssert;

    private static By masterMenu = By.xpath("//h1[contains(text(),'Master')]");
    private static By employee = By.xpath("//*[@id=\"root\"]/div/section/section/header/ul/li[15]/a");
    private static By btnemployee = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[3]");
    private static By addemployee =By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[1]/div/div[2]/div[2]/div/button");
    private static By txtF_name = By.id("first_name");
    private static By txtL_name = By.id("last_name");
    private static By txtaddress = By.id("address");
    private static By txtC_no = By.id("phoneno");
    private static By txtemail = By.id("email");
    private static By clicksavebtn = By.xpath("/html/body/div[9]/div/div[2]/div/div[2]/div[3]/button[2]");
    private static By clickPlantOption = By.xpath("//*[@id=\"plant\"]/div/div");
    private static By selectDesignationOption = By.xpath("//*[@id=\"desigination\"]/div/div");

    public static void setDropDownOption(String option) {
        Select dropDownOption = new Select(getDriver().findElement(clickPlantOption));
        dropDownOption.selectByVisibleText(option);
    }
    public static void selectPlantOption1() throws Exception {
        getDriver().findElement(clickPlantOption).click();
        PageBase.hitEnter();
    }
    public static void setSelectDesignation1() throws Exception {
        getDriver().findElement(selectDesignationOption).click();
        PageBase.hitEnter();
    }
    public static void clickMasterMenu() {
        getDriver().findElement(masterMenu).click();
    }
    public static void clickEmployee() {
        getDriver().findElement(employee).click();
    }
    public static void clickbtnEmployee() {
        getDriver().findElement(btnemployee).click();
    }
    public static void clickAddEmployee() {
        getDriver().findElement(addemployee).click();
    }
    public static void setfname(String fname) {
        getDriver().findElement(txtF_name).sendKeys(fname);
    }
    public static void setlname(String lname) {
        getDriver().findElement(txtL_name).sendKeys(lname);
    }
    public static void setaddress(String address) {
        getDriver().findElement(txtaddress).sendKeys(address);
    }
    public static void setnumber(String no) {
        getDriver().findElement(txtC_no).sendKeys(no);
    }
    public static void setemail(String email) {
        getDriver().findElement(txtemail).sendKeys(email);
    }
    public static void clicksavebtn(){
        getDriver().findElement(clicksavebtn).click();
    }
    public static boolean isdashboardDisplay() {
        return getDriver().findElement(txtC_no).isDisplayed();
    }
    public static boolean isDisplayEmployee() {
        return getDriver().findElement(employee).isDisplayed();
    }
    public static boolean getEmployeeAlert() {
        return getDriver().findElement(employee).isDisplayed();
    }


}
