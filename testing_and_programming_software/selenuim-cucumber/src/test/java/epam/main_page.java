package epam;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class main_page {
	
	
	private By search = By.xpath("//*[@id=\"wrapper\"]/div[2]/div[1]/header/div/ul/li[3]/div/button");
	private By join_our_team = By.xpath("/html/body/div[2]/main/div[1]/div[6]/section/div/div[3]/div/a");
	private By search_form = By.id("new_form_search");
	private Keys Enter = Keys.ENTER;
	private WebDriver driver;
	
	public main_page(WebDriver driver) {
		this.driver = driver;
		this.driver.manage().window().maximize();
	}
	
	public void open(String url) {
		driver.get(url);
	}
	
	public void search(String str) {
		driver.findElement(search).click();
		driver.findElement(search_form).sendKeys(str);
		driver.findElement(search_form).sendKeys(Enter);
	}
	
	
	
	public void check_page(String result) { driver.getPageSource().contains(result); }
	
	
	public void click_on_logo() { driver.findElement(By.className("header__logo")).click(); }
	public void click_on_services() { driver.findElement(By.cssSelector("li.top-navigation__item:nth-child(1) > span:nth-child(1) > a:nth-child(1)")).click(); }
	public void click_on_how_we_do_it() { driver.findElement(By.cssSelector("li.top-navigation__item:nth-child(2) > span:nth-child(1) > a:nth-child(1)")).click(); }
	public void click_on_our_work() { driver.findElement(By.cssSelector("li.top-navigation__item:nth-child(3) > span:nth-child(1) > a:nth-child(1)")).click(); }
	public void click_on_about() { driver.findElement(By.cssSelector("li.top-navigation__item:nth-child(5) > span:nth-child(1) > a:nth-child(1)")).click(); }
	public void click_on_careers() { driver.findElement(By.cssSelector("li.top-navigation__item:nth-child(6) > span:nth-child(1) > a:nth-child(1)")).click(); }
	
	public void click_on_JOT() {
		String ref = driver.findElement(join_our_team).getAttribute("href");
		driver.navigate().to(ref);
		}
	
	public String get_url() { return driver.getCurrentUrl(); }
	
	
	protected void finalize() throws Throwable { driver.close(); }
}
