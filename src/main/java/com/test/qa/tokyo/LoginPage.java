package com.test.qa.tokyo;

import utils.PageBase;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import java.util.logging.Logger;

public class LoginPage extends PageBase {
    public SoftAssert softAssert;

    private static final Logger LOGGER = (Logger) Logger.getLogger(String.valueOf(LoginPage.class));

    private static By DashBoard = By.xpath("//div[@class=\"logo\"]");
    private static By hdrLogin = By.xpath("//h3");
    private static By txtUserName = By.id("usernameOrEmail");
    private static By txtPassword = By.id("password");
    private static By btnLogin = By.xpath("//button");
    private static By alert = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/form/div/div[1]/div[2]");

    public static boolean isLoginPageDisplay() {

        return getDriver().findElement(hdrLogin).isDisplayed();
    }
    public static void setUserName(String userName) {
   PageBase.waiTillClickable(txtUserName,8000);
        getDriver().findElement(txtUserName).sendKeys(userName);
    }
    public static void setPassword(String password) {

        getDriver().findElement(txtPassword).sendKeys(password);
    }
    public static void clickLogin() {
        getDriver().findElement(btnLogin).click();
    }

    public static boolean isDashboardPageDisplayed() {
        return getDriver().findElement(DashBoard).isDisplayed();
    }
    public static boolean isLoginAlertDisplay() {
        return getDriver().findElement(alert).isDisplayed();
    }

    public static String getLoginAlert() {
        return  getDriver().findElement(alert).getText();
    }

    public static void login(String user ,String pass){
        LoginPage.setUserName(user);
        LoginPage.setPassword(pass);
        LoginPage.clickLogin();
    }
   /* public static void login1(String userName, String password,String status,String alertMSg) {
        if(status=="valid") {
            LoginPage.setUserName(userName);
            LoginPage.setPassword(password);
            LoginPage.clickLogin();
            LOGGER.info("DashBoardPage is displayed");
            LoginPage.isDashboardPageDisplayed();
            LOGGER.info("logout success");
        }
        else {
            LoginPage.setUserName(userName);
            LoginPage.setPassword(password);
            LoginPage.clickLogin();
            LOGGER.info(alertMSg);
        }

    }*/
}
