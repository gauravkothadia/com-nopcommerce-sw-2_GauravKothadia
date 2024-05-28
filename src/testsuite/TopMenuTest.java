package testsuite;
/**
 * 4. Write down the following test into ‘TopMenuTest’
 * class
 * 1. userShouldNavigateToComputerPageSuccessfully
 * * click on the ‘Computers’ Tab
 * * Verify the text ‘Computers’
 * 2. userShouldNavigateToElectronicsPageSuccessfully
 * * click on the ‘Electronics’ Tab
 * * Verify the text ‘Electronics’
 * 3. userShouldNavigateToApparelPageSuccessfully
 * * click on the ‘Apparel’ Tab
 * * Verify the text ‘Apparel’ 4.
 * userShouldNavigateToDigitalDownloadsPageSuccessfully
 * * click on the ‘Digital downloads’ Tab
 * * Verify the text ‘Digital downloads’
 * 5. userShouldNavigateToBooksPageSuccessfully
 * * click on the ‘Books’ Tab
 * * Verify the text ‘Books’
 * 6. userShouldNavigateToJewelryPageSuccessfully
 * * click on the ‘Jewelry’ Tab
 * * Verify the text ‘Jewelry’
 * 7. userShouldNavigateToGiftCardsPageSuccessfully
 * * click on the ‘Gift Cards’ Tab
 * * Verify the text ‘Gift Cards’
 */

import browserfactory.BaseTest;
import com.google.common.base.Verify;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TopMenuTest extends BaseTest {

    @Before
    public void browserSetup(){
        openBrowser("https://demo.nopcommerce.com/");
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){
        // click on the ‘Computers’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Computers ']")).click();
        // Verify the text ‘Computers’
        String expectedHeading = "Computers";
        String actualHeading = driver.findElement(By.xpath("//div[@class='page-title']//h1")).getText();
        Assert.assertEquals(expectedHeading,actualHeading);
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        // click on the ‘Electronics’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Electronics ']")).click();
        // Verify the text ‘Electronics’
        String expectedHeading = "Electronics";
        String actualHeading = driver.findElement(By.xpath("//div[@class='page-title']//h1")).getText();
        Assert.assertEquals(expectedHeading,actualHeading);
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){
        // click on the ‘Apparel’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Apparel ']")).click();
        // Verify the text ‘Apparel’
        String expectedHeading = "Apparel";
        String actualHeading = driver.findElement(By.xpath("//div[@class='page-title']//h1")).getText();
        Assert.assertEquals(expectedHeading,actualHeading);
    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){
        // click on the ‘Digital downloads’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Digital downloads ']")).click();
        // Verify the text ‘Digital downloads’
        String expectedHeading = "Digital downloads";
        String actualHeading = driver.findElement(By.xpath("//div[@class='page-title']//h1")).getText();
        Assert.assertEquals(expectedHeading,actualHeading);
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        // click on the ‘Books’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Books ']")).click();
        // Verify the text ‘Books’
        String expectedHeading = "Books";
        String actualHeading = driver.findElement(By.xpath("//div[@class='page-title']//h1")).getText();
        Assert.assertEquals(expectedHeading,actualHeading);
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        // click on the ‘Jewelry’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Jewelry ']")).click();
        // Verify the text ‘Jewelry’
        String expectedHeading = "Jewelry";
        String actualHeading = driver.findElement(By.xpath("//div[@class='page-title']//h1")).getText();
        Assert.assertEquals(expectedHeading,actualHeading);
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){
        // click on the ‘Gift Cards’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Gift Cards ']")).click();
        // Verify the text ‘Gift Cards’
        String expectedHeading = "Gift Cards";
        String actualHeading = driver.findElement(By.xpath("//div[@class='page-title']//h1")).getText();
        Assert.assertEquals(expectedHeading,actualHeading);
    }

    @After
    public void tearDown(){
        closeBrowser();
    }
}
