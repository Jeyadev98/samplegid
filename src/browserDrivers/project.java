package browserDrivers;

import org.openqa.selenium.chrome.ChromeDriver;

public class project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./src/browserDrivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.adactin.com/");
	}

}
