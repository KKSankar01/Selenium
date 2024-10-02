package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_locators_assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Sankar");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("K K");		
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Tata Consultancy service");		
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalProfTitle']")).sendKeys("System Engineer");		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String actualText = new String();
		actualText=driver.findElement(By.xpath("//span[@id='viewLead_generalProfTitle_sp']")).getText();
		String expectedText="System Engineer";
		if(actualText==expectedText) {
			System.out.println("Title is verified");
		}else {
			System.out.println("Title is not verified");
			System.out.println(actualText);
		}
	}
}
