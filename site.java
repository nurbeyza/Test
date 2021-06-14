import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class site {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","D:/selenium/ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.tutorialsninja.com/demo/index.php?route=common%2Fhome");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//span[text()='My Account']")).click();
        driver.findElement(By.xpath("//a[text()='Register']")).click();

        String isim="Beyza";
        WebElement firstName = driver.findElement(By.cssSelector("#input-firstname"));
        firstName.sendKeys(isim);

        String soyisim="yalcın";
        WebElement lastName = driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
        lastName.sendKeys(soyisim);

        String mail="abcddrhfshyh@gmail.com";
        WebElement email=driver.findElement(By.name("email"));
        email.sendKeys(mail);

        String no="05859856564";
        WebElement telNo=driver.findElement(By.cssSelector("#input-telephone"));
        telNo.sendKeys(no);

        String pass="zaza5656";
        WebElement password=driver.findElement(By.cssSelector("#input-password"));
        password.sendKeys(pass);

        WebElement confirm=driver.findElement(By.name("confirm"));
        confirm.sendKeys(pass);

        WebElement agree= driver.findElement(By.name("agree"));
        agree.click();

        WebElement createAccountButton=driver.findElement(By.cssSelector("input.btn-primary"));
        createAccountButton.click();

        String myMassege="Your Account Has Been Created!";
    Assert.assertEquals(myMassege,driver.getTitle());
        System.out.println(("başarılı"));
    }

}
