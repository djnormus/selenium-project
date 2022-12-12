package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class PageCheckoutOverview {
    WebDriver driver;

    public PageCheckoutOverview(WebDriver driver) {
        this.driver = driver;
    }

    public void compareTitleCheckoutOverview(){
        By pathTitleCheckoutOverview = By.xpath("//*[@id=\"header_container\"]/div[2]/span");
        String originalTitle = "CHECKOUT: OVERVIEW";
        WebElement elementTitleCheckoutOverview = driver.findElement(pathTitleCheckoutOverview);
        String actualTitle= elementTitleCheckoutOverview.getText();
        Assert.assertEquals(actualTitle,originalTitle,"Titre page checkout overview incorrect");
    }


    public void verifTotalOrder(){

        By pathTotalOrder = By.className("summary_total_label");
        String originalPrice = "Total: $43.18";
        WebElement elementTotalOrder = driver.findElement(pathTotalOrder);
        String actualPrice = elementTotalOrder.getText();
        Assert.assertEquals(actualPrice,originalPrice, "Le prix total est incorrect");
    }


    public void clickFinishBtn(){
        By pathFinishBtn = By.id("finish");
        WebElement elementFinishBtn = driver.findElement(pathFinishBtn);
        elementFinishBtn.click();

    }




}
