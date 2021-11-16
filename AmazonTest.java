import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest
{
    public static void main(String args[]){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\prasanna.prabakaran\\Downloads\\Software\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
        WebElement navigateToSignIn = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        navigateToSignIn.click();
        WebElement loginID = driver.findElement(By.id("ap_email"));
        loginID.sendKeys("prasannaprabakar44@gmail.com");
        WebElement aContinue = driver.findElement(By.id("continue"));
        aContinue.click();
        WebElement password = driver.findElement(By.id("ap_password"));
        password.sendKeys("Prasanna@atmecs");
      //  WebElement radio= driver.findElement(By.id("a-icon a-icon-checkbox"));
       // radio.click();
        driver.findElement(By.id("signInSubmit")).submit();
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("iphone x");
        searchBox.submit();
        driver.findElement(By.linkText("Apple iPhone 13 (256GB) - Pink")).click();
        WebElement addToCart = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[3]/div[7]/div[7]/div/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[35]/div[1]/span/span/span/span"));
        addToCart.submit();
    }
}
