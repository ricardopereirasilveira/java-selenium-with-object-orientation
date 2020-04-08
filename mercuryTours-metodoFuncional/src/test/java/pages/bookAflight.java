package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class bookAflight extends paginaBase {
    public bookAflight(WebDriver googleChrome) {
        super(googleChrome);
    }

    public bookAflight summaryValidation () {
        String flightToWithSpace = googleChrome.findElement(By.xpath("//td[@class='data_left']//b")).getText();
            // RETIRAR OS CARACTERES EM BRANCO DO LADO ESQUERDO
        String flightToWithoutSpace = flightToWithSpace.replace("^\\s+", "");
        String flightReturnWithSpace = googleChrome.findElement(By.xpath("//tbody/tr[2]/td/table/tbody/tr[6]/td/font/font/font/b")).getText();
        String flightReturnWithouSpace = flightReturnWithSpace.replace("^\\s+", "");
//        System.out.print(flightToWithoutSpace);
//        System.out.print(flightReturnWithouSpace);
        String flightTo = "Blue Skies Airlines 361";
        String flightReturn = "Blue Skies Airlines 631";
        Assert.assertEquals(flightReturnWithouSpace, flightReturn);
        Assert.assertEquals(flightToWithoutSpace, flightTo);
        return this;
    }

    public bookAflight firstName (String firstname) {
        googleChrome.findElement(By.name("passFirst0")).sendKeys(firstname);
        return this;
    }

    public bookAflight lastName (String lastname) {
        googleChrome.findElement(By.name("passLast0")).sendKeys(lastname);
        return this;
    }

    public bookAflight creditCardNumber (String creditCard) {
        googleChrome.findElement(By.name("creditnumber")).sendKeys(creditCard);
        return this;
    }

    public bookAflight clickSecurePurchase (){
        googleChrome.findElement(By.name("buyFlights")).click();
        return this;
    }

    public flightConfirmation clickContinue (String firstName, String lastName, String creditCard){
        summaryValidation();
        firstName(firstName);
        lastName(lastName);
        creditCardNumber(creditCard);
        clickSecurePurchase();
        return new flightConfirmation (googleChrome);
    }
}
