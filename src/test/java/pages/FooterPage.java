package pages;

import control.Text;
import locators.FooterLocators;

public class FooterPage {

    public Text storeInformation;

    public FooterPage(){
        storeInformation = new Text(FooterLocators.STORE_INFORMATION.getLocator());
    }
}
