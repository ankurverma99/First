package seleniumDemo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/upload/");
		Thread.sleep(2000);
		driver.findElement(By.id("file_wraper0")).click();
		Thread.sleep(2000);
		String st = "‪F:/New folder (2)/upload.exe";
		Runtime.getRuntime().exec("‪F:/New folder (2)/upload.exe");

	}

}
