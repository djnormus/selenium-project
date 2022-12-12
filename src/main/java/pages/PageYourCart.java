package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class PageYourCart {

    WebDriver driver;

    public PageYourCart(WebDriver driver){
        this.driver = driver;
    }


    public void compareTitleCart(){
        By xpathTitleCart = By.xpath("//*[@id=\"header_container\"]/div[2]/span");
        String originalTitle = "YOUR CART";
        WebElement elementTitle = driver.findElement(xpathTitleCart);
        String actualTitle= elementTitle.getText();
        Assert.assertEquals(actualTitle,originalTitle,"jhgjhgjgjh");
    }

    public void checkCartItems(){
        // BY
        By pathItem1 = By.xpath("//*[@id=\"item_4_title_link\"]/div");
        By pathItem2 = By.xpath("//*[@id=\"item_0_title_link\"]/div");

        // ORIGINAL TITLE
        String originalTitleItem1 = "Sauce Labs Backpack";
        String originalTitleItem2 = "Sauce Labs Bike Light";


        WebElement item1 = driver.findElement(pathItem1);
        WebElement item2 = driver.findElement(pathItem2);

        item1.getText();
        item2.getText();

        Assert.assertTrue(item1.isDisplayed(), "item 1 n'es pas affiché");
        Assert.assertTrue(item2.isDisplayed(), "item 2 n'es pas affiché");
    }

    public void clickBtnCheckout(){
        By pathBtnCheckout = By.id("checkout");
        WebElement btnCheckout = driver.findElement(pathBtnCheckout);
        btnCheckout.click();
    }





}
