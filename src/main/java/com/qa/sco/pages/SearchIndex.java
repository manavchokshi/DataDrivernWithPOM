package com.qa.sco.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.sco.base.TestBase;



public class SearchIndex extends TestBase {

	//Page Factory - Object Repositary:
	
	@FindBy(xpath="//input[@placeholder='Search for an index']")
	WebElement search;
	
	
	@FindBy(xpath="//span[contains(text(),'Morningstar Wide Moat Focus')]")
	WebElement ClikOn;

	@FindBy(xpath="//span[contains(text(), 'All Indexes')] ")
	WebElement AllIndex;
	
	@FindBy(xpath = "//span[contains(text(), 'Equity')]")
	WebElement Equity;

	@FindBy(xpath = "//input[@aria-label='Index Name']")
	WebElement KeyBoard;
	
	@FindBy(xpath ="//tbody/tr[1]")
	List <WebElement> Rows;
	
	
	
	//Initialization the Page Objects:
	public SearchIndex() {
		PageFactory.initElements(driver,this);
		
	}

	
	public nextPage Searchforindex() {
		search.sendKeys("MorningStar");
		Actions a = new Actions(driver);
		a.click(ClikOn).build().perform();
		return new nextPage();
		
	}
	public void cliclOnIndex() {
		AllIndex.click();
		
	}
	public void ClickOnEquity() {
		Equity.click();
	}
	
	
	public void clickOnKeyBoard(){
		KeyBoard.sendKeys("abc");
		
	}
	public int rows() {
		return Rows.size();
	}
}
