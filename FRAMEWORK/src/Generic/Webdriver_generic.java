package Generic;

import org.openqa.selenium.WebDriver;

public class Webdriver_generic {
public void get_the_title(WebDriver driver)
{
	String title=driver.getTitle();
System.out.println(title);

}
public void get_the_url(WebDriver driver)
{
	String url=driver.getCurrentUrl();
System.out.println(url);
}
}
