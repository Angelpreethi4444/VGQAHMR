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
	
	
public heatmap_filters_pageobject(WebDriver newdriver)
	{
		driver=newdriver;
		PageFactory.initElements( newdriver,this);
	}
		
                                             //view Report part	
	
@FindBy(how = How.XPATH, using="(//div[@data-label='Question'])[4]")
@CacheLookup
WebElement qus4;	

@FindBy(how = How.XPATH, using="//li[@data-value='ViewReport']")
@CacheLookup
WebElement viewReport;	

@FindBy(how = How.XPATH, using="(//li[@class='moveAction ng-star-inserted'])[3]")
@CacheLookup
WebElement takeAction;	


                                      //change survey 

@FindBy(how = How.XPATH, using="//div[@class='menuContainer applyMaxWidthMenuContainer']")
@CacheLookup
WebElement changeSurevy_dropdown;	
	

@FindBy(how = How.ID, using="option1")
@CacheLookup
WebElement select_Surevy;	
	
                                       //Filter Locators	
	
	
@FindBy(how = How.XPATH, using="//button[@class='addFilterButtonPanel ng-star-inserted']")
@CacheLookup
WebElement filter;

@FindBy(how = How.XPATH, using="//span[text()='Add Filters']")
@CacheLookup
WebElement Addfilter;

@FindBy(how = How.XPATH, using="//div[text()='Age']")
@CacheLookup
WebElement Agefilter;


@FindBy(how = How.XPATH, using="(//label[@data-id='filterEditorValueLabel'])[2]")
@CacheLookup
WebElement AgeNumber;

@FindBy(how = How.XPATH, using="//button[text()=' Done ']")
@CacheLookup
WebElement doneButton;

@FindBy(how = How.XPATH, using="//button[@class='btnWithVgIcon subtleBtn footerButton glintButton ng-star-inserted']")
@CacheLookup
WebElement closefilterIcon;

                                     // Mouse hover for score

@FindBy(how = How.XPATH, using="(//button[@class='content BUCKET_2 ng-star-inserted'])[2]")
@CacheLookup
WebElement mouse_hover;

@FindBy(how = How.XPATH, using="//div[@data-id='glintTooltip']")
@CacheLookup
WebElement mousehover_Score;


                                        // move after section

@FindBy(how = How.XPATH, using="(//button[@class='moveActionMenuButton popupMenuButton btnIcon glintButton'])[5]")
@CacheLookup
WebElement moveafter_dropdown;

@FindBy(how = How.XPATH, using="//span[text()=' Move After ']")
@CacheLookup
WebElement moveafter;

@FindBy(how = How.XPATH, using="(//button[@class='subMenuItemButton'])[1]")
@CacheLookup
WebElement moveafter_question;

                                        //view report method

public void click_Qus_Basepay() throws InterruptedException 
{
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,250)", "");
    
    Thread.sleep(3000);
    
    qus4.click();
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


                                          // MOUSE HOVER METHOD

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
	//String ExpectedTitle =("Score 50\r\n"+"Company 50\r\n"+"Pulsed on Dec 20, 2023");
	String ExpectedTitle =("Score 50\r\n"
			+ "Pulsed on Oct 13, 2019");
	Assert.assertEquals(ActualTitle , ExpectedTitle);
	
//	String getActualTitle = mousehover_Score.getText();
//	Assert.assertEquals(getActualTitle, "Score 50\r\n"
//			 	+"Company 50\r\n"
//			 	+"Pulsed on Dec 20, 2023");
}


                                              // move after method

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

                                           // change survey method

public void click_surveyDropdown() throws InterruptedException 
{
		Thread.sleep(3000);
	changeSurevy_dropdown.click();
}

public void select_decemberSurvey() throws InterruptedException 
{
	Thread.sleep(3000);
	System.out.println(select_Surevy.getText());
	select_Surevy.click();
}
}
