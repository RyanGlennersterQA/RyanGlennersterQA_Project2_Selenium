package com.qa.CarParkSelenium.Tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import com.qa.CarParkSelenium.Pages.HomePage;

public class HomePageTests {

private WebDriver driver;
	
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().setSize(new Dimension(1378, 690));
	}
	
	@After
	public void shutDown() {
		driver.close();
	}
	
	@Test
	public void testLoad() {
		driver.get("http://localhost:8080");
		assertEquals("Car Park Manager", driver.getTitle());
	}
	
	@Test
	public void createBooking() {
		driver.get("http://localhost:8080");
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.getBookingButton().click();
		homePage.getCarMakeInput().sendKeys("Mercedes");
		homePage.getCarModelInput().sendKeys("GLA");
		homePage.getArrivalDate().sendKeys("13052021");
		homePage.getDepartureDate().sendKeys("14052021");
		
		
		homePage.getCreateSubmitButton().click();
		
		driver.manage().timeouts().implicitlyWait(1800, TimeUnit.MILLISECONDS);
		
		assertTrue(driver.getPageSource().contains("Booking"));
	}
	
	@Test
	public void viewAllTest() {
		driver.get("http://localhost:8080");
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		
		homePage.getViewBookingsButton().click();
		
		driver.manage().timeouts().implicitlyWait(1500, TimeUnit.MILLISECONDS);
		
		assertTrue(driver.getPageSource().contains("Model"));
	}
	
	@Test
	public void editTest() {
		driver.get("http://localhost:8080");
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		
		homePage.getViewBookingsButton().click();
		
		driver.manage().timeouts().implicitlyWait(1500, TimeUnit.MILLISECONDS);
		
		homePage.getEditButton().click();
		
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		
		homePage.getUpdatedCarMakeinput().sendKeys("Range Rover");
		homePage.getUpdatedCarModelInput().sendKeys("Velar");
		homePage.getUpdatedArrivalDate().sendKeys("20052021");
		homePage.getUpdatedDepartureDate().sendKeys("21052021");
		homePage.getUpdateSubmit().click();
		
		driver.manage().timeouts().implicitlyWait(1500, TimeUnit.MILLISECONDS);
		
		assertTrue(driver.getPageSource().contains("Successful!"));
		
	}
	
	@Test
	public void removeTest() {
		driver.get("http://localhost:8080");
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		
		homePage.getViewBookingsButton().click();
		
		driver.manage().timeouts().implicitlyWait(1500, TimeUnit.MILLISECONDS);
		
		homePage.getRemoveBookingButton().click();
		
		driver.manage().timeouts().implicitlyWait(1500, TimeUnit.MILLISECONDS);
		
		assertTrue(driver.getPageSource().contains("removed"));
		
		
	}
	
}
