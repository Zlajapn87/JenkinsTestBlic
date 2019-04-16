import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {



    public static WebDriver driver;
    public static void main(String[] args) {


            System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikola.zlatkovic\\ZlajaWorkspace\\com.TCRM\\src\\test\\resources\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
    }


}

