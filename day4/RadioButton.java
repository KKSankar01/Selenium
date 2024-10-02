package week2.day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui;
//import org.openqa.selenium.support.ui.Select;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//span[contains(@class,'ui-radiobutton')])[15]")).click();		
		WebElement edge1=driver.findElement(By.xpath("(//span[contains(@class,'ui-radiobutton')])[15]"));
		boolean isSelected=edge1.isSelected();
		if (isSelected) {
			System.out.println("Radio button is not un selected successfully");
		}
		else {
			System.out.println("Radio button is un selected successfully");
		}
		List<WebElement> radioButtons=driver.findElements(By.xpath("(//table[contains(@class,'ui-selectoneradio')])[6]"));
		for(WebElement radioButton:radioButtons) {
			if (radioButton.isSelected()) {
				System.out.println("Default selected radio button value:"+radioButton.getAttribute("value"));
				break;
			}
		}
		
	}
}
