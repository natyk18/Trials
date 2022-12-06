package launchBrawser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchChrome {
	//metodss
	//variables
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\natal\\selenium18\\2ndSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	
		//stop the execution locally (not accepted in industry, not used really)
		Thread.sleep(3000);
		driver.close();
	}

}
