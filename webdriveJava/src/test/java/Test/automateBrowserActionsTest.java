//1. Open this link - https://www.techlistic.com/
//2. Launch Firefox browser. (You can choose browser of your choice).
//3. Maximize or set size of browser window.
//4. Get Title of page and validate it with expected value.
//5. Get URL of current page and validate it with expected value.
//6. Get Page source of web page.
//7. And Validate that page title is present in page source.
//8. Close browser.

package Test;

import org.apache.poi.util.SystemOutLogger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import support.Generator;
import support.screenshot;


public class automateBrowserActionsTest {
    private WebDriver firefox;
    @Before
    public void setUp() {
        //1. Open this link - https://www.techlistic.com/
        //2. Launch Firefox browser. (You can choose browser of your choice).
        System.setProperty("webdriver.chrome.driver", "/Applications/Google Chrome.app/Contents/MacOS/chromedriver");
        firefox = new ChromeDriver();
        String url = "https://www.techlistic.com/";
        firefox.get(url);
    }

    @Test
    public void testLauchBrowserAndInteraction () {
        //3. Maximize or set size of browser window.
        firefox.manage().window().maximize();

        //4. Get Title of page and validate it with expected value.
        String title = firefox.getTitle();
        Assert.assertEquals(title, "Techlistic");

        //5. Get URL of current page and validate it with expected value.
        String url = firefox.getCurrentUrl();
        Assert.assertEquals(url, "https://www.techlistic.com/");

        //6. Get Page source of web page.
        String pageSource = firefox.getPageSource();

        //7. And Validate that page title is present in page source;
        if (pageSource.contains(title)) {
            screenshot.tirarScreenshot(firefox, "/Volumes/HD/Java/webdriveJava/src/test/java/Test/screenshots" + Generator.dHmS() + "PASS_" + "testLauchBrowserAndInteraction.png");
        }
        else {
            System.out.print("NOK");
        }


    }

    @After
    public void tearDown() {
        //8. Close browser.
        firefox.quit();
    }
}
