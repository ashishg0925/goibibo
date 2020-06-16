package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import Resources.BrowserSelection;

public class GoibiboLandingPage extends BrowserSelection {
	
	
	By lnk_Sign = By.xpath("//a[@id='get_sign_in'][text()='Sign In']");
	By txt_MobileNum = By.xpath("//input[@id='authMobile'][@type='text']");
	By btn_cont = By.xpath("//button[@id='mobileSubmitBtn'][@type='submit']");
	By txt_pwd = By.xpath("//input[@id='authCredentialPassword'][@type='text']");
	By btn_SignIn = By.xpath("//button[@id='authCredentialPasswordSignInBtn'][text()='Sign In']");
	By img_User = By.xpath("//*[@id=\"hd_user_widdget\"]/i");
	By lnk_Signout = By.xpath("//*[@id=\"hd_user_widdget\"]/div/div[1]/div/span[2]/span[2]");
	
	
	public GoibiboLandingPage(WebDriver driver2) {
		
		GoibiboLandingPage.Driver=driver2; 
	}

	public static WebDriver Driver;
	
	public void loginGoibiboAPP(String Mobile_num, String pwd ) throws InterruptedException
	{
		Driver.findElement(lnk_Sign).click();
		Thread.sleep(2000);
		//int count = Driver.findElements(By.tagName("iframe")).size();
		Driver.switchTo().frame("authiframe");
		
		Driver.findElement(txt_MobileNum).clear();
		Driver.findElement(txt_MobileNum).click();
		Driver.findElement(txt_MobileNum).sendKeys(Mobile_num);
		Thread.sleep(2000);
		Driver.findElement(btn_cont).click();
		Thread.sleep(2000);
		Driver.findElement(txt_pwd).sendKeys(pwd);
		Driver.findElement(btn_SignIn).click();
		Thread.sleep(2000);
		
	}
	
	
	public void ValidateUserLogin() throws InterruptedException
	{
		Driver.findElement(img_User).click();
		Thread.sleep(2000);
		Boolean Flag = Driver.findElement(lnk_Signout).isDisplayed();
		if(Flag)
		{
			System.out.println("Logged in Successfully");
		}
		else
		{
			System.out.println("The User Failed to Login");
		}
	}
	


}
