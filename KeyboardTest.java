package ru.stqa.pft.addressbook2;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class KeyboardTest {

    private static final Cookie GOOGLE_COOKIE = new Cookie(
            "GOOGLE_ABUSE_EXEMPTION",
            "ID=2b35cae900586901:TM=1595153781:C=r:IP=37.144.154.61-:S=APGng0vJQZRjGDMVnH20y5XM6FonvMxXCg"
    );
    public WebDriver driver;
    public String baseUrl;
    public boolean acceptNextAlert = true;
    public StringBuffer verificationErrors = new StringBuffer();

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "https://www.google.com/";
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @Test
    public void testKeyboard() throws Exception {
        driver.get("https://www.google.com/");
        driver.manage().addCookie(KeyboardTest.GOOGLE_COOKIE);
        driver.manage().addCookie(new Cookie("NID", "204=uc-OX37rdL_OKI2D5yNiV0rncaTizZShLGbfMnrjNmhjgBZ68JNJ6D6CAjwvIDiPO7Gi1-JYd7TGJf3H_81M9MAcixJeFtPy2hBVPqV7HhuBggogADtBXVErbXo6rElRHpB7ibz7hrKxyqDqMY_V4kZxsXsUw3L8FYTBLuonCPU"));
        driver.manage().addCookie(new Cookie("SNID", "APx-0P3lbduWJHyNqqVS5nFJxcF4kyRjdyF8BFpJmbxMx8t2IYP5CmYCwZAe6FJKquyElzXafqkJkEsqwvbVfA"));
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//form[@id='tsf']/div[2]/div/div/div/div[3]/div[2]/span")).click();
        driver.findElement(By.id("K70")).click();
        driver.findElement(By.xpath("//button[@id='K68']/span")).click();
        driver.findElement(By.xpath("//button[@id='K78']/span")).click();
        driver.findElement(By.id("K74")).click();
        driver.findElement(By.id("K86")).click();
        driver.findElement(By.xpath("//button[@id='K74']/span")).click();
        driver.findElement(By.xpath("//button[@id='K188']/span")).click();
        driver.findElement(By.xpath("//button[@id='K66']/span")).click();
        driver.findElement(By.id("K75")).click();
        driver.findElement(By.xpath("//button[@id='K66']/span")).click();
        driver.findElement(By.id("K32")).click();
        driver.findElement(By.id("K82")).click();
        driver.findElement(By.xpath("//button[@id='K70']/span")).click();
        driver.findElement(By.xpath("//button[@id='K72']/span")).click();
        driver.findElement(By.xpath("//button[@id='K78']/span")).click();
        driver.findElement(By.xpath("//button[@id='K66']/span")).click();
        driver.findElement(By.xpath("//button[@id='K89']/span")).click();
        driver.findElement(By.id("K82")).click();
        driver.findElement(By.xpath("//button[@id='K66']/span")).click();
        driver.findElement(By.name("btnK")).click();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    public boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}