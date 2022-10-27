package com.juaracoding.selenium.pageobject.pages;

import com.juaracoding.selenium.pageobject.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchWishlist {

    private WebDriver driver;

    public SearchWishlist() {

        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"noo-site\"]/header/div[3]/div[2]/form/input[1]")
    WebElement menuSearch1;

    @FindBy(xpath = "//body/div/div/div/div/div/div/div/div/div/a[1]")
    WebElement btnWishlist1;

    @FindBy(xpath = "//*[@id=\"noo-site\"]/header/div[3]/div[2]/form/input[1]")
    WebElement menuSearch2;

    @FindBy(xpath = "//*[@id=\"product-1213\"]/div[1]/div[2]/div[2]/div/a")
    WebElement btnWishlist2;

    @FindBy(xpath = "//*[@id=\"noo-site\"]/header/div[1]/div/ul[2]/li[1]/a")
    WebElement viewWishlist;

    public void setMenuSearch1() {
        menuSearch1.sendKeys(Keys.ENTER);
        menuSearch1.click();

    }
    public void setBtnWishlist1() {
        menuSearch1.sendKeys("black satin one shoulder cut out midi dress");
        menuSearch1.sendKeys(Keys.ENTER);
        System.out.println("Wishlist Button one Clicked");
        btnWishlist1.click();

    }
    public void setMenuSearch2() {
        menuSearch2.sendKeys(Keys.ENTER);
        menuSearch2.click();

    }

    public void setBtnWishlist2() {
        menuSearch2.sendKeys("black strappy polka dot ruched midi dress");
        menuSearch2.sendKeys(Keys.ENTER);
        System.out.println("Wishlist Button two Clicked");
        btnWishlist2.click();
    }

    public void viewWishlist() {
        viewWishlist.sendKeys("My Wishlist");
        viewWishlist.sendKeys(Keys.ENTER);
        viewWishlist.click();
    }

}

