package Com.OrangeHRM.CRM;

import org.junit.runner.RunWith; 
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber","junit:junit_xml/cucumber.xml"},
monochrome=true,
features ={"E:\\OrangeHRM\\CRM\\src\\test\\resources\\feature\\OrangHRM.Feature"},
tags={"@OrangeHRM"},
dryRun=false
)

public class TestRunner {

}
