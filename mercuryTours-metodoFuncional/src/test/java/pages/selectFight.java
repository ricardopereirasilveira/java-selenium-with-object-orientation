package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class selectFight extends paginaBase {
    public selectFight(WebDriver googleChrome) {
        super(googleChrome);
    }

    public selectFight departTo (){
        googleChrome.findElement(By.xpath("//input[@value='Blue Skies Airlines$361$271$7:10']")).click();
        return this;
    }

    public selectFight returnTo () {
        googleChrome.findElement(By.xpath("//input[@value='Blue Skies Airlines$631$273$14:30']")).click();
        return this;
    }

    public selectFight clickContinue() {
        googleChrome.findElement(By.name("reserveFlights")).click();

        return this;
    }

    public bookAflight flightsToReturn () {
        departTo();
        returnTo();
        clickContinue();

        return new bookAflight(googleChrome);
    }


}
