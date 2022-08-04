package com.co.pet.steps;

import com.co.pet.pageobjects.LoginPage;
import net.thucydides.core.annotations.Step;

public class LoginStep {

    LoginPage loginHomePage = new LoginPage();

    @Step
    public void openBrowser()
    {
        loginHomePage.open();
    }

    @Step
    public void selectSignIn()
    {
        loginHomePage.getDriver().findElements(loginHomePage.getBTN_SIGNIN()).click();
    }

    @Step
    public void addUser()
    {
        loginHomePage.getDriver().findElement(loginHomePage.getTXT_USERNAME()).sendKeys("mbuitragoa");

    }

    @Step
    public void addPassword()
    {
        loginHomePage.getDriver().findElement(loginHomePage.getTXT_PASSWORD()).sendKeys("123456789");
    }

    @Step
    public void clickLogin()
    {
        loginHomePage.getDriver().findElement(loginHomePage.getBTN_LOGIN()).click();
    }



    
    









}
