package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageProduit {


    WebDriver driver;

    public PageProduit (WebDriver driver){
        this.driver = driver;
    }


    public void VerifMessage (String valMsg){
        WebElement message = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span"));

        if (message.equals(valMsg)){
            System.out.println("Titre OK");
        }else {
            System.out.println("ERREUR Titre");
        }

    }

    public void ajoutPanier(){
        WebElement addItem1 = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        addItem1.click();

        WebElement addItem2 = driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
        addItem2.click();

    }

    public void clicCart (){
        WebElement cartBtn = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
        cartBtn.click();
    }










}
