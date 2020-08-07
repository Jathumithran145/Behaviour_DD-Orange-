package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;

public class LoginstepDefination {
    WebDriver driver;

    @Given("^user is already on Login Page$")
    public void user_already_on_login_page(){
        System.setProperty("webdriver.chrome.driver", "src"+ File.separator+"resources"+File.separator+"drivers"+File.separator + "chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
//        driver.findElement(By.name("txtUsername")).sendKeys("Admin ");
//        driver.findElement(By.name("txtPassword")).sendKeys("admin123");
    }
   // @When("^user enters \"(.*)\" and \"(.*)\"$")
   @When("^user enters username and password$")
    public void user_enters_username_and_password(){
        driver.findElement(By.name("txtUsername")).sendKeys("Admin ");
        driver.findElement(By.name("txtPassword")).sendKeys("admin123");
    }
    @Then("^user clicks on login button$")
    public void user_clicks_on_login_button() {
        WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"btnLogin\"]"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", loginBtn);
    }
    @Then("^user clicks and create User$")
    public void user_clicks_and_create_User() {
        WebElement ClAdmin = driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", ClAdmin);
    }

    @Then("^user clicks User$")
    public void user_clicks_User() {
        WebElement ClUser = driver.findElement(By.id("menu_admin_viewSystemUsers"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", ClUser);
    }


    @Then("^user clicks and create UserName and details$")
    public void user_clicks_and_create_UserName_and_details() {
        WebElement ClAdd = driver.findElement(By.id("btnAdd"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", ClAdd);
//        System.setProperty("webdriver.chrome.driver", "src"+ File.separator+"resources"+File.separator+"drivers"+File.separator + "chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/saveSystemUser");
    }

    @Then("^user add details$")
    public void user_add_details() {
        driver.findElement(By.name("systemUser[employeeName][empName]")).sendKeys("JathuMithran ");
        driver.findElement(By.name("systemUser[userName]")).sendKeys("Jathu");
        driver.findElement(By.name("systemUser[password]")).sendKeys("admin123 ");
        driver.findElement(By.name("systemUser[confirmPassword]")).sendKeys("admin123");
        WebElement SaveBTN = driver.findElement(By.xpath("//*[@id=\"btnSave\"]"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", SaveBTN);
    }
    @Then("^Close the browser$")
    public void close_the_browser(){
        driver.quit();
    }


}
