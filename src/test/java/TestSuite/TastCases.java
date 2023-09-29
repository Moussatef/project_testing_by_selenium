
package TestSuite;

import Configuration.SetupTeardown;
import Pages.Home;
import Pages.Shop;
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
}
