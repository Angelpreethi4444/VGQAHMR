package HeatMap_Pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ReportDashboardPageobject {
	
 public WebDriver driver;
 
	public ReportDashboardPageobject(WebDriver newdriver) 
	{
		driver=newdriver;
		PageFactory.initElements(newdriver, this);;
	}
	
@FindBy(how = How.ID, using="tab-4")
@CacheLookup
WebElement reportsDashboard;

@FindBy(how = How.XPATH, using="(//input[@type='search'])[3]")
@CacheLookup
WebElement searchSurvey;


@FindBy(how = How.XPATH, using="//span[@class='facetListRow noCount']")
@CacheLookup
WebElement recurring_Survey;

@FindBy(how = How.XPATH, using="//div[@class='header heatMapReport']")
@CacheLookup
WebElement heatmapReport;

@FindBy(how = How.XPATH, using="(//button[@class='btnIcon delete glintButton ng-star-inserted'])[9]")
@CacheLookup
WebElement deleteReport;

@FindBy(how = How.XPATH, using="//button[@class='glintButton btnAlert']")
@CacheLookup
WebElement deletebutton;

@FindBy(how = How.XPATH, using="//a[@data-type='next']")
@CacheLookup
WebElement nextbutton;

@FindBy(how = How.XPATH, using="(//span[@class='facetListRow'])[3]")
@CacheLookup
WebElement reportcount;



public void click_reportsDashboard() 
{
	reportsDashboard.click();
}
public void searchSurvey_method(String surveyname) 
{
	searchSurvey.sendKeys(surveyname);
}
public void click_recurringSurvey() 
{
	recurring_Survey.click();
}
public void click_heatmapReport() 
{
	heatmapReport.click();
}
	
public void deletereport_method() 
{
	
    
	deleteReport.click();
}

public void deletebutton_method() 
{
	deletebutton.click();
}

public void nextbutton_method() 
{
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,1000)", "");
	nextbutton.click();
}

public void reportcount_method() 
{
	System.out.println(reportcount.getText());
}



}
