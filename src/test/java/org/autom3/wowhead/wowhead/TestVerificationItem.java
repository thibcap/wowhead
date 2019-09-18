package org.autom3.wowhead.wowhead;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import org.autom3.wowhead.wowhead.Outils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.PageFactory;

public class TestVerificationItem {
	
	WebDriver driver;
//	String b = "firefox";
	private String BROWSER=System.getProperty("browser");
	

	
	//@After
	public void tearDown(){
		System.out.println("\n@After");
		driver.close();
	}
	
	@Test
	
	public void test() throws InterruptedException, FileNotFoundException{
		
		driver= Outils.choisirNavigateur(BROWSER);
		driver.manage().window().maximize();
		driver.get("https://fr.wowhead.com/");

		AbstractPage abstractPage = PageFactory.initElements(driver, AbstractPage.class);
		abstractPage.recherche(driver, "Lardeur");
		
		PagePreResult pagePreResult = PageFactory.initElements(driver, PagePreResult.class);
		pagePreResult.goPageLardeur(driver);
		
		PageLardeur pageLardeur = PageFactory.initElements(driver, PageLardeur.class);
		pageLardeur.goPageItem1(driver);
		List<String> list1 = Outils.loadFile("src/main/resources/charac_item/Chahuteurs_de_cadavre.txt");
		List<WebElement> list2 = driver.findElements(By.xpath("//div[@id][contains(@style, 'float: left')]//span"));
		List<String> list3 = new ArrayList<String>();
		for(WebElement e : list2){
		    list3.add(e.getText());
		}
		
		assertEquals(list1, list3);
		
//		assertTrue(driver.findElement(By.xpath("//b[text()='Chahuteurs de cadavre']")).isDisplayed());
//		assertTrue(driver.findElement(By.xpath("(//span[@class='q'])[1]")).isDisplayed());
//		assertTrue(driver.findElement(By.xpath("//td[text()='Lié quand ramassé']")).isDisplayed());
//		assertTrue(driver.findElement(By.xpath("//td[text()='Pieds']")).isDisplayed());
//		assertTrue(driver.findElement(By.xpath("//span[text()='Armure : 3']")).isDisplayed());
//		assertTrue(driver.findElement(By.xpath("//span[text()='+5 Intelligence']")).isDisplayed());
//		assertTrue(driver.findElement(By.xpath("//span[text()='+8 Endurance']")).isDisplayed());
//		assertTrue(driver.findElement(By.xpath("//span[text()='Augmente votre score de hâte de +']")).isDisplayed());
//		assertTrue(driver.findElement(By.xpath("//td[text()='Durabilité 60 / 60']")).isDisplayed());
//		assertTrue(driver.findElement(By.xpath("//div[text()='Prix de Vente: ']")).isDisplayed());
//		assertTrue(driver.findElement(By.xpath("//span[@class='moneysilver' and text()='16']")).isDisplayed());
//		assertTrue(driver.findElement(By.xpath("//span[@class='moneycopper' and text()='34']")).isDisplayed());
		
		PageItem pageItem = PageFactory.initElements(driver, PageItem.class);
		pageItem.goBackPageLardeur(driver);
		
		
		
		PageLardeur pageLardeur2 = PageFactory.initElements(driver, PageLardeur.class);
		pageLardeur2.goPageItem2(driver);
		
		List<String> list4 = Outils.loadFile("src/main/resources/charac_item/Chausses_de_Lardeur.txt");
		List<WebElement> list5 = driver.findElements(By.xpath("//div[@id][contains(@style, 'float: left')]//span"));
		List<String> list6 = new ArrayList<String>();
		for(WebElement e : list5){
		    list6.add(e.getText());
		}
		
		assertEquals(list4, list6);
		
//		assertTrue(driver.findElement(By.xpath("//b[text()='Chausses de Lardeur']")).isDisplayed());
//		assertTrue(driver.findElement(By.xpath("(//span[@class='q'])[1]")).isDisplayed());
//		assertTrue(driver.findElement(By.xpath("//td[text()='Lié quand ramassé']")).isDisplayed());
//		assertTrue(driver.findElement(By.xpath("//td[text()='Jambes']")).isDisplayed());
//		assertTrue(driver.findElement(By.xpath("//span[text()='Armure : 7']")).isDisplayed());
//		assertTrue(driver.findElement(By.xpath("//span[text()='+7 [Agilité or Intelligence]']")).isDisplayed());
//		assertTrue(driver.findElement(By.xpath("//span[text()='+10 Endurance']")).isDisplayed());
//		assertTrue(driver.findElement(By.xpath("//span[text()='Augmente votre score de coup critique de +']")).isDisplayed());
//		assertTrue(driver.findElement(By.xpath("//td[text()='Durabilité 95 / 95']")).isDisplayed());
//		assertTrue(driver.findElement(By.xpath("//div[text()='Prix de Vente: ']")).isDisplayed());
//		assertTrue(driver.findElement(By.xpath("//span[@class='moneysilver' and text()='23']")).isDisplayed());
//		assertTrue(driver.findElement(By.xpath("//span[@class='moneycopper' and text()='44']")).isDisplayed());
		
		PageItem pageItem2 = PageFactory.initElements(driver, PageItem.class);
		pageItem2.goBackPageLardeur(driver);
		
		PageLardeur pageLardeur3 = PageFactory.initElements(driver, PageLardeur.class);
		pageLardeur3.goPageItem3(driver);
		
		List<String> list7 = Outils.loadFile("src/main/resources/charac_item/Pioche_en_fer_glacial.txt");
		List<WebElement> list8 = driver.findElements(By.xpath("//div[@id][contains(@style, 'float: left')]//span"));
		List<String> list9 = new ArrayList<String>();
		for(WebElement e : list8){
		    list9.add(e.getText());
		}
		
		assertEquals(list7, list9);
		
//		assertTrue(driver.findElement(By.xpath("//b[text()='Pioche en fer glacial']")).isDisplayed());
//		assertTrue(driver.findElement(By.xpath("(//span[@class='q'])[1]")).isDisplayed());
//		assertTrue(driver.findElement(By.xpath("//td[text()='Lié quand équipé']")).isDisplayed());
//		assertTrue(driver.findElement(By.xpath("//td[text()='+ 1 - 5 points de dégâts (Givre)']")).isDisplayed());
//		assertTrue(driver.findElement(By.xpath("//td[text()='(12.33 dégâts par seconde)']")).isDisplayed());
//		assertTrue(driver.findElement(By.xpath("//span[text()='+2 Endurance']")).isDisplayed());
//		assertTrue(driver.findElement(By.xpath("//span[text()='+4 Esprit']")).isDisplayed());
//		assertTrue(driver.findElement(By.xpath("//td[text()='Durabilité 60 / 60']")).isDisplayed());
//		assertTrue(driver.findElement(By.xpath("//td[text()='Niveau ' and text()='12 requis']")).isDisplayed());
//		assertTrue(driver.findElement(By.xpath("//div[text()='Prix de Vente: ']")).isDisplayed());
//		assertTrue(driver.findElement(By.xpath("//span[@class='moneysilver' and text()='12']")).isDisplayed());
//		assertTrue(driver.findElement(By.xpath("//span[@class='moneycopper' and text()='23']")).isDisplayed());
		
		PageItem pageItem3 = PageFactory.initElements(driver, PageItem.class);
		pageItem3.goBackPageLardeur(driver);
		
		PageLardeur pageLardeur4 = PageFactory.initElements(driver, PageLardeur.class);
		pageLardeur4.goPageItem4(driver);
		
		List<String> list10 = Outils.loadFile("src/main/resources/charac_item/Greves_de_geolier_volees.txt");
		List<WebElement> list11 = driver.findElements(By.xpath("//div[@id][contains(@style, 'float: left')]//span"));
		List<String> list12 = new ArrayList<String>();
		for(WebElement e : list11){
		    list12.add(e.getText());
		}
		
		assertEquals(list10, list12);
		
//		assertTrue(driver.findElement(By.xpath("//b[text()='Grèves de geôlier volées']")).isDisplayed());
//		assertTrue(driver.findElement(By.xpath("(//span[@class='q'])[1]")).isDisplayed());
//		assertTrue(driver.findElement(By.xpath("//td[text()='Lié quand ramassé']")).isDisplayed());
//		assertTrue(driver.findElement(By.xpath("//td[text()='Jambes']")).isDisplayed());
//		assertTrue(driver.findElement(By.xpath("//span[text()='Armure : 10']")).isDisplayed());
//		assertTrue(driver.findElement(By.xpath("//span[text()='Augmente votre score de coup critique de +']")).isDisplayed());
//		assertTrue(driver.findElement(By.xpath("//span[text()='Augmente votre score de hâte de +']")).isDisplayed());
//		assertTrue(driver.findElement(By.xpath("//td[text()='Durabilité 95 / 95']")).isDisplayed());
//		assertTrue(driver.findElement(By.xpath("//td[text()='Niveau ' and text()='20 requis']")).isDisplayed());
//		assertTrue(driver.findElement(By.xpath("//span[@class='moneysilver' and text()='22']")).isDisplayed());
//		assertTrue(driver.findElement(By.xpath("//span[@class='moneycopper' and text()='93']")).isDisplayed());
//		assertTrue(driver.findElement(By.xpath("//div[text()='Dépouillé sur: Lardeur']")).isDisplayed());
//		assertTrue(driver.findElement(By.xpath("//div[text()='Chance de Butin: 11.22%']")).isDisplayed());
		
		PageItem pageItem4 = PageFactory.initElements(driver, PageItem.class);
		pageItem4.goBackPageLardeur(driver);
		
		PageLardeur pageLardeur5 = PageFactory.initElements(driver, PageLardeur.class);
		pageLardeur5.goPageItem5(driver);
		
		List<String> list13 = Outils.loadFile("src/main/resources/charac_item/Espauliers_de_Tourne-Cle.txt");
		List<WebElement> list14 = driver.findElements(By.xpath("//div[@id][contains(@style, 'float: left')]//span"));
		List<String> list15 = new ArrayList<String>();
		for(WebElement e : list14){
		    list15.add(e.getText());
		}
		
		assertEquals(list13, list15);
		
//		assertTrue(driver.findElement(By.xpath("//b[text()='Espauliers de Tourne-Clé']")).isDisplayed());
//		assertTrue(driver.findElement(By.xpath("(//span[@class='q'])[1]")).isDisplayed());
//		assertTrue(driver.findElement(By.xpath("//td[text()='Lié quand ramassé']")).isDisplayed());
//		assertTrue(driver.findElement(By.xpath("//td[text()='Épaules']")).isDisplayed());
//		assertTrue(driver.findElement(By.xpath("//span[text()='Armure : 13']")).isDisplayed());
//		assertTrue(driver.findElement(By.xpath("//span[text()='+5 [Force or Intelligence]']")).isDisplayed());
//		assertTrue(driver.findElement(By.xpath("//span[text()='+5 [Force or Intelligence]']")).isDisplayed());
//		assertTrue(driver.findElement(By.xpath("//span[text()='+8 Endurance']")).isDisplayed());
//		assertTrue(driver.findElement(By.xpath("//span[text()='Augmente votre score de coup critique de +']")).isDisplayed());
//		assertTrue(driver.findElement(By.xpath("//span[text()='4 Versatilité']")).isDisplayed());
//		assertTrue(driver.findElement(By.xpath("//td[text()='Durabilité 80 / 80']")).isDisplayed());
//		assertTrue(driver.findElement(By.xpath("//td[text()='Niveau ' and text()='20 requis']")).isDisplayed());
//		assertTrue(driver.findElement(By.xpath("//span[@class='moneysilver' and text()='16']")).isDisplayed());
//		assertTrue(driver.findElement(By.xpath("//span[@class='moneycopper' and text()='82']")).isDisplayed());
//		assertTrue(driver.findElement(By.xpath("//div[text()='Dépouillé sur: Lardeur']")).isDisplayed());
//		assertTrue(driver.findElement(By.xpath("//div[text()='Chance de Butin: 4.90%']")).isDisplayed());
		

}
}
