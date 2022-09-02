package locators;

import org.openqa.selenium.By;

public enum SearchLocators {

    SEARCH_TEXTBOX(By.id("search_query_top"), "Search text box input"),

    SEARCH_BUTTON(By.xpath("//*[@id=\"searchbox\"]/button"), "Search button submit"),

    NO_RESULTS_ALERT(By.xpath("//p[@class= 'alert alert-warning' and contains(text(), '@@')]"), "No results alert"),

    PRODUCT_COUNT(By.xpath("//div[@class='product-count']"), "Product count in search results");


    By locator;
    String description;
    SearchLocators(By locator, String description){
        this.locator = locator;
        this.description = description;
    }

    public By getLocator() {
        return locator;
    }
}
