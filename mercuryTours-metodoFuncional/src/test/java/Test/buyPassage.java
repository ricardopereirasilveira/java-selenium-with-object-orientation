package Test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.doLogin;
import support.randomString;

public class buyPassage {
    private WebDriver googleChrome;
    @Before
    public void setUp() {
        googleChrome = support.GC.abrirBrowser();
    }

    @Test
    public void comprarPassagemAereaTest(){
        new doLogin(googleChrome)
                .typeLogin("Mercury", "mercury")
                .flightFinder()
                .flightsToReturn()
                .clickContinue("Teste", "Nextel", "118989038904")
                .flightNumberConfirmation("/Volumes/HD/Java/mercuryTours/src/test/java/Test/screenshot/" + randomString.dataHora() + "flightNumberConfirmation.png");
    }

    @After
    public void tearDown(){
        googleChrome.quit();
    }

}
