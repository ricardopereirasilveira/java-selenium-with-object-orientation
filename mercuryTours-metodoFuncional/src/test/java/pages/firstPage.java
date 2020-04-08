package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class firstPage extends paginaBase {
    public firstPage(WebDriver googleChrome) {
        super(googleChrome);
    }

    public firstPage type (){
        googleChrome.findElement(By.xpath("//input[@name='tripType']")).click();
        return this;
    }

    public firstPage passengers() {
        WebElement passengersCount = googleChrome.findElement(By.name("passCount"));
        new Select(passengersCount).selectByValue("1");

        return this;
    }

    public firstPage selectFrom () {
        WebElement departingFrom = googleChrome.findElement(By.name("fromPort"));
        new Select(departingFrom).selectByValue("London");

        return this;
    }

    public firstPage dateFrom (){
        WebElement fromMonth = googleChrome.findElement(By.name("fromMonth"));
        WebElement fromDay = googleChrome.findElement(By.name("fromDay"));
        new Select(fromMonth).selectByValue("12");
        new Select(fromDay).selectByValue("20");

        return this;
    }

    public firstPage selectTo () {
        WebElement toPort = googleChrome.findElement(By.name("toPort"));
        new Select(toPort).selectByValue("Acapulco");

        return this;
    }

    public firstPage dateTo () {
        WebElement toMonth = googleChrome.findElement(By.name("toMonth"));
        WebElement toDay = googleChrome.findElement(By.name("toDay"));
        new Select(toMonth).selectByValue("10");
        new Select(toDay).selectByValue("21");

        return this;
    }

    public firstPage serviceClass () {
        googleChrome.findElement(By.xpath("//input[@value='First']")).click();

        return this;
    }

    public firstPage arlinesCompany () {
        WebElement airline = googleChrome.findElement(By.xpath("//select[@name='airline']"));
        new Select(airline).selectByVisibleText("Blue Skies Airlines");

        return this;
    }

    public firstPage clickContinue() {
        googleChrome.findElement(By.name("findFlights")).click();

        return this;
    }

    public selectFight flightFinder (){
        type();
        passengers();
        selectFrom();
        dateFrom();
        selectTo();
        dateTo();
        serviceClass();
        arlinesCompany();
        clickContinue();


        return new selectFight(googleChrome);
    }
}
