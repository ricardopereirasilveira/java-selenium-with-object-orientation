package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class insertNameTest {
    private WebDriver firefox;
    public insertNameTest (WebDriver firefox){
        this.firefox = firefox;
    }

    public insertNameTest digitarNome (String name) {
        firefox.findElement(By.xpath("//div[@class='control-group'][2]//following-sibling::input")).sendKeys(name);
        return this;
    }

    public selectGender digitarSobrenome (String sobrenome) {
        firefox.findElement(By.xpath("//div[@class='control-group'][3]//following-sibling::input")).sendKeys(sobrenome);

        return new selectGender(firefox);
    }

//    public selectGender digitarNomeSobrenome (String primeiroNome) {
//        digitarNome(primeiroNome);
//        digitarSobrenome("a");
//        return new selectGender(firefox);
//    }
}
