package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.URL;

public class TestClass {
    @Test
    public void test(){
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://duckduckgo.com/");
        Assert.assertEquals(driver.getTitle(),"Google");
        driver.close();


}}