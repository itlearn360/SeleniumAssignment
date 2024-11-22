package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/");
        driver.manage().window().maximize();
        
        
        driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")).click();
        
        driver.findElement(By.name("firstname")).sendKeys("Itlearn");
        driver.findElement(By.name("lastname")).sendKeys("Training");
        driver.findElement(By.name("email")).sendKeys("traininglearn@gmail.com");
        driver.findElement(By.name("telephone")).sendKeys("6758933589");
        
        driver.findElement(By.name("password")).sendKeys("Training1122");
        driver.findElement(By.name("confirm")).sendKeys("Training1122");
        
        driver.findElement(By.name("agree")).click();
        driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();
        
        
        driver.close();
	}

}
