import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class MobileAutomation1 {
	
	AppiumDriver<MobileElement> driver;
	String path;

	
	public void setup()
	{
		path = System.getProperty("user.dir");
		DesiredCapabilities cap=new DesiredCapabilities();
		//cap.setCapability("platformName", "Android");
		cap.setCapability("platformName", "Android");
		cap.setCapability("devicename", "Mi");
		cap.setCapability("app", path+"//app//ApiDemos.apk");
		
		System.out.println("Testing Git commit");
		
		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		// File appDir = new File("src");
		   
		   // File app = new File(appDir, "bookMyShow-ucb.apk");

		
		MobileAutomation1 obj =new MobileAutomation1();
		obj.setup();
	
		/*
		 * cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
		 * cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
		 * cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");
		 * 
		 * //cap.setCapability(MobileCapabilityType.APPLICATION_NAME,"Chrome");
		 * cap.setCapability(MobileCapabilityType.APP,"Chrome");
		 * //cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		 * //AndroidDriver driver=new AndroidDriver(new
		 * URL("http://0.0.0.0:4723/wd/hub"),cap );
		 */
		//System.out.println("Hello world");
	}

}
