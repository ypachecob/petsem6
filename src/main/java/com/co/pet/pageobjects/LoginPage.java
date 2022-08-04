package com.co.pet.pageobjects;


import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://petstore.octoperf.com/actions/Catalog.action")
public class LoginPage extends PageObject {

    By BTN_SIGNIN = By.xpath("//a[@href='/actions/Account.action;jsessionid=73F19F2CB8B0F4CFB3F6321E0D4BF7A6?signonForm=']");
    By TXT_USERNAME = By.xpath("//input[@id='stripes-1959624851']");
    By TXT_PASSWORD = By.xpath("//input[@name='password']");
    By BTN_LOGIN = By.xpath("//input[@name='signon']");
    By LBL_WELCOME = By.xpath("//*[@id='WelcomeContent']");

    public By getBTN_SIGNIN() {
        return BTN_SIGNIN;
    }

    public By getTXT_USERNAME() {
        return TXT_USERNAME;
    }

    public By getTXT_PASSWORD() {
        return TXT_PASSWORD;
    }

    public By getBTN_LOGIN() {
        return BTN_LOGIN;
    }

    public By getLBL_WELCOME() {
        return LBL_WELCOME;
    }
}
