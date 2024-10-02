package week2.day4;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Dimension;

public class LeafGroundButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();
		String title=driver.getTitle();
		if(title.contains("Dashboard")) {
			System.out.println("Successfully title has been verified");
		}
		driver.navigate().back();
		WebElement button=driver.findElement(By.xpath("(//button[contains(@class,'ui-button')])[2]"));
		if (button.isEnabled()) {
			System.out.println("The button is enabled");
		}else {
			System.out.println("Button is disabled");
		}
		WebElement element=driver.findElement(By.xpath("(//button[contains(@class,'ui-button')])[3]"));
		Point location=element.getLocation();
		int xCoordinate=location.getX();
		int yCoordinate=location.getY();
		System.out.println("X coordinate="+xCoordinate+", Y coordinate="+yCoordinate);
		WebElement element2=driver.findElement(By.xpath("(//button[contains(@class,'ui-button')])[4]"));
		String backgroundColor=element2.getCssValue("background-color");
		System.out.println("Button's background colour"+backgroundColor);
		WebElement element3=driver.findElement(By.xpath("(//button[contains(@class,'ui-button')])[5]"));
		Dimension size=element3.getSize();
		int width=size.getWidth();
		int height=size.getHeight();
		System.out.println("Width="+width+"Height="+height);
		driver.close();
	}

}
