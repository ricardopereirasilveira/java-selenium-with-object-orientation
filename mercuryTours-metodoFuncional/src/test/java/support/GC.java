package support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GC {
    public static WebDriver abrirBrowser() {
        String url = "http://www.newtours.demoaut.com/";
        System.setProperty("webdriver.chrome.driver", "/Applications/Google Chrome.app/Contents/MacOS/chromedriver");
        WebDriver googleChrome = new ChromeDriver();
        googleChrome.get(url);
        googleChrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        return googleChrome;
    }
}
