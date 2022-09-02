package pages;

import control.Button;
import control.Link;
import locators.IndexLocators;

public class IndexPage {
    public Link firstImage;
    public Link imageSecondRow;
    public Button addToCart;
    public Button proceedToCheckout;

    public IndexPage(){
        firstImage = new Link(IndexLocators.FIRST_IMAGE_HOMEPAGE.getLocator());
        imageSecondRow = new Link(IndexLocators.SECOND_ROW_IMAGE.getLocator());
        addToCart = new Button(IndexLocators.ADD_TO_CART.getLocator());
        proceedToCheckout = new Button(IndexLocators.PROCEED_TO_CHECKOUT.getLocator());
    }

}
