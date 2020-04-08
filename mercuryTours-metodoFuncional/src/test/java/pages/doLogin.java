package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class doLogin extends paginaBase {
    public doLogin(WebDriver googleChrome) {
        super(googleChrome);
    }

    public doLogin typeUsername(String username) {
        googleChrome.findElement(By.xpath("//input[@name='userName']")).sendKeys(username);
        return this;
    }

    public doLogin typePassword (String password) {
        googleChrome.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
        return this;
    }

    public doLogin clickSingIn () {
        googleChrome.findElement(By.name("login")).click();
        return this;
    }

    public firstPage typeLogin (String user, String pass){
        typeUsername(user);
        typePassword(pass);
        clickSingIn();
        return new firstPage (googleChrome);
    }}
