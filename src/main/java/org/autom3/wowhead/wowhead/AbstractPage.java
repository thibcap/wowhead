package org.autom3.wowhead.wowhead;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AbstractPage {
	
	public PagePreResult recherche(WebDriver driver, String perso) {
		driver.findElement(By.xpath("//input[@type='text']")).clear();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Lardeur");
		driver.findElement(By.xpath("//a[@class='header-search-button fa fa-search']")).click();
		return PageFactory.initElements(driver, PagePreResult.class);
	}

}
