package testsuite;
/**
 * 5. Write down the following test into ‘RegisterTest’
 * class
 * 1. userShouldNavigateToRegisterPageSuccessful
 *  ly
 * * click on the ‘Register’ link
 * * Verify the text ‘Register’
 * 2. userSholdRegisterAccountSuccessfully *
 * click on the ‘Register’ link
 * * Select gender radio button
 * * Enter First name
 * * Enter Last name
 * * Select Day Month and Year
 * * Enter Email address
 * * Enter Password
 * * Enter Confirm password
 * * Click on REGISTER button
 * * Verify the text 'Your registration
 * completed’ 
 */

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;


import java.time.Duration;


public class RegisterTest extends BaseTest {
    @Before
    public void browserSetup() {
        openBrowser("https://demo.nopcommerce.com/");
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        // click on the ‘Register’ link
        driver.findElement(By.linkText("Register")).click();
        // Verify the text ‘Register’
        String expectedHeading = "Register";
        String actualHeading = driver.findElement(By.xpath("//h1[text()='Register']")).getText();
        Assert.assertEquals("Heading requirements didn't match.", expectedHeading, actualHeading);
    }

    @Test
    public void userSholdRegisterAccountSuccessfully() {
        // click on the ‘Register’ link
        driver.findElement(By.linkText("Register")).click();
        // Select gender radio button
        driver.findElement(By.xpath("//input[@id='gender-male']")).click();
        // Enter First name
        driver.findElement(By.id("FirstName")).sendKeys("Gaurav");
        // Enter Last name
        driver.findElement(By.id("LastName")).sendKeys("Patel");
        // Select Day Month and Year
        driver.findElement(By.name("DateOfBirthDay")).sendKeys("10");
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("September");
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("1990");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // Enter Email address
        driver.findElement(By.id("Email")).sendKeys("gauravkothadia3@gmail.com");
        // Enter Password
        driver.findElement(By.id("Password")).sendKeys("Gauravkothadia3");
        // Enter Confirm password
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Gauravkothadia3");
        // Click on REGISTER button
        driver.findElement(By.id("register-button")).click();
        // Verify the text 'Your registration completed’
        String expectedMessage = "Your registration completed";
        String actualMessage = driver.findElement(By.className("result")).getText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
