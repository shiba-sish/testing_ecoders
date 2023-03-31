package verifying_all_url;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCasePage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shibasish China\\eclipse-workspace\\testing_ecoders\\all_necessary_file/chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.get("http://127.0.0.1:5000/testcase");
		 Thread.sleep(2000);
		 String title = driver.getTitle();
		 System.out.println("title is->"+title);
		 String curl = driver.getCurrentUrl();
		 System.out.println("current url is-->"+curl);
		 String ps = driver.getPageSource();
		 System.out.println("page source-->"+ps);
		 
		 String extectedurl= "http://127.0.0.1:5000/testcase";
		 if(extectedurl.equals(curl)) {
			 System.out.println("Matched test case pass!!!");
		 }
		 else {
			 System.out.println("Not matched test case fail!!!");
		 }
		 
		 driver.quit();
	}

}
