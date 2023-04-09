package test;

import java.io.IOException;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import base.TestBase;
import pages.NSSToDoPage;

public class ValidateSingleListItemTobeRemove extends TestBase
{

	public ValidateSingleListItemTobeRemove() throws IOException {
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
		//driver.close();
	}

	@Test
	void RemovedSingleItemFromList() throws InterruptedException 
	{
		int count_of_all_check_box_before_remove = nsstdolist.countOfallCheckBox();
		System.out.println(" Before removed List of the Items is : " + count_of_all_check_box_before_remove);
		
		nsstdolist.clickOnFirstCheckBox();

		nsstdolist.clickOnRemovedBtn();
		
		Thread.sleep(1000);
		
		int count_of_all_check_box_after_remove = nsstdolist.countOfallCheckBox();
		System.out.println(" After removed List of the Items is : " + count_of_all_check_box_after_remove);
		
		Assert.assertNotEquals(count_of_all_check_box_before_remove, count_of_all_check_box_after_remove);
	}
}
