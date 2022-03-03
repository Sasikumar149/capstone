package computers;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import genericLibrary.ExcelUtil;
import pomRepository.TC_DESKTOPS_001;

/***
 * 
 * @author sasikumar
 *
 */

public class DESKTOPS extends Base_Class {
	@Test
	public void TestingComputers(){
		computersModule= new TC_DESKTOPS_001(driver);
		ExcelUtil excelUtil = new ExcelUtil();
		String expectedHomePageTitle = excelUtil.readStringDataFromExcel("Sheet1",0,0);
		String expecteddesktopPageTitle=excelUtil.readStringDataFromExcel("Sheet1",1,0);
		
		Assert.assertEquals(driver.getTitle(), expectedHomePageTitle,"Home page is not displayed");
		Reporter.log("Home page is displayed",true);
		Actions actions= new Actions(driver);
		
		WebElement computer = computersModule.getComputers();
		
		actions.moveToElement(computer).click().perform();
		
		computersModule.getDesktops().click();
		
		Assert.assertEquals(driver.getTitle(), expecteddesktopPageTitle,"Desktop page is not displayed"); 
		Reporter.log("Desktop page is displayed",true);
		
		computersModule.getSortby().click();
		
		computersModule.getAtoZ().click();
		
		computersModule.getDispaly().click();
		
		computersModule.getPageSize4().click();
		
		computersModule.getViewas().click();
		
		computersModule.getViewaslist().click();
		
		computersModule.getSelectPicture().click();
		
		computersModule.getRadioButton().click();
		
		computersModule.getRadioButton2().click();
		
		computersModule.getRadioButton3().click();
		
		computersModule.getAddToCart().click();
		
//		computersModule= new ComputersModule(driver);
//		computersModule.getLogOut().click();
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
	}
	

}
