package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_login {
@FindBy(id="email")
private WebElement email;

@FindBy(id="pass")
private WebElement password;

@FindBy(xpath="//button[@type='submit']")
private WebElement loginbtn;

public Facebook_login(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
public void setEmail(String mail)
{
	email.sendKeys(mail);
	
}
public void setPass(String pwd)
{
	password.sendKeys(pwd);
}
public void passBtn()
{
	loginbtn.click();

}
}
