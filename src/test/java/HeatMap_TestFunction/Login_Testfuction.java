package HeatMap_TestFunction;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import TestBase.LoginTestbase;

public class Login_Testfuction extends LoginTestbase{
	
	
@BeforeMethod
public void launchBrowser() throws InterruptedException 
{
	openBrowser();
	LoginCredentials();
}
	
@Test
public void getPageTitle()
{
	System.out.println(driver.getTitle());
}

@Test
public void launchHeatmap() throws InterruptedException 
{
	Thread.sleep(5000);	
	
	open_heatmapReport();
	
	changesurevy_method();
}


@Test
public void ViewReport_Heatmap() throws InterruptedException
{
	
	open_heatmapReport();
	
	changesurevy_method();
	
	Thread.sleep(3000);
	
	viewReport_method();

    driver.navigate().back();
    
    Thread.sleep(3000);
    
    driver.navigate().refresh();
}

@Test
public void TakeAction_Goal() throws InterruptedException 
{
	open_heatmapReport();
	
	changesurevy_method();
	Thread.sleep(3000);
	
	takeAction_method();
	
    Thread.sleep(3000);
    
    get_GoalTitle();
    
    Thread.sleep(3000);
    
    driver.navigate().back();
    
    driver.navigate().refresh();
}

@Test
public void saveHeatmap_Report() throws InterruptedException
{
	
	open_heatmapReport();
	changesurevy_method();
	Thread.sleep(3000);
	viewReport_method();
	Thread.sleep(3000);
	saveAS_Report_method();
	}

@Test

public void deleteAction_Report() throws InterruptedException
{
	deletereport();
}



@Test
public void select_ageFilters() throws InterruptedException
{
	open_heatmapReport();
	
	Add_filterMethod();
	
	System.out.println(driver.findElement(By.xpath("//span[@class='errorText ng-star-inserted']")).getText());
}


@Test
public void mouseHover_actionmethod() throws InterruptedException 
{
	open_heatmapReport();
	changesurevy_method();
	mouseHover_method();
}


@Test
public void set_moveAfter_Question() throws InterruptedException
{
	open_heatmapReport();
	changesurevy_method();
	moveafter_method();
}

}
