package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.Locale;

public class GWD {

    private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>();
    public static ThreadLocal<String> threadBrowserName= new ThreadLocal<>();

    // driver: threadDriver.get() ->  bulunduğun thread deki driverı veriyor.
    // driver vermek için : threadDriver.set(driver) -> bulunduğum threade driver ver

    public static WebDriver getDriver() {

        Locale.setDefault(new Locale("EN"));
        System.setProperty("user.language", "EN");

        if (threadBrowserName.get()==null) // XML den çalışmayan durumlar için
            threadBrowserName.set("chrome");  // default chrome

        if (threadDriver.get() == null) // eğen en başta ise
        {
            switch (threadBrowserName.get()) { // hattaki hangi browser adı var
                case "firefox" : threadDriver.set(new FirefoxDriver()); break;
                case "edge" : threadDriver.set(new EdgeDriver()); break;
                default: threadDriver.set(new ChromeDriver()); break;

            }
            threadDriver.set(new ChromeDriver());  // bir threade bir tne driver set et
            threadDriver.get().manage().window().maximize();
            threadDriver.get().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

            // eğer zaten oluşmuşsa önceden oluşmuş driver ı göndere
        }
        return threadDriver.get();
    }

    public static void quitDriver() {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if (threadDriver.get() != null) {
            threadDriver.get().quit();

            //driver=null; // hattakini al, NULL değeri ata ve kendi SET, hattakini NULL yap
            WebDriver hattaki = threadDriver.get();
            hattaki = null;
            threadDriver.set(hattaki);
        }


    }
}
