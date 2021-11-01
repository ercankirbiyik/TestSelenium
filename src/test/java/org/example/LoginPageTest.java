package org.example;

import org.example.base.BaseTest;
import org.example.page.LoginPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LoginPageTest extends BaseTest {
    LoginPage loginPage;

    @Before
    public void before() {
        loginPage = new LoginPage(getWebDriver());
    }

    @Test
    public void test() {
    loginPage.
            moveToLogIn().
            clickLogIn().
            sendEmail().
            sendPassword().
            search().
            searchButton().
            addToCart().
            upPlus().
            trash().
            emptyCart();
    }

    @After
    public void after() {

    }
}