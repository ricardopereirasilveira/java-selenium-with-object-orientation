package pages;

import org.hamcrest.core.StringContains;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.randomString;
import support.screenshot;

public class flightConfirmation extends paginaBase {
    public flightConfirmation(WebDriver googleChrome) {
        super(googleChrome);
    }

    public flightConfirmation flightNumberConfirmation (String arquivo) {
        String flightNumber = googleChrome.findElement(By.xpath("//tr[1]/td/table/tbody/tr/td[1]/b/font/font/b/font[1]")).getText().toLowerCase();
            // RECORTAR OS ESPAÇOS  EM BRANCO QUE ESTÃO NO MEIO DA STRING;
        String flightNumberWithoutSpace = flightNumber.replaceAll("\\s+", " ").toLowerCase();
        String textoFlightConfirmation = "flight confirmation";

        Assert.assertThat(flightNumberWithoutSpace, StringContains.containsString(textoFlightConfirmation));
        screenshot.printScreen(googleChrome, arquivo);
        return this;
    }


}
