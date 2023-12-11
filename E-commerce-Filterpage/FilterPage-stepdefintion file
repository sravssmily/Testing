package steps;
import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import java.util.Map;



import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pages.FilterPage;
import utilities.XLS_DataProvider;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;



public class FilterPageTest{
	BaseTest Bt;
	WebDriver driver;
	FilterPage Fp;
	public FilterPageTest( BaseTest Bt) {
		this.Bt=Bt;
	}
	
	
	@Given("the user is on the e-commerce website")
	public void the_user_is_on_the_e_commerce_website() {
		driver = Bt.getdriver();
		Fp = PageFactory.initElements(driver, FilterPage.class);
		driver.get("https://www.chilternoakfurniture.co.uk/");
	}
		

@When("the user search for products")
public void the_user_search_for_products() throws InterruptedException {
    Fp.enterTheproduct();
}

@When("the user click on search button")
public void the_user_click_on_search_button() throws InterruptedException {
    Fp.clickOnSearchbtn();
}

@When("user applies price filter")
public void user_applies_price_filter() throws InterruptedException, EncryptedDocumentException, IOException, AWTException {
	
	List<Map<String,String>>testdata = XLS_DataProvider.getTestData("sheet1");
	for(Map<String, String>e : testdata) {
		
		String maxprice =String.valueOf(e.get("max_price"));
		Fp.maximumprice(maxprice);
		Fp.robot();
	}
}


@When("user select the colour")
public void user_select_the_colour() throws InterruptedException {
    Fp.colour();
}

@When("user select the style")
public void user_select_the_style()  throws InterruptedException {
    Fp.Checkbox();
}
}







