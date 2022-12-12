import commun.Hooks;
import org.testng.annotations.Test;
import pages.*;

public class Test003 extends Hooks {
    @Test
    public void test003(){

        PageLogin login = new PageLogin(driver);
        PageProduit product = new PageProduit(driver);
        PageYourCart cart = new PageYourCart(driver);
        PageCheckout checkout = new PageCheckout(driver);
        PageCheckoutOverview checkoutOverview = new PageCheckoutOverview(driver);
        PageCheckoutComplete checkoutComplete = new PageCheckoutComplete(driver);

        String valLogin = "standard_user";
        String valMdp = "secret_sauce";
        String valMsg = "PRODUCTS";

        login.saisirLogin(valLogin);
        login.saisirMdp(valMdp);
        login.clicBtnLogin();

        // product.VerifMessage(valMsg);

        product.ajoutPanier();

        product.clicCart();

        cart.compareTitleCart();

        cart.checkCartItems();
        cart.clickBtnCheckout();

        checkout.checkoutForm();
        checkout.compareTitleCheckout();
        checkout.clicBtnContinuer();

        checkoutOverview.compareTitleCheckoutOverview();
        checkoutOverview.verifTotalOrder();
        checkoutOverview.clickFinishBtn();

        checkoutComplete.compareTitleCheckoutComplete();
        checkoutComplete.compareThankyouMsg();





    }


}
