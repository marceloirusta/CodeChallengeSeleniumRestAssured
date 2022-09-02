package locators;

import org.openqa.selenium.By;

public enum IndexLocators {

    SECOND_ROW_IMAGE(By.xpath("//*[@id=\"homefeatured\"]/li[5]/div/div[1]/div"), "Second row item"),

    FIRST_IMAGE_HOMEPAGE(By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[1]/div"), "First item in homepage"),

    ADD_TO_CART(By.xpath("//a/span[text() = 'Add to cart']"), "Add to cart button"),

    PROCEED_TO_CHECKOUT(By.xpath("//a[@title='Proceed to checkout']"), "Proceed to checkout button");


    By locator;
    String description;
    IndexLocators(By locator, String description){
        this.locator = locator;
        this.description = description;
    }

    public By getLocator() {
        return locator;
    }
}
