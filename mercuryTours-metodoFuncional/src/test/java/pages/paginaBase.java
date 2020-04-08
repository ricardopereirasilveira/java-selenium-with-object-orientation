package pages;

import org.openqa.selenium.WebDriver;

public class paginaBase {
    protected WebDriver googleChrome;

    public paginaBase (WebDriver googleChrome) {
        this.googleChrome = googleChrome;

    }
}
