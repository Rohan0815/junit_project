package test;

import java.io.IOException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import base.TestBase;
import pages.NSSToDoPage;

public class RemovedAllListByToggleAll extends TestBase
{

	public RemovedAllListByToggleAll() throws IOException 
	{
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
	void RemovedAllItemFromList() throws InterruptedException 
	{
		int count_of_all_check_box_before_remove = nsstdolist.countOfallCheckBox();
		System.out.println(" Before removed List of the Items is : " + count_of_all_check_box_before_remove);
	
		nsstdolist.clickOnAllTogglebox();	
		
		nsstdolist.clickOnRemovedBtn();
		
		Thread.sleep(500);
		
		int count_of_all_check_box_after_remove = nsstdolist.countOfallCheckBox();
		System.out.println(" After removed List of the Items is : " + count_of_all_check_box_after_remove);
	
	}
}
