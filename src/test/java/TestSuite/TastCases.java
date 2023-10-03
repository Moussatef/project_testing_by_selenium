
package TestSuite;

import Configuration.SetupTeardown;
import Pages.Home;
import Pages.MyAccount;
import Pages.Shop;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TastCases extends SetupTeardown {

    @Test
    public void Register(){
        Home homePage = new Home(driver);
        homePage.clickMyAccount();
        MyAccount myAccount = new MyAccount(driver);
        String email="hajartaouilKKf@gmail.com";
        String password="Test1234567890!@Capgemini";
        myAccount.fillInRegisterEmail(email);
        myAccount.fillInRegisterPassword(password);
        myAccount.clickRegister();
        Assert.assertTrue(myAccount.verifyMessageIsDisplayed());
        System.out.println(myAccount.verifyMessageIsDisplayed());
        System.out.println("finished");
    }
    @Test
    public void Login(){
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
    public void addProductToBuy() throws InterruptedException {
        Home home = new Home(driver);
        home.clickShopButton();
        Shop shop = new Shop(driver);
        shop.clickAddToBasketButton();
        home.clickStartShopping();
        //User Story 4
        shop.clickRemoveProductButton();

    }
}
