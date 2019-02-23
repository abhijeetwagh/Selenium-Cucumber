package Com.OrangeHRM.Config;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Config {

	public static int counter=1;
	public static String TakeScreenShot(String ImagePath,WebDriver driver) throws IOException{
		  
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File(ImagePath);
		FileUtils.copyFile(src, dest);
		String s = dest.toString();
		return s;
	}
}
