import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class okul_lms {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:/selenium/ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://lms.ktun.edu.tr/login/login_auth.php");
        driver.manage().window().maximize();


        String mail="ffgjfjjf@ktun.edu.tr";
        WebElement email = driver.findElement(By.cssSelector("#username"));
        email.sendKeys(mail);
        String pass="fjbjndskgkjsdk";
        WebElement password=driver.findElement(By.cssSelector("#password"));
        password.sendKeys(pass);

        WebElement kullanıcı_hatırla= driver.findElement(By.cssSelector("#rememberusername"));
        kullanıcı_hatırla.click();
        driver.findElement(By.cssSelector("#loginbtn")).click();


        String myMassege="öğrenci ismi"; //okulda kayırlı bulunan öğrenci ismi
        WebElement x=driver.findElement(By.xpath("//h1[@class=\"page-title font-size-24 mb-0\"]"));

        if(myMassege.equals(x.toString())) {
            System.out.println(("başarılı"));
        }
    }
}
