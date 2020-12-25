package StepDefefinitions;

import epam.main_page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class EpamTests {
	
	
	WebDriver driver = null;
	main_page login;
	
	@Given("open {string}")
	public void open(String string) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Education\\Programs\\Selenium2\\cucunber\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		login = new main_page(driver);
		login.open(string);
	}
	
	@When("search {string}")
	public void search(String string) {
		login.search(string);
	}

	/*@When("click on {string}")
	public void click_on(String string) {
	    login.find(string);
	}*/
	
	@When("scroll down to Join Our Team Today! click on {string}")
	public void scroll_down_to_join_our_team_today(String string) {
		login.click_on_JOT();
	}

	@When("click on epam")
	public void click_on_epam() {
		login.click_on_logo();
	}

	@When("click on Services")
	public void click_on_services() {
		login.click_on_services();
	}
	
	@When("click on How we do it")
	public void click_on_how_we_do_it() {
		login.click_on_how_we_do_it();
	}
	
	@When("click on Our Work")
	public void click_on_our_work() {
		login.click_on_our_work();
	}
	
	@When("click on About")
	public void click_on_about() {
		login.click_on_about();
	}

	
	@When("click on Careers")
	public void click_on_careers() {
		login.click_on_careers();
	}
	
	@Then("site should refresh")
	public void site_should_refresh() {
		//driver.close();
	}
	
	@Then("u should see {string}")
	public void u_should_see(String string) {
		login.check_page(string);
	}
	@Then("u should see {string} {string}")
	public void u_should_see(String string1, String string2) {
		login.check_page(string1);
		login.check_page(string2);
	}


	@Then("u should be on {string}")
	public void u_should_be_on(String string) {
		Assert.assertEquals(login.get_url(), string);
	}


	@When("press {string} on keyboard")
	public void press_on_keyboard(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
