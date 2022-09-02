package locators;

import org.openqa.selenium.By;

public enum CartLocators {

    NUMBER_OF_ITEMS(By.xpath("//span[@id='summary_products_quantity' and text() = '1 Product']"), "Number of items in the cart"),

    DELETE_BUTTON(By.xpath("//a[@title = 'Delete']"), "Delete button in shopping cart"),

    EMPTY_CART_ALERT(By.xpath("//p[text() = 'Your shopping cart is empty.']"), "Empty shopping cart alert");


    By locator;
    String description;
    CartLocators(By locator, String description){
        this.locator = locator;
        this.description = description;
    }

    public By getLocator() {
        return locator;
    }
}
