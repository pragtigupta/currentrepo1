package pac1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Seleniumprac1 {

	public static void main(String[] args) {
		//code not working
		
		WebDriver driver;
		
		
		ChromeOptions co = new ChromeOptions();

        co.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(co);



        // WebDriverManager.chromedriver().setup(co);



        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        driver.manage().window().maximize();

        driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/");
        
        
	}

}
