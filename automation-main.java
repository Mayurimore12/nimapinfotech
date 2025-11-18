package com.nimapinfotech;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nimapinfotech.login;

public class main {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d=new ChromeDriver();                    
		login l=new login(d);                              
        l.navigateURL("https://testffc.nimapinfotech.com/");
		l.Username("7378598491");
        l.Password("mayumore");
        l.SignIn();

	}

}
