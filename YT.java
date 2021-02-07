package kucanjePesme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/*Po uzoru na zadatak sa casa

Pomocu jave i selenijuma
1) otici na sajt youtube
2) u search-u pronaci Rick Astley i pustiti pesmu Never gonna give you up
// voditi racuna da ako postoje reklame da ih preskocite

3) Nakon sto je pustena pesma, iz liste sa desne strane (watch next) pustiti drugi predlozen video

Testirati sve napisane metode

Domaci okaciti na drajv na standardan nacin i na github
*/
public class YT {

	public static final String URL = "https://www.youtube.com/";
	public static final String SEARCH_XPATH = "//*[@id=\"search-icon-legacy\"]/yt-icon";
	public static final String SEARCH_TEXT_XPATH = "//*[@id=\"search\"]";
	public static final String PLAY_SONG_XPATH = "//*[@id=\"video-title\"]/yt-formatted-string";
	public static final String NEXT_BTN_XPATH = "//*[@id=\"movie_player\"]/div[33]/div[2]/div[1]/a[2]";
	public static void clickRegSrc(WebDriver driver) {
		WebElement we = driver.findElement(By.xpath(SEARCH_TEXT_XPATH));
		we.click();
		we.sendKeys("Rick Astley ");
		 driver.findElement(By.xpath(SEARCH_XPATH)).click();
		 
	}
	public static void Song(WebDriver driver) {
		 driver.findElement(By.xpath(PLAY_SONG_XPATH)).click();	
		 driver.findElement(By.xpath(NEXT_BTN_XPATH)).click();
	}
}
