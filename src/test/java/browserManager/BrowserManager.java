package browserManager;

import factoryBrowser.FactoryBrowser;
import org.openqa.selenium.WebDriver;

public class BrowserManager {

    private static BrowserManager ourInstance = null;
    private WebDriver session;

    public static BrowserManager getInstance(){
        if(ourInstance ==  null){
            ourInstance =new BrowserManager();
        }

        return ourInstance;

    }

    private BrowserManager(){
        session = FactoryBrowser.make("chrome").create();

    }

    public WebDriver getSession(){
        return session;
    }
}
