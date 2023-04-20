package wtest;

/**
 * Hello world!
 *
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App 
{

    public static void main( String[] args ) throws InterruptedException
    {
        System.out.println( "Hello World!" );
        WebDriver driver;
        //WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "/home/ubuntu/chromedriver");
        ChromeOptions options = new ChromeOptions();
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setAcceptInsecureCerts(true);
        options.addArguments("--headless=new", "--disable-gpu", "--window-size=1580,12800","--ignore-certificate-errors",
        "--disable-extensions","--no-sandbox","--disable-dev-shm-usage", "--disable-crash-reporter", "--remote-debugging-port=9222",
		"--allow-running-insecure-content");
        options.merge(caps);
        driver = new ChromeDriver(options);
        driver.get("http://localhost");
        Thread.sleep(2000);
        System.out.print("Title of the page is: " + driver.getTitle() + "\n");
        driver.quit();
    }

}
