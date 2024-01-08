package com.cdac;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\aadish\\Desktop\\selenium\\geckodriver.exe");

		FirefoxDriver driver = new FirefoxDriver();
		// ChromeDriver driver=new ChromeDriver();

		driver.get("https://www.saucedemo.com/v1/index.html");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElementById("user-name").sendKeys("standard_user");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElementById("password").sendKeys("secret_sauce");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElementById("login-button").click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String text = driver.findElementByClassName("product_label").getText();

		System.out.println(text);

		if (text.equals("Products")) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}

		driver.close();

	}

}
