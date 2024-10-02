package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Sankar K K");
		driver.findElement(By.xpath("(//textarea[contains(@class,'inputBox')])[1]")).sendKeys("Selenium Automation Tester");
		WebElement dd=driver.findElement(By.xpath("(//select[contains(@class,'inputBox')])[2]"));
		Select value=new Select(dd);
		value.selectByValue("IND_SOFTWARE");
		WebElement dd1=driver.findElement(By.xpath("(//select[contains(@class,'inputBox')])[3]"));
		Select value1=new Select(dd1);
		value1.selectByValue("OWN_SCORP");
		WebElement dd2=driver.findElement(By.xpath("(//select[contains(@class,'inputBox')])[4]"));
		Select value2=new Select(dd2);
		value2.selectByValue("LEAD_EMPLOYEE");
		WebElement dd3=driver.findElement(By.xpath("(//select[contains(@class,'inputBox')])[5]"));
		Select value3=new Select(dd3);
		value3.selectByValue("9000");
		WebElement dd4=driver.findElement(By.xpath("(//select[contains(@class,'selectBox')])[2]"));
		Select value4=new Select(dd4);
		value4.selectByValue("TX");
		driver.findElement(By.xpath("//input[contains(@class,'smallSubmit')]")).click();
		//String actualText = new String();
		WebElement accountName=driver.findElement(By.xpath("//input[@id='accountName']"));
		String actualText=accountName.getText();
		String expectedText="Sankar K K";
		if(actualText.contains(expectedText)) 
			System.out.println("Account name is verified");
		else 
			System.out.println("Account name is not verified");
			System.out.println(actualText);
	}
}
