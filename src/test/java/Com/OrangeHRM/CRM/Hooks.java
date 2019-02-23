package Com.OrangeHRM.CRM;

import java.io.IOException;

import org.apache.log4j.Logger;

import Com.OrangeHRM.Config.Config;
import Com.OrangeHRM.result.HTMLReportGenerator;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	Logger log = Logger.getLogger(Hooks.class);
	public boolean isfirstscenario=true;
	@Before
	public void beforeScenario(Scenario obj){
		System.out.println("This will run before the Scenario"+obj.getName()+obj.getId());
		log.info("Scenario Name= " + obj.getName());
		try{			
			HTMLReportGenerator.TestSuiteStart("F:\\OrangeHRM.html", "Abhi");	
		}
		catch(Exception e){
			System.out.println("Error Message"+e.getMessage());	
			e.printStackTrace();
		}
		HTMLReportGenerator.TestCaseStart(obj.getName(), obj.getId()+" "+ obj.getSourceTagNames().toString());
   } 
 
 @After
    public void afterScenario(Scenario scenario) throws IOException{
        System.out.println("This will run after the Scenario"+scenario.getName());
        Config.counter=1;
        /*Config.TakeScreenShot("F:\\OrangHRM\\Screensot\\abc.PNG", OrangeHrmLogin.driver);*/
        HTMLReportGenerator.TestCaseEnd();
        HTMLReportGenerator.TestSuiteEnd();
    }

}
