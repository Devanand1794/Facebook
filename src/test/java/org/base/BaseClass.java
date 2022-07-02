package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileSystemUtils;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	public static WebDriver chromeBrowser() {
		WebDriverManager.chromedriver().setup();        //1
		 driver=new ChromeDriver();
		return driver;

	}
	
	public static void browsersssLaunch(String dname) {
		if(dname.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
}
		else if(dname.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
	}
	
	public static WebDriver firefox() {
		WebDriverManager.firefoxdriver().setup();            //2
		driver=new FirefoxDriver();
		return driver;
		

	}
	
	public static WebDriver edge() {
		WebDriverManager.edgedriver().setup();                  //3
		 driver=new EdgeDriver();
		return driver;

	}
	
	public static void urlLanch(String url) {
		driver.get(url);                                         //4
        driver.manage().window().maximize();
        
	}
	
	public static void implicityWait(int a) {                           //5
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}
	
	public static void sendKeys(WebElement e,String value) {        //6
		e.sendKeys(value);

	}
	public static void click(WebElement e) {          //7
		e.click();

	}
	
	public static void quit() {                  //8
		driver.quit();

	}
	
	public static String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();       //9
		return currentUrl;

	}
	
	public static String getTitle() {                     //10
		String title = driver.getTitle();
		return title;

	}
	
	public static String getText(WebElement e) {               //11
		String text = e.getText();
		return text;

	}
	
	public static String getAttribute(WebElement e) {          //12
		String attribute = e.getAttribute("value");
		return attribute;

	}
	
	public static void moveToElement(WebElement tar) {
		Actions de=new Actions(driver);                         //13
de.moveToElement(tar).perform();
	}
	
	public static void dragAndDrop(WebElement src,WebElement tar) {     //14
		Actions de=new Actions(driver);
		de.dragAndDrop(src, tar).perform();

	}
	
	public static void contextClick(WebElement k) {                             //15
		Actions de=new Actions(driver);
		de.contextClick(k).perform();
		

	}
	
	public static void doubleClick(WebElement l) {
		Actions de=new Actions(driver);                              //16
         de.doubleClick(l).perform();
		
	}
	
	
		

	
	
	public static void keyPress( ) throws AWTException {
		Robot di=new Robot();                                         //18
		di.keyPress(KeyEvent.VK_UP);

	}
	
	public static void keyPress2() throws AWTException {        //19
		Robot di=new Robot();
		di.keyPress(KeyEvent.VK_DOWN);

	}
	
	public static void accept() {                                    //20
		Alert dw= driver.switchTo().alert();
		dw.accept();

	}
	public static void dismiss() {                                 //21
		Alert dz= driver.switchTo().alert();
		dz.dismiss();

	}
	
	public static void sendkeyAlert(String e) {                   //22
		Alert dd= driver.switchTo().alert();
        dd.sendKeys(e);
	}
	
	public static String gettextAlert() {                         //23
		Alert d= driver.switchTo().alert();
		String text = d.getText();
		return text;

	}
	
	public static void selectByValue(WebElement e,String d) {         //24
		Select ss=new Select(e);
		ss.selectByValue(d);

	}
	
	public static void selectByVisibleText(WebElement e,String i) {     //25
		Select ss=new Select(e);
		ss.selectByVisibleText(i);

	}
	
	public static void selectByIndex(WebElement e,int w) {              //26
		Select ss=new Select(e);
		ss.selectByIndex(w);

	}
	
	public static List<WebElement> getOptions(WebElement e) {           //27
		Select ss=new Select(e);
		List<WebElement> options = ss.getOptions();
		return options;

	}
	
	public static List<WebElement> getAllSelectOptions(WebElement e) {
		Select ss=new Select(e);                                           //28
		List<WebElement> allSelectedOptions = ss.getAllSelectedOptions();
		return allSelectedOptions;

	}
	
	public static WebElement getFirstSelectOptions(WebElement e) {
		Select ss=new Select(e);                                          //29
		WebElement firstSelectedOption = ss.getFirstSelectedOption();
		return firstSelectedOption;

	}
	
	public static boolean isMultiple(WebElement e) {                     //30
		Select ss=new Select(e);
		boolean multiple = ss.isMultiple();
		return multiple;

	}
	
	public static void deSelectByIndex(WebElement e, int c) {                  //31
		Select ss=new Select(e);
        ss.deselectByIndex(c);
	}
	
	public static void deselectByText(WebElement e,String n) {                 //32
		Select ss=new Select(e);
		ss.deselectByVisibleText(n);

	}
	
	public static void deselectByValue(WebElement e,String k) {                //33
		Select ss=new Select(e);
		ss.deselectByValue(k);

	}
	
	public static void deSelectAll(WebElement e) {                              //34
		Select ss=new Select(e);
		ss.deselectAll();

	}
	
	public static void frameIndex(int q) {
		driver.switchTo().frame(q);                                            //35

	}
	
	public static void frameString(String l) {                                       //36
		driver.switchTo().frame(l);

	}
	
	public static void frameWebelement(WebElement o) {
		driver.switchTo().frame(o);                                            //37

	}
	
	public static WebDriver frameParent() {                                     //38
		WebDriver parentFrame = driver.switchTo().parentFrame();
		return parentFrame;

	}
	public static void clear(WebElement e) {                                         //39
		e.clear();

	}
	
	public static WebDriver defaultContent() {
		WebDriver defaultContent = driver.switchTo().defaultContent();            //40
		return defaultContent;

	}
	
	public static void windowUrl(String h) {                                       //41
		driver.switchTo().window(h);

	}
	
	public static Set<String> getWindowHandles(int a) {
		Set<String> windowHandles = driver.getWindowHandles(); 
		List<String> l2=new LinkedList();
		l2.addAll(windowHandles);
		driver.switchTo().window(l2.get(a));
		return windowHandles;
		
	}
	
	public static void toNavi(String url) {                                      //44
		driver.navigate().to(url);

	}
	public static void backNavi() {                                             //45
		driver.navigate().back();

	}
	
	public static void forwardNavi() {                                           //46
		driver.navigate().forward();

	}
	
	public static void refreshNavi() {                                             //47
		driver.navigate().refresh();

	}
	
	public static boolean isDisplayed(WebElement e) {                             //48
		boolean displayed = e.isDisplayed();
		return displayed;

	}
	
	public static boolean isEnabled(WebElement e) {                               //49
		boolean enabled = e.isEnabled();
		return enabled;

	}
	
	public static boolean isSelected(WebElement e) {                               //50
		boolean selected = e.isSelected();
		return selected;

	}
	
	public static void threadSleep(long p) throws InterruptedException {                 //51
		threadSleep(p);

	}
	
	public static void javaScriptsetter(String arg, WebElement ele) {
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript(arg, ele);
		

	}
	public static void javascriptClick(Object d) {
	JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", d);
	}
	
	public static Object javascriptGetter(WebElement w) {
		JavascriptExecutor js =(JavascriptExecutor)driver;
        Object executeScript = js.executeScript("return arguments[0].getAttribute('value')", w);
         System.out.println(executeScript.toString());
		return executeScript;
	}

	
	public static File screenShots(WebElement w) throws IOException {
		TakesScreenshot tk=(TakesScreenshot)driver;
		File screenshotAs = tk.getScreenshotAs(OutputType.FILE);
		return screenshotAs;
	}
	
	public static void keyrelease( ) throws AWTException {
		Robot di=new Robot();                                         
		di.keyRelease(KeyEvent.VK_UP);
	}
	public static void keyrelease2( ) throws AWTException {
		Robot di=new Robot();                                         
		di.keyRelease(KeyEvent.VK_DOWN);
}
	public static void keypress3() throws AWTException {
		Robot di=new Robot(); 
		di.keyPress(KeyEvent.VK_ENTER);

	}
	public static void keyrelease3() throws AWTException {
		Robot di=new Robot();
		di.keyRelease(KeyEvent.VK_ENTER);
	}
	public static long currenttimeMillis() {
		long currentTimeMillis = System.currentTimeMillis();
		return currentTimeMillis;

	}
	public static void ctrl() throws AWTException {
		Robot di=new Robot();
		di.keyPress(KeyEvent.VK_CONTROL);
	}
	public static void pastev() throws AWTException {
			Robot di=new Robot();
			di.keyPress(KeyEvent.VK_V);
		}
	public static void ctrlrelease() throws AWTException {
    	   Robot di=new Robot();
    	   di.keyRelease(KeyEvent.VK_CONTROL);
}
	public static void pastevrelease() throws AWTException {
    	   Robot di=new Robot();
    	   di.keyRelease(KeyEvent.VK_V);

	}
	public static void delete() throws AWTException, InterruptedException {
		Robot di=new Robot();
		di.keyPress(KeyEvent.VK_BACK_SPACE);
		Thread.sleep(3000);
		di.keyRelease(KeyEvent.VK_BACK_SPACE);
	}
	
	public static void scrollUp(Object a) {
		JavascriptExecutor de=(JavascriptExecutor)driver;
		de.executeScript("arguments[0].scrollIntoView(False)", a);
	}
	public static void scrollDown(Object x) {
		JavascriptExecutor de=(JavascriptExecutor)driver;
        de.executeScript("arguments[0].scrollIntoView(True)", x);
	}
	public static int dateScreen() {
		Date dss=new Date();
		int seconds = dss.getSeconds();
		return seconds;
	}
	public static void filesStoring(String s, File src) throws IOException {
		File dest= new File(s);
		FileUtils.copyFile(src, dest);

	}
	
	public static String readExcel(String filename, String sheet, int a, int b) throws IOException {
		File f=new File("C:\\Users\\PUGHAZHENDI\\eclipse-workspace\\FaceBookNew\\Excel\\"+filename+".xlsx");
		FileInputStream ss=new FileInputStream(f);
		Workbook dd=new XSSFWorkbook(ss);
		Sheet s = dd.getSheet(sheet);
		Row r = s.getRow(a);
		Cell cell = r.getCell(b);
		int cellType = cell.getCellType();
		
		String value=null;
		if(cellType==1) {
			 value = cell.getStringCellValue();
			
		}
		else {
			if(DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat ff=new SimpleDateFormat("dd/MM/yyyy");
				 value = ff.format(dateCellValue);
							
			}
			else {
				double numericCellValue = cell.getNumericCellValue();
				long num=(long)numericCellValue;
				 value = String.valueOf(num);
				
			}
		}
		return value;

	}
	
	public static void exitisingFiles(String anand, String sheet, int q, int y, Date t) throws IOException {
		
		
		File f=new File("C:\\Users\\PUGHAZHENDI\\eclipse-workspace\\Maven_Deva\\src\\test\\resources\\Excel\\"+anand+".xlsx");
		FileInputStream i=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(i);
		Sheet s = w.getSheet(sheet);
		Row r = s.createRow(q);
		Cell cell = r.createCell(y);
		cell.setCellValue(t);
		FileOutputStream oo=new FileOutputStream(f);
		w.write(oo);
	}
		public void browserLaunch(String dname) {
			if(dname.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
	}
			else if(dname.equalsIgnoreCase("edge")) {
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();

	}}
}
	


		

	

	



	
	