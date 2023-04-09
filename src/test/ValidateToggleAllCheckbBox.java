package test;

import java.io.IOException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.TestBase;
import pages.NSSToDoPage;

class ValidateToggleAllCheckbBox extends TestBase
{

	public ValidateToggleAllCheckbBox() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	NSSToDoPage nsstdolist;
	
	@BeforeEach
	void setUp() throws Exception 
	{
		TestBase.openBrowser();
		nsstdolist = new NSSToDoPage();
	}

	@AfterEach
	void tearDown() throws Exception 
	{
		driver.close();
	}

	@Test
	void VlidateToggleButton() throws InterruptedException 
	{

		nsstdolist.clickOnAllTogglebox();					
			
		int numberofcheckbox = nsstdolist.countOfallCheckBox();
		
		if (numberofcheckbox!=0) 
		{
				
		for (int i = 1; i <= numberofcheckbox; i++) 	
		{
			WebElement checkBoxSelected = driver.findElement(By.xpath("//div[@id='todos-content']/form/ul/li["+i+"]/input"));
			boolean isSelected = checkBoxSelected.isSelected();						
			
			if (isSelected == true )
			{
				System.out.println("check box number : " + i + " is CHECKED");
			}else 
			{
				System.out.println("check box number : " + i + " is UNCHECKED");
			}
		}
		} else 
		{
               System.out.println("Check box is not there to validate");
		}
				
	}

}
