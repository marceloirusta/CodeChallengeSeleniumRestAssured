package control;

import browserManager.BrowserManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Control {

    private By locator;
    private WebElement myControl;

    public Control (By locator){
        this.locator = locator;
    }

    public WebElement getMyControl() {
        return myControl;
    }

    public By getLocator() {
        return locator;
    }

    public void Find() {
        WebDriverWait wait = new WebDriverWait(BrowserManager.getInstance().getSession(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(this.locator));
        myControl = BrowserManager.getInstance().getSession().findElement(this.locator);
    }

    public void click(){
        this.Find();
        myControl.click();
    }

    public void type(String value) {
        this.Find();
        myControl.sendKeys(value);
    }

    public void clear(){
        this.Find();
        myControl.clear();
    }

    public boolean isDisplayed() {
        try {
            this.Find();
            return myControl.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String getValue(){
        this.Find();
        return myControl.getText();
    }

    public String getValueAtribute(){
        this.Find();
        return myControl.getAttribute("value");
    }

   /** public void scrollUntilElement(){
        JavascriptExecutor js = (JavascriptExecutor) BrowserManager.getInstance().getSession();
        js.executeScript("arguments[0].scrollIntoView()", myControl);
    }**/

    public void hoverOver(){
        this.Find();
        Actions actions = new Actions(BrowserManager.getInstance().getSession());
        actions.moveToElement(myControl).perform();

    }
}
