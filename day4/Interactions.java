package week2.day4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class Interactions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//div[contains(@class,'ui-corner-all')])[13]")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'ui-corner-all')])[14]")).click();
		WebElement verification=driver.findElement(By.xpath("//span[@class='ui-growl-title']"));
		String actualText=verification.getText();
		String expectedText="Checked";
		if(actualText.contains(expectedText)) 
			System.out.println("Verification completed");
		else 
			System.out.println("Verification not completed");
			System.out.println(actualText);
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box')])[4]")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box')])[8]")).click();
		driver.findElement(By.xpath("//div[contains(@class,'ui-toggleswitch-slider')]")).click();
		WebElement verification2=driver.findElement(By.xpath("//span[contains(@class,'ui-growl-title')]"));
		String actualText1=verification2.getText();
		String expectedText1="Checked";
		if(actualText1.contains(expectedText1))
			System.out.println("Verification completed");
		else
			System.out.println("Verification not completed");
		WebElement verification3=driver.findElement(By.xpath("//span[contains(@class,'ui-chkbox-label ui-state-disabled')]"));
		String actualText2=verification3.getText();
		String expectedText2="Disabled";
		if(actualText2.contains(expectedText2))
			System.out.println("Verification completed");
		else
			System.out.println("Verification not completed");
			System.out.println(actualText2);
		//driver.findElement(By.xpath("//span[contains(@class,'ui-icon ui-icon-triangle-1-s')]")).click();
		driver.findElement(By.xpath("//div[contains(@class,'ui-selectcheckboxmenu-trigger')]")).click();
		WebElement element=driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget ui-corner-all ui-state-default')])[12]"));
		element.click()
		driver.findElement(By.xpath("//span[contains(@class,'ui-icon ui-icon-circle-close')]")).click();
		boolean isSelected = element.isSelected();
		if (isSelected) {
			System.out.println("The element is selected");
		}
		else {
			System.out.println("The element is not selected");
		}
		}
}
