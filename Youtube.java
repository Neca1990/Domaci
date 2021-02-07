package kucanjePesme;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class Youtube {
	
	private static WebDriver driver;
	// ne izlaze mi reklame
	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\ChromeDriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	public void test() {
		driver.navigate().to(YT.URL);
		YT.clickRegSrc(driver);
		YT.Song(driver);
		driver.close();
	}
}
