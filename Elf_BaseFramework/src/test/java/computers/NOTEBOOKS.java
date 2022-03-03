package computers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;

import genericLibrary.Base_Class;
import genericLibrary.ExcelUtil;
import pomRepository.TC_DESKTOPS_001;
import pomRepository.TC_NOTEBOOKS_002;

/***
 * 
 * @author sasikumar
 *
 */

public class NOTEBOOKS extends Base_Class {
	
	@Test
	
	public void TestingComputers(){
		TC_NOTEBOOKS_002 notebook = new TC_NOTEBOOKS_002(driver);
		ExcelUtil excelUtil = new ExcelUtil();
		String expectedHomePageTitle = excelUtil.readStringDataFromExcel("Sheet1",2,0);
		String expectednotebookPageTitle=excelUtil.readStringDataFromExcel("Sheet1",3,0);
		
		Assert.assertEquals(driver.getTitle(), expectedHomePageTitle,"Home page is not displayed");
		Reporter.log("Home page is displayed",true);
		Actions actions= new Actions(driver);
		WebElement computer = notebook.getComputers();
		actions.moveToElement(computer).click().perform();
		notebook.getNotebooks().click();
		Assert.assertEquals(driver.getTitle(), expectednotebookPageTitle,"Notebooks page is not displayed"); 
		Reporter.log("Notebooks page is displayed",true);
		
		notebook.getSortby().click();
		notebook.getAtoZ().click();
		notebook.getDispaly().click();
		notebook.getPagesize4().click();
		notebook.getViewas().click();
		notebook.getViewaslist().click();
		notebook.getAddtocart().click();

}
}
