package com.qa.CarParkSelenium.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	@FindBy(id = "createBookingButton")
	private WebElement bookingButton;
	
	@FindBy(id = "viewBookingsButton")
	private WebElement viewBookingsButton;
	
	@FindBy(id = "carMake")
	private WebElement carMakeInput;
	
	@FindBy(id = "carModel")
	private WebElement carModelInput;
	
	@FindBy(id = "arrivalDate")
	private WebElement arrivalDate;
	
	@FindBy(id = "departureDate")
	private WebElement departureDate;
	
	@FindBy(xpath = "//*[@id=\"createBookingForm\"]/button[2]")
	private WebElement createSubmitButton;
	
	@FindBy(xpath = "//*[@id=\"viewAllBookings\"]/div[1]/div/div[2]/button[2]")
	private WebElement editButton;
	
	@FindBy(id ="updatedCarMake")
	private WebElement updatedCarMakeinput;
	
	@FindBy(id = "updatedCarModel")
	private WebElement updatedCarModelInput;
	
	@FindBy(id = "updatedArrivalDate")
	private WebElement updatedArrivalDate;
	
	@FindBy(id = "updatedDepartureDate")
	private WebElement updatedDepartureDate;
	
	@FindBy(id = "submitUpdate")
	private WebElement updateSubmit;
	
	@FindBy(xpath = "//*[@id=\"viewAllBookings\"]/div[1]/div/div[2]/button[1]")
	private WebElement removeBookingButton;
	

	public WebElement getEditButton() {
		return editButton;
	}

	public WebElement getRemoveBookingButton() {
		return removeBookingButton;
	}

	public WebElement getUpdatedCarMakeinput() {
		return updatedCarMakeinput;
	}

	public WebElement getUpdatedCarModelInput() {
		return updatedCarModelInput;
	}

	public WebElement getUpdatedArrivalDate() {
		return updatedArrivalDate;
	}

	public WebElement getUpdatedDepartureDate() {
		return updatedDepartureDate;
	}

	public WebElement getUpdateSubmit() {
		return updateSubmit;
	}

	public WebElement getBookingButton() {
		return bookingButton;
	}

	public WebElement getViewBookingsButton() {
		return viewBookingsButton;
	}

	public WebElement getCarMakeInput() {
		return carMakeInput;
	}

	public WebElement getCarModelInput() {
		return carModelInput;
	}

	public WebElement getArrivalDate() {
		return arrivalDate;
	}

	public WebElement getDepartureDate() {
		return departureDate;
	}

	public WebElement getCreateSubmitButton() {
		return createSubmitButton;
	}
	
}
