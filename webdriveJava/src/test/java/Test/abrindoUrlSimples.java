package Test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class abrindoUrlSimples {
    @Test
    public void abrindoUrlBasica () {
        System.setProperty("webdriver.chrome.driver", "/Applications/Google Chrome.app/Contents/MacOS/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com.br/");
    }
}
