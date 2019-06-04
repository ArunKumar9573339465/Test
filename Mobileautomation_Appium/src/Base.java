import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {
	
	
		public static  AndroidDriver<AndroidElement> capability() throws MalformedURLException
		{
			

		AndroidDriver<AndroidElement>  driver;

			// TODO Auto-generated method stub
		 //File appDir = new File("src");
	    // File app = new File(appDir, "ApiDemos.apk");
	     DesiredCapabilities capabilities = new DesiredCapabilities();
	     
	     capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Devices");
	     
	     //capabilities.setCapability(MobileCapabilityType., value);
	     //capabilities.setCapability(MobileCapabilityType.APPLICATION_NAME, "API Demos");
	     //capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
	     
	     //to open without Apk file
		
		 capabilities.setCapability("appPackage", "io.appium.android.apis");
		 capabilities.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		
	     
	     
	     //capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
	     driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		    
	     
	     
		  return driver;
		}
		
}
