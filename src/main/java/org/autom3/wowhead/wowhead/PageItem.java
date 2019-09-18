package org.autom3.wowhead.wowhead;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageItem {

	public PageLardeur goBackPageLardeur (WebDriver driver) {
		driver.get("https://fr.wowhead.com/npc=46254/hogger");
		return PageFactory.initElements(driver,PageLardeur.class);
	}
}
