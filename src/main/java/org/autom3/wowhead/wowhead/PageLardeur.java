package org.autom3.wowhead.wowhead;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageLardeur {

	public PageItem goPageItem1 (WebDriver driver) {
		driver.findElement(By.xpath("//a[text()='Chahuteurs de cadavre']")).click();
		return PageFactory.initElements(driver,PageItem.class);
	}
	
	public PageItem goPageItem2 (WebDriver driver) {
		driver.findElement(By.xpath("//a[text()='Chausses de Lardeur']")).click();
		return PageFactory.initElements(driver,PageItem.class);
	}
	
	public PageItem goPageItem3 (WebDriver driver) {
		driver.findElement(By.xpath("//a[text()='Pioche en fer froid']")).click();
		return PageFactory.initElements(driver,PageItem.class);
	}
	
	public PageItem goPageItem4 (WebDriver driver) {
		driver.findElement(By.xpath("//a[text()='Grèves de geôlier volées']")).click();
		return PageFactory.initElements(driver,PageItem.class);
	}
	
	public PageItem goPageItem5 (WebDriver driver) {
		driver.findElement(By.xpath("//a[text()='Espauliers de Tourne-Clé']")).click();
		return PageFactory.initElements(driver,PageItem.class);
	}
	
}
