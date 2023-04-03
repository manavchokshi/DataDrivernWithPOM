package com.qa.sco.testCases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.sco.base.TestBase;
import com.qa.sco.pages.SearchIndex;
import com.qa.sco.pages.nextPage;




public class LoginPageTest extends TestBase {

	SearchIndex searchindex;
	nextPage nextpage;
	

	
	@BeforeMethod
	public void setUp() {
		initialization();             //Call method from parent class
	    searchindex = new SearchIndex(); //To write this for calling  from other class
	    nextpage = new nextPage();
		}

	@Test(priority = 0)
	public void VerifySearchIndex(){
	
		nextpage = searchindex.Searchforindex();
		
		
	 }
	@Test(priority = 1)
	public void clickOnAllEquity() {
		searchindex.ClickOnEquity();
		
	}
	
	@Test(priority = 2)
	public void clickOnIndex() {
		searchindex.cliclOnIndex();
		
	}
	@Test(priority = 3)
	public void NumRows() {
		Assert.assertEquals(searchindex.rows(),10);
				
	}
	

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
