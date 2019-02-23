package Com.OrangeHRM.CRM;

import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Com.OrangeHRM.Config.Config;
import Com.OrangeHRM.result.HTMLReportGenerator;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangeHrmLogin {
	static WebDriver driver;
	final static Logger logger=Logger.getLogger(OrangeHrmLogin.class);
	@When("^user opens the \"([^\"]*)\" browser$")
	public void user_opens_the_browser(String OpenBrowser) throws IllegalStateException, IOException{
		try{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		    System.out.println("Open Browser " + OpenBrowser);
		    logger.info("Step Number:"+(Config.counter++)+"Step Status:PASS,Step Name:user_opens_the_browser"+OpenBrowser+" browser,Exception:NA");
		    HTMLReportGenerator.StepDetails("pass", "When user opens the "+OpenBrowser+"browser","Browsername:"+OpenBrowser+",Exception:NA",Config.TakeScreenShot("F:\\OrangHRM\\Screensot\\user_opens_the_browser.PNG", OrangeHrmLogin.driver));
		}
		catch(Exception e){
			logger.info("Step Number:"+(Config.counter++)+"Step Status:FAIL,Step Name:user_opens_the_browser"+OpenBrowser+" browser,Exception:"+e.getMessage());
			HTMLReportGenerator.StepDetails("fail", "When user opens the "+OpenBrowser+"browser","Browsername:"+OpenBrowser+",Exception:"+e.getMessage(),Config.TakeScreenShot("F:\\OrangHRM\\Screensot\\user_opens_the_browser.PNG", OrangeHrmLogin.driver));
			e.printStackTrace();
		} 		
	}

	@When("^user enters the url \"([^\"]*)\"$")
	public void user_enters_the_url(String Url) throws IOException{
		try{
            driver.get(Url);
            driver.manage().window().maximize();
			System.out.println("Enter Url" + Url);
			logger.info("Step Number:"+(Config.counter++)+"Step Status:PASS,Step Name:user_opens_the_browser"+Url+" browser,Exception:NA");
			HTMLReportGenerator.StepDetails("pass", "When user opens the "+Url+"browser","URL:"+Url+",Exception:NA",Config.TakeScreenShot("F:\\OrangHRM\\Screensot\\Url.PNG", OrangeHrmLogin.driver));
		}
		catch(Exception o){
			logger.info("Step Number:"+(Config.counter++)+"Step Status:FAIL,Step Name:user_opens_the_browser"+Url+" browser,Exception:"+o.getMessage());
			HTMLReportGenerator.StepDetails("fail", "When user opens the "+Url+"browser","URL:"+Url+",Exception:"+o.getMessage(),Config.TakeScreenShot("F:\\OrangHRM\\Screensot\\Url.PNG", OrangeHrmLogin.driver));
			o.printStackTrace();
		}
	   }

	@Given("^user is on the application login page$")
	public void user_is_on_the_application_login_page() throws IOException{
		
	  try{
		  System.out.println("user is on the application login page");
		  logger.info("Step Number:"+(Config.counter++)+"Step Status:PASS,Step Name:user is on the application login page");
		  HTMLReportGenerator.StepDetails("pass", "user is on the application login page"+""+"","application login page:"+""+",Exception:NA",Config.TakeScreenShot("F:\\OrangHRM\\Screensot\\applicationpage.PNG", OrangeHrmLogin.driver));
	  }
	  catch(Exception b){
		  logger.info("Step Number:"+(Config.counter++)+"Step Status:FAIL,Step Name:user is on the application login page");
		  HTMLReportGenerator.StepDetails("fail", "user enters username "+""+"","application login page:"+""+",Exception:"+b.getMessage(),Config.TakeScreenShot("F:\\OrangHRM\\Screensot\\applicationpage.PNG", OrangeHrmLogin.driver));
	  }
	 }

	@When("^user enters \"([^\"]*)\" as username$")
	public void user_enters_as_username(String Username) throws IOException{
	   try{
		   driver.findElement(By.id("txtUsername")).sendKeys(Username);
			System.out.println("Enter UserName" + Username);
			logger.info("Step Number:"+(Config.counter++)+"Step Status:PASS,Step Name:user enters username"+Username+" browser,Exception:NA");
			HTMLReportGenerator.StepDetails("pass", "user enters username"+""+"","Username:"+Username+",Exception:NA",Config.TakeScreenShot("F:\\OrangHRM\\Screensot\\Enter_username.PNG", OrangeHrmLogin.driver));
			}
		catch(Exception g){
			logger.info("Step Number:"+(Config.counter++)+"Step Status:FAIL,Step Name:user enters username"+Username+" browser,Exception:"+g.getMessage());
			HTMLReportGenerator.StepDetails("fail", "user enters username "+Username+"","Username:"+Username+",Exception:"+g.getMessage(),Config.TakeScreenShot("F:\\OrangHRM\\Screensot\\Enter_username.PNG", OrangeHrmLogin.driver));
			g.printStackTrace();
		}
}

	@And("^user enters \"([^\"]*)\" as password$")
	public void user_enters_as_password(String Password) throws IOException{
		try{
			driver.findElement(By.id("txtPassword")).sendKeys(Password);
			System.out.println("Enter Password " + Password);
			logger.info("Step Number:"+(Config.counter++)+"Step Status:PASS,Step Name:user enters password"+Password+" browser,Exception:NA");
			HTMLReportGenerator.StepDetails("pass", "user enters password"+Password+"","Password:"+Password+",Exception:NA",Config.TakeScreenShot("F:\\OrangHRM\\Screensot\\password.PNG", OrangeHrmLogin.driver));
			
		}
		catch(Exception v){
			logger.info("Step Number:"+(Config.counter++)+"Step Status:FAIL,Step Name:user enters username"+Password+" browser,Exception:"+v.getMessage());
			HTMLReportGenerator.StepDetails("fail", "user enters username "+Password+"Password","Password:"+Password+",Exception:"+v.getMessage(),Config.TakeScreenShot("F:\\OrangHRM\\Screensot\\password.PNG", OrangeHrmLogin.driver));
			v.printStackTrace();
		}
		}

	@And("^user clicks on login button$")
	public void user_clicks_on_login_button() throws InterruptedException, IOException{
		try{
			driver.findElement(By.name("Submit")).click();
			System.out.println("User Click On Login Button");
			logger.info("Step Number:"+(Config.counter++)+"Step Status:PASS,Step Name:user clicks on login button");
			HTMLReportGenerator.StepDetails("pass", "User Click On Login Button"+""+"","Login Button:"+""+",Exception:NA",Config.TakeScreenShot("F:\\OrangHRM\\Screensot\\login_button.PNG", OrangeHrmLogin.driver));
		}
		catch(Exception n){
			logger.info("Step Number:"+(Config.counter++)+"Step Status:FAIL,Step Name:User Click On Login Button");
			HTMLReportGenerator.StepDetails("fail", "User Click On Login Button"+""+"","Login Button:"+""+",Exception:"+n.getMessage(),Config.TakeScreenShot("F:\\OrangHRM\\Screensot\\login_button.PNG", OrangeHrmLogin.driver));
		}  
	}

	@Then("^user is on the application Dashboard page$")
	public void user_is_on_the_application_Dashboard_page() throws IOException{
		try{
			String title = driver.getTitle();
			String ExpectedTitle="OrangeHRM";
			if(title.equalsIgnoreCase(ExpectedTitle))
				 System.out.println("Title Matched");
				 else
				 System.out.println("Title didn't match");
			System.out.println("User Get Message");
			logger.info("Step Number:"+(Config.counter++)+"Step Status:PASS,Step Name:user is on the application Dashboard page");
			HTMLReportGenerator.StepDetails("pass", "User Get Message"+""+"","Get Message:"+""+",Exception:NA",Config.TakeScreenShot("F:\\OrangHRM\\Screensot\\Dashboard.PNG", OrangeHrmLogin.driver));
		}
		catch(Exception k){
			logger.info("Step Number:"+(Config.counter++)+"Step Status:FAIL,Step Name:user is on the application Dashboard page");
			HTMLReportGenerator.StepDetails("fail", "User Get Message"+""+"","Get Message:"+""+",Exception:"+k.getMessage(),Config.TakeScreenShot("F:\\OrangHRM\\Screensot\\Dashboard.PNG", OrangeHrmLogin.driver));
		}
	}
		@Then("^user click on Admin tab$")
		public void user_click_on_Admin_tab() throws IOException{
			try{
				driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']")).click();
			    logger.info("Step Number:"+(Config.counter++)+"Step Status:PASS,Step Name:user click on Admin tab");
			    HTMLReportGenerator.StepDetails("pass", "user click on Admin tab"+""+"",""+""+",Exception:NA",Config.TakeScreenShot("F:\\OrangHRM\\Screensot\\Dashboard.PNG", OrangeHrmLogin.driver));
			    System.out.println("user_click_on_Admin_tab");
			}
		    catch(Exception i){
		    	 logger.info("Step Number:"+(Config.counter++)+"Step Status:FAIL,Step Name:user click on Admin tab");
		    	 HTMLReportGenerator.StepDetails("fail", "user click on Admin tab"+""+"","Get Message:"+""+",Exception:"+i.getMessage(),Config.TakeScreenShot("F:\\OrangHRM\\Screensot\\Dashboard.PNG", OrangeHrmLogin.driver));
		    	 i.printStackTrace();
		    }
		}

		@Then("^user moves a cursor on the User Management$")
		public void user_moves_a_cursor_on_the_User_Management() throws IOException{
		    try{
		    	driver.findElement(By.linkText("User Management")).click();
		    	logger.info("Step Number:"+(Config.counter++)+"Step Status:PASS,Step Name:user moves a cursor on the User Management");
			    HTMLReportGenerator.StepDetails("pass", "user moves a cursor on the User Management"+""+"",""+""+"",Config.TakeScreenShot("F:\\OrangHRM\\Screensot\\User_Management.PNG", OrangeHrmLogin.driver));
			    System.out.println("user moves a cursor on the User Management");
		    }
		    catch(Exception d){
		    	logger.info("Step Number:"+(Config.counter++)+"Step Status:FAIL,Step Name:user moves a cursor on the User Management");
		    	HTMLReportGenerator.StepDetails("fail", "user moves a cursor on the User Management"+""+"",""+""+",Exception:"+d.getMessage(),Config.TakeScreenShot("F:\\OrangHRM\\Screensot\\User_Management.PNG", OrangeHrmLogin.driver));
		    	d.printStackTrace();
		    }
		}
		
		@Then("^user click on Users$")
		public void user_click_on_Users() throws IOException {
			try{
				Thread.sleep(2000);
				Actions action = new Actions(driver);
				driver.findElement(By.linkText("Users")).click();
				logger.info("Step Number:"+(Config.counter++)+"Step Status:PASS,Step Name:user click on Users");
			    HTMLReportGenerator.StepDetails("pass", "user click on Users"+""+"",""+""+"",Config.TakeScreenShot("F:\\OrangHRM\\Screensot\\Users.PNG", OrangeHrmLogin.driver));
			    System.out.println("user click on Users");
			}
			catch(Exception g){
				logger.info("Step Number:"+(Config.counter++)+"Step Status:FAIL,Step Name:user click on Users");
		    	HTMLReportGenerator.StepDetails("fail", "user click on Users"+""+"",""+""+",Exception:"+g.getMessage(),Config.TakeScreenShot("F:\\OrangHRM\\Screensot\\Users.PNG", OrangeHrmLogin.driver));
			}    
		}

		
		
		@Then("^user is on application Users page$")
		public void user_is_on_System_Users_page() throws IOException {
		    try{
		    	System.out.println("user is on System Users page");
		    	logger.info("Step Number:"+(Config.counter++)+"Step Status:PASS,Step Name:user is on application Users page");
			    HTMLReportGenerator.StepDetails("pass", "user is on application Users page"+""+"",""+""+"",Config.TakeScreenShot("F:\\OrangHRM\\Screensot\\Users_page.PNG", OrangeHrmLogin.driver));
		    }
		    catch(Exception r){
		    	logger.info("Step Number:"+(Config.counter++)+"Step Status:FAIL,Step Name:user click on Users");
		    	HTMLReportGenerator.StepDetails("fail", "user click on Users"+""+"",""+""+",Exception:"+r.getMessage(),Config.TakeScreenShot("F:\\OrangHRM\\Screensot\\Users_page.PNG", OrangeHrmLogin.driver));
		    } 
		}

		@And("^user enter \"([^\"]*)\"$")
		public void user_enter_Username(String UserName) throws IOException{
		    try{
		    	System.out.println("user enter" + UserName);
		    	driver.findElement(By.xpath("//input[@name='searchSystemUser[userName]']")).sendKeys("Admin");
		    	logger.info("Step Number:"+(Config.counter++)+"Step Status:PASS,Step Name:user is on application Users page");
			    HTMLReportGenerator.StepDetails("pass", "user enter username"+""+"",""+""+"",Config.TakeScreenShot("F:\\OrangHRM\\Screensot\\username.PNG", OrangeHrmLogin.driver));
		    }
		    catch(Exception d){
		    	logger.info("Step Number:"+(Config.counter++)+"Step Status:FAIL,Step Name:user click on Users");
		    	HTMLReportGenerator.StepDetails("fail", "user click on Users"+""+"",""+""+",Exception:"+d.getMessage(),Config.TakeScreenShot("F:\\OrangHRM\\Screensot\\Users_page.PNG", OrangeHrmLogin.driver));
		    }    
		}

		@And("^user select user Role$")
		public void user_select_user_Role() throws IOException{
			try{
				System.out.println("user select user Role");
				Select oSelect = new Select(driver.findElement(By.xpath("//select[@name='searchSystemUser[userType]']")));
				oSelect.selectByVisibleText("Admin");
		    	logger.info("Step Number:"+(Config.counter++)+"Step Status:PASS,Step Name:user select user Role");
			    HTMLReportGenerator.StepDetails("pass", "user select user Role"+""+"",""+""+"",Config.TakeScreenShot("F:\\OrangHRM\\Screensot\\user_Role.PNG", OrangeHrmLogin.driver));
		    }
		    catch(Exception d){
		    	logger.info("Step Number:"+(Config.counter++)+"Step Status:FAIL,Step Name:user select user Role");
		    	HTMLReportGenerator.StepDetails("fail", "user select user Role"+""+"",""+""+",Exception:"+d.getMessage(),Config.TakeScreenShot("F:\\OrangHRM\\Screensot\\user_Role.PNG", OrangeHrmLogin.driver));
		    }		    
		}

		@And("^user enter \"([^\"]*)\" Name$")
		public void user_enter_Employee_Name( String EmpName) throws IOException{
		    try{
		    	driver.findElement(By.xpath("//input[@name='searchSystemUser[employeeName][empName]']")).sendKeys(EmpName);
		    	System.out.println("user enter Employee Name" + EmpName);
		    	logger.info("Step Number:"+(Config.counter++)+"Step Status:PASS,Step Name:user enter Employee name");
			    HTMLReportGenerator.StepDetails("pass", "user enter Employee name"+""+"EmpName",""+EmpName+"",Config.TakeScreenShot("F:\\OrangHRM\\Screensot\\Employee_Name.PNG", OrangeHrmLogin.driver));
		    }
		    catch(Exception f){
		    	logger.info("Step Number:"+(Config.counter++)+"Step Status:FAIL,Step Name:user click on Users");
		    	HTMLReportGenerator.StepDetails("fail", "user enter Employee name"+""+"",""+EmpName+""+f.getMessage(),Config.TakeScreenShot("F:\\OrangHRM\\Screensot\\Employee_Name.PNG", OrangeHrmLogin.driver));
		    }    
		}

		@And("^user select Status$")
		public void user_select_Status() throws IOException{
		    try{
		    	Select select =new Select(driver.findElement(By.xpath("//select[@name='searchSystemUser[status]']")));
		    	select.selectByIndex(1);
		    	List <WebElement> elementCount = select.getOptions();
		    	 System.out.println(elementCount.size());
		    	System.out.println("user select Status");
		    	logger.info("Step Number:"+(Config.counter++)+"Step Status:PASS,Step Name:user select Status");
			    HTMLReportGenerator.StepDetails("pass", "user select Status"+""+"EmpName",""+""+"",Config.TakeScreenShot("F:\\OrangHRM\\Screensot\\Status.PNG", OrangeHrmLogin.driver));
		    }
		    catch(Exception b){
		    	logger.info("Step Number:"+(Config.counter++)+"Step Status:FAIL,Step Name:user select Status");
		    	HTMLReportGenerator.StepDetails("fail", "user select Status"+""+"",""+""+""+b.getMessage(),Config.TakeScreenShot("F:\\OrangHRM\\Screensot\\Status.PNG", OrangeHrmLogin.driver));
		    }   
		}

		@Then("^user click on Search$")
		public void click_on_Search() throws IOException{
		    try{
		    	System.out.println("click on Search");
		    	driver.findElement(By.xpath("//input[@name='_search']")).click();
		    	logger.info("Step Number:"+(Config.counter++)+"Step Status:PASS,Step Name:user click on Search");
			    HTMLReportGenerator.StepDetails("pass", "user click on Search"+""+"EmpName",""+""+"",Config.TakeScreenShot("F:\\OrangHRM\\Screensot\\Search.PNG", OrangeHrmLogin.driver));
		      }
		    catch(Exception g){
		    	logger.info("Step Number:"+(Config.counter++)+"Step Status:FAIL,Step Name:user click on Search");
		    	HTMLReportGenerator.StepDetails("fail", "user click on Search"+""+"",""+""+""+g.getMessage(),Config.TakeScreenShot("F:\\OrangHRM\\Screensot\\Search.PNG", OrangeHrmLogin.driver));
		    }
		}
	}
	

