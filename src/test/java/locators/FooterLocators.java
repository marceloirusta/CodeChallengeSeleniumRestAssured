package locators;

import org.openqa.selenium.By;

public enum FooterLocators {

    STORE_INFORMATION(By.xpath("//section[@id='block_contact_infos']//ul[@class='toggle-footer']/li[1]"), "Store information at the page footer");


    By locator;
    String description;
    FooterLocators(By locator, String description){
        this.locator = locator;
        this.description = description;
    }

    public By getLocator() {
        return locator;
    }
}
