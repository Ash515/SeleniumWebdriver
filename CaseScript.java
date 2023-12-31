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

//hanlding exceptions w.r.t time
driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS); 


// WebDriverWait wait = new WebDriverWait(driver, 20);
// WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("submitform")));

//Get and print the webpage title
String title = driver.getTitle();
System.out.println(title);

//maximize the screen
driver.manage().window().maximize();

driver.findElement(By.name("username")).sendKeys("Ashwin");
driver.findElement(By.xpath("//input[@id='dob']")).sendKeys("29/10/2000");


WebElement dropelement=driver.findElement(By.tagName("select"));
dropelement.findElement(By.xpath("//option[. ='America']")).click();

//Alternative Approach of dropdown element slection
/**WebElement dropdown = driver.findElement(By.id("selenium_commands"));
Select s=new Select(dropdown);
s.selectByIndex("1");
**/

WebElement genderselect = driver.findElement(By.id("gender"));
Select fs=  new Select(genderselect);
fs.selectByValue("male");


driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ashwin@zoho.com");
driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("ashwein@414");
driver.findElement(By.name("submitform")).click();


driver.findElement(By.xpath("//input[@id='email-name']")).sendKeys("Ashwin");
driver.findElement(By.xpath("//input[@id='email-pass']")).sendKeys("Ashwin789");
driver.findElement(By.xpath("//input[@name='submittag']")).click();
driver.navigate().back();
//opening new window and new tab
//driver.switchTo().newWindow(WindowType.WINDOW);
driver.switchTo().newWindow(WindowType.TAB);

String handle=driver.getWindowHandle();
System.out.println(handle); //printing the unique window handler ID
// driver.switchTo().window(handle);
    }
}