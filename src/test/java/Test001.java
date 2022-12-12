import commun.Hooks;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.PageLogin;

public class Test001 extends Hooks {

    @Test
    public void test001 (){

        PageLogin login = new PageLogin(driver);
        String valLogin = "standard_user";
        String valMdp = "abc123";
        String valMsg = "Epic sadface: Username and password do not match any user in this service";

        login.saisirLogin(valLogin);
        login.saisirMdp(valMdp);
        login.clicBtnLogin();
        login.VerifMessage(valMsg);




    }




}
