package HeatMap_Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import org.testng.Assert;

public class Save_heatmapReport {
	
	public WebDriver driver;
	
	public Save_heatmapReport(WebDriver newdriver) {
		
		driver=newdriver;
		PageFactory.initElements(newdriver,this);
	}
	

//@FindBy(how = How.XPATH,using="//div[@aria-label='Report Export Options Menu']")
	
@FindBy(how = How.XPATH,using="//glint-dropdown[@id='reportExportDropdown']")
@CacheLookup
WebElement saveAs_dropdown;	
	
	
@FindBy(how = How.XPATH,using="//li[@data-value='SAVE_AS']")
@CacheLookup
WebElement saveAs_Button;

@FindBy(how = How.ID, using="saveDialogTitle")
@CacheLookup
WebElement Reportname;

@FindBy(how = How.XPATH,using="//button[@translate='actions.save']")
@CacheLookup
WebElement saveButton;

@FindBy(how = How.XPATH,using="//glint-back-button[@class='backButton ng-star-inserted']")
@CacheLookup
WebElement goBackButton;

//assert verify text


//@FindBy(how = How.XPATH, using="//h1[text()=' Exec Summary ']")
//@CacheLookup
//WebElement reportText_assertVerify;	

public WebElement reportText_assertVerify()
{
    WebElement assertVerify  = driver.findElement(By.xpath("//h1[@class='reportTitle']"));
     return assertVerify;
}
	
	

public void assertverify_method() 
{
	String getActualTitle = reportText_assertVerify().getText();
    Assert.assertEquals(getActualTitle ,"Exec Summary");
    
    System.out.println(reportText_assertVerify().getText());
    
}


public void click_saveAsDropdown() throws InterruptedException 
{
	Thread.sleep(3000);
	saveAs_dropdown.click();
}


public void click_saveAsButton() throws InterruptedException 
{
	Thread.sleep(3000);
//Select s= new Select(saveAs_dropdown);
//s.selectByIndex(5);
	
	
	saveAs_Button.click();
}


public void Add_reportName(String save_reportname)
{
	Reportname.clear();
	
	Reportname.sendKeys(save_reportname);
	
	
	
}

public void Click_saveButton()
{
	
	saveButton.click();

}

public void Click_goBack()
{
	
	goBackButton.click();

}


}
