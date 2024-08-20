package TestBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import HeatMap_Pageobjects.Login_PageObject;
import HeatMap_Pageobjects.ReportDashboardPageobject;
import HeatMap_Pageobjects.Save_heatmapReport;
import HeatMap_Pageobjects.heatmap_filters_pageobject;

public class LoginTestbase {
	
	public WebDriver driver;
	public WebDriverWait wait;
	public Login_PageObject logpage;
    public ReportDashboardPageobject report;
    public heatmap_filters_pageobject filterpage;
    public Save_heatmapReport savereportpage;
	
	
public void openBrowser() 
{
	driver = new ChromeDriver();
	
	logpage=new Login_PageObject(driver);
	report = new ReportDashboardPageobject(driver);
	report=new ReportDashboardPageobject(driver);
    filterpage = new heatmap_filters_pageobject(driver);
    savereportpage= new Save_heatmapReport(driver);
	
	driver.manage().window().maximize();
	
	driver.get("https://app.vgqa.glint.cloud-dev.microsoft/session/auth");
	
}

public void LoginCredentials() throws InterruptedException {
	
	Thread.sleep(5000);
	
	
	logpage.enter_mailid("qatester@glintinc.com");
    //wait = new WebDriverWait(driver,30);
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//footer[@class='sessionFormFooter']/button")));
	
	
	
	logpage.setContinuebutton();
	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	logpage.enter_clientid("qa20191108");
	
	
	logpage.setContinuebutton();
	
	
	
	logpage.enter_password("Dem0@pass2");
	
	logpage.setContinuebutton();
	
	//logpage.click_PasswordContinue_button();
}
	
public void open_heatmapReport() throws InterruptedException 

{
	Thread.sleep(5000);
	
	report.click_reportsDashboard();
	report.searchSurvey_method("Recurring survey-20191113");
	report.click_recurringSurvey();
	report.click_heatmapReport();
}	


public void changesurevy_method() throws InterruptedException {
	
	filterpage.click_filter();
	filterpage.click_surveyDropdown();
	filterpage.select_decemberSurvey();
	filterpage.click_closefiltericon();
	
	
}



public void viewReport_method() throws InterruptedException {
	
	
	
	
	filterpage.click_Qus_DiscretionaryEffort();
	
	//Thread.sleep(5000);
	
	filterpage.click_viewReport();
	
	savereportpage.assertverify_method();
	
	
	
}


public void takeAction_method() throws InterruptedException {
	
	Thread.sleep(5000);
	
	filterpage.click_Qus_DiscretionaryEffort();
	
	Thread.sleep(5000); 
	
	filterpage.click_takeAction();
	
}


public void Add_filterMethod() throws InterruptedException 
{
	
	Thread.sleep(5000);
	
	filterpage.click_filter();
	
	filterpage.click_addfilter();
	
	
	
	filterpage.click_agefilter();
	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	filterpage.select_ageNumber();
	
	filterpage.click_doneBtton();
	
	filterpage.click_closefiltericon();
}



public void saveAS_Report_method() throws InterruptedException
{
	
	savereportpage.click_saveAsDropdown();
	
	
	savereportpage.click_saveAsButton();
	
	
	Thread.sleep(3000);
	
	savereportpage.Add_reportName("R68 REPORT");
	
	savereportpage.Click_saveButton();
		
	savereportpage.Click_goBack();
	
	

	
}





public void mouseHover_method() 
{
	
	filterpage.MouseHover_action();
	
	filterpage.get_mouseHoverSCORE();
}

public void moveafter_method() throws InterruptedException {
	
	filterpage.click_Qus_DiscretionaryEffort();
	filterpage.click_dropdown_moveAfter();
	Thread.sleep(3000);
	filterpage.click_moveAfter();
	filterpage.select_onequestion_formoveAfter();
}











}
