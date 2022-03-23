package Util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * 
 * @author NaveenKhunteta
 *
 */
public class MMT {

	//public static final String ACCOUNT_SID = "ACdd3520e9e91efc41439c4c2a00f86d40";
	//public static final String AUTH_TOKEN = "44751c38cf9b67a5056707551020c41b";

	public static void main(String[] args) throws InterruptedException {
		Actions actions;
		WebDriver driver;
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dnagpal\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//li[@class='makeFlex hrtlCenter font10 makeRelative lhUser userLoggedOut']")).click();
		driver.findElement(By.xpath("//input[@id='toCity']")).click();
		List<WebElement>toList = driver.findElements(By.xpath("//div[@role='listbox']//ul/li"));
		for(int i =1 ; i< toList.size() ; i++){
			WebElement ele = driver.findElement(By.xpath("(//div[@role='listbox']//ul/li["+i+"]//div//div[1]//p[1])[1]"));
			String text = ele.getText();
			System.out.println("elements :"+text);
			if(text.contains("Mumbai")){
				ele.click();
				break;
			}
		}

		/*List<WebElement> ele =driver.findElements(By.xpath("//div[contains(text(),'Select Operator')]/parent::div[1]//span"));
		for(WebElement wb : ele){
			String names = wb.getText();
			System.out.println("print name:"+names);
		}*/

		//List<WebElement> lis = driver.findElements(By.xpath())
		//Thread.sleep(10);


		/*driver.findElement(By.id("ap_customer_name")).sendKeys("DeepeshTestOTP");
		driver.findElement(By.id("auth-country-picker-container")).click();

		driver.findElement(By.xpath("//ul[@role='application']//li/a[contains(text(),'United States +1')]")).click();
		driver.findElement(By.id("ap_phone_number")).sendKeys("6018085599");
		driver.findElement(By.id("ap_password")).sendKeys("DeepeshTestAuto@6060");
		driver.findElement(By.id("continue")).click();*/

		Thread.sleep(20000);

		// get the OTP using Twilio APIs:
		//Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

		
		//driver.findElement(By.id("auth-pv-enter-code")).sendKeys(OTPNumber);

	}

	/*public static String getMessage() {
		return getMessages().filter(m -> m.getDirection().compareTo(Message.Direction.INBOUND) == 0)
				.filter(m -> m.getTo().equals("+16018085599")).map(Message::getBody).findFirst()
				.orElseThrow(IllegalStateException::new);
	}*/

	/*private static Stream<Message> getMessages() {
		ResourceSet<Message> messages = Message.reader(ACCOUNT_SID).read();
		return StreamSupport.stream(messages.spliterator(), false);
	}*/

}
