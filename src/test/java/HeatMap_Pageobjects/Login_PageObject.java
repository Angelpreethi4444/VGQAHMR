package HeatMap_Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Login_PageObject {
	
	public WebDriver driver;
	
	
	public Login_PageObject(WebDriver newdriver)
	{
		driver=newdriver;
		PageFactory.initElements(newdriver, this);	}
	
	
	
//Element Declaration
	
@FindBy(how = How.ID, using="email")
@CacheLookup
WebElement EmailId;

//@FindBy(how = How.XPATH, using="//footer[@class='sessionFormFooter']/button")
////@FindBy(how = How.XPATH,using="//button[text()='Continue']")////button[@class='btnCta glintButton']   ////button[@class='btnCta glintButton']
//@CacheLookup
//WebElement Continue_Button;


@FindBy(how = How.ID, using="clientUuid")
@CacheLookup
WebElement ClientId;

//@FindBy(how = How.XPATH, using="//button[@translate='session.continueButton']")
//@CacheLookup
//WebElement companyid_continueButton;


@FindBy(how = How.ID, using="password")
@CacheLookup
WebElement Password;

//@FindBy(how = How.XPATH, using="//button[@class='btnCta glintButton']")
//@CacheLookup
//WebElement password_continueButton;


public WebElement continue_button()
{
    WebElement cbutton = driver.findElement(By.xpath("//button[@class='btnCta glintButton']"));
     return cbutton;
}




// Method Declaration for each locators


public void enter_mailid(String usermail) 
{
	EmailId.sendKeys(usermail);
	
}

public void enter_clientid(String userid)
{
	ClientId.sendKeys(userid);

}

public void enter_password(String pswd)
{
	Password.sendKeys(pswd);
}

//public void click_continue_button()
//{
//	Continue_Button.click();
//}
//
//public void click_companyContinue_button() {
//
//	companyid_continueButton.click();
//}
//	
//
//public void click_PasswordContinue_button() {
//	password_continueButton.click();
//}


public void setContinuebutton()
{
	continue_button().click();
}




















}
