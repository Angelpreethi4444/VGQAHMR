package HeatMap_Pageobjects;

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
		PageFactory.initElements(newdriver, this);
	}
	
@FindBy(how = How.XPATH, using="//a[text()=' Reports ']")

@CacheLookup
WebElement reportsDashboard;

@FindBy(how = How.XPATH, using="(//input[@type='search'])[3]")
@CacheLookup
WebElement searchSurvey;

@FindBy(how = How.CLASS_NAME,using="facet indent ng-star-inserted")
@CacheLookup
WebElement recurring_Survey;

@FindBy(how = How.XPATH, using="//div[@class='header heatMapReport']")
@CacheLookup
WebElement heatmapReport;




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
	
	

}
