package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class DeleteLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		WebElement text=driver.findElement(By.xpath("(//a[@class='linktext'])[4]"));
		String text2 = text.getText();
		System.out.println(text2);
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[29]")).sendKeys(text2);
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click();
		String text3=new String();
		text3=driver.findElement(By.xpath("//div[contains(@class,'info')]")).getText();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println(text3);
		String text4="No records to display";
		if (text3==text4){
			System.out.println("Lead successfully deleted");
			System.out.println(text4);
		}
		}
}
