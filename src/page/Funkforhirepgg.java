package page;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Funkforhirepgg {
	WebDriver driver;
	 By ffhlogin=By.xpath("/html/body/div[2]/sticky-header/header/div/a[1]");
	 By email=By.xpath("//*[@id=\"CustomerEmail\"]");
	 By password=By.xpath("//*[@id=\"CustomerPassword\"]");
	 By signinbutton=By.xpath("//*[@id=\"customer_login\"]/button");
	 By wallet=By.xpath("//*[@id=\"Details-HeaderMenu-2\"]/summary/span");
	 By squarewallet=By.xpath("//*[@id=\"HeaderMenu-MenuList-2\"]/li[2]/a");
	 By matchsqwallet=By.xpath("//*[@id=\"product-grid\"]/li[3]/div/div/div[2]/div[1]/h3/a");
	 By addtocart=By.xpath("//*[@id=\"product-form-template--14860858196058__main\"]/div/button");
	 By viewmycart=By.id("cart-notification-button");
	 public Funkforhirepgg(WebDriver driver) {
		this.driver=driver;
	}
	public void flog() {
		 driver.findElement(ffhlogin).click();
		 
	 }
	public void setvalue(String mail,String psw)
	{
		driver.findElement(email).sendKeys(mail);
		driver.findElement(password).sendKeys(psw);
	}
	public void buttonsn()
	{
		driver.findElement(signinbutton).click();
	}
	 public void clicker() {
		 driver.findElement(wallet).click();
		 driver.findElement(squarewallet).click();
	 }
	 
	 public void elem()
	 {
		 driver.findElement(matchsqwallet).click();
	 }
	 public void atk()
	 {
		 driver.findElement(addtocart).click();
	 }
	 public void vCart()
	 {
		 Alert a=driver.switchTo().alert();
		 driver.findElement(viewmycart).click();
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
