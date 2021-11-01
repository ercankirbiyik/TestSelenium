package org.example.page;

import org.example.base.BasePage;
import org.openqa.selenium.WebDriver;

import static org.example.constants.ConstantsLoginPage.*;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage moveToLogIn() {
        hoverElement(MOVE);
        return this;
    }

    public LoginPage clickLogIn() {
        click(LOGIN);
        return this;
    }

    public LoginPage sendEmail() {
        sendKeys(EMAIL, "rcnkirbiyik@gmail.com");
        return this;
    }

    public LoginPage sendPassword() {
        sendKeys(PASSWORD, "Ercan30.");
        return this;
    }

    public LoginPage search() {
        click(LOGIN);
        return this;
    }

    public LoginPage searchButton() {
        click(CLICK_BUTTON);
        return this;
    }

    public LoginPage addToCart() {
        click(ADD_TO_CART);
        return this;
    }

    public LoginPage upPlus() {
        click(UP_PLUS);
        return this;
    }

    public LoginPage trash() {
        click(TRASH);
        return this;
    }

    public LoginPage emptyCart() {
        click(CART_EMPTY);
        return this;
    }

}
