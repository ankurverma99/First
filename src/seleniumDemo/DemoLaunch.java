package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoLaunch {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		WebElement frame = driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
		driver.switchTo().frame(frame);
		Actions a = new Actions(driver);
		WebElement ele = driver.findElement(By.id("draggable"));
		WebElement ele1 = driver.findElement(By.id("droppable"));
		a.dragAndDrop(ele, ele1).perform();
		Thread.sleep(2000);
		WebElement txt = driver.findElement(By.xpath("//div[@id=\"droppable\"]/p"));
		System.out.println(txt.getText());

	}

}
