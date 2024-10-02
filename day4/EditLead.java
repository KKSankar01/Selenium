package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

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
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("IT-Automation");
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("This is IT field");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("phillsburytoy@gmail.com");
		WebElement state=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		state.click();
		Select ny=new Select(state);
		ny.selectByValue("NY");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("This is IT field");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		String title=driver.getTitle();
		System.out.println(title);
		
		
	}

}
