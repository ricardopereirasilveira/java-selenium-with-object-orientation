//1. Open this link  https://www.techlistic.com/
//2. Launch Firefox browser. (You can choose browser of your choice).
//3. Maximize or set size of browser window.
//4. Click on 'Java Tutorial' link and validate page title.
//5. Navigate back to Home Page.
//6. Click on 'Selenium Tutorial' link and validate page title.
//7. Navigate back to Home Page.
//8. Click on 'Selenium Blogs' link and validate page title.
//9. Navigate back to Home Page.
//10. Click on 'TestNG Blogs' link and validate page title.
//11. Close the browser.


package Test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import support.Generator;
import support.screenshot;

public class automateMenuLinkTest {
    private WebDriver firefox;
    @Before
    public void setUp() {
        //1. Open this link  https://www.techlistic.com/
        //2. Launch Firefox browser. (You can choose browser of your choice).
        String url = "https://www.techlistic.com/";
        System.setProperty("webdriver.chrome.driver", "/Applications/Google Chrome.app/Contents/MacOS/chromedriver");
        firefox = new ChromeDriver();
        firefox.get(url);
    }

    @Test
    public void testAutomateAndValidatePage () {
        //3. Maximize or set size of browser window.
        firefox.manage().window().maximize();

        //4. Click on 'Java Tutorial' link and validate page title.
        firefox.findElement(By.xpath("//nav[@role='navigation']//ul[@class='tabs']//li[3]")).click();
        String pageTituloJava = firefox.getTitle();
        Assert.assertEquals(pageTituloJava, "Java Tutorials Series - Java For Selenium");

        //5. Navigate back to Home Page.
        firefox.findElement(By.xpath("//div[@id='header']//h1")).click();

        //6. Click on 'Selenium Tutorial' link and validate page title.
        firefox.findElement(By.xpath("//nav[@role='navigation']//ul[@class='tabs']//li[2]")).click();
        String pageTituloSelenium = firefox.getTitle();
        Assert.assertEquals(pageTituloSelenium, "Selenium Tutorial - Learn Selenium from Comprehensive Series of 40 Coding Tutorials");

        //7. Navigate back to Home Page.
        firefox.findElement(By.xpath("//div[@id='header']//h1")).click();

        //8. Click on 'Selenium Blogs' link and validate page title.
        firefox.findElement(By.xpath("//nav[@role='navigation']//div[@class='overflow-button']")).click();
        firefox.findElement(By.xpath("//div[@class='overflow-popup']//div[@class='container']/ul/li[14]")).click();
        String pageTituloBlogs = firefox.getTitle();
        Assert.assertEquals(pageTituloBlogs, "Top Selenium Blogs");
        screenshot.tirarScreenshot(firefox, "/Volumes/HD/Java/webdriveJava/src/test/java/Test/screenshots/" + Generator.dHmS() + "testAutomateAndValidatePage.png");
    }

    @After
    public void tearDown() {
        firefox.quit();
    }
}
