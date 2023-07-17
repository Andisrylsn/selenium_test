package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePages;

public class SearchGoogleSteps {
    WebDriver driver;
    HomePages homePages = new HomePages();

    @Given("I Open browser")
    public void iOpenBrowser() throws InterruptedException {
        String dir = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", dir  + "/driver/chromedriver.exe");
        driver = new ChromeDriver();
        Thread.sleep(1000);
    }


    @And("Open website Google")
    public void openWebsiteGoogle() throws InterruptedException {
        driver.get("https://www.google.co.id/");
        Thread.sleep(1000);
    }

    @And("Located on google website")
    public void locatedOnGoogleWebsite() {
        homePages.verifyButton();
    }

    @When("I search {string}")
    public void iSearch(String searchValue) {
        homePages.sendKeysSearch(searchValue);
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }

    @Then("Showing result related with {string}")
    public void showingResultRelatedWith(String result) {
        driver.findElement(By.xpath("//a[@href='https://id.linkedin.com/in/wisnuwm']")).isDisplayed();
        String urlLinkedinWisnu = driver.findElement(By.xpath("//a[@href='https://id.linkedin.com/in/wisnuwm']")).getText();
        System.out.println(urlLinkedinWisnu);
        driver.close();
        driver.quit();
    }

}
