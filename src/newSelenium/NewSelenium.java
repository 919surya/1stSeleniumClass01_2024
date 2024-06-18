package newSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class NewSelenium {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\soyuz\\OneDrive\\Desktop\\newSELENIUM-workspace\\SeleniumClass01\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
//		driver.get("https://google.com/");
//		driver.get("https://techfios.com/portal/login");		
		driver.get("https://www.codefios.com/ebilling/login");		
//		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.close();
//https://www.codefios.com/ebilling/login		

	}

}
