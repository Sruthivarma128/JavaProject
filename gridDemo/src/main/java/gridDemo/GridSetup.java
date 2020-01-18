package gridDemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridSetup {

	
		public static WebDriver driver = new ChromeDriver();
		 
		 public static void main(String[]  args) throws MalformedURLException, InterruptedException{
		 System.setProperty("web.driver.chrome","C:\\chromedriver.exe");	 
		 String URL = "http://www.DemoQA.com";
		 String Node = "http://10.0.0.148:5555/wd/hub";
		 DesiredCapabilities cap = DesiredCapabilities.chrome();
		 cap.setBrowserName("Chrome");
		 cap.setPlatform(Platform.WIN10);
		 driver = new RemoteWebDriver(new URL(Node), cap);
		 
		 driver.navigate().to(URL);
		 Thread.sleep(5000);
		 driver.quit();
		 } 

	}


