//1. Open link http://automationpractice.com/index.php
//2. Click on sign in link.
//3. Enter your email address in 'Create and account' section.
//4. Click on Create an Account button.
//5. Enter your Personal Information, Address and Contact info.
//6. Click on Register button.
//7. Validate that user is created.
//If you find it difficult to automate above steps, then follow the reference link.

package Test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class automateUserRegistrationTest {
    private WebDriver firefox;
    @Before
    public void setUp() {
        //1. Open link http://automationpractice.com/index.php
        String url = "http://automationpractice.com/index.php";
        System.setProperty("webdriver.chrome.driver", "/Applications/Google Chrome.app/Contents/MacOS/chromedriver");
        firefox = new ChromeDriver();
        firefox.get(url);
        firefox.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void testUserRegistrationEcommerce() throws InterruptedException {
        //2. Click on sign in link.
        firefox.findElement(By.className("header_user_info")).click();

        //3. Enter your email address in 'Create and account' section.
        firefox.findElement(By.xpath("//input[@id='email_create']")).sendKeys("asdfassdf@asdfasd.com.br");

        //4. Click on Create an Account button.
        firefox.findElement(By.id("SubmitCreate")).click();

        //5. Enter your Personal Information, Address and Contact info.
//        String authenticator = firefox.findElement(By.xpath("//span[@class='navigation_page']")).getText();
//        Assert.assertSame("Authentication", authenticator);
            //Selecionar genero;
        firefox.findElement(By.id("id_gender1")).click();
            // Selecionar nome & sobrenome;
        String firstName = "First";
        String lastName = "Last";
        firefox.findElement(By.id("customer_firstname")).sendKeys(firstName);
        firefox.findElement(By.id("customer_lastname")).sendKeys(lastName);
            // selecionar password;
        String password = "password";
        firefox.findElement(By.id("passwd")).sendKeys(password);
            // selecionar dia, mês e ano;
        WebElement dia = firefox.findElement(By.id("days"));
        new Select(dia).selectByValue("25");
        WebElement mes = firefox.findElement(By.id("months"));
        new Select(mes).selectByValue("3");
        WebElement ano = firefox.findElement(By.id("years"));
        new Select(ano).selectByValue("1988");
            // selecionar receber Newsletter
        firefox.findElement(By.id("newsletter")).click();
            //selecionar receber ofertas especiais;
        firefox.findElement(By.id("optin")).click();

            //your address - //label[@for='firstname']//following-sibling::input
        firefox.findElement(By.xpath("//label[@for='firstname']//following-sibling::input ")).sendKeys(firstName);
        firefox.findElement(By.xpath("//label[@for='lastname']//following-sibling::input")).sendKeys(lastName);
        firefox.findElement(By.id("company")).sendKeys("Company Name SA");
        firefox.findElement(By.id("address1")).sendKeys("Address First Line Information");
        firefox.findElement(By.id("address2")).sendKeys("Address 2nd Line Information");
        firefox.findElement(By.id("city")).sendKeys("New York City");
        WebElement state = firefox.findElement(By.id("id_state"));
        new Select(state).selectByValue("32");
        firefox.findElement(By.id("postcode")).sendKeys("01362");
        firefox.findElement(By.id("phone")).sendKeys("+1123456789");
        firefox.findElement(By.id("phone_mobile")).sendKeys("+10987654321");
        firefox.findElement(By.id("alias")).click();
        firefox.findElement(By.id("alias")).clear();
        firefox.findElement(By.id("alias")).sendKeys("my home address");

        //6. Click on Register button.
        firefox.findElement(By.xpath("//button[@id='submitAccount']")).click();
//        Thread.sleep(10000);

        //7. Validate that user is created.
        String title = firefox.getTitle();
        String currentURL = firefox.getCurrentUrl();
        Assert.assertEquals("My account - My Store", title);
        Assert.assertEquals("http://automationpractice.com/index.php?controller=my-account", currentURL);

    }

    @After
    public void tearDown(){
        firefox.quit();
    }
}
