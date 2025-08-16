import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NaukriUpdateResume {

	@Test
	public void NaukriResume() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/mnjuser/profile?id=&altresid");
		driver.findElement(By.id("usernameField")).sendKeys("dmpramodh@gmail.com");
		driver.findElement(By.id("passwordField")).sendKeys("Pramu@000");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
//		driver.findElement(By.partialLinkText("View")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("(//div[contains(@class,'view-profile')])")).click();
		driver.findElement(By.xpath("//input[@value='Update resume']")).click();
		try {
			Runtime.getRuntime().exec("E:\\Softwares\\java\\fileuploadfile.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//img[@alt='naukri user profile img']")).click();
		driver.findElement(By.xpath("//a[@title='Logout']")).click();
		driver.quit();
		
	}
}
