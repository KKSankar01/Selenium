package week2.day3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

import java.time.Duration;


public class SelectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.xpath("//input[contains(@name,'firstname')]")).sendKeys("Sankar");
		driver.findElement(By.xpath("//input[contains(@name,'lastname')]")).sendKeys("K K");
		driver.findElement(By.xpath("(//input[contains(@class,'inputtext')])[7]")).sendKeys("9384352990");
		driver.findElement(By.id("password_step_input")).sendKeys("KLSP@family01");
		WebElement date=driver.findElement(By.id("day"));
		Select value=new Select(date);
		value.selectByValue("1");
		WebElement month=driver.findElement(By.id("month"));
		Select value1=new Select(month);
		value1.selectByValue("4");
		WebElement year=driver.findElement(By.id("year"));
		Select value2=new Select(year);
		value2.selectByValue("2001");
		driver.findElement(By.xpath("(//input[contains(@name,'sex')])[2]")).click();
	}

}
