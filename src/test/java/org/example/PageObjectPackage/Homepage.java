package org.example.PageObjectPackage;

import gherkin.lexer.Th;
import org.apache.commons.io.FileUtils;
import org.example.BaseClassPackage.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Homepage extends DriverFactory {
@FindBy(xpath = "//ul[@id='top-menu']//li[@class='menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children menu-item-228205']")
    WebElement YourIndustry;
@FindBy(xpath = "//*[@id=\"top-menu\"]/li[3]/ul/li[5]")
    WebElement retail;
@FindBy(xpath = "//*[@id=\"post-226525\"]/div/div/div/div[1]/div/div/div[1]/div/h5")
    WebElement retailTitle;
public void retailMethod() throws InterruptedException {
    Actions actions = new Actions(driver);
    actions.moveToElement(YourIndustry).perform();
    Thread.sleep(1000);
    actions.moveToElement(retail).click().perform();
}
public void assertionMethod(){
    String actual = retailTitle.getText();
    Assert.assertThat(actual,Matchers.containsString("Retail"));
}
public void scrollMethod() throws InterruptedException {
    Thread.sleep(1000);
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,1400);");
}
public void screenshotMethod() throws IOException {
    TakesScreenshot screenshot = ((TakesScreenshot) driver);
    File sourcefile = screenshot.getScreenshotAs(OutputType.FILE);
    File destinationfile = new File("C:\\BJSS.png");
    FileUtils.copyFile(sourcefile,destinationfile);
}

}
