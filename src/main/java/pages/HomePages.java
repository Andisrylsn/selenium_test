package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WebDriverFactory;

public class HomePages {

    private WebDriver driver = WebDriverFactory.getDriver();
    private By button = By.name("btnK");

    private By search = By.name("q");

    public void verifyButton(){
        driver.findElement(button).isDisplayed();
    }

    public void sendKeysSearch(String string){
        driver.findElement(search).sendKeys(string);
    }

}