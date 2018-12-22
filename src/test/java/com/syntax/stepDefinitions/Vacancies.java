package com.syntax.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.syntax.pages.AddVacancies;
import com.syntax.pages.LoginPage;
import com.syntax.utils.BaseClass;
import com.syntax.utils.CommonMethods;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Vacancies extends BaseClass {

	AddVacancies vac;

	@Given("^I logged into OrangeHRM$")
	public void i_logged_into_OrangeHRM() {
		LoginPage login = new LoginPage();
		CommonMethods.enterValue(login.username, BaseClass.prop.getProperty("username"));
		CommonMethods.enterValue(login.password, BaseClass.prop.getProperty("password"));
		CommonMethods.click(login.btnLogin);
		vac = new AddVacancies();
	}

	@Given("^click on login$")
	public void click_on_login() {
		driver.findElement(By.id("btnLogin")).click();
	}

	@When("^I click Recruitment Module and click Vacancies$")
	public void i_click_Recruitment_Module_and_click_Vacancies() {
		vac.recruitment.click();
		vac.vacancies.click();
	}

	@When("^Click Add$")
	public void click_Add() {
		vac.add.click();
	}

	@When("^Select Job Title to any job Title$")
	public void select_Job_Title_to_any_job_Title() {
		Select select = new Select(vac.jobTitle);
		select.selectByVisibleText("IT Executive");
	}

	@When("^Enter Vacancy Name$")
	public void enter_Vacancy_Name() {
		CommonMethods.enterValue(vac.vacancyName, "IT Manager");
	}

	@When("^Enter Hiring Manager to John Smith$")
	public void enter_Hiring_Manager_to_John_Smith() {
		CommonMethods.enterValue(vac.hiringManager, "John Smith");
	}

	@When("^Enter Number Of Positions one$")
	public void enter_Number_Of_Positions_one() {
		CommonMethods.enterValue(vac.numberOfPositions, "1");
	}

	@When("^Enter Description$")
	public void enter_Description() {
		CommonMethods.enterValue(vac.discription, "IT Manager, permanent position");
	}

	@When("^I Click Save$")
	public void i_Click_Save() {
		vac.save.click();
	}

	@Then("^I see vacancy details are displayed$")
	public void i_see_vacancy_details_are_displayed() {
		boolean checkbox = driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_2']")).isDisplayed();
		Assert.assertTrue(checkbox);
	}

////scenario 2///////////
	@When("^Select Job Title that matches previous entry\\.$")
	public void select_Job_Title_that_matches_previous_entry() {
		Select select = new Select(vac.jobTitle);
		select.selectByVisibleText("IT Executive");
	}

	@When("^Select Vacancy to Vacancy name that matches previous entry\\.$")
	public void select_Vacancy_to_Vacancy_name_that_matches_previous_entry() {
		Select select = new Select(vac.vacancyName);
		select.selectByVisibleText("IT Manager");
	}

	@When("^Select Hiring Manager to John Smith$")
	public void select_Hiring_Manager_to_John_Smith() {
		Select select = new Select(vac.hiringManager);
		select.selectByVisibleText("John Smith");
	}

	@When("^Select Status to All$")
	public void select_Status_to_All() {
		Select select = new Select(vac.selectStatus);
		select.selectByVisibleText("All");
	}

	@Then("^I see Vacancy appears$")
	public void i_see_Vacancy_appears() {
		boolean checkbox = driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_2']")).isDisplayed();
		Assert.assertTrue(checkbox);
	}

	@When("^Click Search$")
	public void click_Search() {
		vac.Search.click();
	}

	@When("^Validate Vacancy appears$")
	public void validate_Vacancy_appears() {
		boolean checkbox = driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_2']")).isDisplayed();
		Assert.assertTrue(checkbox);
	}

	@When("^Check the Checkbox of created Vacancy$")
	public void check_the_Checkbox_of_created_Vacancy() {
		driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_2']")).click();
	}

	@When("^Click Delete$")
	public void click_Delete() {
		driver.findElement(By.xpath("//input[@id='btnDelete']")).click();
		Alert simpleAlert = driver.switchTo().alert();
		String alertText = simpleAlert.getText();
		System.out.println("Alert text is " + alertText);
		simpleAlert.accept();
	}

	@Then("^I see the message No Record Found$")
	public void i_see_the_message_No_Record_Found() {
		boolean record = driver.findElement(By.xpath("//td[@colspan='5']")).isDisplayed();
		Assert.assertTrue(record);
	}

}
