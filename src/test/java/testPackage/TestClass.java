package testPackage;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.URL;

public class TestClass {
    @Test
    public void a(){
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://duckduckgo.com/");
        Assert.assertEquals(driver.getTitle(),"Google");
        driver.close();


}
@Test
    public void c(){
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://duckduckgo.com/");
        driver.findElement(By.id("searchbox_input")).sendKeys("Selenium WebDriver", Keys.ENTER);
  driver.close();
}
}