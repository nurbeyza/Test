import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class rezervasyon {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:/selenium/ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.grandakca.com/");

        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[@class=\"stm-header__element stm_header_element_603cef866aa01 stm-header__element_btn_solid\"]")).click();
        driver.findElement(By.cssSelector("#arrival")).click();
        Thread.sleep(3000);
        String tarih="18.6.2021";

        String ay="TEMMUZ 2021";
        String gün="30";


        //calender
        while (true){
            String text=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div")).getText();
            if(text.equals(ay)){
                System.out.println("seçildi");
                break;

            }
            else{
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("document.querySelector(\'#ui-datepicker-div > div > a.ui-datepicker-next.ui-corner-all\',':before').click();");
            }
        }
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[6]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"departure\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[3]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"Search\"]/div/div[3]/select/optgroup/option[5]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"Search\"]/div/div[4]/select/optgroup/option[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"inputState\"]/option[5]")).click();
        driver.findElement(By.xpath("//*[@id=\"Search\"]/div/div[5]/div/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"tab-11\"]/div/div[1]/div[2]/div[2]/div/div[3]/div/div/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"cd-cart-trigger\"]/span[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"cd-cart\"]/div/div[2]/form/button")).click();


        String AdSoyad="sjdkjsdks jdndj";
        String tel="03589658542";
        String TcNo="45612545533";
        String email="djkfndjsk@gmail.com";

        WebElement ad_soyad=driver.findElement(By.xpath("//*[@id=\"fatura_form\"]/div[1]/div[1]/div/input"));
        ad_soyad.sendKeys(AdSoyad);

        WebElement tel_=driver.findElement(By.xpath("//*[@id=\"fatura_form\"]/div[1]/div[3]/input"));
        tel_.sendKeys(tel);

        WebElement tcno_=driver.findElement(By.xpath("//*[@id=\"fatura_form\"]/div[2]/div[1]/div/input"));
        tcno_.sendKeys(TcNo);

        WebElement email_=driver.findElement(By.xpath("//*[@id=\"fatura_form\"]/div[1]/div[2]/div/input"));
        email_.sendKeys(email);
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"fatura_form\"]/button")).click();

    }
}
