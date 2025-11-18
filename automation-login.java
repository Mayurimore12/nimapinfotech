package com.nimapinfotech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class login {
	
	WebDriver d;

	public login(WebDriver d) {
		this.d=d;

	}
	
	public void navigateURL(String url) throws InterruptedException {
		d.get(url);                                          
		System.out.println("open url");
		d.manage().window().maximize();
		System.out.println("maximize the window");
		Thread.sleep(6000);
    }

	public void Username(String usernametxt) {
		WebElement usernameField=d.findElement(By.cssSelector("input[id='mat-input-0']"));
		usernameField.sendKeys(usernametxt);
		System.out.println("insert username: 7378598491");
	}
	
	public void Password(String passwordtxt) {
		WebElement passwordField=d.findElement(By.cssSelector("input[id='mat-input-1']"));
		passwordField.sendKeys(passwordtxt);
		System.out.println("insert password: mayumore");
	}
	
	public void SignIn() {                                   
		WebElement SignInbutton=d.findElement(By.cssSelector("button[id='kt_login_signin_submit']"));
		SignInbutton.click();
		System.out.println("SignIn nimapinfotech site");
	}
}
