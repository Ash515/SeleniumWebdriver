import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

class A{
    public static void main(String ar[]){
System.setProperty("webdriver.chrome.driver","C:\\Chrome Driver\\chromedriver-win64\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.navigate().to("C:\\Users\\ashwin-ts69\\Documents\\Selinium\\Driver Project\\Project 3\\Registration.html");
driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS); 

// WebDriverWait wait = new WebDriverWait(driver, 20);
// WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("submitform")));




driver.manage().window().maximize();


// driver.setTitle("title1");
driver.findElement(By.name("username")).sendKeys("Ashwin");
driver.findElement(By.xpath("//input[@id='dob']")).sendKeys("29/10/2000");


WebElement dropelement=driver.findElement(By.tagName("select"));
dropelement.findElement(By.xpath("//option[. ='America']")).click();

// WebElement dropdown = driver.findElement(By.id("selenium_commands"));
//         dropdown.findElement(By.xpath("//option[. = 'Browser Commands']")).click();
// Select s=new Select(dropelement);
// s.selectByValue("1");
driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ashwin@zoho.com");
driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("ashwein@414");
driver.findElement(By.name("submitform")).click();

// driver.navigate().to("C:\\Users\\ashwin-ts69\\Documents\\Selinium\\Driver Project\\Project 3\\index.html");
driver.findElement(By.xpath("//input[@id='email-name']")).sendKeys("Ashwin");
driver.findElement(By.xpath("//input[@id='email-pass']")).sendKeys("Ashwin789");
driver.findElement(By.xpath("//input[@name='submittag']")).click();


    }
}