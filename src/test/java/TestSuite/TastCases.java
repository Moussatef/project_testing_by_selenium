
package TestSuite;

import Configuration.SetupTeardown;
import Pages.Home;
import org.testng.annotations.Test;

public class TastCases extends SetupTeardown {



    @Test
    public void userStory2() throws InterruptedException {
        Home home = new Home(driver);
        String emailtest ="test@gmail.com";
        String cardnumberTest="4242424242424242";
        String dateTest= "1924";
        String codetest = "199";
        String productname="Gary Bio Sandalwood SPF-50";
        //Assert.assertTrue(home.verifyTitleMoisturizers());
        home.clickMyAccount();

       /* Sunscreens sunscreen = new Sunscreens(driver);
        String productName = sunscreen.getItemName(productname);
        String productPrice = sunscreen.getPrice(productname);
        System.out.println(productName);
        System.out.println(productPrice);
        sunscreen.clickAddSunscreens(productname);
        //sunscreen.SelectSunscreen();

        sunscreen.ClickOnCart();
        Cart cart = new Cart(driver);
        cart.clickPaySuncreen();
        cart.remplirformulaire(emailtest,cardnumberTest,dateTest,codetest);
        //cart.remplirformulaire("",cardnumberTest,"","");
        //cart.remplirformulaire("", "23","","");
        //cart.remplirformulaire("", "4242","","199");
        //cart.JSExecuter("test@gmail.com", "4242 4242 4242 4242","4242","199");
        cart.ClickPassToPayment();
        wait(2000);*/


    }
}
