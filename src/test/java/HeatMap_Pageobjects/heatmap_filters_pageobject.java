package HeatMap_Pageobjects;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;

public class heatmap_filters_pageobject {
	
	
	public WebDriver driver;
	
	public  String ActualTitle;
	
	public String ExpectedTitle;
	
	//public  String getActualTitle;
	
		
	public heatmap_filters_pageobject(WebDriver newdriver)
	{
		driver=newdriver;
		PageFactory.initElements( newdriver,this);
	}
	

	
//view Report part	
	
	
	
@FindBy(how = How.XPATH, using="//span[text()=' Discretionary Effort ']")
@CacheLookup
WebElement Qus_DiscretionaryEffort;

@FindBy(how = How.XPATH, using="(//span[@class='heatmapCell score ng-star-inserted'])[3]")
@CacheLookup
WebElement DiscretionaryEffort_score ;	


//@FindBy(how = How.XPATH, using="//span[text()=' View Report ']")
@FindBy(how = How.XPATH, using="//li[@data-value='ViewReport']")
@CacheLookup
WebElement viewReport;	

@FindBy(how = How.XPATH, using="(//li[@class='moveAction ng-star-inserted'])[3]")
@CacheLookup
WebElement takeAction;	


//change surevy 

@FindBy(how = How.XPATH, using="//div[@class='menuContainer applyMaxWidthMenuContainer']")
@CacheLookup
WebElement changeSurevy_dropdown;	
	

@FindBy(how = How.XPATH, using="//li[@aria-label='December 2023 R67 ODSP NOTIFY Pulse']")
@CacheLookup
WebElement select_decSurevy;	
	
//Filter Locators	
	
	
@FindBy(how = How.XPATH, using="//button[@class='btnWithVgIcon subtleBtn footerButton glintButton ng-star-inserted']")
@CacheLookup
WebElement filter;

@FindBy(how = How.XPATH, using="//span[text()='Add Filters']")
@CacheLookup
WebElement Addfilter;

@FindBy(how = How.XPATH, using="//div[text()='Age']")
@CacheLookup
WebElement Agefilter;

//@FindBy(how = How.XPATH, using="(//label[@data-id='filterEditorValueLabel'])[2]")//(//label[@data-id="filterEditorValueLabel"])[2]
//@FindBy(how = How.XPATH, using="(//div[@class='filterEditorRow ng-star-inserted'])[1]")

//@FindBy(how = How.XPATH, using="//input[@class='ng-pristine ng-valid ng-touched']")

@FindBy(how = How.XPATH, using="(//label[@data-id='filterEditorValueLabel'])[2]")
@CacheLookup
WebElement AgeNumber;

@FindBy(how = How.XPATH, using="//button[text()=' Done ']")
@CacheLookup
WebElement doneButton;

@FindBy(how = How.XPATH, using="//button[@class='btnWithVgIcon subtleBtn footerButton glintButton ng-star-inserted']")
@CacheLookup
WebElement closefilterIcon;

// Mousehover for score

@FindBy(how = How.XPATH, using="//button[@class='content BUCKET_2 ng-star-inserted']")
@CacheLookup
WebElement mouse_hover;


@FindBy(how = How.XPATH, using="//div[@class='tooltipContent visible']")
@CacheLookup
WebElement mousehover_Score;


// move after section

@FindBy(how = How.XPATH, using="(//button[@class='moveActionMenuButton popupMenuButton btnIcon glintButton'])[5]")
@CacheLookup
WebElement moveafter_dropdown;

//@FindBy(how = How.XPATH, using="//i[@class='right glintIcon ng-star-inserted']")
//@FindBy(how = How.XPATH, using="//li[@data-value='MoveAfter']")
@FindBy(how = How.XPATH, using="//span[text()=' Move After ']")
@CacheLookup
WebElement moveafter;


@FindBy(how = How.XPATH, using="(//button[@class='subMenuItemButton'])[3]")
@CacheLookup
WebElement moveafter_question;




//view report method

public void click_Qus_DiscretionaryEffort() throws InterruptedException {
	
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,250)", "");
    
    Thread.sleep(3000);
    
    Qus_DiscretionaryEffort.click();
}

public void click_viewReport() throws InterruptedException 
{
	Thread.sleep(3000);
    viewReport.click();
    

}



public void click_takeAction()
{
    
	takeAction.click();
}

//filters method


public void click_filter() 
{
	filter.click();
}

public void click_addfilter() 
{
	Addfilter.click();
}

public void click_agefilter() 
{

	Agefilter.click();
	
	
}
public void select_ageNumber() 
{
		AgeNumber.click();
}
public void click_doneBtton() 
{
	doneButton.click();
}

public void click_closefiltericon() 
{
	closefilterIcon.click();
}


// MOUSEHOVER METHOD

public void MouseHover_action() 
{
	WebElement ele = mouse_hover;
	Actions action = new Actions(driver);
	action.moveToElement(ele).perform();
}


public void get_mouseHoverSCORE() 
{
	System.out.println(mousehover_Score.getText());
	
	String ActualTitle = mousehover_Score.getText();
	String ExpectedTitle =("Score 50\r\n"+"Company 50\r\n"+"Pulsed on Dec 20, 2023");
	Assert.assertEquals(ActualTitle , ExpectedTitle);
	
//	String getActualTitle = mousehover_Score.getText();
//	Assert.assertEquals(getActualTitle, "Score 50\r\n"
//			 	+"Company 50\r\n"
//			 	+"Pulsed on Dec 20, 2023");
}


// moveafter method

public void click_dropdown_moveAfter() 
{
	moveafter_dropdown.click();
}

public void click_moveAfter() 
{
	moveafter.click();
}


public void select_onequestion_formoveAfter() 
{
	moveafter_question.click();
}


public void click_surveyDropdown() throws InterruptedException 
{
		Thread.sleep(3000);
	changeSurevy_dropdown.click();
}

public void select_decemberSurvey() throws InterruptedException 
{
	Thread.sleep(3000);
	select_decSurevy.click();
}
}
