
package TestSuite;

import Configuration.SetupTeardown;
import Pages.Home;
import Pages.MyAccount;
import Pages.Shop;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TastCases extends SetupTeardown {



    @Test
    public void addProductToBuy() throws InterruptedException {
        Home home = new Home(driver);

        home.closeAddPopup();
        home.clickShopButton();

        Shop shop = new Shop(driver);

        shop.clickAddToBasketButton();

        home.clickStartShopping();

        shop.clickRemoveProductButton();

    }

    @Test
    public void signin(){
        Home home = new Home(driver);
        home.clickMyAccount();
        MyAccount myAccount = new MyAccount(driver);
        String username="mzili.elmehdi";
        String password="Hola123456?";
        myAccount.fillInLoginUserName(username);
        myAccount.fillInLoginPassword(password);
        myAccount.clickLogin();
    }

    @Test
    public void Login(){
        Home homePage = new Home(driver);
        homePage.clickMyAccount();
        MyAccount myAccountPage = new MyAccount(driver);
        String email="hajartaouilKnKnjfW@gmail.com";
        String password="Test1234567890!";
        myAccountPage.fillInRegisterEmail(email);
        myAccountPage.fillInRegisterPassword(password);
        myAccountPage.clickRegister();
        Assert.assertTrue(myAccountPage.verifyMessageIsDisplayed());
        System.out.println(myAccountPage.verifyMessageIsDisplayed());
        System.out.println("finished");
    }
}
