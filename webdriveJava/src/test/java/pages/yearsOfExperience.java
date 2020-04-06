package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class yearsOfExperience {
    private WebDriver firefox;
    public yearsOfExperience (WebDriver firefox) {
        this.firefox = firefox;
    }

    public yearsOfExperience selectYears (){
        firefox.findElement(By.xpath("//div[@class='control-group'][5]")).findElement(By.id("exp-3")).click();
        return this;
    }
}
