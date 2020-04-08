package support;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class screenshot {
    public static void printScreen (WebDriver googleChrome, String arquivo){
        File screenshot = ((TakesScreenshot)googleChrome).getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(screenshot, new File(arquivo));
        } catch (Exception e) {
            System.out.print("A screenshot falhou! ");
        }
    }
}
