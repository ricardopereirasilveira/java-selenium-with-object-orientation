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
import org.openqa.selenium.WebDriver;
import pages.insertNameTest;
import pages.selectGender;
import pages.yearsOfExperience;
import support.FIREFOX;

public class automateDemoAboutPageObject {
    private WebDriver firefox;
    @Before
    public void setUp() {
        //Open this link - https://www.techlistic.com/p/selenium-practice-form.html
        firefox = FIREFOX.criarChrome();
    }

    @Test
    public void testName () throws InterruptedException {
        //Enter first and last name (textbox).
        new insertNameTest(firefox)
                .digitarNome("First")
                .digitarSobrenome("Last");

        //Select gender (radio button).
        new selectGender(firefox)
                .selecioneSexo();

        //Select years of experience (radio button).
        new yearsOfExperience(firefox)
                .selectYears();

    }

    @After
    public void TearDown() {
        firefox.quit();
    }
}
