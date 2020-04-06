package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class selectGender {
    private WebDriver firefox;
    public selectGender(WebDriver firefox) {
        this.firefox = firefox;
    }

    public yearsOfExperience selecioneSexo(){
//        WebElement idSex = firefox.findElement(By.xpath("//div[@class='control-group'][4]"));
//        idSex.findElement(By.id("sex-0")).click();
        firefox.findElement(By.xpath("//div[@class='control-group'][4]")).findElement(By.id("sex-0")).click();

        return new yearsOfExperience(firefox);
    }
}
