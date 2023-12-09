package com.ecommerce.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
public class FilterPage{
     WebDriver driver;
     
     @FindBy(xpath = "(//input[@class = 'main-search__input'])[1]")
 	WebElement Searchbox;
 	
 	@FindBy(xpath = "(//button [@type = 'submit'])[1]")
 	WebElement Searchbutton;
 
 	
 	@FindBy(xpath = "(//input[@id='CCPriceRangeMin']")
	WebElement minimumprice;
 	
 	
 	@FindBy(xpath = "//input[@id = 'CCPriceRangeMax']")
	WebElement maxprice;
 	
 	@FindBy(xpath = "//label[@title = 'Blue']")
 	WebElement bluecolour;
 	
 	@FindBy(xpath = "//input[@type='checkbox']")
 	WebElement checkbox;
 	
 // public FilterPage(WebDriver driver) {
	 // PageFactory.initElements(driver,this);
  
  //public void FilterPage(MinimumPrice,MaximumPrice,colour) {
	 // FilterPageForminimumPrice.sendkeys(minPrice);
	 // FilterPageFormaximumPrice.sendkeys(maxPrice);
	 // FilterPageBlueclour.sendkeys(Bluecolour);
  
  
  
	  
	  

	  
 public void enterTheproduct() throws InterruptedException{
 
 	Searchbox.sendKeys("Table");
 	 Thread.sleep(1500);
 }
  
 public void clickOnSearchbtn() throws InterruptedException
 {
 	Searchbutton.click();
 	Thread.sleep(3000);
 }
 	public void minimum() 
 			throws InterruptedException
 
 {
	 minimumprice.sendKeys("0");
	 Thread.sleep(1500);
 }
 public void maximumprice(String user1) 
		 throws InterruptedException
	{
		maxprice.sendKeys(user1);
		Thread.sleep(3000);
	}
public void colour() throws InterruptedException
{
	bluecolour.click();
	Thread.sleep(3000);
}


public void Checkbox() throws InterruptedException
{
   checkbox.click();
    Thread.sleep(1500);
    		
    
}
}
