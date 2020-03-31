package Test;

import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class informacoesUsuarioTest {
    @Test
    public void testAdicionarUmaInformacacaoAdicionalDoUsuario () {
        System.setProperty("webdriver.chrome.driver", "/Applications/Google Chrome.app/Contents/MacOS/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.juliodelima.com.br/taskit");
//        assertEquals(1,1);
    }
}
