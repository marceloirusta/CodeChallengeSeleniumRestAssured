package pages;

import control.Button;
import control.Text;
import control.TextBox;
import locators.SearchLocators;

public class SearchPage {

    public TextBox search;
    public Button searchButton;
    public Text noResults;
    public Text productCount;

    public SearchPage(){
        search = new TextBox(SearchLocators.SEARCH_TEXTBOX.getLocator());
        searchButton = new Button(SearchLocators.SEARCH_BUTTON.getLocator());
        noResults = new Text(SearchLocators.NO_RESULTS_ALERT.getLocator());
        productCount = new Text(SearchLocators.PRODUCT_COUNT.getLocator());

    }
}
