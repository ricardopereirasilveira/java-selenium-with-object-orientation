//Open this link - https://www.techlistic.com/p/selenium-practice-form.html
//Enter first and last name (textbox).
//Select gender (radio button).
//Select years of experience (radio button).
//Enter date.
//Select Profession (Checkbox).
//Select Automation tools you are familiar with (multiple checkboxes).
//Select Continent (Select box).
//Select multiple commands from a multi select box.
//If you can handle Upload image then try it or leave this step.
//Click on Download file link and handle the download file pop-up (leave it if you are beginner).
//Click on Submit button.

package Test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import support.Generator;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class automateDemoAboutTest {
    private WebDriver firefox;
    @Before
    public void setUp() {
        //Open this link - https://www.techlistic.com/p/selenium-practice-form.html
        String url = "https://www.techlistic.com/p/selenium-practice-form.html";
        System.setProperty("webdriver.chrome.driver", "/Applications/Google Chrome.app/Contents/MacOS/chromedriver");
        firefox = new ChromeDriver();
        firefox.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        firefox.get(url);
//        firefox.manage().window().maximize();

    }

    @Test
    public void testFormOptions () throws InterruptedException, AWTException {
        //Enter first and last name (textbox). - //div[@class='control-group'][2]//following-sibling::input (first name) - //div[@class='control-group'][3]//following-sibling::input (last name)
        firefox.findElement(By.xpath("//div[@class='control-group'][2]//following-sibling::input")).sendKeys("First");
        firefox.findElement(By.xpath("//div[@class='control-group'][3]//following-sibling::input")).sendKeys("Last");

        //Select gender (radio button). - //div[@class='control-group'][4]
        WebElement idSex = firefox.findElement(By.xpath("//div[@class='control-group'][4]"));
        idSex.findElement(By.id("sex-0")).click();

        //Select years of experience (radio button).
        WebElement idExperience = firefox.findElement(By.xpath("//div[@class='control-group'][5]"));
        idExperience.findElement(By.id("exp-3")).click();

        //Enter date.
        firefox.findElement(By.id("datepicker")).sendKeys(Generator.date());

        //Select Profession (Checkbox). - //div[@class='control-group'][6]
        WebElement idProfession = firefox.findElement(By.xpath("//div[@class='control-group'][6]"));
        idProfession.findElement(By.id("profession-0")).click();
        idProfession.findElement(By.id("profession-1")).click();

        //Select Automation tools you are familiar with (multiple checkboxes).
        WebElement automationTools = firefox.findElement(By.xpath("//div[@class='control-group'][7]"));
        automationTools.findElement(By.id("tool-0")).click();
        automationTools.findElement(By.id("tool-1")).click();
        automationTools.findElement(By.id("tool-2")).click();

        //Select Continent (Select box). - //div[@class='controls']//select[@class='input-xlarge']
        WebElement continents = firefox.findElement(By.xpath("//div[@class='controls']//select[@class='input-xlarge']"));
        new Select(continents).selectByVisibleText("South America");

        //Select multiple commands from a multi select box. - //div[@class='control-group'][9]//select[@class='input-xlarge']
        WebElement seleniumCommands = firefox.findElement(By.xpath("//div[@class='control-group'][9]//select[@class='input-xlarge']"));
       new Select(seleniumCommands).selectByVisibleText("Browser Commands");
       new Select(seleniumCommands).selectByVisibleText("Switch Commands");
       new Select(seleniumCommands).selectByVisibleText("WebElement Commands");
//        Thread.sleep(5000);

        //If you can handle Upload image then try it or leave this step. - .sendKeys("C:\\newhtml.html"); - //input[@id='photo']
            // /Volumes/HD/Java/webdriveJava/src/test/java/Test/screenshots/020420201515testAutomateAndValidatePage.png
        String caminhoFoto = "/Volumes/HD/Java/webdriveJava/src/test/java/Test/screenshots/020420201515testAutomateAndValidatePage.png";
        firefox.findElement(By.xpath("//input[@id='photo']")).sendKeys(caminhoFoto);

        //Click on Download file link and handle the download file pop-up (leave it if you are beginner).
        WebElement downloadFile = firefox.findElement(By.linkText("Click here to Download File"));
            // right-click on mouse
        Actions actions = new Actions(firefox);
        actions.contextClick(downloadFile).build().perform();
            // click on 'save this file...'
        actions.sendKeys(Keys.ARROW_DOWN);
        actions.sendKeys(Keys.ARROW_DOWN);
        actions.sendKeys(Keys.ARROW_DOWN);
        actions.sendKeys(Keys.ARROW_DOWN);
        actions.sendKeys(Keys.RETURN);

        //Click on Submit button.
        firefox.findElement(By.xpath("//button[@id='submit']")).click();
    }

    @After
    public void TearDown() {
        firefox.quit();
    }
}
