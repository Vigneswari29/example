import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectDrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vigneshwari\\eclipse-workspace\\SeleniumLaunch\\driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("http:facebook.com");
	}

}
