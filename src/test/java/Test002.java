import commun.Hooks;
import org.testng.annotations.Test;
import pages.PageLogin;

public class Test002 extends Hooks {

    @Test
    public void test002 (){

        PageLogin login = new PageLogin(driver);
        String valLogin = "locked_out_user";
        String valMdp = "secret_sauce";
        String valMsg = "Epic sadface: Sorry, this user has been locked out.";

        login.saisirLogin(valLogin);
        login.saisirMdp(valMdp);
        login.clicBtnLogin();
        login.VerifMessage(valMsg);

    }



}
