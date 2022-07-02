package org.fbb;

import java.io.IOException;

import org.base.BaseClass;
import org.pom.PomClass;
import org.testng.annotations.Test;

public class FaceBookNew extends BaseClass{

	@Test(priority=1)
	private void validCombination() throws IOException {
		browsersssLaunch("chrome");
		urlLanch("https://www.facebook.com/");
		PomClass de=new PomClass();
		sendKeys(de.getUsername(), readExcel("FaceBookNew", "FaceBook", 1, 0));
		sendKeys(de.getPassword(), readExcel("FaceBookNew", "FaceBook", 1, 1));
		click(de.getLogin());
	}
	
	@Test(priority=2)
	private void invalidCombination1() throws IOException {
		browsersssLaunch("chrome");
		urlLanch("https://www.facebook.com/");
		PomClass de=new PomClass();
		sendKeys(de.getUsername(), readExcel("FaceBookNew", "FaceBook", 2, 0));
		sendKeys(de.getPassword(), readExcel("FaceBookNew", "FaceBook", 2, 1));
		click(de.getLogin());
	}
	@Test(priority=3)
	private void invalidCombination2() throws IOException {
		browsersssLaunch("edge");
		urlLanch("https://www.facebook.com/");
		PomClass de=new PomClass();
		sendKeys(de.getUsername(), readExcel("FaceBookNew", "FaceBook", 3, 0));
		sendKeys(de.getPassword(), readExcel("FaceBookNew", "FaceBook", 3, 1));
		click(de.getLogin());
	}
	@Test(priority=4)
	private void invalidCombination3() throws IOException {
		browsersssLaunch("edge");
		urlLanch("https://www.facebook.com/");
		PomClass de=new PomClass();
		sendKeys(de.getUsername(), readExcel("FaceBookNew", "FaceBook", 4, 0));
		sendKeys(de.getPassword(), readExcel("FaceBookNew", "FaceBook", 4, 1));
		click(de.getLogin());
	}
	@Test(priority=5)
	private void invalidCombination4() throws IOException {
		browsersssLaunch("chrome");
		urlLanch("https://www.facebook.com/");
		PomClass de=new PomClass();
		sendKeys(de.getUsername(), readExcel("FaceBookNew", "FaceBook", 5, 0));
		sendKeys(de.getPassword(), readExcel("FaceBookNew", "FaceBook", 5, 1));
		click(de.getLogin());
	}
	@Test(priority=6)
	private void invalidCombination5() throws IOException {
		browsersssLaunch("chrome");
		urlLanch("https://www.facebook.com/");
		PomClass de=new PomClass();
		sendKeys(de.getUsername(), readExcel("FaceBookNew", "FaceBook", 6, 0));
		sendKeys(de.getPassword(), readExcel("FaceBookNew", "FaceBook", 6, 1));
		click(de.getLogin());

	}
	
}
