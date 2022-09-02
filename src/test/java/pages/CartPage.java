package pages;

import control.Button;
import control.Text;
import locators.CartLocators;

public class CartPage {

    public Text oneProduct;
    public Button deleteProduct;
    public Text emptyCart;

    public CartPage(){
        oneProduct = new Text(CartLocators.NUMBER_OF_ITEMS.getLocator());
        deleteProduct = new Button(CartLocators.DELETE_BUTTON.getLocator());
        emptyCart = new Text(CartLocators.EMPTY_CART_ALERT.getLocator());
    }
}
