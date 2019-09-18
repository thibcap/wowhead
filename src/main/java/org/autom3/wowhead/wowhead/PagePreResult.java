package org.autom3.wowhead.wowhead;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PagePreResult {
	
	public PageLardeur goPageLardeur(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("//div[text()='PNJ (7)']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Continuer']")).click();
		driver.findElement(By.xpath("//td[@class='icon-boss-padded']")).click();
		return PageFactory.initElements(driver,PageLardeur.class);
	}

}
