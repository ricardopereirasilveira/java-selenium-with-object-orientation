package Test;

import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class informacoesUsuarioTest {
    @Test
    public void testAdicionarUmaInformacacaoAdicionalDoUsuario () {
        System.setProperty("webdriver.chrome.driver", "/Applications/Google Chrome.app/Contents/MacOS/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // ABRINDO O NAVEGADOR E ACESSANDO A URL INDICADA!
        driver.get("http://www.juliodelima.com.br/taskit");

        // CLICAR NO LINK QUE POSSUI O TEXTO "Sign in"
        driver.findElement(By.linkText("Sign in")).click();

        // IDENTIFICAR O FORMULÁRIO DE LOGIN
        WebElement form = driver.findElement(By.id("signinbox"));

        // DIGITAR NO CAMPO COM NOME "login" QUE ESTA DENTRO DO FORMULÁRIO DE ID "signinbox" O TEXTO "julio0001"
        form.findElement(By.name("login")).sendKeys("julio0001");

        // DIGITAR NO CAMPO COM NOME "password" QUE ESTA DENTRO DO FORMULÁRIO DE ID "signinbox" O TEXTO "12345"
        form.findElement(By.name("password")).sendKeys("123456");

        // CLICAR NO LINK COM O TEXTO "SIGN IN"
        form.findElement(By.linkText("SIGN IN")).click();

        // VALIDAR O TEXTO DENTRO DA TAG "me" COM O TEXTO "Hi, Julio"
        WebElement me = driver.findElement(By.className("me"));
        String meText = me.getText();
        assertEquals("Hi, Julio", meText);

        // FECHANDO O BROWSER E A SESSÃO
        driver.close();
        driver.quit();

    }
}
