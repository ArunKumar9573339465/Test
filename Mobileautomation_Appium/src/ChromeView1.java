import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ChromeView1 extends BaseChrome {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver = capability();
		//driver.get("www.google.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.close();
		
		driver.quit();
		//driver.closeApp();
		
	}

}
