package seleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UrbanLadder {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@class=\"close-reveal-modal hide-mobile\"]")).click();
		List<WebElement> menus = driver.findElements(By.xpath("//ul[@class=\"topnav bodytext\"]/li"));
		Actions a = new Actions(driver);
		Thread.sleep(1000);
		for (WebElement item : menus) {
			String name = item.getText();
			System.err.println(name);
			a.moveToElement(item).build().perform();
			Thread.sleep(2000);
			List<WebElement> subMenues = driver.findElements(
					By.xpath("//span[contains(.,'" + name + "')]/parent::li/descendant::ul[@class=\"taxonslist\"]/li"));
			Thread.sleep(2000);
			for (WebElement subItem : subMenues) {
				System.out.println(subItem.getText());
			}
		}
		System.out.println(menus.getClass());
	}
}
