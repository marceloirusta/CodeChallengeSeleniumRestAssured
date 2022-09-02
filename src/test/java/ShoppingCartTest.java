import browserManager.BrowserManager;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.FooterPage;
import pages.IndexPage;
import pages.SearchPage;

import java.time.Duration;

public class ShoppingCartTest extends TestBase{

    IndexPage indexPage = new IndexPage();
    CartPage cartPage = new CartPage();
    SearchPage searchPage = new SearchPage();
    FooterPage footerPage = new FooterPage();

    @Test
    public void shoppingCartTest() throws InterruptedException {
        System.out.println("--- Shopping cart test ---");

        System.out.println("--- Step 1: Select the first item in homepage ---");
        System.out.println("... Scrollling down through the page ...");
        JavascriptExecutor js = (JavascriptExecutor) BrowserManager.getInstance().getSession();
        js.executeScript("window.scrollBy(0, 500)", "");
        System.out.println("... Adding the item to cart ...");
        indexPage.firstImage.hoverOver();
        indexPage.addToCart.click();
        System.out.println("... Clicking on proceed to checkout button to check the cart ...");
        indexPage.proceedToCheckout.click();
        Assert.assertTrue(cartPage.oneProduct.isDisplayed(),"Item was not added to the cart");

        System.out.println("--- Step 2: Removing item from shopping cart ---");
        System.out.println("... Clicking on delete item button ...");
        cartPage.deleteProduct.click();
        Assert.assertTrue(cartPage.emptyCart.isDisplayed(), "Cart is not empty");

        System.out.println("--- Step 3: Doing a search with invalid characters ---");
        System.out.println("... Typing @@ on search bar ...");
        searchPage.search.type("@@");
        searchPage.searchButton.click();
        Assert.assertTrue(searchPage.noResults.isDisplayed(), "");

        System.out.println("---Step 4: Doing a valid search ---");
        System.out.println("... Typing 'dress' on search bar ...");
        searchPage.search.clear();
        searchPage.search.type("dress");
        searchPage.searchButton.click();
        Assert.assertTrue(searchPage.productCount.isDisplayed(), "Search not showing any results");

        System.out.println("--- Step 5: Validating store information ---");
        System.out.println("... Scrolling down to bottom ...");
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        Assert.assertTrue(footerPage.storeInformation.isDisplayed(), "Store information is not being displayed");
    }
}
