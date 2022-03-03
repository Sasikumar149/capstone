package computers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import genericLibrary.ExcelUtil;
import pomRepository.TC_ACCESSORIES_003;
import pomRepository.TC_NOTEBOOKS_002;

/***
 * 
 * @author sasikumar
 *
 */

public class ACCESSORIES extends Base_Class {

	@Test
	public void TestingComputers(){
		TC_ACCESSORIES_003 accessories=new TC_ACCESSORIES_003(driver);
		ExcelUtil excelUtil = new ExcelUtil();
		String expectedHomePageTitle = excelUtil.readStringDataFromExcel("Sheet1",4,0);
		String expectedAccessoriesPageTitle=excelUtil.readStringDataFromExcel("Sheet1",5,0);

		Assert.assertEquals(driver.getTitle(), expectedHomePageTitle,"Home page is not displayed");
		Reporter.log("Home page is displayed",true);
		Actions actions= new Actions(driver);
		WebElement computer = accessories.getComputers();
		actions.moveToElement(computer).click().perform();
		accessories.getAccessories().click();

		Assert.assertEquals(driver.getTitle(), expectedAccessoriesPageTitle,"Accessories page is not displayed");
		Reporter.log("Accessories page is displayed",true);
		accessories.getSortby().click();
		accessories.getAtoZ().click();
		accessories.getDispaly().click();
		accessories.getPagesize4().click();
		accessories.getViewas().click();
		accessories.getViewaslist().click();
		accessories.getClickonproduct().click();
		accessories.getAddtocart().click();

	}
}
