package pages;


import java.io.IOException;
import java.util.List;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class NSSToDoPage extends TestBase
{
	
	public NSSToDoPage() throws IOException 
	{
		
		PageFactory.initElements(driver , this);
		// TODO Auto-generated constructor stub
	}


	@FindBy(name ="allbox")
	WebElement allcheckboxelement;
		
	
	@FindBy(how=How.XPATH,using="//div[@id='todos-content']/form/ul/li")
	List<WebElement> listofcheckboxselement;
	
	@FindBy(xpath ="//div[@id='todos-content']/form/ul/li[1]/input")
	WebElement firstcheckboxelement;
	
	@FindBy(xpath ="//div[@id='todos-content']/form/ul/li[1]")
	WebElement gettextoffirstelement;
	
	
	@FindBy(xpath ="//input[@value='Remove']")
	WebElement clickonremovedbutton;
	
	public void clickOnAllTogglebox() 
	{
		allcheckboxelement.click();;
	}
	
	public int countOfallCheckBox() 
	{		
		int cnt = listofcheckboxselement.size();
		return cnt;
	}
	
	public String clickOnFirstCheckBox() 
	{
		firstcheckboxelement.click();
		String titleofement = gettextoffirstelement.getText();
		return titleofement;
	}
	
	public void clickOnRemovedBtn() {
		clickonremovedbutton.click();
	}
	
		
}
