package New;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {

	public static void main(String[] args) {
		//set the path of executable browser driver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\Desktop\\Selenium\\chromedriver_win32//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://selenium.dev");
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
