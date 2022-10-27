package com.juaracoding.com.selenium.pageobject;

import com.juaracoding.selenium.pageobject.drivers.DriverSingleton;
import com.juaracoding.selenium.pageobject.pages.Dashboard;
import com.juaracoding.selenium.pageobject.pages.Login;
import com.juaracoding.selenium.pageobject.pages.Register;
import com.juaracoding.selenium.pageobject.pages.SearchWishlist;
import com.juaracoding.selenium.pageobject.utils.Constants;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


public class PostTest18 {

    public static void main(String[] args) {
        DriverSingleton.getInstance(Constants.CHROME);
        WebDriver driver = DriverSingleton.getDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        Dashboard dashboard = new Dashboard();
        Register register = new Register();
        Login login = new Login();
        SearchWishlist searchWishlist = new SearchWishlist();

        // Dashboard
        driver.get(Constants.URL);
        dashboard.dashboard();

        // Register Account
        driver.get(Constants.URL_LOGIN);
        register.registerForm("Rizki Maulana", "rizkimaulanaazis12@email.com", "RizkiM123456--");

        driver.navigate().back();
        driver.navigate().refresh();

        // Login Account
        login.loginForm("rizkimaulanaazis12@email.com", "RizkiM123456--");

        //Item list one product
        driver.get(Constants.URL_SHOP1);
        js.executeScript("window.scrollBy(0,1000)");
        searchWishlist.setBtnWishlist1();

        driver.navigate().back();
        driver.navigate().refresh();

        //Item list two product
        driver.get(Constants.URL_SHOP2);
        js.executeScript("window.scrollBy(0,1000)");
        searchWishlist.setBtnWishlist2();

        // View My wishlist
        driver.get(Constants.URL_MY_WISHLIST);
        js.executeScript("window.scrollBy(0,1000)");
        searchWishlist.viewWishlist();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();
    }
}