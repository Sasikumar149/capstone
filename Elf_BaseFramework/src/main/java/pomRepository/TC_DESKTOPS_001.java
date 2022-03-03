package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_DESKTOPS_001 {

	public TC_DESKTOPS_001(WebDriver driver) {
		PageFactory.initElements(driver,this);
		

	}
	@FindBy(xpath = "//a[contains(text(),'Computers')]") private WebElement Computers;
	@FindBy(partialLinkText = "Desktops") private WebElement desktops;
	@FindBy(xpath = "//select[@id='products-orderby']") private WebElement Sortby;
	@FindBy(xpath = "(//option[@value='http://demowebshop.tricentis.com/desktops?orderby=5'])") private WebElement AtoZ;
	@FindBy(xpath = "//select[@name='products-pagesize']") private WebElement dispaly;
	@FindBy(xpath = "//option[@value='http://demowebshop.tricentis.com/desktops?orderby=5&pagesize=4']") private WebElement pageSize4;
	@FindBy(xpath = "//select[contains(@id,'products-viewmode')]") private WebElement viewas;
	@FindBy(xpath = "//option[text()='List']") private WebElement viewaslist;
	@FindBy(xpath = "//img[contains(@src,'http://demowebshop.tricentis.com/content/images/thumbs/0000172_build-your-own-cheap-computer_125.jpeg')]") private WebElement selectPicture;
	@FindBy(xpath = "//input[contains(@id,'product_attribute_72_5_18_52')]") private WebElement radioButton;
	@FindBy(xpath = "//input[contains(@id,'product_attribute_72_6_19_91')]") private WebElement radioButton2;
	@FindBy(xpath = "//input[contains(@id,'product_attribute_72_3_20_58')]") private WebElement radioButton3;
	@FindBy(xpath = "//input[contains(@id,'add-to-cart-button-72')]") private WebElement AddToCart;
	@FindBy(xpath = "//a[text()='Log out']") private WebElement logOut;
	public WebElement getComputers() {
		return Computers;
	}
	public WebElement getDesktops() {
		return desktops;
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
	public WebElement getPageSize4() {
		return pageSize4;
	}
	public WebElement getViewas() {
		return viewas;
	}
	public WebElement getViewaslist() {
		return viewaslist;
	}
	public WebElement getSelectPicture() {
		return selectPicture;
	}
	public WebElement getRadioButton() {
		return radioButton;
	}
	public WebElement getRadioButton2() {
		return radioButton2;
	}
	public WebElement getRadioButton3() {
		return radioButton3;
	}
	public WebElement getAddToCart() {
		return AddToCart;
	}
	public WebElement getLogOut() {
		return logOut;
	}


}
