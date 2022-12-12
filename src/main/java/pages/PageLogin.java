package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageLogin {

   WebDriver driver;

   public PageLogin(WebDriver driver){

       this.driver = driver;
   }


   public void saisirLogin(String valLogin){
       WebElement champLogin = driver.findElement(By.id("user-name"));
       champLogin.sendKeys(valLogin);
   }

    public void saisirMdp(String valMdp){
        WebElement champMdp = driver.findElement(By.id("password"));
        champMdp.sendKeys(valMdp);
    }

    public void clicBtnLogin(){
       WebElement btnLogin = driver.findElement(By.id("login-button"));
       btnLogin.click();
    }


    public void VerifMessage (String valMsg){
       WebElement message = driver.findElement(By.tagName("h3"));

        if (message.equals(valMsg)){
            System.out.println("Message OK");
        }else {
            System.out.println("ERREUR Message");
        }
    }





}
