package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class PageCheckout {

    WebDriver driver;

    public PageCheckout(WebDriver driver){

        this.driver=driver;
    }


    public void checkoutForm () {

        // By
        By pathFirstNameInput = By.id("first-name");
        By pathLastnameInput = By.id("last-name");
        By pathPostalCodeInput = By.id("postal-code");

        // FIRST NAME
        WebElement firstnameInput = driver.findElement(pathFirstNameInput);
        firstnameInput.sendKeys("Nordine");

        // LAST NAME
        WebElement lastnameInput = driver.findElement(pathLastnameInput);
        lastnameInput.sendKeys("Ben");

        // ZIP CODE
        WebElement postalCodeInput = driver.findElement(pathPostalCodeInput);
        postalCodeInput.sendKeys("75001");
    }


    public void compareTitleCheckout(){

        By pathTitleCheckout = By.xpath("//*[@id=\"header_container\"]/div[2]/span");
        String originalTitle = "CHECKOUT: YOUR INFORMATION";
        WebElement elementTitleCheckout = driver.findElement(pathTitleCheckout);
        String actualTitle = elementTitleCheckout.getText();
        Assert.assertEquals(actualTitle,originalTitle,"Titre page Checkout incorrect");
    }

    public void clicBtnContinuer(){

        By pathBtnContinuer = By.id("continue");
        WebElement btnContinuer = driver.findElement(pathBtnContinuer);
        btnContinuer.click();
    }




}
