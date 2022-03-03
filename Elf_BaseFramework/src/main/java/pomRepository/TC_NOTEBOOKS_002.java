package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_NOTEBOOKS_002 {
	
	public TC_NOTEBOOKS_002(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath = "//a[contains(text(),'Computers')]") private WebElement Computers;
	@FindBy(partialLinkText = "Notebooks") private WebElement notebooks;
	@FindBy(xpath = "//select[@id='products-orderby']") private WebElement Sortby;
	@FindBy(xpath = "//option[(@value='http://demowebshop.tricentis.com/notebooks?orderby=5')]") private WebElement AtoZ;
	@FindBy(xpath = "//select[@name='products-pagesize']") private WebElement dispaly;
	@FindBy(xpath = "//option[text()='4']")  private WebElement pagesize4;
	@FindBy(xpath = "//select[contains(@id,'products-viewmode')]") private WebElement viewas;
	@FindBy(xpath ="//option[text()='Grid']" ) private WebElement viewaslist;
	@FindBy(xpath = "(//input[@type='button'])[3]") private WebElement addtocart;
	public WebElement getComputers() {
		return Computers;
	}
	public WebElement getNotebooks() {
		return notebooks;
	}
	public WebElement getSortby() {
		return Sortby;
	}
	public WebElement getAtoZ() {
		return AtoZ;
	}
	public WebElement getDispaly() {
		return dispaly;
	}
	public WebElement getPagesize4() {
		return pagesize4;
	}
	public WebElement getViewas() {
		return viewas;
	}
	public WebElement getViewaslist() {
		return viewaslist;
	}
	public WebElement getAddtocart() {
		return addtocart;
	}
	
}
