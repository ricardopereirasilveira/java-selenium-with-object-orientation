package support;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class screenshot {
    public static void tirarScreenshot(WebDriver firefox, String arquivo) {
        File ss = ((TakesScreenshot)firefox).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(ss, new File(arquivo));
        } catch (Exception e) {
            System.out.print("Não foi possível tirar Screenshot.");
        }
    }
}
