package support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FIREFOX {
    public static WebDriver criarChrome() {
        String url = "https://www.techlistic.com/p/selenium-practice-form.html";
        System.setProperty("webdriver.chrome.driver", "/Applications/Google Chrome.app/Contents/MacOS/chromedriver");
        WebDriver firefox = new ChromeDriver();
        firefox.get(url);
        firefox.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        return firefox;
    }
}
