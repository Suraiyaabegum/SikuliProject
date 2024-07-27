package demoScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class LoginGmail {

	public static void main(String[] args) throws Exception {


		Screen screen= new Screen();
		Pattern image1=new Pattern("C:\\Tools\\Sikuli setup\\gmaillink.png");
		Pattern image2=new Pattern("C:\\Tools\\Sikuli setup\\email.png");
		Pattern image3=new Pattern("C:\\Tools\\Sikuli setup\\emailnext.png");
		Pattern image4=new Pattern("C:\\Tools\\Sikuli setup\\password.png");

		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");

		screen.wait(image1, 10);
		screen.click(image1);

		screen.type(image2, "suraiyabegum500@gmail.com");
		screen.click(image3);
		screen.type(image4, "AnnewithanE");

	}
}