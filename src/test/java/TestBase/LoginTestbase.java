package TestBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v125.page.model.NavigatedWithinDocument;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import HeatMap_Pageobjects.FocusArea_Heatmap_pageobject;
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
    public FocusArea_Heatmap_pageobject goalheatmap;
	
	
public void openBrowser() 
{
	driver = new ChromeDriver();
	
	logpage=new Login_PageObject(driver);
	report= new ReportDashboardPageobject(driver);
    filterpage = new heatmap_filters_pageobject(driver);
    savereportpage= new Save_heatmapReport(driver);
    goalheatmap= new FocusArea_Heatmap_pageobject(driver);
	
	driver.manage().window().maximize();
	
	driver.get("https://app.vgqa.glint.cloud-dev.microsoft/session/auth");
	
}

public void LoginCredentials() throws InterruptedException {
	
	Thread.sleep(5000);
	
	
	logpage.enter_mailid("qatester@glintinc.com");
    
	logpage.setContinuebutton();
	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	logpage.enter_clientid("qa20191108");
	
	
	logpage.setContinuebutton();
	
	
	
	logpage.enter_password("Dem0@pass2");
	
	logpage.setContinuebutton();
	
	
}
	
public void open_heatmapReport() throws InterruptedException 

{
	Thread.sleep(5000);
	
	report.click_reportsDashboard();
	driver.navigate().refresh();
	report.searchSurvey_method("Recurring survey-20191113");
	Thread.sleep(5000);
	//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	report.click_recurringSurvey();
	Thread.sleep(5000);
	//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	report.click_heatmapReport();
}	


public void changesurevy_method() throws InterruptedException 
{
	filterpage.click_filter_method();
	filterpage.click_surveyDropdown();
	filterpage.select_decemberSurvey();
	filterpage.click_closefiltericon();	
}



public void viewReport_method() throws InterruptedException 
{
	
	filterpage.click_Qus_Basepay();
	filterpage.click_viewReport();
	savereportpage.assertverify_method();
	
}

public void takeAction_method() throws InterruptedException 
{
	Thread.sleep(5000);
	
	filterpage.click_Qus_Basepay();
	
	Thread.sleep(5000); 
	
	filterpage.click_takeAction();
}

public void get_GoalTitle() throws InterruptedException
{
	goalheatmap.Viewing_Goal_method();
	goalheatmap.Focusarea_Title_method();
}

public void Addfilter_report() throws InterruptedException 
{
	Thread.sleep(5000);
	filterpage.click_filter_method();
	filterpage.click_addfilter_method();
	filterpage.click_birthyear_filter_method();
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
	savereportpage.Add_reportName("R75 REPORT");
	savereportpage.Click_saveButton();
	Thread.sleep(3000);
	savereportpage.Click_goBack();
}

public void deletereport() throws InterruptedException 
{
	report.click_reportsDashboard();
	report.reportcount_method();
	Thread.sleep(3000);
	report.nextbutton_method();
	Thread.sleep(3000);
	report.deletereport_method();
	Thread.sleep(3000);
	report.deletebutton_method();
	driver.navigate().refresh();
	
}

public void mouseHover_method() throws InterruptedException 
{
	Thread.sleep(3000);
	filterpage.MouseHover_action();
	Thread.sleep(3000);
	filterpage.get_mouseHoverSCORE();
}

public void moveafter_method() throws InterruptedException 
{
	
	filterpage.click_Qus_Basepay();
	//filterpage.click_dropdown_moveAfter();
	Thread.sleep(3000);
	filterpage.click_moveAfter();
	Thread.sleep(3000);
	filterpage.select_onequestion_formoveAfter();
}

public void select_ungrouped() throws InterruptedException 
{
	filterpage.ungrouped_method();
}

public void edit_Report() throws InterruptedException 
{
	filterpage.threedot_method();
	Thread.sleep(3000);
	filterpage.editbutton_method();
	Thread.sleep(3000);
	filterpage.editdropdown_method();
	Thread.sleep(3000);
	filterpage.select_editdropdown_option__method();
	Thread.sleep(3000);
	filterpage.scoresdropdown_method();
	Thread.sleep(3000);
	filterpage.select_scoresdropdown_option_method();
	Thread.sleep(3000);
	filterpage.Donebutton_method();
}

public void addsection_report_RemoveReport() throws InterruptedException 
{
	filterpage.MoreDropdown_method();
	Thread.sleep(3000);
	filterpage.addSection_method();
	Thread.sleep(3000);
	filterpage.addSection_survey_method();
	Thread.sleep(3000);
	filterpage.addedSurvey_threeDot_method();
	Thread.sleep(3000);
	filterpage.removeButton_method();
}
public void benchmark_reportlink() throws InterruptedException 
{
	filterpage.click_benchmark_link_method();
	Thread.sleep(3000);
	filterpage.benchmark_text_method();
	Thread.sleep(3000);
	filterpage.select_internal_benchmark_method();
	Thread.sleep(3000);
	filterpage.select_external_benchmark_method();
	Thread.sleep(3000);
	filterpage.click_doneButton_benchmark_method();
	Thread.sleep(3000);
	filterpage.click_exportButton_method();
	Thread.sleep(3000);
	filterpage.click_exportPPT_method();
}
}
