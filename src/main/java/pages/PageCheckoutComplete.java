package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class PageCheckoutComplete {

    WebDriver driver;

    public PageCheckoutComplete(WebDriver driver) {
        this.driver = driver;
    }

    public void compareTitleCheckoutComplete(){
        By pathTitleCheckoutComplete = By.xpath("//*[@id=\"header_container\"]/div[2]/span");
        String originalTitle = "CHECKOUT: COMPLETE!";
        WebElement elementTitleCheckoutComplete = driver.findElement(pathTitleCheckoutComplete);
        String actualTitle= elementTitleCheckoutComplete.getText();
        Assert.assertEquals(actualTitle,originalTitle,"Titre page checkout complete incorrect");
    }

    public void compareThankyouMsg(){
        By pathMsg = By.tagName("h2");
        String originalmsg = "THANK YOU FOR YOUR ORDER";
        WebElement elementMsg = driver.findElement(pathMsg);
        String actualMsg= elementMsg.getText();
        Assert.assertEquals(actualMsg,originalmsg,"Titre page checkout complete incorrect");
    }



}
