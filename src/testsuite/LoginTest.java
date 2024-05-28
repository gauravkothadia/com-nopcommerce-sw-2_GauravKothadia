package testsuite;
/**
 * 3. Write down the following test into ‘LoginTest’ class
 * 1. userShouldNavigateToLoginPageSuccessfully *
 * click on the ‘Login’ link
 * * Verify the text ‘Welcome, Please Sign
 * In!’
 * 2. userShouldLoginSuccessfullyWithValidCredentials
 * * click on the ‘Login’ link
 * * Enter valid username
 * * Enter valid password
 * * Click on ‘LOGIN’ button
 * * Verify the ‘Log out’ text is display
 * 3. verifyTheErrorMessage
 * * click on the ‘Login’ link
 * * Enter invalid username
 * * Enter invalid password
 * * Click on Login button
 * * Verify the error message ‘Login was unsuccessful.
 * Please correct the errors and try again. No customer account found’
 */

import browserfactory.BaseTest;
import com.google.common.base.Verify;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {

    String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
            "No customer account found";


    @Before
    public void browserSetup() {
        openBrowser("https://demo.nopcommerce.com/");
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        // clicking on the login link
        driver.findElement(By.linkText("Log in")).click();

        // Verifying the Login page header message
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = driver.findElement(By.xpath("//h1[text()='Welcome, Please Sign In!']")).getText();
        Assert.assertEquals("Welcome message doesn't match requirement.", expectedMessage, actualMessage);
    }

   @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {

        // clicking on the login link
        driver.findElement(By.linkText("Log in")).click();
        //Enter valid username
        driver.findElement(By.id("Email")).sendKeys("gauravkothadia3@gmail.com");
        //Enter valid password
        driver.findElement(By.id("Password")).sendKeys("Gauravkothadia3");

        //Click on ‘LOGIN’ button
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        // Verify the ‘Log out’ text is display
        String expectedLink = "Log out";
        String actualLink = driver.findElement(By.linkText("Log out")).getText();
        Assert.assertEquals("Log out link not found.", expectedLink, actualLink);
       driver.findElement(By.linkText("Log out")).click();
    }

    @Test
    public void verifyErrorMessage() {
        // clicking on the login link
        driver.findElement(By.linkText("Log in")).click();
        // Enter invalid username
        driver.findElement(By.id("Email")).sendKeys("gauravkothadia3@gmail.com");
        // Enter invalid password
        driver.findElement(By.id("Password")).sendKeys("Invalidgauravk1");
        // Click on Login button
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        // Verify the error message ‘Login was unsuccessful.
        // Please correct the errors and try again. No customer account found’
        String actualErrorMessage = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);

    }

    @After
    public void tearDown() {
      closeBrowser();
    }
}